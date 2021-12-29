package element.priceManagement;

/*
*
* 期货价格页面的 元素字段
*
* */
public class futurePrice {
    //价格管理
    private static String priceM = "//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[6]/li/div";
    //期货管理
    private static String fPrice = "//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[6]/li/ul/div[1]/a/li";
    //订货会下拉框
    public static String exchangeFair = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[1]/div[1]/input";
    //订货会选择
    public static String chooseExchangeFair ="/html/body/div[4]/div[1]/div[1]/ul/li[2]";
    //价格单号
    public static String priceNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[2]/input";
    //价格状态下拉框
    public static String PriceState = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[3]/div[1]/input";
    //价格状态选择
    public static String choosePriceState = "/html/body/div[5]/div[1]/div[1]/ul/li[3]";
    //使用范围下拉框
    public static String usableRange = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[4]/div/input";
    //使用范围选择
    public static String chooseUsableRange ="/html/body/div[6]/div[1]/div[1]/ul/li[1]";
    //起始时间选择框
    private static String creatTime1 ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[5]/input";
    //起始时间选择
    private static String chooseCreatTime1 ="/html/body/div[7]/div[1]/div/div[2]/table[1]/tbody/tr[4]/td[2]/div";
    //结束时间选择框
    private static String finishTime1 ="//html/body/div[1]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[6]/input";
    //结束时间选择
    private static String chooseFinishTime1 ="/html/body/div[8]/div[1]/div/div[2]/table[1]/tbody/tr[4]/td[4]/div";

    //起始时间选择框
    private static String creatTime2 ="/html/body/div[1]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[7]/input";
    //起始时间选择
    private static String chooseCreatTime2 ="/html/body/div[9]/div[1]/div/div[2]/table[1]/tbody/tr[4]/td[1]/div/span";
    //结束时间选择框
    private static String finishTime2 ="/html/body/div[1]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[8]/input";
    //结束时间选择
    private static String chooseFinishTime2 ="/html/body/div[10]/div[1]/div/div[2]/table[1]/tbody/tr[4]/td[4]/div/span";
    //创建人
    private static String foungder ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[9]/input";
    //查询按钮
    private static String searchButton ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[1]";
    //重置按钮
    private static String resetButton ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[2]";


    //新建按钮
    public static String newButton = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[1]";
    //关闭 X
    public static String windowQuit1 = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[1]/button/i";
    //取消
    public static String cancel = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[3]/div/button[1]";
    //订货会下拉框_新建
    public static String exchangeFair_new = "//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[1]/div/div/div/input";
    //订货会选择_新建
    public static String chooseExchangeFair_new = "/html/body/div[6]/div[1]/div[1]/ul/li[1]";
    //价格单号
    public static String priceNum_new = "//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[2]/div/div/input";
    //起始时间选择框
    private static String creatTime_new ="//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[3]/div/div/input";
    //起始时间选择
    private static String chooseCreatTime_new ="/html/body/div[6]/div[1]/div/div[2]/table[1]/tbody/tr[4]/td[2]/div";
    //结束时间选择框
    private static String finishTime_new ="/html/body/div[1]/div/div[2]/section/div/div[3]/div/div[2]/div/form/div[1]/div[2]/div[4]/div/div/input";
    //结束时间选择
    private static String chooseFinishTime_new ="/html/body/div[7]/div[1]/div/div[2]/table[1]/tbody/tr[4]/td[4]/div";
    //备注
    private static String remarks ="//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[5]/div/div/input";
    //使用范围下拉框
    public static String usableRange_new = "//*[@id=\"myscroll\"]/form/div[2]/div[2]/div[1]/div/div/div[1]/input";
    //使用范围选择
    public static String chooseUsableRange_new = "/html/body/div[6]/div[1]/div[1]/ul/li[1]";
    //添加
    public static String add_new ="//*[@id=\"myscroll\"]/form/div[3]/div[1]/div/button[3]/span";
    //产品编码
    public static String productNum_new ="//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[2]/div/div[1]/div[1]/input";
    //产品名称
    public static String productName_new ="//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[2]/div/div[1]/div[1]/input";
    //查询按钮
    private static String searchButton_new ="//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[2]/div/div[1]/button[1]/span";
    //商品选择 确认按钮
    private static String productCheck1 = "//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[1]/div/label/span/span";
    private static String productComfirm = "//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[2]/div/div[1]/button[2]/span";
    private static String windowQuit2= "//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[1]/button/i";
    //导入
    private static String productImport = "/html/body/div[1]/div/div[2]/section/div/div[3]/div/div[2]/div/form/div[3]/div[1]/div/button[2]";
    //点击下载模板
    private static String clickDownLoad = "/html/body/div[1]/div/div[2]/section/div/div[6]/div/div[2]/div/div[2]/div[1]/div/div/button/span";
    //点击上次excel
    private static String clickUpLoad = "//*[@id=\"myscroll\"]/div[2]/div[2]/div/div/div[2]/div/button";
    //点击下一步
    private static String next1 = "//*[@id=\"myscroll\"]/div[3]/button[2]";
    //完成
    private static String fine= "/html/body/div[1]/div/div[2]/section/div/div[6]/div/div[2]/div/div[4]/button";
    //删除 商品选择
    private static String productCheck2 = "/html/body/div[1]/div/div[2]/section/div/div[3]/div/div[2]/div/form/div[3]/div[2]/div/div[3]/table/tbody/tr[1]/td[1]/div/label";
    private static String productRemove = "//*[@id=\"myscroll\"]/form/div[3]/div[1]/div/button[1]/span";
    //确认按钮
    public static String comfirm = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[3]/div/button[2]";

    //单据编辑
    public static String voucherEdit = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[9]/div/button[1]";
    //单据确认 取消确认
    public static String voucherComfirm = "/html/body/div[1]/div/div[2]/section/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[9]/div/button[2]";
    public static String voucherCancel = "/html/body/div[1]/div/div[2]/section/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[9]/div/button[2]";
    //作废
    public static String voucherInvaild = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[9]/div/button[3]";
    //审核 取消确认审核
    public static String voucherAudit = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[9]/div/button[3]";
    public static String voucherCancel1 = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[9]/div/button[2]";
    //查看
    public static String voucherCheck = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[9]/div/button[1]";
    //导出
    public static String vouchersExport = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[2]/span";

    //取消、确认
    public static String voucherCancel2 ="/html/body/div[5]/div/div[3]/button[1]/span";
    public static String vocherComfirm1  ="/html/body/div[5]/div/div[3]/button[2]/span";

    public static String getVoucherCancel2() {
        return voucherCancel2;
    }

    public static String getVoucherComfirm() {
        return voucherComfirm;
    }

    public static String getVocherComfirm1() {
        return vocherComfirm1;
    }

    public static String getPriceM() {
        return priceM;
    }

    public static String getfPrice() {
        return fPrice;
    }

    public static String getExchangeFair() {
        return exchangeFair;
    }

    public static String getChooseExchangeFair() {
        return chooseExchangeFair;
    }

    public static String getPriceNum() {
        return priceNum;
    }

    public static String getPriceState() {
        return PriceState;
    }

    public static String getChoosePriceState() {
        return choosePriceState;
    }

    public static String getUsableRange() {
        return usableRange;
    }

    public static String getChooseUsableRange() {
        return chooseUsableRange;
    }

    public static String getCreatTime1() {
        return creatTime1;
    }

    public static String getChooseCreatTime1() {
        return chooseCreatTime1;
    }

    public static String getFinishTime1() {
        return finishTime1;
    }

    public static String getChooseFinishTime1() {
        return chooseFinishTime1;
    }

    public static String getCreatTime2() {
        return creatTime2;
    }

    public static String getChooseCreatTime2() {
        return chooseCreatTime2;
    }

    public static String getFinishTime2() {
        return finishTime2;
    }

    public static String getChooseFinishTime2() {
        return chooseFinishTime2;
    }

    public static String getFoungder() {
        return foungder;
    }

    public static String getSearchButton() {
        return searchButton;
    }

    public static String getResetButton() {
        return resetButton;
    }

    public static String getNewButton() {
        return newButton;
    }

    public static String getWindowQuit1() {
        return windowQuit1;
    }

    public static String getCancel() {
        return cancel;
    }

    public static String getExchangeFair_new() {
        return exchangeFair_new;
    }

    public static String getChooseExchangeFair_new() {
        return chooseExchangeFair_new;
    }

    public static String getPriceNum_new() {
        return priceNum_new;
    }

    public static String getCreatTime_new() {
        return creatTime_new;
    }

    public static String getChooseCreatTime_new() {
        return chooseCreatTime_new;
    }

    public static String getFinishTime_new() {
        return finishTime_new;
    }

    public static String getChooseFinishTime_new() {
        return chooseFinishTime_new;
    }

    public static String getRemarks() {
        return remarks;
    }

    public static String getUsableRange_new() {
        return usableRange_new;
    }

    public static String getChooseUsableRange_new() {
        return chooseUsableRange_new;
    }

    public static String getAdd_new() {
        return add_new;
    }

    public static String getProductNum_new() {
        return productNum_new;
    }

    public static String getProductName_new() {
        return productName_new;
    }

    public static String getSearchButton_new() {
        return searchButton_new;
    }

    public static String getProductCheck1() {
        return productCheck1;
    }

    public static String getProductComfirm() {
        return productComfirm;
    }

    public static String getWindowQuit2() {
        return windowQuit2;
    }

    public static String getProductImport() {
        return productImport;
    }

    public static String getProductCheck2() {
        return productCheck2;
    }

    public static String getProductRemove() {
        return productRemove;
    }

    public static String getComfirm() {
        return comfirm;
    }

    public static String getVoucherEdit() {
        return voucherEdit;
    }

    public static String getVoucherCancel() {
        return voucherCancel;
    }

    public static String getVoucherInvaild() {
        return voucherInvaild;
    }

    public static String getVoucherAudit() {
        return voucherAudit;
    }

    public static String getVoucherCancel1() {
        return voucherCancel1;
    }

    public static String getVoucherCheck() {
        return voucherCheck;
    }

    public static String getVouchersExport() {
        return vouchersExport;
    }

    public static String getClickDownLoad() {
        return clickDownLoad;
    }

    public static String getClickUpLoad() {
        return clickUpLoad;
    }

    public static String getNext1() {
        return next1;
    }

    public static String getFine() {
        return fine;
    }
}
