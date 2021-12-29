package element.lockTheGoodsManagement;

public class lockCargoflow {
    //锁货流水页面
    public static String lockCargoflowhtml = "//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[3]/li/ul/div[3]/a/li";
    //起始时间选择框
    private static String creatTime="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[1]/input";
    //起始时间选择
    private static String chooseCreatTime="/html/body/div[8]/div[1]/div/div[2]/table[1]/tbody/tr[4]/td[2]/div/span";
    //结束时间选择框
    private static String finishTime="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[2]/input";
    //结束时间选择
    private static String chooseFinishTime="/html/body/div[9]/div[1]/div/div[2]/table[1]/tbody/tr[4]/td[7]/div/span";
    //变更类型下拉框
    private static String changeType = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[3]/div[1]/input";
    //变更类型选择
    private static String chooseChangeType ="/html/body/div[10]/div[1]/div[1]/ul/li[1]";
    //产品编号
    public static String productNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[4]/input";
    //产品名称
    public static String productName = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[5]/input";
    //单据编号
    public static String voucherNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[6]/input";
    //单据备注
    public static String voucherRemarks = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[7]/input";
    //操作人
    public static String founder= "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[8]/input";
    //查询、重置按钮
    private static String searchButton ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[1]";
    private static String resetButton ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[2]/i";
    //导出
    public static String vouchersExport = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button/i";

    public static String getLockCargoflowhtml() {
        return lockCargoflowhtml;
    }

    public static String getCreatTime() {
        return creatTime;
    }

    public static String getChooseCreatTime() {
        return chooseCreatTime;
    }

    public static String getFinishTime() {
        return finishTime;
    }

    public static String getChooseFinishTime() {
        return chooseFinishTime;
    }

    public static String getChangeType() {
        return changeType;
    }

    public static String getChooseChangeType() {
        return chooseChangeType;
    }

    public static String getProductNum() {
        return productNum;
    }

    public static String getProductName() {
        return productName;
    }

    public static String getVoucherNum() {
        return voucherNum;
    }

    public static String getVoucherRemarks() {
        return voucherRemarks;
    }

    public static String getFounder() {
        return founder;
    }

    public static String getSearchButton() {
        return searchButton;
    }

    public static String getResetButton() {
        return resetButton;
    }

    public static String getVouchersExport() {
        return vouchersExport;
    }
}
