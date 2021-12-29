package com.testOms.ManangedOrder;

import element.orderManagement.invoice;
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

public class testCaseInvoice {
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

    //配货单
    @Test(priority = 3)
    public void lockOrder() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        WebElement ef = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(invoice.getInvoice())));
        ef.click();
    }
    //配货单号编号
    @Test(priority = 4)
    public void invoiceNum() {
        webDriver.findElement(By.xpath(invoice.getInvoiceNum())).sendKeys("");
        //查询
        webDriver.findElement(By.xpath(invoice.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(invoice.getResetButton())).click();
    }
    //订单编号
    @Test(priority = 5)
    public void orderNum() {
        webDriver.findElement(By.xpath(invoice.getOrdreNum())).sendKeys("");
        //查询
        webDriver.findElement(By.xpath(invoice.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(invoice.getResetButton())).click();
    }
    //配货状态
    @Test(priority = 6)
    public void invoiceState() {
        webDriver.findElement(By.xpath(invoice.getInvoiceState())).click();
        webDriver.findElement(By.xpath(invoice.getChooseInvoiceState())).click();
        //查询
        webDriver.findElement(By.xpath(invoice.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(invoice.getResetButton())).click();
    }
    //店铺编号
    @Test(priority = 7)
    public void storeNum() {
        webDriver.findElement(By.xpath(invoice.getStoreNum())).sendKeys("DHD202112240030000009");
        //查询
        webDriver.findElement(By.xpath(invoice.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(invoice.getResetButton())).click();
    }
    //店铺名称
    @Test(priority = 8)
    public void storeName() {
        webDriver.findElement(By.xpath(invoice.getStoreName())).sendKeys("宁波博洋家纺直营旗舰店");
        //查询
        webDriver.findElement(By.xpath(invoice.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(invoice.getResetButton())).click();
    }
    //配货仓库
    @Test(priority = 9)
    public void invoiceWarehouse() {
        webDriver.findElement(By.xpath(invoice.getInvoiceWarehouse())).click();
        webDriver.findElement(By.xpath(invoice.getChooseInvoiceWarehouse())).click();
        //查询
        webDriver.findElement(By.xpath(invoice.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(invoice.getResetButton())).click();
    }

    //时间筛选
    @Test(priority = 10)
    public void orderTimeB() throws InterruptedException {
        //起始时间下拉框
        webDriver.findElement(By.xpath(invoice.getCreatTime())).sendKeys("2021-12-16");
        //结束时间下拉框
        webDriver.findElement(By.xpath(invoice.getFinishTime())).sendKeys("2021-12-17");
        //搜索按键
        webDriver.findElement(By.xpath(invoice.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(invoice.getResetButton())).click();

    }
    @Test(priority = 11)
    public void remarks(){
        webDriver.findElement(By.xpath(invoice.getRemarks())).sendKeys("宁波博洋家纺直营旗舰店");
        //查询
        webDriver.findElement(By.xpath(invoice.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(invoice.getResetButton())).click();
    }
    @Test(priority = 12)
    public void founder(){
        webDriver.findElement(By.xpath(invoice.getFounder())).sendKeys("宁波博洋家纺直营旗舰店");
        //查询
        webDriver.findElement(By.xpath(invoice.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(invoice.getResetButton())).click();
    }
    //隐藏
    @Test(priority = 13)
    public void hideInvalidDocuments() {
        webDriver.findElement(By.xpath(invoice.getHideInvalidDocuments())).click();
    }
    @Test(priority = 14)
    public void voucherEdit() throws InterruptedException {
        Thread.sleep(2000);
        //点击编辑
        webDriver.findElement(By.xpath(invoice.getVoucherEdit())).click();
        //修改备注
        webDriver.findElement(By.xpath(invoice.getRemarks_new())).sendKeys("编辑产生的备注");
        //确认
        webDriver.findElement(By.xpath(invoice.getEditComfirm())).click();
    }
    //确认键
    @Test(priority = 15)
    public void voucherComfirm1() throws InterruptedException {

        //确认
        webDriver.findElement(By.xpath(invoice.getVoucherComfirm())).click();
        //取消确认
        webDriver.findElement(By.xpath(invoice.getVoucherCancel2())).click();
        //确认
        webDriver.findElement(By.xpath(invoice.getVoucherComfirm())).click();
        //确认确认
        webDriver.findElement(By.xpath(invoice.getVocherComfirm1())).click();
        //查看
        webDriver.findElement(By.xpath(invoice.getVoucherCheck())).click();
        Thread.sleep(1000);
        //点击退出
        webDriver.findElement(By.xpath(invoice.getVoucherCancel3())).click();
    }
    //审核
    @Test(priority = 16)
    public void vocherAuditAndCheck(){
        //确认审核
        webDriver.findElement(By.xpath(invoice.getVoucherAudit())).click();
        webDriver.findElement(By.xpath(invoice.getVocherComfirm1())).click();
        //查看
        webDriver.findElement(By.xpath(invoice.getVoucherCheck())).click();
        //点击退出
        webDriver.findElement(By.xpath(invoice.getVoucherCancel3())).click();
    }
    @Test(priority = 17)
    public void voucherCancel2(){
        //取消审核
        webDriver.findElement(By.xpath(invoice.getVoucherAudit())).click();
        webDriver.findElement(By.xpath(invoice.getVocherComfirm1())).click();
    }
    @Test(priority = 18)
    public void voucherCancel1(){
        //取消确定
        webDriver.findElement(By.xpath(invoice.getVoucherCancel())).click();
        webDriver.findElement(By.xpath(invoice.getVocherComfirm1())).click();
    }
    @Test(priority = 19)
    public void voucherInvaild(){
        //作废
        webDriver.findElement(By.xpath(invoice.getVoucherInvaild())).click();
        webDriver.findElement(By.xpath(invoice.getVocherComfirm1())).click();
    }
    @Test(priority = 20)
    public void voucherExpects(){
        //导出
        webDriver.findElement(By.xpath(invoice.getVouchersExport())).click();
    }

    @AfterClass
    public void quitEnv(){
        webDriver.quit();
    }
}
