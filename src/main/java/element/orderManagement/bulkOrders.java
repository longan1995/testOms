package element.orderManagement;

public class bulkOrders {
    //批量订单页面
    private static String bulkOrdersHtml = "//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[2]/li/ul/div[7]/a/li";
    //订单编号
    private static String orderNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[1]/input";
    //订单状态
    private static String orderState = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[2]/div/input";
    //订单状态选择
    private static String chooseOrderState = "/html/body/div[7]/div[1]/div[1]/ul/li[1]";
    //订单类型
    private static String orderType = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[3]/div/input";
    //订单类型选择
    private static String chooseOrderType = "/html/body/div[8]/div[1]/div[1]/ul/li[1]";
    //店铺编号
    private static String storeNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[4]/input";
    //店铺名称
    private static String storeName = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[5]/input";
    //店铺状态
    private static String storeState = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[6]/div[1]/input";
    //店铺状态选择
    private static String chooseStoreState = "/html/body/div[9]/div[1]/div[1]/ul/li[2]";
    //起始时间选择框
    private static String creatTime ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[7]/input";
    //起始时间选择
    private static String chooseCreatTime ="/html/body/div[10]/div[1]/div/div[2]/table[1]/tbody/tr[6]/td[3]/div";
    //结束时间选择框
    private static String finishTime ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[8]/input";
    //结束时间选择
    private static String chooseFinishTime = "/html/body/div[11]/div[1]/div/div[2]/table[1]/tbody/tr[6]/td[5]/div";
    //订货品牌
    private static String orderBrand = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[9]/div[1]/input";
    //订货品牌选择
    private static String chooseOrderBrand = "/html/body/div[12]/div[1]/div[1]/ul/li[9]";
    //备注
    private static String remarks = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[10]/input";
    //隐藏作废单据
    private static  String hideInvalidDocuments = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/label/span[1]";
    //搜索键
    private static String searchButton = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[1]/i";
    private static String resetButton = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[2]/i";

    //批量导入
    private static String BulkImport = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[1]/i";
    //点击下载模板
    private static String clickDownLoad = "//*[@id=\"myscroll\"]/div[1]/div[1]/div/div/button";
    //点击上传excel
    private static String clickUpLoad = "//*[@id=\"myscroll\"]/div[1]/div[2]/div/div/div[2]/div/button";
    //点击下一步 ###
    private static String next1 = "//*[@id=\"myscroll\"]/div[3]/button[2]";
    //完成 ###
    private static String fine= "//*[@id=\"myscroll\"]/div[4]/button";


    //单据页面全选
    private static String vouchersCheck = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[2]/table/thead/tr/th[1]/div/label/span/span";
    //批量确认
    private static String bulkComfirm = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[2]";
    //取消确认
    private static String bulkComfirmCancel  = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[3]";
    //批量审核
    private static String bulkAudit = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[4]";
    //取消确认审核
    private static String bulkAuditCancel  = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[5]/i";
    //批量作废
    public static String bulkInvaild = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[6]/i";
    //单据编辑
    public static String voucherEdit = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[14]/div/button[1]";
    //编辑中的备注栏
    public static String remarks_edit = "//*[@id=\"myscroll\"]/div[1]/div[2]/form/div[9]/div/div/input";
    //编辑中的确认
    public static String comfirm_edit = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[3]/div/button[2]/span";
    //单据确认 取消确认
    public static String voucherComfirm = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[14]/div/button[2]";
    public static String voucherCancel = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[14]/div/button[2]";
    //作废
    public static String voucherInvaild = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[14]/div/button[3]";
    //审核 取消确认审核
    public static String voucherAudit = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[14]/div/button[3]";
    public static String voucherCancel1 = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[14]/div/button[2]";
    //查看
    public static String voucherCheck = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[14]/div/button[1]";
    //查看中的退出
    public static String windowQuit_check = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[3]/div/button";
    //导出
    public static String vouchersExport = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[7]";

    //取消、确认
    public static String voucherCancel2 ="/html/body/div[12]/div/div[3]/button[1]/span";
    public static String vocherComfirm1  ="/html/body/div[12]/div/div[3]/button[2]/span";


    public static String getVouchersCheck() {
        return vouchersCheck;
    }

    public static String getWindowQuit_check() {
        return windowQuit_check;
    }

    public static String getComfirm_edit() {
        return comfirm_edit;
    }

    public static String getRemarks_edit() {
        return remarks_edit;
    }

    public static String getChooseStoreState() {
        return chooseStoreState;
    }

    public static String getBulkOrdersHtml() {
        return bulkOrdersHtml;
    }

    public static String getOrderNum() {
        return orderNum;
    }

    public static String getOrderState() {
        return orderState;
    }

    public static String getChooseOrderState() {
        return chooseOrderState;
    }

    public static String getOrderType() {
        return orderType;
    }

    public static String getChooseOrderType() {
        return chooseOrderType;
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

    public static String getRemarks() {
        return remarks;
    }

    public static String getHideInvalidDocuments() {
        return hideInvalidDocuments;
    }

    public static String getSearchButton() {
        return searchButton;
    }

    public static String getResetButton() {
        return resetButton;
    }

    public static String getBulkImport() {
        return BulkImport;
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

    public static String getBulkComfirm() {
        return bulkComfirm;
    }

    public static String getBulkComfirmCancel() {
        return bulkComfirmCancel;
    }

    public static String getBulkAudit() {
        return bulkAudit;
    }

    public static String getBulkAuditCancel() {
        return bulkAuditCancel;
    }

    public static String getBulkInvaild() {
        return bulkInvaild;
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

    public static String getVoucherCancel2() {
        return voucherCancel2;
    }

    public static String getVocherComfirm1() {
        return vocherComfirm1;
    }
}
