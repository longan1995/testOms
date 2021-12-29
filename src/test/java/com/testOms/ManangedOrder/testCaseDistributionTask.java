package com.testOms.ManangedOrder;

import element.orderManagement.distributionTask;
import element.orderManagement.purchaseOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Set;

public class testCaseDistributionTask {
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

    //配货任务
    @Test(priority = 3)
    public void lockOrder() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        WebElement ef = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(distributionTask.getDistributionTask())));
        ef.click();
    }
    //订单编号
    @Test(priority = 4)
    public void orderNum() {
        webDriver.findElement(By.xpath(distributionTask.getOrdreNum())).sendKeys("DHD202112240030000009");
        //查询
        webDriver.findElement(By.xpath(distributionTask.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(distributionTask.getResetButton())).click();
    }
    //店铺编号
    @Test(priority = 5)
    public void storeNum() {
        webDriver.findElement(By.xpath(distributionTask.getStoreNum())).sendKeys("DHD202112240030000009");
        //查询
        webDriver.findElement(By.xpath(distributionTask.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(distributionTask.getResetButton())).click();
    }
    //店铺名称
    @Test(priority = 6)
    public void storeName() {
        webDriver.findElement(By.xpath(distributionTask.getStoreName())).sendKeys("宁波博洋家纺直营旗舰店");
        //查询
        webDriver.findElement(By.xpath(distributionTask.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(distributionTask.getResetButton())).click();
    }
    //店铺状态
    @Test(priority = 7)
    public void storState() {
        webDriver.findElement(By.xpath(distributionTask.getStoreState())).click();
        webDriver.findElement(By.xpath(distributionTask.getChooseStoreState())).click();
        //查询
        webDriver.findElement(By.xpath(distributionTask.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(distributionTask.getResetButton())).click();
    }

    //时间筛选
    @Test(priority = 8)
    public void orderTimeB() throws InterruptedException {
        //起始时间下拉框
        webDriver.findElement(By.xpath(distributionTask.getCreatTime())).sendKeys("2021-12-16");
        //结束时间下拉框
        webDriver.findElement(By.xpath(distributionTask.getFinishTime())).sendKeys("2021-12-17");
        //搜索按键
        webDriver.findElement(By.xpath(distributionTask.getSearchButton())).click();
        Thread.sleep(1000);
        //重置按键
        webDriver.findElement(By.xpath(distributionTask.getResetButton())).click();
    }
    //订货品牌
    @Test(priority = 9)
    public void orderBrand(){
        webDriver.findElement(By.xpath(distributionTask.getOrderSource())).click();
        webDriver.findElement(By.xpath(distributionTask.getChooseOrderSource())).click();
        //查询
        webDriver.findElement(By.xpath(distributionTask.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(distributionTask.getResetButton())).click();
    }
    //订单来源
    @Test(priority = 10)
    public void orderSource(){
        webDriver.findElement(By.xpath(distributionTask.getOrderSource())).click();
        webDriver.findElement(By.xpath(distributionTask.getChooseOrderSource())).click();
        //查询
        webDriver.findElement(By.xpath(distributionTask.getSearchButton())).click();
        //重置
        webDriver.findElement(By.xpath(distributionTask.getResetButton())).click();
    }
    //备注
    @Test(priority =11)
    public void remarks() {
        webDriver.findElement(By.xpath(distributionTask.getRemarks())).sendKeys("8888");
    }
    //查看
    @Test(priority = 12)
    public void voucherCheck(){
        webDriver.findElement(By.xpath(distributionTask.getVoucherCheck())).click();
        webDriver.findElement(By.xpath(distributionTask.getVoucherCancel())).click();
    }
    //生成配货单
    @Test(priority = 13)
    public void generateList(){
        webDriver.findElement(By.xpath(distributionTask.getGenerateList())).click();
    }
    //导出
    @Test(priority = 14)
    public void voucherExport(){
        webDriver.findElement(By.xpath(distributionTask.getVoucherExport())).click();
    }
}
