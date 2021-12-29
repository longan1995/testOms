package com.testOms.ManagedPrice;

/**
 *
 *
 * 价格管理-期货价格
 * 注意前几个订货会是否可用
 *
 *
 *
 * **/

import element.priceManagement.distributionPrice;
import element.priceManagement.futurePrice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Set;

public class testCaseFuturePrice {

    public WebDriver webDriver;

    @BeforeClass
    public void setUpEnv(){
        Path path = Paths.get("src","drivers","chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",path.toAbsolutePath().toString());

        //创建浏览器实例
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://mall.beyond-itcenter.com/uums/login/");

        WebElement username_enter = webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/form/div[1]/div/div[1]/input"));
        username_enter.clear();
        //定位到账号
        username_enter.sendKeys("20100421");//输入账号
        WebElement passwd_enter = webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/form/div[2]/div/div/input"));
        passwd_enter.clear();
        //定位到密码
        passwd_enter.sendKeys("YHZXgh20100421!");//输入密码

        WebElement userCenter = webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/form/div[3]/div/button/span/span"));
        //点击登录用户中心
        userCenter.click();
        //隐式等待
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //新oms系统
    @Test(priority = 1)
    public void testSwithchWindows(){
        //点击oms系统
        webDriver.findElement(By.xpath(distributionPrice.getOmsC())).click();
        //当前页面句柄
        String currentwindows = webDriver.getWindowHandle();
        //存放句柄
        Set<String> allWindows = webDriver.getWindowHandles();
        for (String window:allWindows){
            if (window != currentwindows){
                webDriver.switchTo().window(window);
            }
        }
    }
    //价格管理
    @Test(priority = 2)
    public void priceManager(){
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        WebElement oms = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(futurePrice.getPriceM())));
        oms.click();

    }
    //期货价格
    @Test(priority = 3)
    public void futurePrice(){
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        WebElement oms = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(futurePrice.getfPrice())));
        oms.click();

    }
  //订货会选择
    @Test(priority = 4)
    public void ExchangeFair() throws InterruptedException{
        //订货会下拉框
        webDriver.findElement(By.xpath(futurePrice.getExchangeFair())).click();
        //订货会选择
        webDriver.findElement(By.xpath(futurePrice.getChooseExchangeFair())).click();
        //搜索按键
        webDriver.findElement(By.xpath(futurePrice.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(futurePrice.getResetButton())).click();
    }
    //价格单号
    @Test(priority = 5)
    public void priceNum() throws InterruptedException{
        //价格单号输入
        webDriver.findElement(By.xpath(futurePrice.getPriceNum())).sendKeys("12213123");
        //搜索按键
        webDriver.findElement(By.xpath(futurePrice.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(futurePrice.getResetButton())).click();
    }
    //价格状态
    @Test(priority = 6)
    public void priceState() throws InterruptedException{
        //价格状态下拉框
        webDriver.findElement(By.xpath(futurePrice.getPriceState())).click();
        //价格状态选择
        webDriver.findElement(By.xpath(futurePrice.getChoosePriceState())).click();
        //搜索按键
        webDriver.findElement(By.xpath(futurePrice.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(futurePrice.getResetButton())).click();
    }
    //使用范围
    @Test(priority = 7)
    public void usableRange() throws InterruptedException{
        //订货会下拉框
        webDriver.findElement(By.xpath(futurePrice.getUsableRange())).click();
        //订货会选择
        webDriver.findElement(By.xpath(futurePrice.getChooseUsableRange())).click();
        //搜索按键
        webDriver.findElement(By.xpath(futurePrice.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(futurePrice.getResetButton())).click();
    }
    //开始时间
    @Test(priority = 8)
    public void timeBegin() throws InterruptedException{
        //起始时间下拉框
        webDriver.findElement(By.xpath(futurePrice.getCreatTime1())).sendKeys("2021-12-01");
        //结束时间下拉框
        webDriver.findElement(By.xpath(futurePrice.getFinishTime1())).sendKeys("2021-12-03");
        //搜索按键
        webDriver.findElement(By.xpath(futurePrice.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(futurePrice.getResetButton())).click();
    }
   //结束时间
    @Test(priority = 9)
    public void timeEnd() throws InterruptedException{
        //起始时间下拉框
        webDriver.findElement(By.xpath(futurePrice.getCreatTime2())).sendKeys("2021-12-29");
        //时间选择
        webDriver.findElement(By.xpath(futurePrice.getChooseCreatTime2())).click();
        //结束时间下拉框
        webDriver.findElement(By.xpath(futurePrice.getFinishTime2())).sendKeys("2022-01-01");
        //搜索按键
        webDriver.findElement(By.xpath(futurePrice.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(futurePrice.getResetButton())).click();
    }
    //创建人
    @Test(priority = 10)
    public void  founder() throws InterruptedException{
        //创建人
        webDriver.findElement(By.xpath(futurePrice.getPriceNum())).sendKeys("20110049");
        //搜索按键
        webDriver.findElement(By.xpath(futurePrice.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(futurePrice.getResetButton())).click();
    }
    /**------新建----*/
   @Test(priority = 11)
    public void newButton(){
        webDriver.findElement(By.xpath(futurePrice.getNewButton())).click();
    }
    @Test(priority = 12)
    public void windowquit1(){
        webDriver.findElement(By.xpath(futurePrice.getWindowQuit1())).click();
        webDriver.findElement(By.xpath(futurePrice.getNewButton())).click();
    }
    @Test(priority = 13)
    public void cancel(){
        webDriver.findElement(By.xpath(futurePrice.getCancel())).click();
        webDriver.findElement(By.xpath(futurePrice.getNewButton())).click();
    }
    @Test(priority = 14)
    public void chooseExchangeFair() throws InterruptedException{
        //订货会下拉框
        webDriver.findElement(By.xpath(futurePrice.getExchangeFair_new())).sendKeys("ZDH001");

    }
    @Test(priority = 15)
    public void creatAndEndTime()throws InterruptedException{
        //起始时间下拉框
        webDriver.findElement(By.xpath(futurePrice.getCreatTime_new())).sendKeys("2021-12-02");
        //结束时间下拉框
        webDriver.findElement(By.xpath(futurePrice.getFinishTime_new())).sendKeys("2021-12-31");

    }
    @Test(priority = 16)
    public void remarks() throws InterruptedException{
        //备注
        webDriver.findElement(By.xpath(futurePrice.getRemarks())).sendKeys("8888");
    }
    @Test(priority = 17)
    public void usableRangeNew() throws InterruptedException, AWTException {
        webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/section/div/div[3]/div/div[1]")).click();
        //全局下拉框
        webDriver.findElement(By.xpath(futurePrice.getUsableRange_new())).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);

    }
    @Test(priority = 18)
    public void addButton(){
        webDriver.findElement(By.xpath(futurePrice.getAdd_new())).click();
    }
    @Test(priority = 19)
    public void searchProductNum(){
        //输入产品编码
        webDriver.findElement(By.xpath(futurePrice.getProductNum_new())).sendKeys("91113233213");
        //点击查询
        webDriver.findElement(By.xpath(futurePrice.getSearchButton_new())).click();
        //勾选产品
        webDriver.findElement(By.xpath(futurePrice.getProductCheck1())).click();
        //点击确认
        webDriver.findElement(By.xpath(futurePrice.getProductComfirm())).click();
        //退出添加页面
        webDriver.findElement(By.xpath(futurePrice.getWindowQuit2())).click();
    }
    @Test(priority = 20,enabled = false)
    public void searchProductName(){
        //输入产品名称
        webDriver.findElement(By.xpath(futurePrice.getProductNum_new())).sendKeys("莱赛尔一拍松桑蚕丝被");
        //点击查询
        webDriver.findElement(By.xpath(futurePrice.getSearchButton_new())).click();
        //勾选产品
        webDriver.findElement(By.xpath(futurePrice.getProductCheck1())).click();
        //点击确认
        webDriver.findElement(By.xpath(futurePrice.getProductComfirm())).click();
        //退出添加页面
        webDriver.findElement(By.xpath(futurePrice.getWindowQuit2())).click();
    }
    @Test(priority = 21)
    public void foProductsImport() throws InterruptedException {
        //点击导入
        webDriver.findElement(By.xpath(futurePrice.getProductImport())).click();
        //点击下载模板
        webDriver.findElement(By.xpath(futurePrice.getClickDownLoad())).click();
        //点击上传
        webDriver.findElement(By.xpath(futurePrice.getClickUpLoad())).click();
        Thread.sleep(5000);
        /**
         * 上传脚本
         * */
        try {
            Runtime.getRuntime().exec("src\\document\\priceUpload.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Thread.sleep(10000);
        //点击下一步
        webDriver.findElement(By.xpath(futurePrice.getNext1())).click();
        //点击完成
        webDriver.findElement(By.xpath(futurePrice.getFine())).click();
    }
    @Test(priority = 22)
    public void remove(){
        //选择商品，点击删除
        webDriver.findElement(By.xpath(futurePrice.getProductCheck2())).click();
        webDriver.findElement(By.xpath(futurePrice.getProductRemove())).click();
    }
    @Test(priority = 23)
    public void comfirm(){
        //新建确认
        webDriver.findElement(By.xpath(futurePrice.getComfirm())).click();
    }
    @Test(priority = 24)
    public void voucherEdit() throws InterruptedException {
        Thread.sleep(2000);
        //点击编辑
        webDriver.findElement(By.xpath(futurePrice.getVoucherEdit())).click();
        //修改备注
        webDriver.findElement(By.xpath(futurePrice.getRemarks())).sendKeys("编辑产生的备注");
        //确认
        webDriver.findElement(By.xpath(futurePrice.getComfirm())).click();
    }
    //确认键
    @Test(priority = 26)
    public void voucherComfirm1() throws InterruptedException {

        //确认
        webDriver.findElement(By.xpath(futurePrice.getVoucherComfirm())).click();
        //取消确认
        webDriver.findElement(By.xpath(futurePrice.getVoucherCancel2())).click();
        //确认
        webDriver.findElement(By.xpath(futurePrice.getVoucherComfirm())).click();
        //确认确认
        webDriver.findElement(By.xpath(futurePrice.getVocherComfirm1())).click();
        //查看
        webDriver.findElement(By.xpath(futurePrice.getVoucherCheck())).click();
        Thread.sleep(1000);
        //点击退出
        webDriver.findElement(By.xpath(futurePrice.getWindowQuit2())).click();
    }
    //审核
    @Test(priority = 27)
    public void vocherAuditAndCheck(){
        //确认审核
        webDriver.findElement(By.xpath(futurePrice.getVoucherAudit())).click();
        webDriver.findElement(By.xpath(futurePrice.getVocherComfirm1())).click();
        //查看
        webDriver.findElement(By.xpath(futurePrice.getVoucherCheck())).click();
        //点击退出
        webDriver.findElement(By.xpath(futurePrice.getWindowQuit2())).click();
    }
    @Test(priority = 28)
    public void voucherCancel2(){
        //取消审核
        webDriver.findElement(By.xpath(futurePrice.getVoucherAudit())).click();
        webDriver.findElement(By.xpath(futurePrice.getVocherComfirm1())).click();
    }
    @Test(priority = 29)
    public void voucherCancel1(){
        //取消确定
        webDriver.findElement(By.xpath(futurePrice.getVoucherCancel())).click();
        webDriver.findElement(By.xpath(futurePrice.getVocherComfirm1())).click();
    }
    @Test(priority = 30)
    public void voucherInvaild(){
        //作废
        webDriver.findElement(By.xpath(futurePrice.getVoucherInvaild())).click();
        webDriver.findElement(By.xpath(futurePrice.getVocherComfirm1())).click();
    }
    @Test(priority = 31)
    public void voucherExpects(){
        //导出
        webDriver.findElement(By.xpath(futurePrice.getVouchersExport())).click();
    }

    @AfterClass
    public void quitEnv(){
        webDriver.quit();
    }
}
