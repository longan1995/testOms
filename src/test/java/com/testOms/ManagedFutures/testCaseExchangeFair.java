package com.testOms.ManagedFutures;


/**
 *
 * 期货管理-期货单
 *
 * */


import element.futuresManagement.exchangeFair;
import element.futuresManagement.futuresOrder;
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

public class testCaseExchangeFair {
    public WebDriver webDriver;
    @BeforeClass
    public void setUpEnv(){
        Path path = Paths.get("src","drivers","chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",path.toAbsolutePath().toString());

        //创建浏览器实例
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://mall.beyond-itcenter.com/uums/login/");

        //隐式等待 5s
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

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
    }

    //新oms系统
    @Test(priority = 1)
    public void testSwithchWindows(){
        //点击oms系统
        webDriver.findElement(By.xpath(exchangeFair.getOmsC())).click();
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
    //期货管理
    @Test(priority = 2)
    public void managedFutures(){
        WebDriverWait wait = new WebDriverWait(webDriver,3);
        WebElement oms = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(element.futuresManagement.exchangeFair.managedFturesPath)));
        oms.click();
    }
    //期货单页面
    @Test(priority = 22)
    public void futuresOrder(){
        WebDriverWait wait = new WebDriverWait(webDriver,5);
        WebElement fo = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(futuresOrder.getFuturesOrder())));
        fo.click();
    }

    //期货单号
    @Test(priority = 23)
    public void futuresOrderNum() throws InterruptedException{
        webDriver.findElement(By.xpath(futuresOrder.getFuturesNum())).sendKeys("QHDD20211130000001");
        //搜索按键
        webDriver.findElement(By.xpath(futuresOrder.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(futuresOrder.getResetButton())).click();
    }
    //期货状态
    @Test(priority = 24)
    public void futuresOrderState()throws InterruptedException{
        //期货状态下拉框
        webDriver.findElement(By.xpath(futuresOrder.getFuturesState())).click();
        //期货状态
        webDriver.findElement(By.xpath(futuresOrder.getChooseFuturesState())).click();
        //搜索按键

        webDriver.findElement(By.xpath(futuresOrder.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(futuresOrder.getResetButton())).click();
    }
    //店铺编号
    @Test(priority = 25)
    public void storeNum()throws InterruptedException{
        webDriver.findElement(By.xpath(futuresOrder.getStoreNum())).sendKeys("A010005CS005");
        //搜索按键
        webDriver.findElement(By.xpath(futuresOrder.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(futuresOrder.getResetButton())).click();
    }
    //店铺名称
    @Test(priority = 26)
    public void storeName() throws InterruptedException{
        webDriver.findElement(By.xpath(futuresOrder.getStoreName())).sendKeys("宁波博洋家纺直营旗舰店");
        //搜索按键
        webDriver.findElement(By.xpath(futuresOrder.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(futuresOrder.getResetButton())).click();
    }
    //订货会
    @Test(priority = 27)
    public void exchangeFair()throws InterruptedException{
        //期货状态下拉框
        webDriver.findElement(By.xpath(futuresOrder.getExchangeFair())).click();
        //期货状态
        webDriver.findElement(By.xpath(futuresOrder.getChooseExchangeFair())).click();
        //搜索按键
        webDriver.findElement(By.xpath(futuresOrder.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(futuresOrder.getResetButton())).click();
    }
    @Test(priority = 28)
    public void  timeNew() throws InterruptedException{
        //起始时间下拉框
        webDriver.findElement(By.xpath(futuresOrder.getCreatTime())).sendKeys("2021-12-22");
        //结束时间下拉框
        webDriver.findElement(By.xpath(futuresOrder.getFinishTime())).sendKeys("2021-12-23");
        //搜索按键
        webDriver.findElement(By.xpath(futuresOrder.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(futuresOrder.getResetButton())).click();
    }
    //作废隐藏按钮
    @Test(priority = 28)
    public void hideInvalidDocuments(){
        webDriver.findElement(By.xpath(futuresOrder.getHideInvalidDocuments())).click();
    }
    /*****---新建---****/

    @Test(priority = 29)
    public void newButtonf(){
        webDriver.findElement(By.xpath(futuresOrder.getNewButton())).click();
    }
    @Test(priority = 30)
    public void windowquitf1(){
        webDriver.findElement(By.xpath(futuresOrder.getWindowQuit1())).click();
        webDriver.findElement(By.xpath(futuresOrder.getNewButton())).click();
    }
    @Test(priority = 31)
    public void cancelf(){
        webDriver.findElement(By.xpath(futuresOrder.getCancel())).click();
        webDriver.findElement(By.xpath(futuresOrder.getNewButton())).click();
    }
    //店铺选择框
    @Test(priority = 32)
    public void storeNumf(){
        webDriver.findElement(By.xpath(futuresOrder.getStoreNum_new())).click();
    }
    //店铺编号输入，搜索
    @Test(priority = 33)
    public void storeNumI() throws InterruptedException{
        webDriver.findElement(By.xpath(futuresOrder.getStoreNumInput())).sendKeys("A010005CS005");
        //搜索
        webDriver.findElement(By.xpath(futuresOrder.getSearchButton_new())).click();
        //选择店铺
        webDriver.findElement(By.xpath(futuresOrder.getStoreCheck())).click();
        //确认
        webDriver.findElement(By.xpath(futuresOrder.getComfirm_new())).click();
    }
    //店铺名称输入，搜索   跳过
    @Test(priority = 33,enabled = false)
    public void storeNameI() throws InterruptedException{
        webDriver.findElement(By.xpath(futuresOrder.getStoreNameInput())).sendKeys("博洋家纺环球银泰店");
        //搜索
        webDriver.findElement(By.xpath(futuresOrder.getSearchButton_new())).click();
        //选择店铺
        webDriver.findElement(By.xpath(futuresOrder.getStoreCheck())).click();
        //确认
        webDriver.findElement(By.xpath(futuresOrder.getComfirm_new())).click();
    }
    //备注
    @Test(priority = 35)
    public void remarksfo(){
        webDriver.findElement(By.xpath(futuresOrder.getRemarks_new())).sendKeys("新建产生的备注");
    }

    //导入
    @Test(priority = 36)
    public void foProductsImport() throws InterruptedException {
        //点击导入
        webDriver.findElement(By.xpath(futuresOrder.getProductImport())).click();
        //点击下载模板
        webDriver.findElement(By.xpath(futuresOrder.getClickDownLoad())).click();
        //点击上传
        webDriver.findElement(By.xpath(futuresOrder.getClickUpLoad())).click();
        Thread.sleep(5000);
        /**
         * 上传脚本
         * */
        try {
            Runtime.getRuntime().exec("src\\document\\upload.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //上传后续步骤
    @Test(priority = 37)
    public void uploadSucess() throws InterruptedException{
        Thread.sleep(6000);
        //点击下一步
        webDriver.findElement(By.xpath(futuresOrder.getNext1())).click();
        //点击完成
        webDriver.findElement(By.xpath(futuresOrder.getFine())).click();
    }
    //删除商品
    @Test(priority = 38)
    public void productsRemove(){
        //选择商品
        webDriver.findElement(By.xpath(futuresOrder.getProductCheck())).click();
        //点击删除
        webDriver.findElement(By.xpath(futuresOrder.getProductRemove())).click();
    }
    //确认
    @Test(priority = 39)
    public void comfirm(){
        webDriver.findElement(By.xpath(futuresOrder.getComfirm())).click();
    }
    //编辑
    @Test(priority = 40)
    public void edit() throws InterruptedException {
        Thread.sleep(2000);
        //点击编辑
        webDriver.findElement(By.xpath(futuresOrder.getVoucherEdit())).click();
        //修改备注
        webDriver.findElement(By.xpath(futuresOrder.getRemarks_new())).sendKeys("编辑产生的备注");
        //确认
        webDriver.findElement(By.xpath(futuresOrder.getComfirm())).click();
    }
    //审核、查看
    @Test(priority = 41)
    public void auditAndCheck(){
        //审核
        webDriver.findElement(By.xpath(futuresOrder.getVoucherAudit())).click();
        //审核取消
        webDriver.findElement(By.xpath(futuresOrder.getVoucherCancel2())).click();
        //审核
        webDriver.findElement(By.xpath(futuresOrder.getVoucherAudit())).click();
        //审核确认
        webDriver.findElement(By.xpath(futuresOrder.getVocherComfirm())).click();
        //查看
        webDriver.findElement(By.xpath(futuresOrder.getVoucherCheck())).click();
    }
    //取消审核，作废
    @Test(priority = 42)
    public void cancelAndInvaild() throws InterruptedException {
        Thread.sleep(1000);
        //取消审核
        webDriver.findElement(By.xpath(futuresOrder.getVoucherCancel1())).click();
        //取消审核取消
        webDriver.findElement(By.xpath(futuresOrder.getVoucherCancel2())).click();
        //取消审核
        webDriver.findElement(By.xpath(futuresOrder.getVoucherCancel1())).click();
        //取消审核确认
        webDriver.findElement(By.xpath(futuresOrder.getVocherComfirm())).click();
        //作废
        webDriver.findElement(By.xpath(futuresOrder.getVoucherInvaild())).click();
        webDriver.findElement(By.xpath(futuresOrder.getVoucherCancel2())).click();
    }
    //批量审核
    @Test(priority = 43)
    public void audits() throws InterruptedException {
        Thread.sleep(1000);
        //选择单据
        webDriver.findElement(By.xpath(futuresOrder.getProductCheck2())).click();
        //批量审核
        webDriver.findElement(By.xpath(futuresOrder.getBatchReview())).click();
        //批量审核取消
        webDriver.findElement(By.xpath(futuresOrder.getVoucherCancel2())).click();
        //批量审核
        webDriver.findElement(By.xpath(futuresOrder.getBatchReview())).click();
        //批量审核确认
        webDriver.findElement(By.xpath(futuresOrder.getVocherComfirm())).click();
    }
    //导出
    @Test(priority = 44)
    public void export(){
        webDriver.findElement(By.xpath(futuresOrder.getVouchersExport())).click();
    }
    @AfterClass
    public void quitEnv(){
        webDriver.quit();
    }
}
