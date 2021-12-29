package element.priceManagement;

public class distributionPrice {
    //点击新oms系统
    private static String omsC = "//*[@id=\"app\"]/div/div[2]/div[3]/a/div/div";
    //价格管理
    private static String priceM = "//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[6]/li/div";
    //分销管理
    private static String dPrice ="//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[6]/li/ul/div[2]/a/li" ;
    //订货会下拉框
    public static String exchangeFair = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[1]/div[1]/input";
    //订货会选择
    public static String chooseExchangeFair ="/html/body/div[4]/div[1]/div[1]/ul/li[2]";
    //价格单号
    public static String priceNum = "";
    //价格状态下拉框
    public static String PriceState = "";
    //价格状态选择
    public static String choosePriceState = "";
    //使用范围下拉框
    public static String usableRange = "";
    //使用范围选择
    public static String chooseUsableRange ="";
    //起始时间选择框
    private static String creatTime1 ="";
    //起始时间选择
    private static String chooseCreatTime1 ="";
    //结束时间选择框
    private static String finishTime1 ="";
    //结束时间选择
    private static String chooseFinishTime1 ="";

    //起始时间选择框
    private static String creatTime2 ="";
    //起始时间选择
    private static String chooseCreatTime2 ="";
    //结束时间选择框
    private static String finishTime2 ="";
    //结束时间选择
    private static String chooseFinishTime2 ="";
    //创建人
    private static String foungder ="";
    //查询按钮
    private static String searchButton ="";
    //重置按钮
    private static String resetButton ="";


    //新建按钮
    public static String newButton = "";
    //关闭 X
    public static String windowQuit1 = "";
    //取消
    public static String cancel = "";
    //订货会下拉框_新建
    public static String exchangeFair_new = "";
    //订货会选择_新建
    public static String chooseExchangeFair_new = "";
    //价格单号
    public static String priceNum_new = "";
    //起始时间选择框
    private static String creatTime_new ="";
    //起始时间选择
    private static String chooseCreatTime_new ="";
    //结束时间选择框
    private static String finishTime_new ="";
    //结束时间选择
    private static String chooseFinishTime_new ="";
    //备注
    private static String remarks ="";
    //使用范围下拉框
    public static String usableRange_new = "";
    //使用范围选择
    public static String chooseUsableRange_new = "";
    //添加
    public static String add_new ="";
    //产品编码
    public static String productNum_new ="";
    //产品名称
    public static String productName_new ="";
    //查询按钮
    private static String searchButton_new ="";
    //商品选择 确认按钮
    private static String productCheck1 = "";
    private static String productComfirm = "";
    private static String windowQuit2= "";
    //导入
    private static String productImport = "";
    //删除 商品选择
    private static String productCheck2 = "";
    private static String productRemove = "";
    //确认按钮
    public static String comfirm = "";

    //单据编辑
    public static String voucherEdit = "";
    //单据确认 取消确认
    public static String voucherComfirm = "";
    public static String voucherCancel = "";
    //作废
    public static String voucherInvaild = "";
    //审核 取消确认审核
    public static String voucherAudit = "";
    public static String voucherCancel1 = "";
    //查看
    public static String voucherCheck = "";
    //导出
    public static String vouchersExport = "";

    public static String getOmsC() {
        return omsC;
    }

    public static String getdPrice() {
        return dPrice;
    }

    public static String getPriceM() {
        return priceM;
    }

    public static String getDPrice() {
        return dPrice;
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

    public static String getVoucherComfirm() {
        return voucherComfirm;
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
}
