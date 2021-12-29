package com.testOms.ManagedPrice;

import element.futuresManagement.futuresOrder;
import element.priceManagement.distributionPrice;
import element.priceManagement.futurePrice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Set;

public class testCaseDistributionPrice {
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
    /**
     * 分销价格
     *
     * */
    @Test(priority = 32)
    public void distributionPrice(){
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        WebElement oms = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(distributionPrice.getDPrice())));
        oms.click();

    }
    //订货会选择
    @Test(priority = 33)
    public void ExchangeFairDP() throws InterruptedException{
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
    @Test(priority = 34)
    public void priceNumDP() throws InterruptedException{
        //价格单号输入
        webDriver.findElement(By.xpath(futurePrice.getPriceNum())).sendKeys("12213123");
        //搜索按键
        webDriver.findElement(By.xpath(futurePrice.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(futurePrice.getResetButton())).click();
    }
    //价格状态
    @Test(priority = 35)
    public void priceStateDP() throws InterruptedException{
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
    @Test(priority = 36)
    public void usableRangeDP() throws InterruptedException{
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
    @Test(priority = 37)
    public void timeBeginDP() throws InterruptedException{
        //起始时间下拉框
        webDriver.findElement(By.xpath(futurePrice.getCreatTime1())).click();
        //时间选择
        webDriver.findElement(By.xpath(futurePrice.getChooseCreatTime1())).click();
        //结束时间下拉框
        webDriver.findElement(By.xpath(futurePrice.getFinishTime1())).click();
        //时间选择
        webDriver.findElement(By.xpath(futurePrice.getChooseFinishTime1())).click();
        //搜索按键
        webDriver.findElement(By.xpath(futurePrice.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(futurePrice.getResetButton())).click();
    }
    //结束时间
    @Test(priority = 38)
    public void timeEndDP() throws InterruptedException{
        //起始时间下拉框
        webDriver.findElement(By.xpath(futurePrice.getCreatTime2())).click();
        //时间选择
        webDriver.findElement(By.xpath(futurePrice.getChooseCreatTime2())).click();
        //结束时间下拉框
        webDriver.findElement(By.xpath(futurePrice.getFinishTime2())).click();
        //时间选择
        webDriver.findElement(By.xpath(futurePrice.getChooseFinishTime2())).click();
        //搜索按键
        webDriver.findElement(By.xpath(futurePrice.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(futurePrice.getResetButton())).click();
    }
    //创建人
    @Test(priority = 39)
    public void  founderDP() throws InterruptedException{
        //创建人
        webDriver.findElement(By.xpath(futurePrice.getPriceNum())).sendKeys("20110049");
        //搜索按键
        webDriver.findElement(By.xpath(futurePrice.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(futurePrice.getResetButton())).click();
    }
    @Test(priority = 40)
    public void newButtonDP(){
        webDriver.findElement(By.xpath(futurePrice.getNewButton())).click();
    }
    @Test(priority = 41)
    public void windowquit1DP(){
        webDriver.findElement(By.xpath(futurePrice.getWindowQuit1())).click();
        webDriver.findElement(By.xpath(futurePrice.getNewButton())).click();
    }
    @Test(priority = 42)
    public void cancelDP(){
        webDriver.findElement(By.xpath(futurePrice.getCancel())).click();
        webDriver.findElement(By.xpath(futurePrice.getNewButton())).click();
    }
    @Test(priority = 43)
    public void chooseExchangeFairDP() throws InterruptedException{
        //订货会下拉框
        webDriver.findElement(By.xpath(futurePrice.getExchangeFair_new())).click();
        //订货会选择
        webDriver.findElement(By.xpath(futurePrice.getChooseExchangeFair_new())).click();
    }
    @Test(priority = 44)
    public void creatAndEndTimeDP()throws InterruptedException{
        //起始时间下拉框
        webDriver.findElement(By.xpath(futurePrice.getCreatTime_new())).click();
        //时间选择
        webDriver.findElement(By.xpath(futurePrice.getChooseCreatTime_new())).click();
        //结束时间下拉框
        webDriver.findElement(By.xpath(futurePrice.getFinishTime_new())).click();
        //时间选择
        webDriver.findElement(By.xpath(futurePrice.getChooseFinishTime_new())).click();
    }
    @Test(priority = 45)
    public void remarksDP() throws InterruptedException{
        //备注
        webDriver.findElement(By.xpath(futurePrice.getRemarks())).sendKeys("8888");
    }
    @Test(priority = 46)
    public void usableRangeNewDP() throws InterruptedException{
        //订货会下拉框
        webDriver.findElement(By.xpath(futurePrice.getUsableRange_new())).click();
        //订货会选择
        webDriver.findElement(By.xpath(futurePrice.getChooseUsableRange_new())).click();
    }
    @Test(priority = 47)
    public void addButtonDP(){
        webDriver.findElement(By.xpath(futurePrice.getAdd_new())).click();
    }
    @Test(priority = 48)
    public void searchProductNumDP(){
        //输入产品编码
        webDriver.findElement(By.xpath(futurePrice.getProductNum_new())).sendKeys("91113233213");
        //点击查询
        webDriver.findElement(By.xpath(futurePrice.getSearchButton_new())).click();
        //勾选产品
        webDriver.findElement(By.xpath(futurePrice.getProductCheck1())).click();
        //点击确认
        webDriver.findElement(By.xpath(futurePrice.getProductComfirm())).click();
    }
    @Test(priority = 49)
    public void searchProductNameDP(){
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
    @Test(priority = 50)
    public void productImportDP() throws InterruptedException {
        //点击导入
        webDriver.findElement(By.xpath(futurePrice.getProductImport())).click();
        //点击下载模板
        webDriver.findElement(By.xpath(futurePrice.getClickDownLoad())).click();
        //点击上传
        webDriver.findElement(By.xpath(futurePrice.getClickUpLoad())).click();
        Thread.sleep(2000);
        /**
         * 上传脚本
         * */
        try {
            Runtime.getRuntime().exec("src\\document\\upload.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Thread.sleep(10000);
        //点击下一步
        webDriver.findElement(By.xpath(futurePrice.getNext1())).click();
        //点击完成
        webDriver.findElement(By.xpath(futurePrice.getFine())).click();
    }
    @Test(priority = 51)
    public void removeDP(){
        //选择商品，点击删除
        webDriver.findElement(By.xpath(futurePrice.getProductCheck2())).click();
        webDriver.findElement(By.xpath(futurePrice.getProductRemove())).click();
    }
    @Test(priority = 52)
    public void comfirmDP(){
        //新建确认
        webDriver.findElement(By.xpath(futurePrice.getComfirm())).click();
    }
    @Test(priority = 53)
    public void voucherEditDP(){
        //点击编辑
        webDriver.findElement(By.xpath(futurePrice.getVoucherEdit())).click();
        webDriver.findElement(By.xpath(futurePrice.getRemarks())).sendKeys("编辑后备注");
        webDriver.findElement(By.xpath(futurePrice.getComfirm())).click();
    }
    @Test(priority = 54)
    public void voucherComfirmDP(){
        //点击确认
        webDriver.findElement(By.xpath(futurePrice.getProductComfirm())).click();
        webDriver.findElement(By.xpath(futuresOrder.getVocherComfirm())).click();
    }
    @Test(priority = 55)
    public void voucherAuditDP(){
        //审核
        webDriver.findElement(By.xpath(futurePrice.getVoucherAudit())).click();
        webDriver.findElement(By.xpath(futuresOrder.getVocherComfirm())).click();
    }
    @Test(priority = 56)
    public void vocherCheckDP(){
        //查看
        webDriver.findElement(By.xpath(futurePrice.getVoucherCheck())).click();
        //点击退出
        webDriver.findElement(By.xpath(futurePrice.getWindowQuit2())).click();
    }
    @Test(priority = 57)
    public void voucherCancelDP2(){
        //取消审核
        webDriver.findElement(By.xpath(futurePrice.getVoucherAudit())).click();
        webDriver.findElement(By.xpath(futuresOrder.getVocherComfirm())).click();
    }
    @Test(priority = 58)
    public void voucherCancelDP1(){
        //取消确定
        webDriver.findElement(By.xpath(futurePrice.getVoucherCancel())).click();
        webDriver.findElement(By.xpath(futuresOrder.getVocherComfirm())).click();
    }
    @Test(priority = 59)
    public void voucherInvaildDP(){
        //作废
        webDriver.findElement(By.xpath(futurePrice.getVoucherInvaild())).click();
        webDriver.findElement(By.xpath(futuresOrder.getVocherComfirm())).click();
    }
    @Test(priority = 60)
    public void voucherExpectsDP(){
        //导出
        webDriver.findElement(By.xpath(futurePrice.getVouchersExport())).click();
    }
    @AfterClass
    public void quitEnv(){
        webDriver.quit();
    }
}
