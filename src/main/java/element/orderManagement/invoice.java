package element.orderManagement;

public class invoice {
    //配货单
    private static String invoice = "//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[2]/li/ul/div[3]/a/li";
    //配货单号
    private static String invoiceNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[1]/input";
    //订单编号输入栏
    private static String ordreNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[2]/input";
    //配货状态下拉框
    private static String invoiceState = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[3]/div[1]/input";
    //配货状态选择
    private static String chooseInvoiceState = "/html/body/div[7]/div[1]/div[1]/ul/li[1]";
    //店铺编号
    private static String storeNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[4]/input";
    //店铺名称
    private static String storeName = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[5]/input";
    //配货仓库
    private static String invoiceWarehouse = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[6]/div[1]/input";
    //配货仓库选择
    private static String chooseInvoiceWarehouse = "/html/body/div[8]/div[1]/div[1]/ul/li[2]";
    //起始时间选择框
    private static String creatTime ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[7]/input";
    //起始时间选择
    private static String chooseCreatTime ="/html/body/div[9]/div[1]/div/div[2]/table[1]/tbody/tr[6]/td[1]/div";
    //结束时间选择框
    private static String finishTime ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[8]/input";
    //结束时间选择
    private static String chooseFinishTime ="/html/body/div[10]/div[1]/div/div[2]/table[1]/tbody/tr[6]/td[4]/div";
    //备注
    private static String remarks = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[9]/input";
    //操作人
    private static String founder = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[10]/input";
    //隐藏作废
    private static  String hideInvalidDocuments= "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/label/span[1]/span";

    //搜索键
    private static String searchButton = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[1]";
    //重置键位
    private static String resetButton = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[2]";
    //单据编辑
    public static String voucherEdit = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[14]/div/button[1]";
    //编辑页面中的备注
    private static String remarks_new = "//*[@id=\"myscroll\"]/div[1]/div[2]/form/div[5]/div/div/input";
    //编辑页面中的确认
    private static String editComfirm = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[3]/div/button[2]/span";



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
    //导出
    public static String vouchersExport = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[1]";

    //取消、确认
    public static String voucherCancel2 ="/html/body/div[10 ]/div/div[3]/button[2]/span";
    public static String vocherComfirm1  ="/html/body/div[10]/div/div[3]/button[2]/span";

    //查看页面关闭
    private static String voucherCancel3 = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[3]/div/button";

    public static String getInvoice() {
        return invoice;
    }

    public static String getInvoiceNum() {
        return invoiceNum;
    }

    public static String getOrdreNum() {
        return ordreNum;
    }

    public static String getInvoiceState() {
        return invoiceState;
    }

    public static String getChooseInvoiceState() {
        return chooseInvoiceState;
    }

    public static String getStoreNum() {
        return storeNum;
    }

    public static String getStoreName() {
        return storeName;
    }

    public static String getInvoiceWarehouse() {
        return invoiceWarehouse;
    }

    public static String getChooseInvoiceWarehouse() {
        return chooseInvoiceWarehouse;
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

    public static String getHideInvalidDocuments() {
        return hideInvalidDocuments;
    }

    public static String getSearchButton() {
        return searchButton;
    }

    public static String getResetButton() {
        return resetButton;
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

    public static String getVoucherCancel3() {
        return voucherCancel3;
    }

    public static String getRemarks_new() {
        return remarks_new;
    }

    public static String getEditComfirm() {
        return editComfirm;
    }
}

