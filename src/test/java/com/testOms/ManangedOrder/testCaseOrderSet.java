package com.testOms.ManangedOrder;

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

public class testCaseOrderSet {
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
        WebElement ef = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(orderSet.getOrderSetHtml())));
        ef.click();
    }
    //订单类型
    @Test(priority = 4)
    public void orderType() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        WebElement ef = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(orderSet.getOrderTypeHtml())));
        ef.click();
    }
    //类型名称
    @Test(priority = 5)
    public void typeName(){
        webDriver.findElement(By.xpath(orderSet.getTypeName())).sendKeys("日常订货");
        //查询
        webDriver.findElement(By.xpath(orderSet.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(orderSet.getResetButton())).click();
    }
    //适用范围
    @Test(priority = 6)
    public void range(){
        webDriver.findElement(By.xpath(orderSet.getRange())).click();
        webDriver.findElement(By.xpath(orderSet.getChooseRange())).click();
        //查询
        webDriver.findElement(By.xpath(orderSet.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(orderSet.getResetButton())).click();
    }
    //产品编码/名称
    @Test(priority = 5)
    public void SAngthing(){
        webDriver.findElement(By.xpath(orderSet.getSearchAnything())).sendKeys("111");
        //查询
        webDriver.findElement(By.xpath(orderSet.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(orderSet.getResetButton())).click();
    }
    //适用品牌
    @Test(priority = 6)
    public void brand(){
        webDriver.findElement(By.xpath(orderSet.getBrand())).click();
        webDriver.findElement(By.xpath(orderSet.getChooseBrand())).click();
        //查询
        webDriver.findElement(By.xpath(orderSet.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(orderSet.getResetButton())).click();
    }
    //是否可用
    @Test(priority = 7)
    public void available(){
        webDriver.findElement(By.xpath(orderSet.getAvailable())).click();
        webDriver.findElement(By.xpath(orderSet.getChooseAvailable())).click();
        //查询
        webDriver.findElement(By.xpath(orderSet.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(orderSet.getResetButton())).click();
    }
    /**订单类型新建*/
    //打开新建窗口
    @Test(priority = 8)
    public void newVoucher() {
        webDriver.findElement(By.xpath(orderSet.getNewButton())).click();
        webDriver.findElement(By.xpath(orderSet.getWindowsCancel())).click();
        webDriver.findElement(By.xpath(orderSet.getNewButton())).click();
    }
    //类型名称
    @Test(priority = 9)
    public void typeNameNew(){
        webDriver.findElement(By.xpath(orderSet.getTypeName_new())).sendKeys("测试订货");
    }
    //适用品牌
    @Test(priority = 10)
    public void brandNew(){
        webDriver.findElement(By.xpath(orderSet.getBrand_new())).click();
        webDriver.findElement(By.xpath(orderSet.getChooseBrand_new())).click();
    }
    //备注
    @Test(priority = 11)
    public void remarks(){
        webDriver.findElement(By.xpath(orderSet.getRemarks())).sendKeys("新建备注");
    }
    //是否可用
    @Test(priority = 12)
    public void availableNew(){
        webDriver.findElement(By.xpath(orderSet.getAvailable_new())).click();
    }
    //门店适用范围
    @Test(priority = 13)
    public void storeRange(){
        webDriver.findElement(By.xpath(orderSet.getStoreRange())).click();
        webDriver.findElement(By.xpath(orderSet.getChooseStoreRange())).click();
    }
    //产品适用范围
    @Test(priority = 14)
    public void productRange(){
        webDriver.findElement(By.xpath(orderSet.getProductRange())).click();
        webDriver.findElement(By.xpath(orderSet.getChooseProductRange())).click();
    }
    //新建确认
    @Test(priority = 15)
    public void orderSetComfirm(){
        webDriver.findElement(By.xpath(orderSet.getWindowComfirm())).click();
    }
    @Test(priority = 16)
    public void edit(){
        webDriver.findElement(By.xpath(orderSet.getVoucherEdit())).click();
        //修改是否可用
        webDriver.findElement(By.xpath(orderSet.getAvailable_new())).click();
        webDriver.findElement(By.xpath(orderSet.getWindowComfirm())).click();
    }
    @Test(priority = 17)
    public void voucherExpects(){
        //导出
        webDriver.findElement(By.xpath(orderSet.getVouchersExport())).click();
    }
    /**-----------产品搭配------------**/
    //产品搭配页面
    @Test(priority = 22)
    public void productMix() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        WebElement ef = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(orderSet.getProductMixHtml())));
        ef.click();
    }
    //产品名称
    @Test(priority = 23)
    public void productName(){
        webDriver.findElement(By.xpath(orderSet.getProductName())).sendKeys();
        //查询
        webDriver.findElement(By.xpath(orderSet.getSearchButtonPM())).click();
        //重置
        webDriver.findElement(By.xpath(orderSet.getResetButtonPM())).click();
    }
    //关系类型
    @Test(priority = 24)
    public void relationshipsTypes(){
        webDriver.findElement(By.xpath(orderSet.getRelationshipTypes())).click();
        webDriver.findElement(By.xpath(orderSet.getChooseRelationshipTypes())).click();
        //查询
        webDriver.findElement(By.xpath(orderSet.getSearchButtonPM())).click();
        //重置
        webDriver.findElement(By.xpath(orderSet.getResetButtonPM())).click();
    }
    //适用品牌
    @Test(priority = 25)
    public void brandPM(){
        webDriver.findElement(By.xpath(orderSet.getProductBrand())).click();
        webDriver.findElement(By.xpath(orderSet.getChooseProductBrand())).click();
        //查询
        webDriver.findElement(By.xpath(orderSet.getSearchButtonPM())).click();
        //重置
        webDriver.findElement(By.xpath(orderSet.getResetButtonPM())).click();
    }
    //是否可用
    @Test(priority = 26)
    public void availablePM(){
        webDriver.findElement(By.xpath(orderSet.getAvailablePM())).click();
        webDriver.findElement(By.xpath(orderSet.getChooseAvailablePM())).click();
        //查询
        webDriver.findElement(By.xpath(orderSet.getSearchButtonPM())).click();
        //重置
        webDriver.findElement(By.xpath(orderSet.getResetButtonPM())).click();
    }



    //新建
    @Test(priority = 27)
    public void newButton(){
        webDriver.findElement(By.xpath(orderSet.getNewButtonPM())).click();
        webDriver.findElement(By.xpath(orderSet.getWindowsCancelPM())).click();
        webDriver.findElement(By.xpath(orderSet.getNewButtonPM())).click();
    }
    //适用品牌
    @Test(priority = 28)
    public void brandPMNew(){
        webDriver.findElement(By.xpath(orderSet.getBrandPM_new())).click();
        webDriver.findElement(By.xpath(orderSet.getChooseBrandPM_new())).click();
    }
    //关系类型
    @Test(priority = 29)
    public void relationgshipsTypesPM(){
        webDriver.findElement(By.xpath(orderSet.getRelationshipTypes_new())).click();
        webDriver.findElement(By.xpath(orderSet.getChooseRelationshipTypes_new())).click();
    }
    //主搭产品
    @Test(priority = 30)
    public void mianProductNum(){
        webDriver.findElement(By.xpath(orderSet.getProduct())).click();
        webDriver.findElement(By.xpath(orderSet.getProductNumImport())).sendKeys("91113231104");
        webDriver.findElement(By.xpath(orderSet.getSearchButton1())).click();
        webDriver.findElement(By.xpath(orderSet.getProductPick())).click();
        webDriver.findElement(By.xpath(orderSet.getProductComfirm())).click();
    }
    //主搭产品
    @Test(priority = 30,enabled = false)
    public void mianProductName(){
        webDriver.findElement(By.xpath(orderSet.getProduct())).click();
        webDriver.findElement(By.xpath(orderSet.getProductNameImport())).sendKeys("莱赛尔一拍松桑蚕丝被");
        webDriver.findElement(By.xpath(orderSet.getSearchButton1())).click();
        webDriver.findElement(By.xpath(orderSet.getProductPick())).click();
        webDriver.findElement(By.xpath(orderSet.getProductComfirm())).click();
    }
    //备注
    @Test(priority = 31)
    public void remarksPM(){
        webDriver.findElement(By.xpath(orderSet.getRemarksPM())).sendKeys("产品搭配新建");
    }
    //添加
    @Test(priority = 32)
    public void AddButton(){
        webDriver.findElement(By.xpath(orderSet.getProductAdd_new())).click();
        //查询
        webDriver.findElement(By.xpath(orderSet.getProductSeacheB())).click();
        webDriver.findElement(By.xpath(orderSet.getProductPick1())).click();
        webDriver.findElement(By.xpath(orderSet.getProductPick2())).click();
        webDriver.findElement(By.xpath(orderSet.getProductComfirmB())).click();
    }
    //删除
    @Test(priority = 33)
    public void removenButton(){
        webDriver.findElement(By.xpath(orderSet.getProductPick3())).click();
        webDriver.findElement(By.xpath(orderSet.getProductRemove())).click();
    }
    //新建完成
    @Test(priority = 34)
    public void newSuccess(){
        webDriver.findElement(By.xpath(orderSet.getWindowComfirmPM())).click();
    }
    @Test(priority = 35)
    public void editPM(){
        webDriver.findElement(By.xpath(orderSet.getVoucherEdit())).click();
        //修改是否可用
        webDriver.findElement(By.xpath(orderSet.getRemarksPM())).sendKeys("编辑后");
        webDriver.findElement(By.xpath(orderSet.getWindowComfirm())).click();
    }
    @Test(priority = 36)
    public void voucherExpectsPM(){
        //导出
        webDriver.findElement(By.xpath(orderSet.getVouchersExport())).click();
    }
    @AfterClass
    public void quitEnv(){
        webDriver.quit();
    }
}

















