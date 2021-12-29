package element.futuresManagement;
/*
*
* 期货单
*
* */
public class futuresOrder {
    //期货单页面
    private static String futuresOrder="//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[5]/li/ul/div[2]/a/li";
    //期货单号
    private static String futuresNum="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[1]/input";
    //期货状态下拉框
    private static String futuresState="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/input";
    //期货状态选择
    private static String chooseFuturesState = "/html/body/div[4]/div[1]/div[1]/ul/li[1]";
    //店铺编号
    private static String storeNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[3]/input";
    //店铺名称
    private static String storeName = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[4]/input";
    //订货会下拉框
    public static String exchangeFair = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[5]/div[1]/input";
    //订货会选择
    public static String chooseExchangeFair = "/html/body/div[5]/div[1]/div[1]/ul/li[1]";
    //起始时间选择框
    private static String creatTime="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[6]/input";
    //结束时间选择框
    private static String finishTime="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[7]/input";
    //查询按钮
    private static String searchButton ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[1]";
    //重置按钮
    private static String resetButton ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[2]";
    //作废隐藏
    private static String hideInvalidDocuments= "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/label/span[1]/span";

    //新建按钮
    public static String newButton = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[1]";
    //关闭 X
    public static String windowQuit1 = "/html/body/div[1]/div/div[2]/section/div/div[3]/div/div[1]/button/";
    //取消
    public static String cancel = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[3]/div/button[1]";
    //店铺编号
    private static String storeNum_new = "//*[@id=\"myscroll\"]/div[1]/div[2]/form/div[2]/div";
    //店铺编号输入
    private static String storeNumInput = "/html/body/div[1]/div/div[2]/section/div/div[4]/div/div[2]/div/div[1]/div[1]/input";
    //店铺名称输入
    private static String storeNameInput = "//*[@id=\"app\"]/div/div[2]/section/div/div[4]/div/div[2]/div/div[1]/div[2]/input";
    //点击店铺
    private static String storeCheck = "//*[@id=\"app\"]/div/div[2]/section/div/div[4]/div/div[2]/div/div[2]/div[3]/table/tbody/tr/td[1]/div";
    //查询按钮
    private static String searchButton_new ="/html/body/div[1]/div/div[2]/section/div/div[4]/div/div[2]/div/div[1]/button[1]";
    //确认
    private static String comfirm_new ="/html/body/div[1]/div/div[2]/section/div/div[4]/div/div[2]/div/div[1]/button[2]";
    //订货会下拉框_新建
    public static String exchangeFair_new = "//*[@id=\"myscroll\"]/div[1]/div[2]/form/div[4]/div/div/div[1]/input";
    //订货会选择_新建
    public static String chooseExchangeFair_new = "/html/body/div[5]/div[1]/div[1]/ul/li[1]";
    //备注
    private static String remarks_new = "//*[@id=\"myscroll\"]/div[1]/div[2]/form/div[5]/div/div/input";


    //导入
    private static String productImport = "//*[@id=\"myscroll\"]/div[2]/div[1]/div/button[2]/span";
    //点击下载模板
    private static String clickDownLoad = "/html/body/div[1]/div/div[2]/section/div/div[5]/div/div[2]/div/div[2]/div[1]/div/div/button/span";
    //点击上次excel
    private static String clickUpLoad = "//*[@id=\"myscroll\"]/div[2]/div[2]/div/div/div[2]/div/button/span";
    //点击下一步
    private static String next1 = "//*[@id=\"myscroll\"]/div[3]/button[2]";
    //完成
    private static String fine= "/html/body/div[1]/div/div[2]/section/div/div[5]/div/div[2]/div/div[4]/button";

    //删除 商品选择
    private static String productCheck = "/html/body/div[1]/div/div[2]/section/div/div[3]/div/div[2]/div/div[2]/div[2]/div/div[3]/table/tbody/tr[1]/td[1]/div/label";
    private static String productRemove = "/html/body/div[1]/div/div[2]/section/div/div[3]/div/div[2]/div/div[2]/div[1]/div/button[1]";
    //确认按钮
    public static String comfirm = "/html/body/div[1]/div/div[2]/section/div/div[3]/div/div[3]/div/button[2]";

    //单据编辑
    public static String voucherEdit = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[11]/div/button[1]";
    //作废
    public static String voucherInvaild = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[11]/div/button[3]";
    //审核 取消确认审核
    public static String voucherAudit = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[11]/div/button[2]";
    public static String voucherCancel1 = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[11]/div/button[2]";
    //取消、确认
    public static String voucherCancel2 = "/html/body/div[4]/div/div[3]/button[1]";
    public static String vocherComfirm = "/html/body/div[2]/div/div[3]/button[2]";
    //查看
    public static String voucherCheck = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[11]/div/button[1]";

    //批量审核
    private static String productCheck2 = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[1]/div/label";
    private static String batchReview ="//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[2]";

    //导出
    public static String vouchersExport = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[3]";

    public static String getFuturesOrder() {
        return futuresOrder;
    }

    public static String getFuturesNum() {
        return futuresNum;
    }

    public static String getFuturesState() {
        return futuresState;
    }

    public static String getChooseFuturesState() {
        return chooseFuturesState;
    }

    public static String getStoreNum() {
        return storeNum;
    }

    public static String getStoreName() {
        return storeName;
    }

    public static String getExchangeFair() {
        return exchangeFair;
    }

    public static String getChooseExchangeFair() {
        return chooseExchangeFair;
    }

    public static String getCreatTime() {
        return creatTime;
    }

    public static String getFinishTime() {
        return finishTime;
    }


    public static String getSearchButton() {
        return searchButton;
    }

    public static String getResetButton() {
        return resetButton;
    }

    public static String getHideInvalidDocuments() {
        return hideInvalidDocuments;
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

    public static String getStoreNum_new() {
        return storeNum_new;
    }

    public static String getStoreNumInput() {
        return storeNumInput;
    }

    public static String getStoreNameInput() {
        return storeNameInput;
    }

    public static String getStoreCheck() {
        return storeCheck;
    }

    public static String getSearchButton_new() {
        return searchButton_new;
    }

    public static String getComfirm_new() {
        return comfirm_new;
    }

    public static String getExchangeFair_new() {
        return exchangeFair_new;
    }

    public static String getChooseExchangeFair_new() {
        return chooseExchangeFair_new;
    }

    public static String getRemarks_new() {
        return remarks_new;
    }

    public static String getProductImport() {
        return productImport;
    }

    public static String getClickDownLoad() {
        return clickDownLoad;
    }

    public static String getClickUpLoad() {
        return clickUpLoad;
    }

    public static String getProductCheck() {
        return productCheck;
    }

    public static String getProductRemove() {
        return productRemove;
    }

    public static String getComfirm() {
        return comfirm;
    }

    public static String getProductCheck2() {
        return productCheck2;
    }

    public static String getBatchReview() {
        return batchReview;
    }

    public static String getVouchersExport() {
        return vouchersExport;
    }
    public static String getNext1() {
        return next1;
    }

    public static String getFine() {
        return fine;
    }

    public static String getVoucherEdit() {
        return voucherEdit;
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

    public static String getVoucherCancel2() {
        return voucherCancel2;
    }

    public static String getVocherComfirm() {
        return vocherComfirm;
    }
}
