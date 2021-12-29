package com.testOms.ManagedFutures;

/**
 *
 * 期货管理-订货会
 *
 * 需要修改新建中得订货会编码和订货会名称
 *
 *
 *
 * */
import element.futuresManagement.exchangeFair;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Set;

public class testCaseFuturesOrder {
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
        WebElement oms = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(exchangeFair.managedFturesPath)));
        oms.click();
    }

    //订货会
    @Test(priority = 3)
    public void exchangeFairInto(){
        WebDriverWait wait = new WebDriverWait(webDriver,3);
        WebElement ef = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(exchangeFair.exchangeFairPath)));
        ef.click();

    }
        //订货会名称
    @Test(priority = 4)
    public void exhangeFairName() throws InterruptedException{
        webDriver.findElement(By.xpath(exchangeFair.getExchangeFairName())).sendKeys("订货会测试");
        //搜索按键
        webDriver.findElement(By.xpath(exchangeFair.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(exchangeFair.getResetButton())).click();
    }
    //订货会编码
    @Test(priority = 5)
    public void exhangeFairNum() throws InterruptedException {
        webDriver.findElement(By.xpath(exchangeFair.getExchangeFairNum())).sendKeys("JF22SS");
        //搜索按键
        webDriver.findElement(By.xpath(exchangeFair.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(exchangeFair.getResetButton())).click();
    }
    //订货会开始日期
    @Test(priority = 6)
    public void exhangeFairBeginTime() throws InterruptedException {
        //起始时间下拉框
        webDriver.findElement(By.xpath(exchangeFair.getCreatTimeB())).sendKeys("2021-11-30");
        //结束时间下拉框
        webDriver.findElement(By.xpath(exchangeFair.getFinishTimeB())).sendKeys("2021-12-2");
        //搜索按键
        webDriver.findElement(By.xpath(exchangeFair.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(exchangeFair.getResetButton())).click();
    }
    //订货会开始日期
    @Test(priority = 7)
    public void exhangeFairEndTime() throws InterruptedException {
        //起始时间下拉框
        webDriver.findElement(By.xpath(exchangeFair.getCreatTimeE())).sendKeys("2021-12-20");
        //结束时间下拉框
        webDriver.findElement(By.xpath(exchangeFair.getFinishTimeE())).sendKeys("2021-12-22");
        //搜索按键
        webDriver.findElement(By.xpath(exchangeFair.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(exchangeFair.getResetButton())).click();
    }
    //使用范围
    @Test(priority = 8)
    public void usableRange() throws InterruptedException {
        //适用范围下拉框
        webDriver.findElement(By.xpath(exchangeFair.getUsableRange())).click();
        //使用范围选择
        webDriver.findElement(By.xpath(exchangeFair.getChooseUsableRange())).click();
        //搜索按键
        webDriver.findElement(By.xpath(exchangeFair.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(exchangeFair.getResetButton())).click();
    }
    //创建人
    @Test(priority = 9)
    public void founder() throws InterruptedException {
        webDriver.findElement(By.xpath(exchangeFair.getFoungder())).sendKeys("高晓博");
        //搜索按键
        webDriver.findElement(By.xpath(exchangeFair.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(exchangeFair.getResetButton())).click();
    }
    //备注
    @Test(priority = 10)
    public void remarks() throws InterruptedException{
        webDriver.findElement(By.xpath(exchangeFair.getRemarks())).sendKeys("2026定货会");
        //搜索按键
        webDriver.findElement(By.xpath(exchangeFair.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(exchangeFair.getResetButton())).click();
    }
    //是否可用
    @Test(priority = 11)
    public void aviailableOrNot() throws InterruptedException {
        //适用范围下拉框
        webDriver.findElement(By.xpath(exchangeFair.getAvailableOrNot())).click();
        //使用范围选择
        webDriver.findElement(By.xpath(exchangeFair.getChooseOne())).click();
        //搜索按键
        webDriver.findElement(By.xpath(exchangeFair.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(exchangeFair.getResetButton())).click();
    }

    /*****---新建---****/

    @Test(priority = 12)
    public void newButton(){
        webDriver.findElement(By.xpath(exchangeFair.getNewButton())).click();
    }
    @Test(priority = 13)
    public void windowquit1(){
        webDriver.findElement(By.xpath(exchangeFair.getWindowQuit1())).click();
        webDriver.findElement(By.xpath(exchangeFair.getNewButton())).click();
    }
    @Test(priority = 14)
    public void cancel(){
        webDriver.findElement(By.xpath(exchangeFair.getCancel())).click();
        webDriver.findElement(By.xpath(exchangeFair.getNewButton())).click();
    }
    //输入订货会编号
    @Test(priority = 15)
    public void exchangeFairNew(){
        webDriver.findElement(By.xpath(exchangeFair.getExchangeFairNum_new())).sendKeys("ZDH1227-2");
    }
    //输入订货会名称
    @Test(priority = 16)
    public void exchangeFairNameNew(){
        webDriver.findElement(By.xpath(exchangeFair.getExchangeFair_new())).sendKeys("1227-2");
    }
    //时间选择
    @Test(priority = 17)
    public void  timeNew1(){
        //起始时间下拉框
        webDriver.findElement(By.xpath(exchangeFair.getCreatTime_new())).sendKeys("2021-12-5");
        //结束时间下拉框
        webDriver.findElement(By.xpath(exchangeFair.getFinishTime_new())).sendKeys("2021-12-27");

    }
    //备注
    @Test(priority = 18)
    public void remarks2(){
        webDriver.findElement(By.xpath(exchangeFair.getRemarks_new())).sendKeys("2026定货会");
    }
    //是否可用
    @Test(priority = 19)
    public void availableOrNot2(){
        //点击取消覆盖
        webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/section/div/div[3]/div/div[1]")).click();
        //适用范围
        webDriver.findElement(By.xpath(exchangeFair.getChooseButton())).click();

    }
    //适用范围
    @Test(priority = 20)
    public void usableRangeNew(){
        //适用范围下拉框
        webDriver.findElement(By.xpath(exchangeFair.getUsableRange_new())).click();
        webDriver.findElement(By.xpath(exchangeFair.chooseUsableRange_new)).click();
        //确认按钮
        webDriver.findElement(By.xpath(exchangeFair.getComfirm())).click();
    }
    @Test(priority = 21)
    public void productEdit(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDriver.findElement(By.xpath(exchangeFair.getVoucherEdit())).click();
        //适用范围
        webDriver.findElement(By.xpath(exchangeFair.getChooseButton())).click();
        //确认按钮
        webDriver.findElement(By.xpath(exchangeFair.getComfirm())).click();
    }
    @AfterClass
    public void quitEnv(){
        webDriver.quit();
    }

}
