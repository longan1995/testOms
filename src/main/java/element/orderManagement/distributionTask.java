package element.orderManagement;

public class distributionTask {
    //配货任务页面
    private static String distributionTask = "//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[2]/li/ul/div[2]/a/li";
    //订单编号输入栏
    private static String ordreNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[1]/input";
    //订单类型下拉框
    private static String orderForm = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/input";
    //订单类型选择
    private static String chooseOrderForm = "/html/body/div[10]/div[1]/div[1]/ul/li[1]";
    //店铺编号
    private static String storeNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[3]/input";
    //店铺名称
    private static String storeName = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[4]/input";
    //店铺状态下拉框
    private static String storeState = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[5]/div[1]/input";
    //店铺状态选择
    private static String chooseStoreState = "/html/body/div[9]/div[1]/div[1]/ul/li[2]";
    //起始时间选择框
    private static String creatTime ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[6]/input";
    //起始时间选择
    private static String chooseCreatTime ="/html/body/div[8]/div[1]/div/div[2]/table[1]/tbody/tr[6]/td[2]/div";
    //结束时间选择框
    private static String finishTime ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[7]/input";
    //结束时间选择
    private static String chooseFinishTime ="/html/body/div[7]/div[1]/div/div[2]/table[1]/tbody/tr[6]/td[3]/div";
    //订货品牌下拉框
    private static String orderBrand = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[8]/div[1]/input";
    //订货品牌选择
    private static String chooseOrderBrand = "/html/body/div[6]/div[1]/div[1]/ul/li[9]";
    //订单来源下拉框
    private static String orderSource = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[9]/div/input";
    //订单来源选择
    private static String chooseOrderSource = "/html/body/div[5]/div[1]/div[1]/ul/li[1]";
    //备注
    private static String remarks = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[10]/input";
    //搜索键
    private static String searchButton = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[1]";
    //重置键位
    private static String resetButton = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[2]";
    //查看
    private static String voucherCheck = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[15]/div/button[1]";
    //生成配货单
    private static String generateList = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[15]/div/button[2]";
    //导出
    private static String voucherExport = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button";
    //查看页面关闭
    private static String voucherCancel = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[3]/div/button";

    public static String getDistributionTask() {
        return distributionTask;
    }

    public static String getOrdreNum() {
        return ordreNum;
    }

    public static String getOrderForm() {
        return orderForm;
    }

    public static String getChooseOrderForm() {
        return chooseOrderForm;
    }

    public static String getStoreNum() {
        return storeNum;
    }

    public static String getStoreName() {
        return storeName;
    }

    public static String getStoreState() {
        return storeState;
    }

    public static String getChooseStoreState() {
        return chooseStoreState;
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

    public static String getOrderBrand() {
        return orderBrand;
    }

    public static String getChooseOrderBrand() {
        return chooseOrderBrand;
    }

    public static String getOrderSource() {
        return orderSource;
    }

    public static String getChooseOrderSource() {
        return chooseOrderSource;
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

    public static String getVoucherCheck() {
        return voucherCheck;
    }

    public static String getGenerateList() {
        return generateList;
    }

    public static String getVoucherExport() {
        return voucherExport;
    }

    public static String getVoucherCancel() {
        return voucherCancel;
    }
}
