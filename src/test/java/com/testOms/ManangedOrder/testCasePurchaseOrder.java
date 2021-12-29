package com.testOms.ManangedOrder;

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

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Set;

public class testCasePurchaseOrder {
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

    //订货单
    @Test(priority = 3)
    public void lockOrder() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        WebElement ef = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(purchaseOrder.getpOrder())));
        ef.click();
    }
    //订单编号
    @Test(priority = 4)
    public void orderNum() {
        webDriver.findElement(By.xpath(purchaseOrder.getOrdreNum())).sendKeys("DHD202112240030000009");
        //查询
        webDriver.findElement(By.xpath(purchaseOrder.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(purchaseOrder.getResetButton())).click();
    }

    //订单状态
    @Test(priority = 4)
    public void orderState() {
        webDriver.findElement(By.xpath(purchaseOrder.getOrderState())).click();
        webDriver.findElement(By.xpath(purchaseOrder.getChooseOrderState())).click();
        //查询
        webDriver.findElement(By.xpath(purchaseOrder.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(purchaseOrder.getResetButton())).click();
    }

    //订单类型
    @Test(priority = 5)
    public void orderForm() {
        webDriver.findElement(By.xpath(purchaseOrder.getOrderForm())).click();
        webDriver.findElement(By.xpath(purchaseOrder.getChooseOrderForm())).click();
        //查询
        webDriver.findElement(By.xpath(purchaseOrder.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(purchaseOrder.getResetButton())).click();
    }

    //店铺编号
    @Test(priority = 6)
    public void storeNum() {
        webDriver.findElement(By.xpath(purchaseOrder.getStoreNum())).sendKeys("DHD202112240030000009");
        //查询
        webDriver.findElement(By.xpath(purchaseOrder.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(purchaseOrder.getResetButton())).click();
    }
    //店铺名称
    @Test(priority = 7)
    public void storeName() {
        webDriver.findElement(By.xpath(purchaseOrder.getStoreName())).sendKeys("宁波博洋家纺直营旗舰店");
        //查询
        webDriver.findElement(By.xpath(purchaseOrder.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(purchaseOrder.getResetButton())).click();
    }
    //店铺状态
    @Test(priority = 8)
    public void storState() {
        webDriver.findElement(By.xpath(purchaseOrder.getStoreState())).click();
        webDriver.findElement(By.xpath(purchaseOrder.getStoreState())).click();
        //查询
        webDriver.findElement(By.xpath(purchaseOrder.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(purchaseOrder.getResetButton())).click();
    }

    //时间筛选
    @Test(priority = 9)
    public void orderTimeB() throws InterruptedException {
        //起始时间下拉框
        webDriver.findElement(By.xpath(purchaseOrder.getCreatTime())).sendKeys("2021-12-16");
        //结束时间下拉框
        webDriver.findElement(By.xpath(purchaseOrder.getFinishTime())).sendKeys("2021-12-17");
        //搜索按键
        webDriver.findElement(By.xpath(purchaseOrder.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(purchaseOrder.getResetButton())).click();
    }
    //订单来源
    @Test(priority = 10)
    public void orderSource(){
        webDriver.findElement(By.xpath(purchaseOrder.getOrderSource())).click();
        webDriver.findElement(By.xpath(purchaseOrder.getChooseOrderSource())).click();
        //查询
        webDriver.findElement(By.xpath(purchaseOrder.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(purchaseOrder.getResetButton())).click();
    }
    //备注
    @Test(priority =11)
    public void remarks() {
        webDriver.findElement(By.xpath(purchaseOrder.getRemarks())).sendKeys("8888");
    }

    //隐藏
    @Test(priority = 12)
    public void hideInvalidDocuments() {
            webDriver.findElement(By.xpath(purchaseOrder.getHideInvalidDocuments())).click();
   }

   /**-----新建-----**/

   @Test(priority = 13)
   public void newButtonf() {
       webDriver.findElement(By.xpath(purchaseOrder.getNewButton())).click();
   }

    @Test(priority = 14)
    public void windowquitf1() {
        webDriver.findElement(By.xpath(purchaseOrder.getWindowQuit1())).click();
        webDriver.findElement(By.xpath(purchaseOrder.getNewButton())).click();
    }

    @Test(priority = 15)
    public void cancelf() {
        webDriver.findElement(By.xpath(purchaseOrder.getCancel())).click();
        webDriver.findElement(By.xpath(purchaseOrder.getNewButton())).click();
    }
    //订货品牌
    @Test(priority = 16)
    public void orderBrand(){
       webDriver.findElement(By.xpath(purchaseOrder.getOrderBrand())).click();
        webDriver.findElement(By.xpath(purchaseOrder.getChooseOrderSource())).click();
    }
    //发货仓
    @Test(priority = 17)
    public void sendWarehouse(){
        webDriver.findElement(By.xpath(purchaseOrder.getSendWarehouse())).click();
        webDriver.findElement(By.xpath(purchaseOrder.getChooseSendWarehouse())).click();
    }
    //发货仓
    @Test(priority = 18)
    public void orderStore(){
        webDriver.findElement(By.xpath(purchaseOrder.getOrderStore())).click();
        webDriver.findElement(By.xpath(purchaseOrder.getChooseOrderState())).click();
    }
    //订货会
    @Test(priority = 19)
    public void exchangeFair(){
        webDriver.findElement(By.xpath(purchaseOrder.getExchangeFair())).click();
        webDriver.findElement(By.xpath(purchaseOrder.getChooseExchangeFair())).click();
    }
    //订单类型
    @Test(priority = 20)
    public void orderFormN(){
        webDriver.findElement(By.xpath(purchaseOrder.getOrderForm_new())).click();
        webDriver.findElement(By.xpath(purchaseOrder.getChooseOrderForm_new())).click();
    }
    //物流方式
    @Test(priority = 21)
    public void logisticsMode(){
        webDriver.findElement(By.xpath(purchaseOrder.getLogisticsMode())).click();
        webDriver.findElement(By.xpath(purchaseOrder.getChooseLogisticsMode())).click();
    }
    //物流单位
    @Test(priority = 22)
    public void logisticsUnits(){
        webDriver.findElement(By.xpath(purchaseOrder.getLogisticsUnits())).click();
        webDriver.findElement(By.xpath(purchaseOrder.getChooseLogisticsUnits())).click();
    }
    //备注
    @Test(priority = 23)
    public void remarksN(){
       webDriver.findElement(By.xpath(purchaseOrder.getRemarks_new())).sendKeys("新建备注");
    }
    //添加
    @Test(priority = 24)
    public void addButton(){
        webDriver.findElement(By.xpath(purchaseOrder.getAdd_new())).click();
    }
    @Test(priority = 25)
    public void searchProductNum(){
        //输入产品编码
        webDriver.findElement(By.xpath(purchaseOrder.getProductNum_new())).sendKeys("91113233213");
        //点击查询
        webDriver.findElement(By.xpath(purchaseOrder.getSearchButton_new())).click();
        //勾选产品
        webDriver.findElement(By.xpath(purchaseOrder.getProductCheck1())).click();
        //点击确认
        webDriver.findElement(By.xpath(purchaseOrder.getProductComfirm())).click();
        //退出添加页面
        webDriver.findElement(By.xpath(purchaseOrder.getWindowQuit2())).click();
    }
    @Test(priority = 25,enabled = false)
    public void searchProductName(){
        //输入产品名称
        webDriver.findElement(By.xpath(purchaseOrder.getProductNum_new())).sendKeys("莱赛尔一拍松桑蚕丝被");
        //点击查询
        webDriver.findElement(By.xpath(purchaseOrder.getSearchButton_new())).click();
        //勾选产品
        webDriver.findElement(By.xpath(purchaseOrder.getProductCheck1())).click();
        //点击确认
        webDriver.findElement(By.xpath(purchaseOrder.getProductComfirm())).click();
        //退出添加页面
        webDriver.findElement(By.xpath(purchaseOrder.getWindowQuit2())).click();
    }
    @Test(priority = 26)
    public void foProductsImport() throws InterruptedException {
        //点击导入
        webDriver.findElement(By.xpath(purchaseOrder.getProductImport())).click();
        //点击下载模板
        webDriver.findElement(By.xpath(purchaseOrder.getClickDownLoad())).click();
        //点击上传
        webDriver.findElement(By.xpath(purchaseOrder.getClickUpLoad())).click();
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
        webDriver.findElement(By.xpath(purchaseOrder.getNext1())).click();
        //点击完成
        webDriver.findElement(By.xpath(purchaseOrder.getFine())).click();
    }
    @Test(priority = 27)
    public void remove(){
        //选择商品，点击删除
        webDriver.findElement(By.xpath(purchaseOrder.getProductCheck2())).click();
        webDriver.findElement(By.xpath(purchaseOrder.getProductRemove())).click();
    }
    @Test(priority = 28)
    public void comfirm(){
        //新建确认
        webDriver.findElement(By.xpath(purchaseOrder.getComfirm())).click();
    }
    @Test(priority = 29)
    public void voucherEdit() throws InterruptedException {
        Thread.sleep(2000);
        //点击编辑
        webDriver.findElement(By.xpath(purchaseOrder.getVoucherEdit())).click();
        //修改备注
        webDriver.findElement(By.xpath(purchaseOrder.getRemarks_new())).sendKeys("编辑产生的备注");
        //确认
        webDriver.findElement(By.xpath(purchaseOrder.getComfirm())).click();
    }
    //确认键
    @Test(priority = 30)
    public void voucherComfirm1() throws InterruptedException {

        //确认
        webDriver.findElement(By.xpath(purchaseOrder.getVoucherComfirm())).click();
        //取消确认
        webDriver.findElement(By.xpath(purchaseOrder.getVoucherCancel2())).click();
        //确认
        webDriver.findElement(By.xpath(purchaseOrder.getVoucherComfirm())).click();
        //确认确认
        webDriver.findElement(By.xpath(purchaseOrder.getVocherComfirm1())).click();
        //查看
        webDriver.findElement(By.xpath(purchaseOrder.getVoucherCheck())).click();
        Thread.sleep(1000);
        //点击退出
        webDriver.findElement(By.xpath(purchaseOrder.getWindowQuit2())).click();
    }
    //审核
    @Test(priority = 31)
    public void vocherAuditAndCheck(){
        //确认审核
        webDriver.findElement(By.xpath(purchaseOrder.getVoucherAudit())).click();
        webDriver.findElement(By.xpath(purchaseOrder.getVocherComfirm1())).click();
        //查看
        webDriver.findElement(By.xpath(purchaseOrder.getVoucherCheck())).click();
        //点击退出
        webDriver.findElement(By.xpath(purchaseOrder.getWindowQuit2())).click();
    }
    @Test(priority = 32)
    public void voucherCancel2(){
        //取消审核
        webDriver.findElement(By.xpath(purchaseOrder.getVoucherAudit())).click();
        webDriver.findElement(By.xpath(purchaseOrder.getVocherComfirm1())).click();
    }
    @Test(priority = 33)
    public void voucherCancel1(){
        //取消确定
        webDriver.findElement(By.xpath(purchaseOrder.getVoucherCancel())).click();
        webDriver.findElement(By.xpath(purchaseOrder.getVocherComfirm1())).click();
    }
    @Test(priority = 34)
    public void voucherInvaild(){
        //作废
        webDriver.findElement(By.xpath(purchaseOrder.getVoucherInvaild())).click();
        webDriver.findElement(By.xpath(purchaseOrder.getVocherComfirm1())).click();
    }
    @Test(priority = 35)
    public void voucherExpects(){
        //导出
        webDriver.findElement(By.xpath(purchaseOrder.getVouchersExport())).click();
    }

    @AfterClass
    public void quitEnv(){
        webDriver.quit();
    }

}
