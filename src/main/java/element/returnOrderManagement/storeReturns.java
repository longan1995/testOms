package element.returnOrderManagement;

/*
*
* 门店退货
*
* */

public class storeReturns {
    //点击新oms系统
    private static String omsC = "//*[@id=\"app\"]/div/div[2]/div[3]/a/div/div";
    //退单管理页面
    private static String returnManagement = "//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[4]/li/div";
    //门店退货
    private static String storeReturns = "//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[4]/li/ul/div/a/li/span";
    //查询按钮
    private static String searchButton ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[1]";
    //重置按钮
    private static String resetButton ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[2]";
    //退单编号
    private static String returnNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[1]/input";
    //退单状态下拉框
    private static String returnState = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/input";
    //退单状态
    private static String chooseReturnState = "/html/body/div[4]/div[1]/div[1]/ul/li[1]";
    //退单类型下拉框
    private static String returnForm ="/html/body/div[1]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[3]/div[1]/input";
    //退单类型
    private static String chooseReturnForm = "/html/body/div[5]/div[1]/div[1]/ul/li[1]";
    //店铺编号
    private static String storeNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[4]/input";
    //店铺名称
    private static String storeName = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[5]/input";
    //店铺状态下拉框
    private static String storeState = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[6]/div[1]/input";
    //店铺状态
    private static String chooseStoreState = "/html/body/div[6]/div[1]/div[1]/ul/li[1]";
    //起始时间选择框
    private static String creatTime="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[7]/input";
    //起始时间选择
    private static String chooseCreatTime="/html/body/div[5]/div[1]/div/div[2]/table[1]/tbody/tr[5]/td[5]/div";
    //结束时间选择框
    private static String finishTime="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[8]/input";
    //结束时间选择
    private static String chooseFinishTime="/html/body/div[6]/div[1]/div/div[2]/table[1]/tbody/tr[5]/td[5]/div/span";
    //退单来源下拉框
    private static String returnSource = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[9]/div[1]/input";
    //退单来源选择
    private static String chooseReturnSource = "/html/body/div[9]/div[1]/div[1]/ul/li[1]";
    //是否隐藏作废单据
    private static String hideInvalidDocuments= "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/label/span[1]/span";
    //备注
    private static String remarks = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[10]/input";
    /*******新建页面*********/
    //新建按钮
    public static String newButton = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[1]/i";
    //关闭 X
    public static String windowQuit1 = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[1]/button/i";
    //取消
    public static String cancel = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[3]/div/button[1]";
    //订货会下拉框_新建
    public static String exchangeFair_new = "//*[@id=\"myscroll\"]/div[1]/div[2]/form/div[1]/div/div/div/input";
    //订货会选择_新建
    public static String chooseExchangeFair_new = "/html/body/div[13]/div[1]/div[1]/ul/li[1]";
    //退单类型下拉框
    private static String returnForm_new ="//*[@id=\"myscroll\"]/div[1]/div[2]/form/div[2]/div/div/div/input";
    //退单类型
    private static String chooseReturnForm_new = "/html/body/div[13]/div[1]/div[1]/ul/li[1]";
    //退货店铺下拉框
    private static String returnStore = "//*[@id=\"myscroll\"]/div[1]/div[2]/form/div[3]/div/div/div/input";
    //退货店铺选择
    private static String chooseReturnStore = "";
    //地址下拉框
    private static String detailedAddress = "";
    //地址选择
    private static String chooseDetailedAddress = "";
    //接收仓下拉框
    private static String receivieWarehouse = "//*[@id=\"myscroll\"]/div[1]/div[2]/form/div[7]/div/div/div/input";
    //接收仓选择
    private static String chooseRW = "/html/body/div[13]/div[1]/div[1]/ul/li[1]";
    //物流方式下拉框
    private static String LogisticsMode = "//*[@id=\"myscroll\"]/div[1]/div[2]/form/div[8]/div/div/div/input";
    //物流方式选择
    private static String chooseLogisticsMode="/html/body/div[13]/div[1]/div[1]/ul/li[1]";
    //物流单位
    private static String LogisticsUnit = "//*[@id=\"myscroll\"]/div[1]/div[2]/form/div[9]/div/div[1]/input";
    //快递箱数
    private static String ExpressContainerNum = "//*[@id=\"myscroll\"]/div[1]/div[2]/form/div[10]/div/div/input";
    //备注
    private static String remarks_new = "//*[@id=\"myscroll\"]/div[1]/div[2]/form/div[11]/div/div/input";


    //添加
    public static String add_new ="//*[@id=\"myscroll\"]/div[2]/div[1]/div/button[3]/span";
    //产品编码
    public static String productNum_new ="//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[2]/div/div[1]/div[1]/input";
    //产品名称
    public static String productName_new ="//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[2]/div/div[1]/div[2]/input";
    //查询按钮
    private static String searchButton_new ="//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[2]/div/div[1]/button[1]";
    //商品选择 确认按钮
    private static String productCheck1 = "//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[1]/div/label/span/span";
    private static String productComfirm = "//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[2]/div/div[1]/button[2]";
    private static String windowQuit2= "//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[1]/button";
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
    public static String voucherEdit = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[15]/div/button[1]";
    //单据确认 取消确认
    public static String voucherComfirm = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[15]/div/button[2]";
    public static String voucherCancel = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[15]/div/button[2]";
    //作废
    public static String voucherInvaild = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[15]/div/button[3]";
    //审核 取消确认审核
    public static String voucherAudit = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[15]/div/button[2]";
    public static String voucherCancel1 = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[15]/div/button[2]";
    //查看
    public static String voucherCheck = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[15]/div/button[1]";
    //导出
    public static String vouchersExport = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[2]";









    public static String getSearchButton() {
        return searchButton;
    }

    public static String getResetButton() {
        return resetButton;
    }

    public static String getRemarks_new() {
        return remarks_new;
    }

    public static String getReturnNum() {
        return returnNum;
    }

    public static String getReturnState() {
        return returnState;
    }

    public static String getChooseReturnState() {
        return chooseReturnState;
    }

    public static String getReturnForm() {
        return returnForm;
    }

    public static String getChooseReturnForm() {
        return chooseReturnForm;
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

    public static String getReturnSource() {
        return returnSource;
    }

    public static String getChooseReturnSource() {
        return chooseReturnSource;
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

    public static String getExchangeFair_new() {
        return exchangeFair_new;
    }

    public static String getChooseExchangeFair_new() {
        return chooseExchangeFair_new;
    }

    public static String getReturnForm_new() {
        return returnForm_new;
    }

    public static String getChooseReturnForm_new() {
        return chooseReturnForm_new;
    }

    public static String getReturnStore() {
        return returnStore;
    }

    public static String getChooseReturnStore() {
        return chooseReturnStore;
    }

    public static String getDetailedAddress() {
        return detailedAddress;
    }

    public static String getChooseDetailedAddress() {
        return chooseDetailedAddress;
    }

    public static String getReceivieWarehouse() {
        return receivieWarehouse;
    }

    public static String getChooseRW() {
        return chooseRW;
    }

    public static String getLogisticsMode() {
        return LogisticsMode;
    }

    public static String getChooseLogisticsMode() {
        return chooseLogisticsMode;
    }

    public static String getLogisticsUnit() {
        return LogisticsUnit;
    }

    public static String getExpressContainerNum() {
        return ExpressContainerNum;
    }

    public static String getRemarks() {
        return remarks;
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

    public static String getReturnManagement() {
        return returnManagement;
    }

    public static String getStoreReturns() {
        return storeReturns;
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

    public static String getOmsC() {
        return omsC;
    }
}
