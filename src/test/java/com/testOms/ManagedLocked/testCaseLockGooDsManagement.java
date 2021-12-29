package com.testOms.ManagedLocked;

import element.lockTheGoodsManagement.lockCargoflow;
import element.lockTheGoodsManagement.lockDetails;
import element.lockTheGoodsManagement.lockOrder;
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

public class testCaseLockGooDsManagement {
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
        webDriver.findElement(By.xpath(lockOrder.getOmsC())).click();
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

    //锁货管理
    @Test(priority = 2)
    public void lockGoodsManagement() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        WebElement oms = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(lockOrder.getlTGM())));
        oms.click();
    }

    //锁货单
    @Test(priority = 3)
    public void lockOrder() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        WebElement ef = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(lockOrder.getLockOrderhtml())));
        ef.click();

    }

    //锁货单号
    @Test(priority = 4)
    public void lockGoodsNum() {
        webDriver.findElement(By.xpath(lockOrder.getLockGoodsNum())).sendKeys("SHD20211217000001");
        //查询
        webDriver.findElement(By.xpath(lockOrder.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(lockOrder.getResetButton())).click();
    }

    //锁货状态
    @Test(priority = 4)
    public void lockGoodsState() {
        webDriver.findElement(By.xpath(lockOrder.getLockGoodsState())).click();
        webDriver.findElement(By.xpath(lockOrder.getChooseLockGoodsState())).click();
        //查询
        webDriver.findElement(By.xpath(lockOrder.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(lockOrder.getResetButton())).click();
    }

    //锁货店铺编号
    @Test(priority = 5)
    public void lockStoreNum() {
        webDriver.findElement(By.xpath(lockOrder.getStoreNum())).sendKeys("A010005CS005");
        //查询
        webDriver.findElement(By.xpath(lockOrder.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(lockOrder.getResetButton())).click();
    }

    //锁货店铺名称
    @Test(priority = 6)
    public void lockStoreName() {
        webDriver.findElement(By.xpath(lockOrder.getStoreName())).sendKeys("宁波博洋家纺直营旗舰店");
        //查询
        webDriver.findElement(By.xpath(lockOrder.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(lockOrder.getResetButton())).click();
    }

    //时间筛选
    @Test(priority = 7)
    public void lockTimeB() throws InterruptedException {
        //起始时间下拉框
        webDriver.findElement(By.xpath(lockOrder.getCreatTime())).sendKeys("2021-12-16");
        //结束时间下拉框
        webDriver.findElement(By.xpath(lockOrder.getFinishTime())).sendKeys("2021-12-17");
        //搜索按键
        webDriver.findElement(By.xpath(lockOrder.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(lockOrder.getResetButton())).click();
    }

    //创建人
    @Test(priority = 8)
    public void lockFounder() {
        webDriver.findElement(By.xpath(lockOrder.getFounder())).sendKeys("20100421");
        //查询
        webDriver.findElement(By.xpath(lockOrder.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(lockOrder.getResetButton())).click();
    }

    //备注
    @Test(priority = 9)
    public void remarks() {
        webDriver.findElement(By.xpath(lockOrder.getRemarks())).sendKeys("8888");
    }

    //隐藏
    @Test(priority = 10)
    public void hideInvalidDocuments() {
        webDriver.findElement(By.xpath(lockOrder.getHideInvalidDocuments())).click();
    }

    /**
     * -------------新建------------
     **/
    @Test(priority = 11)
    public void newButtonf() {
        webDriver.findElement(By.xpath(lockOrder.getNewButton())).click();
    }

    @Test(priority = 12)
    public void windowquitf1() {
        webDriver.findElement(By.xpath(lockOrder.getWindowQuit1())).click();
        webDriver.findElement(By.xpath(lockOrder.getNewButton())).click();
    }

    @Test(priority = 13)
    public void cancelf() {
        webDriver.findElement(By.xpath(lockOrder.getCancel())).click();
        webDriver.findElement(By.xpath(lockOrder.getNewButton())).click();
    }

    //锁货仓库
    @Test(priority = 14)
    public void lockWarehouse() {
        webDriver.findElement(By.xpath(lockOrder.getLockGoodsWarehouse())).click();
        webDriver.findElement(By.xpath(lockOrder.getChooseWarehouse())).click();
    }

    //店铺选择
    @Test(priority = 15)
    public void storeNumI() throws InterruptedException {
        webDriver.findElement(By.xpath(lockOrder.getStoreNumInput())).sendKeys("A010005CS005");
        //搜索
        webDriver.findElement(By.xpath(lockOrder.getSearchButton_new())).click();
        //选择店铺
        webDriver.findElement(By.xpath(lockOrder.getStoreCheck())).click();
        //确认
        webDriver.findElement(By.xpath(lockOrder.getComfirm_new())).click();
    }

    //店铺名称输入，搜索   跳过
    @Test(priority = 15, enabled = false)
    public void storeNameI() throws InterruptedException {
        webDriver.findElement(By.xpath(lockOrder.getStoreNameInput())).sendKeys("博洋家纺环球银泰店");
        //搜索
        webDriver.findElement(By.xpath(lockOrder.getSearchButton_new())).click();
        //选择店铺
        webDriver.findElement(By.xpath(lockOrder.getStoreCheck())).click();
        //确认
        webDriver.findElement(By.xpath(lockOrder.getComfirm_new())).click();
    }

    //备注
    @Test(priority = 16)
    public void remarksNew() {
        webDriver.findElement(By.xpath(lockOrder.getRemarks_new())).sendKeys("新建产生的备注");
    }

    //添加
    @Test(priority = 17)
    public void addButton() {
        webDriver.findElement(By.xpath(lockOrder.getAddButton())).click();
    }

    @Test(priority = 18)
    public void searchProductNum() {
        //输入产品编码
        webDriver.findElement(By.xpath(lockOrder.getProductNum_new())).sendKeys("91113233213");
        //点击查询
        webDriver.findElement(By.xpath(lockOrder.getSearchButton_new())).click();
        //勾选产品
        webDriver.findElement(By.xpath(lockOrder.getProductCheck())).click();
        //点击确认
        webDriver.findElement(By.xpath(lockOrder.getProductComfirm_new())).click();
        //退出添加页面
        webDriver.findElement(By.xpath(lockOrder.getWindowsQuit())).click();
    }

    @Test(priority = 19)
    public void searchProductName() {
        //输入产品名称
        webDriver.findElement(By.xpath(lockOrder.getProductNum_new())).sendKeys("莱赛尔一拍松桑蚕丝被");
        //点击查询
        webDriver.findElement(By.xpath(lockOrder.getSearchButton_new())).click();
        //勾选产品
        webDriver.findElement(By.xpath(lockOrder.getProductCheck())).click();
        //点击确认
        webDriver.findElement(By.xpath(lockOrder.getProductComfirm_new())).click();
        //退出添加页面
        webDriver.findElement(By.xpath(lockOrder.getWindowsQuit())).click();
    }

    @Test(priority = 20)
    public void productImport() throws InterruptedException {
        //点击导入
        webDriver.findElement(By.xpath(lockOrder.getProductImport())).click();
        //点击下载模板
        webDriver.findElement(By.xpath(lockOrder.getClickDownLoad())).click();
        //点击上传
        webDriver.findElement(By.xpath(lockOrder.getClickUpLoad())).click();
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
        webDriver.findElement(By.xpath(lockOrder.getNext1())).click();
        //点击完成
        webDriver.findElement(By.xpath(lockOrder.getFine())).click();
    }

    @Test(priority = 21)
    public void remove() {
        //选择商品，点击删除
        webDriver.findElement(By.xpath(lockOrder.getProductCheck2())).click();
        webDriver.findElement(By.xpath(lockOrder.getProductRemove())).click();
    }

    @Test(priority = 22)
    public void comfirm() {
        //新建确认
        webDriver.findElement(By.xpath(lockOrder.getComfirm())).click();
    }
    //编辑
    @Test(priority = 23)
    public void edit() throws InterruptedException {
        Thread.sleep(2000);
        //点击编辑
        webDriver.findElement(By.xpath(lockOrder.getVoucherEdit())).click();
        //修改备注
        webDriver.findElement(By.xpath(lockOrder.getRemarks_new())).sendKeys("编辑产生的备注");
        //确认
        webDriver.findElement(By.xpath(lockOrder.getComfirm())).click();
    }
    //审核、查看
    @Test(priority = 24)
    public void auditAndCheck(){
        //审核
        webDriver.findElement(By.xpath(lockOrder.getVoucherAudit())).click();
        //审核取消
        webDriver.findElement(By.xpath(lockOrder.getVoucherCancel1())).click();
        //审核
        webDriver.findElement(By.xpath(lockOrder.getVoucherAudit())).click();
        //审核确认
        webDriver.findElement(By.xpath(lockOrder.getVocherComfirm1())).click();
        //查看
        webDriver.findElement(By.xpath(lockOrder.getVoucherCheck())).click();
    }
    //取消审核，作废
    @Test(priority = 25)
    public void cancelAndInvaild() throws InterruptedException {
        Thread.sleep(1000);
        //取消审核
        webDriver.findElement(By.xpath(lockOrder.getVoucherCancel1())).click();
        //取消审核确认
        webDriver.findElement(By.xpath(lockOrder.getVocherComfirm1())).click();
        //作废
        webDriver.findElement(By.xpath(lockOrder.getVoucherInvaild())).click();
        webDriver.findElement(By.xpath(lockOrder.getVoucherCancel2())).click();
    }
    @Test(priority = 26)
    public void voucherExpects(){
        //导出
        webDriver.findElement(By.xpath(futurePrice.getVouchersExport())).click();
    }
    /**------------锁货明细------------**/
    //锁货明细
    @Test(priority = 27)
    public void lockDetails() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        WebElement ld = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(lockDetails.getLockDetailshtml())));
        ld.click();
    }
    //锁货单号
    @Test(priority = 28)
    public void lockGoodsNumD() {
        webDriver.findElement(By.xpath(lockDetails.getLockNum())).sendKeys("20100421");
        //查询
        webDriver.findElement(By.xpath(lockDetails.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(lockDetails.getResetButton())).click();
    }
    //锁货产品编码
    @Test(priority = 29)
    public void lockProductNum() {
        webDriver.findElement(By.xpath(lockDetails.getProductNum())).sendKeys("20100421");
        //查询
        webDriver.findElement(By.xpath(lockDetails.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(lockDetails.getResetButton())).click();
    }
    //锁货产品名称
    @Test(priority = 30)
    public void lockProductName() {
        webDriver.findElement(By.xpath(lockDetails.getProductName())).sendKeys("天禧");
        //查询
        webDriver.findElement(By.xpath(lockDetails.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(lockDetails.getResetButton())).click();
    }
    //锁货店铺编码
    @Test(priority = 31)
    public void lockStoreNumD() {
        webDriver.findElement(By.xpath(lockDetails.getStoreNum())).sendKeys("20100421");
        //查询
        webDriver.findElement(By.xpath(lockDetails.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(lockDetails.getResetButton())).click();
    }
    //锁货店铺名称
    @Test(priority = 32)
    public void lockStoreNameD() {
        webDriver.findElement(By.xpath(lockDetails.getStoreName())).sendKeys("20100421");
        //查询
        webDriver.findElement(By.xpath(lockDetails.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(lockDetails.getResetButton())).click();
    }
    //时间筛选
    @Test(priority = 33)
    public void lockTimeDB() throws InterruptedException {
        //起始时间下拉框
        webDriver.findElement(By.xpath(lockDetails.getCreatTime())).sendKeys("2021-12-16");
        //结束时间下拉框
        webDriver.findElement(By.xpath(lockDetails.getFinishTime())).sendKeys("2021-12-17");
        //搜索按键
        webDriver.findElement(By.xpath(lockDetails.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(lockDetails.getResetButton())).click();
    }
    //备注
    @Test(priority = 34)
    public void remarksD() {
        webDriver.findElement(By.xpath(lockDetails.getRemarks())).sendKeys("8888");
    }

    //创建人
    @Test(priority = 35)
    public void lockFounderD() {
        webDriver.findElement(By.xpath(lockDetails.getFounder())).sendKeys("20100421");
        //查询
        webDriver.findElement(By.xpath(lockDetails.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(lockDetails.getResetButton())).click();
    }

    @Test(priority = 36)
    public void voucherExpectsD(){
        //导出
        webDriver.findElement(By.xpath(lockDetails.getVouchersExport())).click();
    }
    /**------------锁货流水------------**/
    //锁货明细
    @Test(priority = 37)
    public void lockCargoflow() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        WebElement lc = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(lockCargoflow.getLockCargoflowhtml())));
        lc.click();
    }
    //时间筛选
    @Test(priority = 38)
    public void lockTimeCB() throws InterruptedException {
        //起始时间下拉框
        webDriver.findElement(By.xpath(lockCargoflow.getCreatTime())).sendKeys("2021-12-16");
        //结束时间下拉框
        webDriver.findElement(By.xpath(lockCargoflow.getFinishTime())).sendKeys("2021-12-17");
        //搜索按键
        webDriver.findElement(By.xpath(lockCargoflow.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(lockCargoflow.getResetButton())).click();
    }
    //变更类型
    @Test(priority = 39)
    public void changeType(){
        webDriver.findElement(By.xpath(lockCargoflow.getChangeType())).click();
        webDriver.findElement(By.xpath(lockCargoflow.getChooseChangeType())).click();
        //搜索按键
        webDriver.findElement(By.xpath(lockCargoflow.getSearchButton())).click();
        //重置按键
        webDriver.findElement(By.xpath(lockCargoflow.getResetButton())).click();
    }
    //锁货产品编码
    @Test(priority = 40)
    public void lockProductNumC() {
        webDriver.findElement(By.xpath(lockCargoflow.getProductNum())).sendKeys("20100421");
        //查询
        webDriver.findElement(By.xpath(lockCargoflow.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(lockCargoflow.getResetButton())).click();
    }
    //锁货产品名称
    @Test(priority = 41)
    public void lockProductNameC() {
        webDriver.findElement(By.xpath(lockCargoflow.getProductName())).sendKeys("天禧");
        //查询
        webDriver.findElement(By.xpath(lockCargoflow.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(lockCargoflow.getResetButton())).click();
    }
    //锁货单据编码
    @Test(priority = 42)
    public void lockVoucherNumC() {
        webDriver.findElement(By.xpath(lockCargoflow.getVoucherNum())).sendKeys("20100421");
        //查询
        webDriver.findElement(By.xpath(lockCargoflow.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(lockCargoflow.getResetButton())).click();
    }
    //备注
    @Test(priority = 43)
    public void remarksC() {
        webDriver.findElement(By.xpath(lockCargoflow.getVoucherRemarks())).sendKeys("8888");
        //查询
        webDriver.findElement(By.xpath(lockCargoflow.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(lockCargoflow.getResetButton())).click();
    }

    //创建人
    @Test(priority = 44)
    public void lockFounderC() {
        webDriver.findElement(By.xpath(lockCargoflow.getFounder())).sendKeys("20100421");
        //查询
        webDriver.findElement(By.xpath(lockCargoflow.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(lockCargoflow.getResetButton())).click();
    }
    @Test(priority = 45)
    public void voucherExpectsC(){
        //导出
        webDriver.findElement(By.xpath(lockCargoflow.getVouchersExport())).click();
    }
    @AfterClass
    public void quitEnv(){
        webDriver.quit();
    }
}
