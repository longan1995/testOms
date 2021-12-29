package com.testOms.ManangedOrder;

import element.orderManagement.purchaseOrder;
import element.orderManagement.shippingAddress;
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

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Set;

public class testCaseShippingAddress {
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

    //收货地址
    @Test(priority = 3)
    public void address() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        WebElement ef = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(shippingAddress.getShippingAddress())));
        ef.click();
    }

    //店铺编码
    @Test(priority = 4)
    public void storeNum() {
        webDriver.findElement(By.xpath(shippingAddress.getStoreNum())).sendKeys("1111");
        //查询
        webDriver.findElement(By.xpath(shippingAddress.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(shippingAddress.getResetButton()));
    }

    //店铺编码
    @Test(priority = 5)
    public void storeName() {
        webDriver.findElement(By.xpath(shippingAddress.getStoreName())).sendKeys("1111");
        //查询
        webDriver.findElement(By.xpath(shippingAddress.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(shippingAddress.getResetButton()));
    }

    //店铺状态
    @Test(priority = 5)
    public void storeState() {
        webDriver.findElement(By.xpath(shippingAddress.getStoreState())).click();
        webDriver.findElement(By.xpath(shippingAddress.getChooseStoreState())).click();
        //查询
        webDriver.findElement(By.xpath(shippingAddress.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(shippingAddress.getResetButton()));
    }

    //联系人
    @Test(priority = 6)
    public void contact() {
        webDriver.findElement(By.xpath(shippingAddress.getContact())).sendKeys("马园");
        //查询
        webDriver.findElement(By.xpath(shippingAddress.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(shippingAddress.getResetButton()));
    }

    @Test(priority = 7)
    public void contactNum() {
        webDriver.findElement(By.xpath(shippingAddress.getContactNum())).sendKeys("13900000000");
        //查询
        webDriver.findElement(By.xpath(shippingAddress.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(shippingAddress.getResetButton()));
    }

    @Test(priority = 8)
    public void shippingAddress() {
        webDriver.findElement(By.xpath(shippingAddress.getShippingAddress())).sendKeys("马园路212号");
        //查询
        webDriver.findElement(By.xpath(shippingAddress.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(shippingAddress.getResetButton()));
    }

    @Test(priority = 9)
    public void available() {
        webDriver.findElement(By.xpath(shippingAddress.getAvailable())).click();
        webDriver.findElement(By.xpath(shippingAddress.getChooseAvailable())).click();
        //查询
        webDriver.findElement(By.xpath(shippingAddress.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(shippingAddress.getResetButton()));
    }

    //是否默认
    @Test(priority = 10)
    public void dfault() {
        webDriver.findElement(By.xpath(shippingAddress.getDefaultT())).click();
        webDriver.findElement(By.xpath(shippingAddress.getChooseDfaultT())).click();
        //查询
        webDriver.findElement(By.xpath(shippingAddress.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(shippingAddress.getResetButton())).click();
    }
    //打开新建窗口
    @Test(priority = 11)
    public void newVoucher() {
        webDriver.findElement(By.xpath(shippingAddress.getNewButton())).click();
        webDriver.findElement(By.xpath(shippingAddress.getWindowsCancel())).click();
        webDriver.findElement(By.xpath(shippingAddress.getNewButton())).click();
    }
    //店铺编号输入
    @Test(priority = 12)
    public void storeNumImport(){
        webDriver.findElement(By.xpath(shippingAddress.getStoreNumImport())).sendKeys("A010005CS005");
        webDriver.findElement(By.xpath(shippingAddress.getSearchButton1())).click();
        webDriver.findElement(By.xpath(shippingAddress.getStorePick())).click();
        webDriver.findElement(By.xpath(shippingAddress.getStoreComfirm())).click();
    }
    //店铺编号输入
    @Test(priority = 12,enabled = false)
    public void storeNameImport(){
        webDriver.findElement(By.xpath(shippingAddress.getStoreNumImport())).sendKeys("宁波博洋家纺直营旗舰店");
        webDriver.findElement(By.xpath(shippingAddress.getSearchButton1())).click();
        webDriver.findElement(By.xpath(shippingAddress.getStorePick())).click();
        webDriver.findElement(By.xpath(shippingAddress.getStoreComfirm())).click();
    }
    //站点名称
    @Test(priority = 13)
    public void siteName(){
        webDriver.findElement(By.xpath(shippingAddress.getSiteName())).sendKeys("测试站点");
    }
    //省市区
    @Test(priority = 14)
    public void provinces(){
        webDriver.findElement(By.xpath(shippingAddress.getProvinces())).sendKeys(Keys.ARROW_DOWN);
    }
    //收货地址
    @Test(priority = 15)
    public void addressNew(){
        webDriver.findElement(By.xpath(shippingAddress.getAddress())).sendKeys("26");
    }
    //联系人
    @Test(priority = 16)
    public void contactNameNew(){
        webDriver.findElement(By.xpath(shippingAddress.getContact_new())).sendKeys("树先生");
    }
    //联系人电话
    @Test(priority = 17)
    public void contactNumNew(){
        webDriver.findElement(By.xpath(shippingAddress.getContactNum_new())).sendKeys("13900000000");
    }
    //是否可用
    @Test(priority = 18)
    public void availableNew(){
        webDriver.findElement(By.xpath(shippingAddress.getAvailable_new())).click();
    }
    //确认创建
    @Test(priority = 19)
    public void comfirm(){
        webDriver.findElement(By.xpath(shippingAddress.getWindowsComfirm())).click();
    }
    @Test(priority = 20)
    public void edit(){
        webDriver.findElement(By.xpath(shippingAddress.getVoucherEdit())).click();
        //修改是否可用
        webDriver.findElement(By.xpath(shippingAddress.getAvailable_new())).click();
        webDriver.findElement(By.xpath(shippingAddress.getWindowsComfirm())).click();
    }
    @Test(priority = 21)
    public void voucherExpects(){
        //导出
        webDriver.findElement(By.xpath(shippingAddress.getVouchersExport())).click();
    }
    @AfterClass
    public void quitEnv(){
        webDriver.quit();
    }
}
















