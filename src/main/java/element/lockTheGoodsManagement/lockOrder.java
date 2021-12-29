package element.lockTheGoodsManagement;

public class lockOrder {
    //点击新oms系统
    private static String omsC = "//*[@id=\"app\"]/div/div[2]/div[3]/a/div/div";
    //锁货管理
    private static String lTGM = "//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[3]/li/div";
    //锁货单页面
    private static String lockOrderhtml= "//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[3]/li/ul/div[1]/a/li";
    //锁货单号
    private static String lockGoodsNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[1]/input";
    //锁货状态下拉框
    private static String lockGoodsState = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/input";
    //锁货状态选择
    private static String chooseLockGoodsState = "/html/body/div[4]/div[1]/div[1]/ul/li[1]";
    //锁货店铺编号
    private static String storeNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[3]/input";
    //锁货店铺名称
    private static String storeName = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[4]/input";
    //起始时间选择框
    private static String creatTime="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[5]/input";
    //起始时间选择
    private static String chooseCreatTime="/html/body/div[6]/div[1]/div/div[2]/table[1]/tbody/tr[4]/td[4]/div/span";
    //结束时间选择框
    private static String finishTime="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[6]/input";
    //结束时间选择
    private static String chooseFinishTime="/html/body/div[7]/div[1]/div/div[2]/table[1]/tbody/tr[4]/td[7]/div/span";
    //创建人
    private static String founder= "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[7]/input";
    //备注
    private static String remarks= "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[8]/input";
    //查询、重置按钮
    private static String searchButton ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[1]/span";
    private static String resetButton ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[2]/span";
    //作废隐藏
    private static String hideInvalidDocuments= "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/label/span[1]/span";


    //新建按钮
    public static String newButton = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[1]";
    //关闭 X
    public static String windowQuit1 = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[1]/button/i";
    //取消
    public static String cancel = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[3]/div/button[1]/span";
    //锁货仓库下拉框
    public static String lockGoodsWarehouse = "//*[@id=\"myscroll\"]/div[1]/div[2]/form/div[2]/div/div/div[1]/input";
    //选择仓库
    public static String chooseWarehouse = "/html/body/div[5]/div[1]/div[1]/ul/li[2]";
    //锁货店铺编号
    public static String lockStoreNum = "//*[@id=\"myscroll\"]/div[1]/div[2]/form/div[3]/div/div/input";
    //店铺编号输入
    private static String storeNumInput= "//*[@id=\"app\"]/div/div[2]/section/div/div[4]/div/div[2]/div/div[1]/div[1]/input";
    //店铺名称输入
    private static String storeNameInput = "//*[@id=\"app\"]/div/div[2]/section/div/div[4]/div/div[2]/div/div[1]/div[2]/input";
    //查询按钮
    private static String searchButton_new ="//*[@id=\"app\"]/div/div[2]/section/div/div[4]/div/div[2]/div/div[1]/button[1]/span";
    //点击店铺
    private static String storeCheck = "//*[@id=\"app\"]/div/div[2]/section/div/div[4]/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[1]/div";
    //确认
    private static String comfirm_new = "//*[@id=\"app\"]/div/div[2]/section/div/div[4]/div/div[2]/div/div[1]/button[2]/i";
    //锁货店铺名称
    public static String lockStoreName = "//*[@id=\"myscroll\"]/div[1]/div[2]/form/div[4]/div/div/input";
    //备注
    public static String remarks_new = "//*[@id=\"myscroll\"]/div[1]/div[2]/form/div[5]/div/div/input";

    //添加
    public static String addButton = "//*[@id=\"myscroll\"]/div[2]/div[1]/div/button[4]/span";
    //产品编号
    public static String productNum_new = "//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[2]/div/div[1]/div[1]/input";
    //产品名称
    public static String productName_name = "//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[2]/div/div[1]/div[2]/input";
    //查询按钮
    private static String searchProductButton_new ="//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[2]/div/div[1]/button[1]/i";
    //点击店铺
    private static String productCheck = "//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[1]/div/label/span/span";
    //确认
    private static String productComfirm_new = "//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[2]/div/div[1]/button[2]/i";
    //退出当前窗口
    private static String windowsQuit = "//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div[1]/button/i";


    //导入
    private static String productImport = "//*[@id=\"myscroll\"]/div[2]/div[1]/div/button[3]/span";
    //点击下载
    private static String clickDownLoad = "/html/body/div[1]/div/div[2]/section/div/div[6]/div/div[2]/div/div[2]/div[1]/div/div/button/span";
    //点击上传
    private static String clickUpLoad ="//*[@id=\"myscroll\"]/div[2]/div[2]/div/div/div[2]/div/button";
    //点击下一步
    private static String next1 = "//*[@id=\"myscroll\"]/div[3]/button[2]";
    //完成
    private static String fine= "/html/body/div[1]/div/div[2]/section/div/div[6]/div/div[2]/div/div[4]/button";
    //删除 商品选择
    private static String productCheck2 = "//*[@id=\"myscroll\"]/div[2]/div[2]/div/div[3]/table/tbody/tr/td[1]/div/label/span/span";
    private static String productRemove = "//*[@id=\"myscroll\"]/div[2]/div[1]/div/button[1]/span";
    //确认按钮
    public static String comfirm = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[3]/div/button[2]/span";


    //单据编辑
    public static String voucherEdit = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[11]/div/button[1]";
    //作废
    public static String voucherInvaild = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[11]/div/button[3]";
    //审核 取消确认审核
    public static String voucherAudit = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[11]/div/button[2]";
    public static String voucherCancel1 = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[11]/div/button[2]";
    //解锁
    public static String voucherUnlock = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[11]/div/button[3]";
    //查看
    public static String voucherCheck = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[11]/div/button[1]";
    //导出
    public static String vouchersExport = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[2]/span";

    //取消、确认
    public static String voucherCancel2 ="/html/body/div[6]/div/div[3]/button[1]/span";
    public static String vocherComfirm1 ="/html/body/div[6]/div/div[3]/button[2]/span";

    public static String getOmsC() {
        return omsC;
    }

    public static String getlTGM() {
        return lTGM;
    }

    public static String getLockOrderhtml() {
        return lockOrderhtml;
    }

    public static String getLockGoodsNum() {
        return lockGoodsNum;
    }

    public static String getLockGoodsState() {
        return lockGoodsState;
    }

    public static String getChooseLockGoodsState() {
        return chooseLockGoodsState;
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

    public static String getFounder() {
        return founder;
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

    public static String getLockGoodsWarehouse() {
        return lockGoodsWarehouse;
    }

    public static String getChooseWarehouse() {
        return chooseWarehouse;
    }

    public static String getLockStoreNum() {
        return lockStoreNum;
    }

    public static String getStoreNumInput() {
        return storeNumInput;
    }

    public static String getStoreNameInput() {
        return storeNameInput;
    }

    public static String getSearchButton_new() {
        return searchButton_new;
    }

    public static String getStoreCheck() {
        return storeCheck;
    }

    public static String getComfirm_new() {
        return comfirm_new;
    }

    public static String getLockStoreName() {
        return lockStoreName;
    }

    public static String getRemarks_new() {
        return remarks_new;
    }

    public static String getAddButton() {
        return addButton;
    }

    public static String getProductNum_new() {
        return productNum_new;
    }

    public static String getProductName_name() {
        return productName_name;
    }

    public static String getSearchProductButton_new() {
        return searchProductButton_new;
    }

    public static String getProductCheck() {
        return productCheck;
    }

    public static String getProductComfirm_new() {
        return productComfirm_new;
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

    public static String getWindowsQuit() {
        return windowsQuit;
    }

    public static String getVoucherUnlock() {
        return voucherUnlock;
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

    public static String getVoucherCancel2() {
        return voucherCancel2;
    }

    public static String getVocherComfirm1() {
        return vocherComfirm1;
    }
}
