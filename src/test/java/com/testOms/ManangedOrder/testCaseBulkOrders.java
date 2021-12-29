package com.testOms.ManangedOrder;

import element.orderManagement.bulkOrders;
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

import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Set;

public class testCaseBulkOrders {
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
    public void bulkOrders() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        WebElement ef = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(bulkOrders.getBulkOrdersHtml())));
        ef.click();
    }
    //单据编号
    @Test(priority =4)
    public void orderNum(){
        webDriver.findElement(By.xpath(bulkOrders.getOrderNum())).sendKeys("DHD202112210002000005");
        webDriver.findElement(By.xpath(bulkOrders.getSearchButton())).click();
        webDriver.findElement(By.xpath(bulkOrders.getResetButton())).click();
    }
    //单据状态
    @Test(priority =5)
    public void orderState(){
        webDriver.findElement(By.xpath(bulkOrders.getOrderState())).click();
        webDriver.findElement(By.xpath(bulkOrders.getChooseOrderState())).click();
        webDriver.findElement(By.xpath(bulkOrders.getSearchButton())).click();
        webDriver.findElement(By.xpath(bulkOrders.getResetButton())).click();
    }
    //单据类型
    @Test(priority =6)
    public void orderType(){
        webDriver.findElement(By.xpath(bulkOrders.getOrderType())).click();
        webDriver.findElement(By.xpath(bulkOrders.getChooseOrderType())).click();
        webDriver.findElement(By.xpath(bulkOrders.getSearchButton())).click();
        webDriver.findElement(By.xpath(bulkOrders.getResetButton())).click();
    }
    //店铺编号
    @Test(priority =7)
    public void storeNum(){
        webDriver.findElement(By.xpath(bulkOrders.getStoreNum())).sendKeys("DHD202112210002000005");
        webDriver.findElement(By.xpath(bulkOrders.getSearchButton())).click();
        webDriver.findElement(By.xpath(bulkOrders.getResetButton())).click();
    }
    //店铺名称
    @Test(priority =8)
    public void storeName(){
        webDriver.findElement(By.xpath(bulkOrders.getStoreNum())).sendKeys("宁波博洋家纺直营旗舰店");
        webDriver.findElement(By.xpath(bulkOrders.getSearchButton())).click();
        webDriver.findElement(By.xpath(bulkOrders.getResetButton())).click();
    }
    //店铺状态
    @Test(priority =9)
    public void storeState(){
        webDriver.findElement(By.xpath(bulkOrders.getStoreState())).click();
        webDriver.findElement(By.xpath(bulkOrders.getChooseStoreState())).click();
        webDriver.findElement(By.xpath(bulkOrders.getSearchButton())).click();
        webDriver.findElement(By.xpath(bulkOrders.getResetButton())).click();
    }
    //时间筛选
    @Test(priority = 10)
    public void orderTime() throws InterruptedException {
        //起始时间下拉框
        webDriver.findElement(By.xpath(bulkOrders.getCreatTime())).sendKeys("2021-12-16");
        //结束时间下拉框
        webDriver.findElement(By.xpath(bulkOrders.getFinishTime())).sendKeys("2021-12-17");
        //搜索按键
        webDriver.findElement(By.xpath(bulkOrders.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(bulkOrders.getResetButton())).click();
    }
    //订货品牌
    @Test(priority =11)
    public void orderBrand(){
        webDriver.findElement(By.xpath(bulkOrders.getOrderBrand())).click();
        webDriver.findElement(By.xpath(bulkOrders.getChooseOrderBrand())).click();
        webDriver.findElement(By.xpath(bulkOrders.getSearchButton())).click();
        webDriver.findElement(By.xpath(bulkOrders.getResetButton())).click();
    }
    //备注
    @Test(priority =12)
    public void remarks(){
        webDriver.findElement(By.xpath(bulkOrders.getRemarks())).sendKeys("宁波博洋家纺直营旗舰店");
        webDriver.findElement(By.xpath(bulkOrders.getSearchButton())).click();
        webDriver.findElement(By.xpath(bulkOrders.getResetButton())).click();
    }
    //隐藏作废单据
    @Test(priority =13)
    public void voucher(){
        webDriver.findElement(By.xpath(bulkOrders.getHideInvalidDocuments())).click();
        webDriver.findElement(By.xpath(bulkOrders.getSearchButton())).click();
        webDriver.findElement(By.xpath(bulkOrders.getResetButton())).click();
    }
    @Test(priority = 14)
    public void voucherEdit() throws InterruptedException {
        Thread.sleep(2000);
        //点击编辑
        webDriver.findElement(By.xpath(bulkOrders.getVoucherEdit())).click();
        //修改备注
        webDriver.findElement(By.xpath(bulkOrders.getRemarks_edit())).sendKeys("编辑产生的备注");
        //确认
        webDriver.findElement(By.xpath(bulkOrders.getComfirm_edit())).click();
    }
    //确认键
    @Test(priority = 15)
    public void voucherComfirm1() throws InterruptedException {

        //确认
        webDriver.findElement(By.xpath(bulkOrders.getVoucherComfirm())).click();
        //取消确认
        webDriver.findElement(By.xpath(bulkOrders.getVoucherCancel2())).click();
        //确认
        webDriver.findElement(By.xpath(bulkOrders.getVoucherComfirm())).click();
        //确认确认
        webDriver.findElement(By.xpath(bulkOrders.getVocherComfirm1())).click();
        //查看
        webDriver.findElement(By.xpath(bulkOrders.getVoucherCheck())).click();
        Thread.sleep(1000);
        //点击退出
        webDriver.findElement(By.xpath(bulkOrders.getWindowQuit_check())).click();
    }
    //审核
    @Test(priority = 16)
    public void vocherAuditAndCheck(){
        //确认审核
        webDriver.findElement(By.xpath(bulkOrders.getVoucherAudit())).click();
        webDriver.findElement(By.xpath(bulkOrders.getVocherComfirm1())).click();
        //查看
        webDriver.findElement(By.xpath(bulkOrders.getVoucherCheck())).click();
        //点击退出
        webDriver.findElement(By.xpath(bulkOrders.getWindowQuit_check())).click();
    }
    @Test(priority = 17)
    public void voucherCancel2(){
        //取消审核
        webDriver.findElement(By.xpath(bulkOrders.getVoucherAudit())).click();
        webDriver.findElement(By.xpath(bulkOrders.getVocherComfirm1())).click();
    }
    @Test(priority = 18)
    public void voucherCancel1(){
        //取消确定
        webDriver.findElement(By.xpath(bulkOrders.getVoucherCancel())).click();
        webDriver.findElement(By.xpath(bulkOrders.getVocherComfirm1())).click();
    }
    @Test(priority = 19)
    public void voucherInvaild(){
        //作废
        webDriver.findElement(By.xpath(bulkOrders.getVoucherInvaild())).click();
        webDriver.findElement(By.xpath(bulkOrders.getVocherComfirm1())).click();
    }
    //批量导入
    @Test(priority = 20)
    public void bulkImport() throws InterruptedException {
        webDriver.findElement(By.xpath(bulkOrders.getBulkImport())).click();
        //点击下载模板
        webDriver.findElement(By.xpath(bulkOrders.getClickDownLoad())).click();
        //点击上传
        webDriver.findElement(By.xpath(bulkOrders.getClickUpLoad())).click();
        Thread.sleep(5000);
        /**
         * 上传脚本
         * */
        try {
            Runtime.getRuntime().exec("src\\document\\bulkOrdrersUpload.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Thread.sleep(10000);
        //点击下一步
        webDriver.findElement(By.xpath(bulkOrders.getNext1())).click();
        //点击完成
        webDriver.findElement(By.xpath(bulkOrders.getFine())).click();
    }
    //批量确认
    @Test(priority = 21)
    public void bulkComfirm(){
        webDriver.findElement(By.xpath(bulkOrders.getRemarks())).sendKeys("批量测试");
        webDriver.findElement(By.xpath(bulkOrders.getSearchButton())).click();
        webDriver.findElement(By.xpath(bulkOrders.getVouchersCheck())).click();
        webDriver.findElement(By.xpath(bulkOrders.getBulkComfirm())).click();
        webDriver.findElement(By.xpath(bulkOrders.getVocherComfirm1()));
    }
    //批量审核
    @Test(priority = 22)
    public void bulkAudit(){
        webDriver.findElement(By.xpath(bulkOrders.getRemarks())).sendKeys("批量测试");
        webDriver.findElement(By.xpath(bulkOrders.getSearchButton())).click();
        webDriver.findElement(By.xpath(bulkOrders.getVouchersCheck())).click();
        webDriver.findElement(By.xpath(bulkOrders.getBulkAudit())).click();
        webDriver.findElement(By.xpath(bulkOrders.getVocherComfirm1()));
    }
    //批量取消审核
    @Test(priority = 23)
    public void bulkAuditCancel(){
        webDriver.findElement(By.xpath(bulkOrders.getRemarks())).sendKeys("批量测试");
        webDriver.findElement(By.xpath(bulkOrders.getSearchButton())).click();
        webDriver.findElement(By.xpath(bulkOrders.getVouchersCheck())).click();
        webDriver.findElement(By.xpath(bulkOrders.getBulkAuditCancel())).click();
        webDriver.findElement(By.xpath(bulkOrders.getVocherComfirm1()));
    }
    //批量取消确认
    @Test(priority = 24)
    public void bulkComfirmCancel(){
        webDriver.findElement(By.xpath(bulkOrders.getRemarks())).sendKeys("批量测试");
        webDriver.findElement(By.xpath(bulkOrders.getSearchButton())).click();
        webDriver.findElement(By.xpath(bulkOrders.getVouchersCheck())).click();
        webDriver.findElement(By.xpath(bulkOrders.getBulkComfirmCancel())).click();
        webDriver.findElement(By.xpath(bulkOrders.getVocherComfirm1()));
    }
    //批量作废
    @Test(priority = 25)
    public void bulkInvaild(){
        webDriver.findElement(By.xpath(bulkOrders.getRemarks())).sendKeys("批量测试");
        webDriver.findElement(By.xpath(bulkOrders.getSearchButton())).click();
        webDriver.findElement(By.xpath(bulkOrders.getVouchersCheck())).click();
        webDriver.findElement(By.xpath(bulkOrders.getBulkInvaild())).click();
        webDriver.findElement(By.xpath(bulkOrders.getVocherComfirm1()));
    }
    @Test(priority = 26)
    public void voucherExpects(){
        //导出
        webDriver.findElement(By.xpath(bulkOrders.getVouchersExport())).click();
    }
    @AfterClass
    public void quitEnv(){
        webDriver.quit();
    }
}

