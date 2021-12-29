package com.testOms.ManangedOrder;

import element.orderManagement.distributionSet;
import element.orderManagement.orderSet;
import element.orderManagement.purchaseOrder;
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

public class testCaseDistributionSet {
    public WebDriver webDriver;

    @BeforeClass
    public void setUpEnv() {
        Path path = Paths.get("src", "drivers", "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", path.toAbsolutePath().toString());

        //创建浏览器实例
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://mall.beyond-itcenter.com/uums/login/");

        //隐式等待 5s
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

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
    public void testSwithchWindows() {
        //点击oms系统
        webDriver.findElement(By.xpath(purchaseOrder.getOmsC())).click();
        //当前页面句柄
        String currentwindows = webDriver.getWindowHandle();
        //存放句柄
        Set<String> allWindows = webDriver.getWindowHandles();
        for (String window : allWindows) {
            if (window != currentwindows) {
                webDriver.switchTo().window(window);
            }
        }
    }

    //订单管理
    @Test(priority = 2)
    public void lockGoodsManagement() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        WebElement oms = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(purchaseOrder.getOmsM())));
        oms.click();
    }

    //订货设置
    @Test(priority = 3)
    public void orderSet() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        WebElement ef = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(distributionSet.getDistributionSetHtml())));
        ef.click();
    }

    //店铺编号
    @Test(priority = 5)
    public void storeNum() {
        webDriver.findElement(By.xpath(distributionSet.getStoreNum())).sendKeys("456132");
        //查询
        webDriver.findElement(By.xpath(distributionSet.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(distributionSet.getResetButton())).click();
    }

    //店铺名称
    @Test(priority = 6)
    public void storeName() {
        webDriver.findElement(By.xpath(distributionSet.getStoreName())).sendKeys("宁波博洋家纺直营旗舰店");
        //查询
        webDriver.findElement(By.xpath(distributionSet.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(distributionSet.getResetButton())).click();
    }

    //适用范围
    @Test(priority = 7)
    public void range() {
        webDriver.findElement(By.xpath(distributionSet.getUseRange())).click();
        webDriver.findElement(By.xpath(distributionSet.getChooseUseRange())).click();
        //查询
        webDriver.findElement(By.xpath(distributionSet.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(distributionSet.getResetButton())).click();
    }

    //是否可用
    @Test(priority = 8)
    public void available() {
        webDriver.findElement(By.xpath(distributionSet.getAvailable())).click();
        webDriver.findElement(By.xpath(distributionSet.getChooseAvailable())).click();
        //查询
        webDriver.findElement(By.xpath(distributionSet.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(distributionSet.getResetButton())).click();
    }

    //时间筛选
    @Test(priority = 9)
    public void orderTimeB() throws InterruptedException {
        //起始时间下拉框
        webDriver.findElement(By.xpath(distributionSet.getCreatTimeB())).sendKeys("2021-12-16");
        //结束时间下拉框
        webDriver.findElement(By.xpath(distributionSet.getFinishTimeB())).sendKeys("2021-12-17");
        //搜索按键
        webDriver.findElement(By.xpath(distributionSet.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(distributionSet.getResetButton())).click();
    }

    //时间筛选
    @Test(priority = 10)
    public void orderTimeE() throws InterruptedException {
        //起始时间下拉框
        webDriver.findElement(By.xpath(distributionSet.getCreatTimeE())).sendKeys("2021-12-16");
        //结束时间下拉框
        webDriver.findElement(By.xpath(distributionSet.getFinishTimeE())).sendKeys("2021-12-17");
        //搜索按键
        webDriver.findElement(By.xpath(distributionSet.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(distributionSet.getResetButton())).click();
    }

    //备注
    @Test(priority = 11)
    public void remarks() {
        webDriver.findElement(By.xpath(distributionSet.getRemarks())).sendKeys("查询");
    }


    //打开新建窗口
    @Test(priority = 12)
    public void newVoucher() {
        webDriver.findElement(By.xpath(distributionSet.getNewButton())).click();
        webDriver.findElement(By.xpath(distributionSet.getWindowsCancel())).click();
        webDriver.findElement(By.xpath(distributionSet.getNewButton())).click();
    }
    //订单类型
    @Test(priority = 13)
    public void orderType() {
        webDriver.findElement(By.xpath(distributionSet.getOrderType_new())).click();
        webDriver.findElement(By.xpath(distributionSet.getChooseOrderType_new())).click();
        //查询
        webDriver.findElement(By.xpath(distributionSet.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(distributionSet.getResetButton())).click();
    }
    //是否可用
    @Test(priority = 14)
    public void availableNew(){
        webDriver.findElement(By.xpath(distributionSet.getAvailable_new())).click();
    } //时间筛选
    @Test(priority = 15)
    public void orderTime() throws InterruptedException {
        //起始时间下拉框
        webDriver.findElement(By.xpath(distributionSet.getCreatTime_new())).sendKeys("2021-12-16");
        //结束时间下拉框
        webDriver.findElement(By.xpath(distributionSet.getFinishTime_new())).sendKeys("2021-12-17");
    }
    //备注
    @Test(priority = 16)
    public void remarksNew() {
        webDriver.findElement(By.xpath(distributionSet.getRemarks_new())).sendKeys("新建");
    }
    //适用范围
    @Test(priority = 17)
    public void useRange(){
        webDriver.findElement(By.xpath(distributionSet.getUseRange_new())).click();
        webDriver.findElement(By.xpath(distributionSet.getChooseUseRange_new())).click();
    }
    //新建完成
    @Test(priority = 18)
    public void orderSetComfirm(){
        webDriver.findElement(By.xpath(orderSet.getWindowComfirm())).click();
    }
    @Test(priority = 19)
    public void edit(){
        webDriver.findElement(By.xpath(orderSet.getVoucherEdit())).click();
        //修改是否可用
        webDriver.findElement(By.xpath(orderSet.getAvailable_new())).click();
        webDriver.findElement(By.xpath(orderSet.getWindowComfirm())).click();
    }
    @Test(priority = 20)
    public void voucherExpects(){
        //导出
        webDriver.findElement(By.xpath(orderSet.getVouchersExport())).click();
    }
    @AfterClass
    public void quitEnv(){
        webDriver.quit();
    }
}
