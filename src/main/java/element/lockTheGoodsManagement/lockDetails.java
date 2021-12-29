package element.lockTheGoodsManagement;

public class lockDetails {
    //锁货明细
    public static String lockDetailshtml = "//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[3]/li/ul/div[2]/a/li";
    //锁货单号
    public static String lockNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[1]/input";
    //产品编号
    public static String productNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[2]/input";
    //产品名称
    public static String productName = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[3]/input";
    //店铺编号
    public static String storeNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[4]/input";
    //店铺名称
    public static String storeName = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[5]/input";
    //起始时间选择框
    private static String creatTime="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[6]/input";
    //起始时间选择
    private static String chooseCreatTime="/html/body/div[6]/div[1]/div/div[2]/table[1]/tbody/tr[4]/td[4]/div";
    //结束时间选择框
    private static String finishTime="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[7]/input";
    //结束时间选择
    private static String chooseFinishTime="/html/body/div[7]/div[1]/div/div[2]/table[1]/tbody/tr[4]/td[7]/div/span";
    //备注
    private static String remarks= "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[8]/input";
    //创建人
    private static String founder= "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[9]/input";
    //查询、重置按钮
    private static String searchButton ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[1]";
    private static String resetButton ="/html/body/div[1]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[2]";
    //导出
    public static String vouchersExport = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button/i";

    public static String getLockDetailshtml() {
        return lockDetailshtml;
    }

    public static String getLockNum() {
        return lockNum;
    }

    public static String getProductNum() {
        return productNum;
    }

    public static String getProductName() {
        return productName;
    }

    public static String getStoreNum() {
        return storeNum;
    }

    public static String getStoreName() {
        return storeName;
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

    public static String getRemarks() {
        return remarks;
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
