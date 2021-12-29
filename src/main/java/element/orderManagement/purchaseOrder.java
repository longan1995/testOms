package element.orderManagement;

public class purchaseOrder {
    //点击新oms系统
    private static String omsC = "//*[@id=\"app\"]/div/div[2]/div[3]/a/div/div";
    //订单管理
    private static String omsM = "//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[2]/li/div";
    //订货单
    private static String pOrder = "//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[2]/li/ul/div[1]/a/li";
    //订单编号输入栏
    private static String ordreNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[1]/input";
    //搜索键
    private static String searchButton = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[1]";
    //重置键位
    private static String resetButton = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[2]";
    //订单状态下拉框
    private static String orderState = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[2]/div/input";
    //订单状态选择
    private static String chooseOrderState = "/html/body/div[4]/div[1]/div[1]/ul/li[4]";
    //订单类型下拉框
    private static String orderForm = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[3]/div[1]/input";
    //订单类型选择
    private static String chooseOrderForm = "/html/body/div[5]/div[1]/div[1]/ul/li[2]";
    //店铺编号
    private static String storeNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[4]/input";
    //店铺状态下拉框
    private static String storeState = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[6]/div[1]/input";
    //店铺状态选择
    private static String chooseStoreState = "/html/body/div[6]/div[1]/div[1]/ul/li[2]";
    //店铺名称
    private static String storeName = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[5]/input";
    //起始时间选择框
    private static String creatTime ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[7]/input";
    //起始时间选择
    private static String chooseCreatTime ="/html/body/div[8]/div[1]/div/div[2]/table[1]/tbody/tr[5]/td[4]/div";
    //结束时间选择框
    private static String finishTime ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[8]/input";
    //结束时间选择
    private static String chooseFinishTime ="/html/body/div[9]/div[1]/div/div[2]/table[1]/tbody/tr[4]/td[3]/div";
    //订单来源下拉框
    private static String orderSource = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[9]/div/input";
    //订单来源选择
    private static String chooseOrderSource = "/html/body/div[9]/div[1]/div[1]/ul/li[1]";
    //备注
    private static String remarks = "/html/body/div[1]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[10]/input";
    //隐藏作废
    private static  String hideInvalidDocuments= "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/label/span[1]/span";


    /*新建按钮*/

    //新建
    private static String newButton = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[1]";
    //关闭 X
    private static String WindowQuit1 = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[1]/button/i";
    //取消
    private static String cancel = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[3]/div/button[1]";
    //订货品牌
    private static String orderBrand = "//*[@id=\"myscroll\"]/div[2]/div[2]/form/div[1]/div/div/div/input";
    //订货品牌选择
    private static String chooseOrderBrand = "/html/body/div[9]/div[1]/div[1]/ul/li[9]";
    //发货仓
    private static String sendWarehouse = "//*[@id=\"myscroll\"]/div[2]/div[2]/form/div[2]/div/div/div[1]/input";
    //发货仓选择
    private static String chooseSendWarehouse = "/html/body/div[5]/div[1]/div[1]/ul/li[2]";
    //订货店铺
    private static String orderStore = "//*[@id=\"myscroll\"]/div[2]/div[2]/form/div[3]/div/div/div[1]/input";
    //订货店铺选择
    private static String chooseOrderStore = "/html/body/div[6]/div[1]/div[1]/ul/li[2]";
    //订货会下拉框
    public static String exchangeFair = "//*[@id=\"myscroll\"]/div[2]/div[2]/form/div[4]/div/div/div[1]/input";
    //订货会选择
    public static String chooseExchangeFair = "/html/body/div[7]/div[1]/div[1]/ul/li[2]";
    //订单类型下拉框
    private static String orderForm_new = "//*[@id=\"myscroll\"]/div[2]/div[2]/form/div[5]/div/div/div[1]/input";
    //订单类型选择
    private static String chooseOrderForm_new = "/html/body/div[8]/div[1]/div[1]/ul/li[1]";
    //物流方式
    private static String logisticsMode = "//*[@id=\"myscroll\"]/div[2]/div[2]/form/div[9]/div/div/div/input";
    //物流方式选择
    private static String chooseLogisticsMode = "/html/body/div[11]/div[1]/div[1]/ul/li[1]";
    //物流单位
    private static String logisticsUnits = "//*[@id=\"myscroll\"]/div[2]/div[2]/form/div[10]/div/div/div[1]/input";
    //物流单位选择
    private static String ChooseLogisticsUnits = "/html/body/div[10]/div[1]/div[1]/ul/li[1]";
    //备注
    private static String remarks_new = "//*[@id=\"myscroll\"]/div[2]/div[2]/form/div[11]/div/div/input";


    //添加
    public static String add_new ="//*[@id=\"myscroll\"]/div[1]/div[1]/div/button[3]";
    //产品编码
    public static String productNum_new ="//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[2]/div/div[1]/div[1]/input";
    //产品名称
    public static String productName_new ="//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[2]/div/div[1]/div[2]/input";
    //查询按钮
    private static String searchButton_new ="//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[2]/div/div[1]/button[1]";
    //商品选择 确认按钮
    private static String productCheck1 = "//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[1]/div/label/span/span";
    private static String productComfirm = "//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[2]/div/div[1]/button[2]";
    private static String windowQuit2= "//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[1]/button/i";
    //导入
    private static String productImport = "//*[@id=\"myscroll\"]/div[1]/div[1]/div/button[2]";
    //点击下载模板
    private static String clickDownLoad = "//*[@id=\"myscroll\"]/div[2]/div[1]/div/div/button";
    //点击上次excel
    private static String clickUpLoad = "//*[@id=\"myscroll\"]/div[2]/div[2]/div/div/div[2]/div/button";
    //点击下一步
    private static String next1 = "//*[@id=\"myscroll\"]/div[3]/button[2]";
    //完成
    private static String fine= "//*[@id=\"myscroll\"]/div[4]/button";
    //删除 商品选择
    private static String productCheck2 = "//*[@id=\"myscroll\"]/div[1]/div[2]/div/div[3]/table/tbody/tr[1]/td[1]/div/label";
    private static String productRemove = "//*[@id=\"myscroll\"]/div[1]/div[1]/div/button[1]";
    //确认按钮
    public static String comfirm = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[3]/div/button[2]";

    //单据编辑
    public static String voucherEdit = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[18]/div/button[1]";
    //单据确认 取消确认
    public static String voucherComfirm = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[18]/div/button[2]";
    public static String voucherCancel = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[18]/div/button[2]";
    //作废
    public static String voucherInvaild = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[18]/div/button[3]";
    //审核 取消确认审核
    public static String voucherAudit = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[18]/div/button[3]";
    public static String voucherCancel1 = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[18]/div/button[2]";
    //查看
    public static String voucherCheck = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[18]/div/button[1]";
    //导出
    public static String vouchersExport = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[2]";

    //取消、确认
    public static String voucherCancel2 ="/html/body/div[5]/div/div[3]/button[1]/span";
    public static String vocherComfirm1  ="/html/body/div[5]/div/div[3]/button[2]/span";






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

    public static String getOrderSource() {
        return orderSource;
    }

    public static String getChooseOrderSource() {
        return chooseOrderSource;
    }

    public static String getRemarks() {
        return remarks;
    }

    public static String getChooseStoreState() {
        return chooseStoreState;
    }

    public static String getStoreState() {
        return storeState;
    }

    public static String getStoreNum() {
        return storeNum;
    }

    public static String getStoreName() {
        return storeName;
    }

    public static String getOrderForm() {
        return orderForm;
    }

    public static String getChooseOrderForm() {
        return chooseOrderForm;
    }

    public static String getOrderState() {
        return orderState;
    }

    public static String getChooseOrderState() {
        return chooseOrderState;
    }

    public static String getOmsC() {
        return omsC;
    }

    public static String getOmsM() {
        return omsM;
    }


    public static String getpOrder() {
        return pOrder;
    }

    public static String getOrdreNum() {
        return ordreNum;
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

    public static String getOrderBrand() {
        return orderBrand;
    }

    public static String getChooseOrderBrand() {
        return chooseOrderBrand;
    }

    public static String getHideInvalidDocuments() {

        return hideInvalidDocuments;
    }

    public static String getWindowQuit1() {
        return WindowQuit1;
    }

    public static String getCancel() {
        return cancel;
    }

    public static String getSendWarehouse() {
        return sendWarehouse;
    }

    public static String getChooseSendWarehouse() {
        return chooseSendWarehouse;
    }

    public static String getOrderStore() {
        return orderStore;
    }

    public static String getChooseOrderStore() {
        return chooseOrderStore;
    }

    public static String getExchangeFair() {
        return exchangeFair;
    }

    public static String getChooseExchangeFair() {
        return chooseExchangeFair;
    }

    public static String getOrderForm_new() {
        return orderForm_new;
    }

    public static String getChooseOrderForm_new() {
        return chooseOrderForm_new;
    }

    public static String getLogisticsMode() {
        return logisticsMode;
    }

    public static String getChooseLogisticsMode() {
        return chooseLogisticsMode;
    }

    public static String getLogisticsUnits() {
        return logisticsUnits;
    }

    public static String getChooseLogisticsUnits() {
        return ChooseLogisticsUnits;
    }

    public static String getRemarks_new() {
        return remarks_new;
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

    public static String getVoucherCancel2() {
        return voucherCancel2;
    }

    public static String getVocherComfirm1() {
        return vocherComfirm1;
    }
}

