package element.futuresManagement;

    /*
    *
    * 订货会
    *
    * */

public class exchangeFair {
    //点击新oms系统
    private static String omsC = "//*[@id=\"app\"]/div/div[2]/div[3]/a/div/div";
    //期货管理
    public static String managedFturesPath = "//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[5]/li/div/span";
    //订货会页面
    public static String exchangeFairPath = "//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[5]/li/ul/div[1]/a/li/span";
    //订货会名称
    public static String exchangeFairName= "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[1]/input";
    //订货会编码
    public static String exchangeFairNum= "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[2]/input";
    //起始时间选择框
    private static String creatTimeB="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[3]/input";
    //结束时间选择框
    private static String finishTimeB="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[4]/input";
    //起始时间选择框
    private static String creatTimeE="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[5]/input";
    //结束时间选择框
    private static String finishTimeE="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[6]/input";
    //使用范围下拉框
    public static String usableRange = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[7]/div[1]/input";
    //使用范围选择
    public static String chooseUsableRange = "/html/body/div[8]/div[1]/div[1]/ul/li[1]";
    //创建人
    private static String foungder ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[8]/input";
    //备注
    private static String remarks ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[9]/input";
    //是否可用下拉框
    private static String availableOrNot = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[10]/div[1]/input";
    //选择
    private static String chooseOne = "/html/body/div[9]/div[1]/div[1]/ul/li[1]";
    //查询按钮
    private static String searchButton ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[1]/span";
    //重置按钮
    private static String resetButton ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[2]/span";



    //新建按钮
    public static String newButton = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[1]";
    //关闭 X
    public static String windowQuit1 = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[1]/button/i";
    //取消
    public static String cancel = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[3]/div/button[1]";
    //适用品牌下拉框
    public static String applyBrand = "//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[1]/div/div/div[1]/input";
    //适用品牌选择
    public static String chooseApplyBrand = "";
    //订货会编码
    public static String exchangeFairNum_new= "//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[2]/div/div/input";
    //订货会名称
    public static String exchangeFair_new= "//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[3]/div/div/input";
    //起始时间选择框
    private static String creatTime_new="//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[4]/div/div/input";
    //结束时间选择框
    private static String finishTime_new="//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[5]/div/div/input";
    //备注
    private static String remarks_new = "//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[6]/div/div/input";
    //是否可用按钮
    private static String chooseButton = "//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[7]/div";
    //使用范围下拉框
    public static String usableRange_new = "//*[@id=\"myscroll\"]/form/div[2]/div[2]/div[1]/div";
    //使用范围选择
    public static String chooseUsableRange_new = "/html/body/div[13]/div[1]/div[1]/ul/li[1]";
    //确认按钮
    public static String comfirm = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[3]/div/button[2]";
    //导出
    public static String vouchersExport = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[2]/span";

    //编辑
    public static String voucherEdit = "/html/body/div[1]/div/div[2]/section/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[9]/div/button/i";

    public static String getOmsC() {
        return omsC;
    }

    public static String getManagedFturesPath() {
        return managedFturesPath;
    }

    public static String getExchangeFairPath() {
        return exchangeFairPath;
    }

    public static String getExchangeFairName() {
        return exchangeFairName;
    }

    public static String getExchangeFairNum() {
        return exchangeFairNum;
    }

    public static String getCreatTimeB() {
        return creatTimeB;
    }

    public static String getFinishTimeB() {
        return finishTimeB;
    }

    public static String getCreatTimeE() {
        return creatTimeE;
    }

    public static String getFinishTimeE() {
        return finishTimeE;
    }

    public static String getUsableRange() {
        return usableRange;
    }

    public static String getChooseUsableRange() {
        return chooseUsableRange;
    }

    public static String getFoungder() {
        return foungder;
    }

    public static String getRemarks() {
        return remarks;
    }

    public static String getAvailableOrNot() {
        return availableOrNot;
    }

    public static String getChooseOne() {
        return chooseOne;
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

    public static String getWindowQuit1() {
        return windowQuit1;
    }

    public static String getCancel() {
        return cancel;
    }

    public static String getApplyBrand() {
        return applyBrand;
    }

    public static String getChooseApplyBrand() {
        return chooseApplyBrand;
    }

    public static String getExchangeFairNum_new() {
        return exchangeFairNum_new;
    }

    public static String getExchangeFair_new() {
        return exchangeFair_new;
    }

    public static String getCreatTime_new() {
        return creatTime_new;
    }

    public static String getFinishTime_new() {
        return finishTime_new;
    }

    public static String getRemarks_new() {
        return remarks_new;
    }

    public static String getChooseButton() {
        return chooseButton;
    }

    public static String getUsableRange_new() {
        return usableRange_new;
    }

    public static String getChooseUsableRange_new() {
        return chooseUsableRange_new;
    }

    public static String getComfirm() {
        return comfirm;
    }

    public static String getVouchersExport() {
        return vouchersExport;
    }

    public static String getVoucherEdit() {
        return voucherEdit;
    }
}
