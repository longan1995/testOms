package com.testOms.ManagedReturns;

import element.futuresManagement.futuresOrder;
import element.priceManagement.futurePrice;
import element.returnOrderManagement.storeReturns;
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

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Set;

public class testCaseStoreRetures {
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
    public void testSwithchWindows(){
        //点击oms系统
        webDriver.findElement(By.xpath(storeReturns.getOmsC())).click();
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
    //退单管理
    @Test(priority = 2)
    public void returnOrderManagement(){
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        WebElement oms = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(storeReturns.getReturnManagement())));
        oms.click();
    }
    //门店退货
    @Test(priority = 3)
    public void exchangeFairInto(){
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        WebElement ef = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(storeReturns.getStoreReturns())));
        ef.click();

    }
    //退单编号
    @Test(priority = 4)
    public void returnOrder(){
        webDriver.findElement(By.xpath(storeReturns.getReturnNum())).sendKeys("THD202112233800003");
        //查询
        webDriver.findElement(By.xpath(storeReturns.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(storeReturns.getResetButton())).click();
    }
    //退单状态
    @Test(priority = 5)
    public  void returnOrderState(){
        webDriver.findElement(By.xpath(storeReturns.getReturnState())).click();

        webDriver.findElement(By.xpath(storeReturns.getChooseReturnState())).click();

        //查询
        webDriver.findElement(By.xpath(storeReturns.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(storeReturns.getResetButton())).click();
    }
    //退单来源
    @Test(priority = 6)
    public  void returnOrderSource(){
        webDriver.findElement(By.xpath(storeReturns.getReturnForm())).click();

        webDriver.findElement(By.xpath(storeReturns.getChooseReturnForm())).click();

        //查询
        webDriver.findElement(By.xpath(storeReturns.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(storeReturns.getResetButton())).click();
    }
    @Test(priority = 7)
    public  void returnStoreName(){
        webDriver.findElement(By.xpath(storeReturns.getStoreName())).sendKeys(
                "马园路专卖店");

        //查询
        webDriver.findElement(By.xpath(storeReturns.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(storeReturns.getResetButton())).click();
    }
    //店铺名称
    @Test(priority = 8)
    public  void returnStoreNum(){
        webDriver.findElement(By.xpath(storeReturns.getStoreNum())).sendKeys(
                "A010005CS005");

        //查询
        webDriver.findElement(By.xpath(storeReturns.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(storeReturns.getResetButton())).click();
    }
    //店铺状态
    @Test(priority = 9)
    public  void returnStoreState(){
        webDriver.findElement(By.xpath(storeReturns.getStoreState())).click();
        webDriver.findElement(By.xpath(storeReturns.getChooseStoreState())).click();
        //查询
        webDriver.findElement(By.xpath(storeReturns.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(storeReturns.getResetButton())).click();
    }
    //日期
    @Test(priority = 10)
    public  void timeB(){
        //起始时间下拉框
        webDriver.findElement(By.xpath(storeReturns.getCreatTime())).sendKeys("2021-12-22");
        //结束时间下拉框
        webDriver.findElement(By.xpath(storeReturns.getFinishTime())).sendKeys("2021-12-23");
        //查询
        webDriver.findElement(By.xpath(storeReturns.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(storeReturns.getResetButton())).click();
    }
    //退单来源
    @Test(priority = 11)
    public  void returnSource(){
        webDriver.findElement(By.xpath(storeReturns.getReturnSource())).click();
        webDriver.findElement(By.xpath(storeReturns.getChooseReturnSource())).click();
        //查询
        webDriver.findElement(By.xpath(storeReturns.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(storeReturns.getResetButton())).click();
    }
    @Test(priority = 12)
    public  void remarks(){
        webDriver.findElement(By.xpath(storeReturns.getRemarks())).sendKeys("2");

        //查询
        webDriver.findElement(By.xpath(storeReturns.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(storeReturns.getResetButton())).click();
    }
    //作废隐藏按钮
    @Test(priority = 13)
    public void hideInvalidDocuments(){
        webDriver.findElement(By.xpath(storeReturns.getHideInvalidDocuments())).click();
    }
    /**-------------新建------------**/
    @Test(priority = 14)
    public void newButtonf(){
        webDriver.findElement(By.xpath(storeReturns.getNewButton())).click();
    }
    @Test(priority = 15)
    public void windowquitf1(){
        webDriver.findElement(By.xpath(storeReturns.getWindowQuit1())).click();
        webDriver.findElement(By.xpath(storeReturns.getNewButton())).click();
    }
    @Test(priority = 16)
    public void cancelf(){
        webDriver.findElement(By.xpath(storeReturns.getCancel())).click();
        webDriver.findElement(By.xpath(storeReturns.getNewButton())).click();
    }
    //退货店铺
    @Test(priority = 17)
    public void returnStore(){
        webDriver.findElement(By.xpath(storeReturns.getReturnStore())).sendKeys("宁波博洋家纺直营旗舰店", Keys.ARROW_DOWN,Keys.ENTER);
       //       webDriver.findElement(By.xpath(storeReturns.getReturnStore())).click();
        //      webDriver.findElement(By.xpath(storeReturns.getChooseReturnStore())).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //订货会
    @Test(priority = 18)
    public void exchangeFair(){
        webDriver.findElement(By.xpath(storeReturns.getExchangeFair_new())).click();
        webDriver.findElement(By.xpath(storeReturns.getChooseExchangeFair_new())).click();
    }
    //退单类型
    @Test(priority = 19)
    public void returState(){
        webDriver.findElement(By.xpath(storeReturns.getReturnForm_new())).click();
        webDriver.findElement(By.xpath(storeReturns.getChooseReturnForm_new())).click();
    }
    //物流方式
    @Test(priority = 20)
    public void LogisticsMode(){
        webDriver.findElement(By.xpath(storeReturns.getLogisticsMode())).click();
        webDriver.findElement(By.xpath(storeReturns.getChooseLogisticsMode())).click();
    }
    //物流单位
    @Test(priority = 21)
    public void logisticsUnit(){
        webDriver.findElement(By.xpath(storeReturns.getLogisticsUnit())).sendKeys("箱子");
    }
   //快递箱数
   @Test(priority = 22)
   public void ExpressContainerNum(){
       webDriver.findElement(By.xpath(storeReturns.getLogisticsUnit())).sendKeys("12");
   }
    //备注
    @Test(priority = 23)
    public void remarks1(){
        webDriver.findElement(By.xpath(storeReturns.getRemarks_new())).sendKeys("新建 备注");
    }
    @Test(priority = 24)
    public void addButton(){
        webDriver.findElement(By.xpath(storeReturns.getAdd_new())).click();
    }
    @Test(priority = 25)
    public void searchProductNum(){
        //输入产品编码
        webDriver.findElement(By.xpath(storeReturns.getProductNum_new())).sendKeys("91113233213");
        //点击查询
        webDriver.findElement(By.xpath(storeReturns.getSearchButton_new())).click();
        //勾选产品
        webDriver.findElement(By.xpath(storeReturns.getProductCheck1())).click();
        //点击确认
        webDriver.findElement(By.xpath(storeReturns.getProductComfirm())).click();
        //退出添加页面
        webDriver.findElement(By.xpath(storeReturns.getWindowQuit2())).click();
    }
    @Test(priority = 25,enabled = false)
    public void searchProductName(){
        //输入产品名称
        webDriver.findElement(By.xpath(storeReturns.getProductNum_new())).sendKeys("莱赛尔一拍松桑蚕丝被");
        //点击查询
        webDriver.findElement(By.xpath(storeReturns.getSearchButton_new())).click();
        //勾选产品
        webDriver.findElement(By.xpath(storeReturns.getProductCheck1())).click();
        //点击确认
        webDriver.findElement(By.xpath(storeReturns.getProductComfirm())).click();
        //退出添加页面
        webDriver.findElement(By.xpath(storeReturns.getWindowQuit2())).click();
    }
    @Test(priority = 26)
    public void foProductsImport() throws InterruptedException, IOException {
        //点击导入
        webDriver.findElement(By.xpath(storeReturns.getProductImport())).click();
        //点击下载模板
        webDriver.findElement(By.xpath(storeReturns.getClickDownLoad())).click();
        //点击上传
        webDriver.findElement(By.xpath(storeReturns.getClickUpLoad())).click();
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
        webDriver.findElement(By.xpath(storeReturns.getNext1())).click();
        //点击完成
        webDriver.findElement(By.xpath(storeReturns.getFine())).click();
    }
    @Test(priority = 27)
    public void remove(){
        //选择商品，点击删除
        webDriver.findElement(By.xpath(storeReturns.getProductCheck2())).click();
        webDriver.findElement(By.xpath(storeReturns.getProductRemove())).click();
    }
    @Test(priority = 28)
    public void comfirm(){
        //新建确认
        webDriver.findElement(By.xpath(storeReturns.getComfirm())).click();
    }
    @Test(priority = 53)
    public void voucherEdit(){
        //点击编辑
        webDriver.findElement(By.xpath(futurePrice.getVoucherEdit())).click();
        webDriver.findElement(By.xpath(futurePrice.getRemarks())).sendKeys("编辑后备注");
        webDriver.findElement(By.xpath(futurePrice.getComfirm())).click();
    }
    @Test(priority = 54)
    public void voucherComfirm(){
        //点击确认
        webDriver.findElement(By.xpath(futurePrice.getProductComfirm())).click();
        webDriver.findElement(By.xpath(futuresOrder.getVocherComfirm())).click();
    }
    @Test(priority = 55)
    public void voucherAudit(){
        //审核
        webDriver.findElement(By.xpath(futurePrice.getVoucherAudit())).click();
        webDriver.findElement(By.xpath(futuresOrder.getVocherComfirm())).click();
    }
    @Test(priority = 56)
    public void vocherCheck(){
        //查看
        webDriver.findElement(By.xpath(futurePrice.getVoucherCheck())).click();
        //点击退出
        webDriver.findElement(By.xpath(futurePrice.getWindowQuit2())).click();
    }
    @Test(priority = 57)
    public void voucherCancel2(){
        //取消审核
        webDriver.findElement(By.xpath(futurePrice.getVoucherAudit())).click();
        webDriver.findElement(By.xpath(futuresOrder.getVocherComfirm())).click();
    }
    @Test(priority = 58)
    public void voucherCancel1(){
        //取消确定
        webDriver.findElement(By.xpath(futurePrice.getVoucherCancel())).click();
        webDriver.findElement(By.xpath(futuresOrder.getVocherComfirm())).click();
    }
    @Test(priority = 59)
    public void voucherInvaild(){
        //作废
        webDriver.findElement(By.xpath(futurePrice.getVoucherInvaild())).click();
        webDriver.findElement(By.xpath(futuresOrder.getVocherComfirm())).click();
    }
    @Test(priority = 60)
    public void voucherExpects(){
        //导出
        webDriver.findElement(By.xpath(futurePrice.getVouchersExport())).click();
    }
    @AfterClass
    public void quitEnv(){
        webDriver.quit();
    }
}

