package element.orderManagement;

public class distributionSet {
    //配货设置页面
    private static String distributionSetHtml = "//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[2]/li/ul/div[6]/a/li";
    //店铺编号
    private static String storeNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[1]/input";
    //店铺名称
    private static String storeName = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[2]/input";
    //适用范围
    private static String UseRange = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[3]/div[1]/input";
    //适用范围选择
    private static String chooseUseRange = "/html/body/div[9]/div[1]/div[1]/ul/li[1]";
    //是否可用
    private static String available = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[4]/div[1]/input";
    //是否可用选择
    private static String chooseAvailable = "/html/body/div[10]/div[1]/div[1]/ul/li[1]";

    //起始时间选择框
    private static String creatTimeB ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[5]/input";
    //起始时间选择
    private static String chooseCreatTimeB ="/html/body/div[11]/div[1]/div/div[2]/table[1]/tbody/tr[4]/td[3]/div";
    //结束时间选择框
    private static String finishTimeB ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[6]/input";
    //结束时间选择
    private static String chooseFinishTimeB = "/html/body/div[12]/div[1]/div/div[2]/table[1]/tbody/tr[4]/td[5]/div";

    //起始时间选择框
    private static String creatTimeE ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[7]/input";
    //起始时间选择
    private static String chooseCreatTimeE ="/html/body/div[13]/div[1]/div/div[2]/table[1]/tbody/tr[6]/td[2]/div/span";
    //结束时间选择框
    private static String finishTimeE ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[8]/input";
    //结束时间选择
    private static String chooseFinishTimeE = "/html/body/div[13]/div[1]/div/div[2]/table[1]/tbody/tr[6]/td[4]/div/span";

    //备注
    private static String remarks = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[9]/input";

    //搜索键
    private static String searchButton = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[1]";
    private static String resetButton = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[2]";

    //新建
    private static String newButton = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[1]";
    //窗口取消
    private static String windowsCancel= "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[3]/div/button[1]";

    //订单类型
    private static String orderType_new = "//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[1]/div/div/div[2]/input";
    //订单类型选择
    private static String chooseOrderType_new = "";

    //是否可用
    private static String available_new = "//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[2]/div/div/span";

    //起始时间选择框
    private static String creatTime_new ="//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[3]/div/div/input";
    //起始时间选择
    private static String chooseCreatTime_new ="/html/body/div[15]/div[1]/div/div[2]/table[1]/tbody/tr[6]/td[2]/div/span";
    //结束时间选择框
    private static String finishTime_new ="//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[4]/div/div/input";
    //结束时间选择
    private static String chooseFinishTime_new = "/html/body/div[16]/div[1]/div/div[2]/table[1]/tbody/tr[6]/td[4]/div/span";
    //备注
    private static String remarks_new = "//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[5]/div/div/input";
    //适用范围
    private static String UseRange_new = "//*[@id=\"myscroll\"]/form/div[2]/div[2]/div[1]/div/div/div[1]/input";
    //适用范围选择
    private static String chooseUseRange_new = "/html/body/div[17]/div[1]/div[1]/ul/li[1]";
    //窗口确认
    private static String windowComfirm  = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[3]/div/button[2]";
    //单据编辑
    private static String voucherEdit = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[6]/div/button";
    //导出
    private static String vouchersExport = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[2]";


    public static String getDistributionSetHtml() {
        return distributionSetHtml;
    }

    public static String getStoreNum() {
        return storeNum;
    }

    public static String getStoreName() {
        return storeName;
    }

    public static String getUseRange() {
        return UseRange;
    }

    public static String getChooseUseRange() {
        return chooseUseRange;
    }

    public static String getAvailable() {
        return available;
    }

    public static String getChooseAvailable() {
        return chooseAvailable;
    }

    public static String getCreatTimeB() {
        return creatTimeB;
    }

    public static String getChooseCreatTimeB() {
        return chooseCreatTimeB;
    }

    public static String getFinishTimeB() {
        return finishTimeB;
    }

    public static String getChooseFinishTimeB() {
        return chooseFinishTimeB;
    }

    public static String getCreatTimeE() {
        return creatTimeE;
    }

    public static String getChooseCreatTimeE() {
        return chooseCreatTimeE;
    }

    public static String getFinishTimeE() {
        return finishTimeE;
    }

    public static String getChooseFinishTimeE() {
        return chooseFinishTimeE;
    }

    public static String getRemarks() {
        return remarks;
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

    public static String getWindowsCancel() {
        return windowsCancel;
    }

    public static String getOrderType_new() {
        return orderType_new;
    }

    public static String getChooseOrderType_new() {
        return chooseOrderType_new;
    }

    public static String getAvailable_new() {
        return available_new;
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

    public static String getRemarks_new() {
        return remarks_new;
    }

    public static String getUseRange_new() {
        return UseRange_new;
    }

    public static String getChooseUseRange_new() {
        return chooseUseRange_new;
    }

    public static String getWindowComfirm() {
        return windowComfirm;
    }

    public static String getVoucherEdit() {
        return voucherEdit;
    }

    public static String getVouchersExport() {
        return vouchersExport;
    }
}
