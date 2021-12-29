package element.orderManagement;

public class orderSet {
    //订货设置页面
    private static String orderSetHtml = "//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[2]/li/ul/div[5]/li/div";
    //订单类型页面
    private static String orderTypeHtml = "//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[2]/li/ul/div[5]/li/ul/div[1]/a/li";
    //类型名称
    private static String typeName = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[1]/div[2]/div/div[1]/div[1]/input";
    //适用范围
    private static String range = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/input";
    //适用范围选择
    private static String chooseRange = "/html/body/div[7]/div[1]/div[1]/ul/li[1]";
    //部分模糊搜索
    private static String searchAnything = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[1]/div[2]/div/div[1]/div[3]/input";
    //适用品牌
    private static String brand = "/html/body/div[1]/div/div[2]/section/div/div/div[1]/div[2]/div/div[1]/div[4]/div[1]/input";
    //适用品牌选择
    private static String chooseBrand = "/html/body/div[8]/div[1]/div[1]/ul/li[9]";
    //是否可用
    private static String available = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[1]/div[2]/div/div[1]/div[5]/div[1]/input";
    //是否可用选择
    private static String chooseAvailable = "/html/body/div[9]/div[1]/div[1]/ul/li[1]";
    //搜索键
    private static String searchButton = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[1]/div[2]/div/div[2]/button[1]/i";
    private static String resetButton = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[1]/div[2]/div/div[2]/button[2]/i";


    //新建
    private static String newButton = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[2]/div/div[1]/div/button[1]";
    //窗口取消
    private static String windowsCancel = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[3]/div/div[1]/button";
    //类型名称
    private static String typeName_new = "//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[1]/div/div/input";
    //适用品牌
    private static String brand_new = "//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[2]/div/div/div[1]/input";
    //适用品牌选择
    private static String chooseBrand_new = "/html/body/div[15]/div[1]/div[1]/ul/li[9]";
    //备注
    private static String remarks = "//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[3]/div/div/input";
    //是否可用
    private static String available_new = "//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[4]/div/div/span";
    //门店范围信息
    private static String storeRange = "//*[@id=\"myscroll\"]/form/div[2]/div[2]/div[1]/div/div/div[1]/input";
    //适用范围选择
    private static String chooseStoreRange = "/html/body/div[16]/div[1]/div[1]/ul/li[1]";
    //产品范围信息
    private static String productRange = "//*[@id=\"myscroll\"]/form/div[3]/div[2]/div[1]/div/div/div/input";
    //适用范围选择
    private static String chooseProductRange = "/html/body/div[17]/div[1]/div[1]/ul/li[1]";
    //窗口确认
    private static String windowComfirm  = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[3]/div/div[3]/div/button[2]/span";
    //单据编辑
    private static String voucherEdit = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[8]/div/button/i";
    //导出
    private static String vouchersExport = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[2]/div/div[1]/div/button[2]";


    /**产品搭配*/
    //产品搭配页面
    private static String productMixHtml = "//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[2]/li/ul/div[5]/li/ul/div[2]/a/li";
    //产品名称
    private static String productName = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[1]/div[2]/div/div[1]/div[1]/input";
    //关系类型下拉框
    private static String relationshipTypes = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[1]/div[2]/div/div[1]/div[2]/div/input";
    //关系类型选择
    private static String chooseRelationshipTypes = "/html/body/div[14]/div[1]/div[1]/ul/li[2]";
    //适用品牌下拉框
    private static String productBrand = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[1]/div[2]/div/div[1]/div[3]/div/input";
    //适用品牌选择
    private static String chooseProductBrand = "/html/body/div[15]/div[1]/div[1]/ul/li[9]";
    //是否可用
    private static String availablePM = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[1]/div[2]/div/div[1]/div[4]/div/input";
    //是否可用选择
    private static String chooseAvailablePM = "/html/body/div[16]/div[1]/div[1]/ul/li[1]";
    //搜索键
    private static String searchButtonPM = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[1]/div[2]/div/div[2]/button[1]";
    private static String resetButtonPM = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[1]/div[2]/div/div[2]/button[2]";


    //新建
    private static String newButtonPM = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[2]/div/div[1]/div/button[1]/i";
    //窗口取消
    private static String windowsCancelPM = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[3]/div/div[3]/div/button[1]";
    //适用品牌
    private static String brandPM_new = "//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[1]/div/div/div[1]/input";
    //适用品牌选择
    private static String chooseBrandPM_new = "/html/body/div[17]/div[1]/div[1]/ul/li[9]";
    //关系类型下拉框
    private static String relationshipTypes_new = "//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[2]/div/div/div[1]/input";
    //关系类型选择
    private static String chooseRelationshipTypes_new = "/html/body/div[18]/div[1]/div[1]/ul/li[2]";
    //主搭产品
    private static String product= "//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[3]/div/div/input";
    //产品编号
    private static String productNumImport = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[4]/div/div[2]/div/div[1]/div[1]/input";
    //产品名称
    private static String productNameImport = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[4]/div/div[2]/div/div[1]/div[2]/input";
    //产品选择
    private static String productPick = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[4]/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[1]/div";
    private static String productPick1 ="//*[@id=\"app\"]/div/div[2]/section/div/div/div[5]/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[1]/div/label/span/span";
    private static String productPick2 = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[5]/div/div[2]/div/div[2]/div[3]/table/tbody/tr[2]/td[1]/div/label/span/span";
    //查询
    private static String searchButton1 = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[4]/div/div[2]/div/div[1]/button[1]";
    //确认
    private static String productComfirm = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[4]/div/div[2]/div/div[1]/button[2]";
    //备注
    private static String remarksPM = "//*[@id=\"myscroll\"]/form/div[1]/div[2]/div[5]/div/div/input";

    //添加
    public static String productAdd_new ="//*[@id=\"myscroll\"]/form/div[2]/div[1]/div/button[2]";
    //查询
    private static String productSeacheB = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[5]/div/div[2]/div/div[1]/button[1]";
    //辅产品确定
    private static String productComfirmB = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[5]/div/div[2]/div/div[1]/button[2]";
    //产品选择、删除
    private static String productPick3 = "//*[@id=\"myscroll\"]/form/div[2]/div[2]/div/div[2]/table/thead/tr/th[1]/div/label/span/span";
    private static String productRemove = "//*[@id=\"myscroll\"]/form/div[2]/div[1]/div/button[1]";

    //窗口确认
    private static String windowComfirmPM = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[3]/div/div[3]/div/button[2]";

    //单据编辑
    private static String voucherEditPM = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[6]/div/button";
    //导出
    private static String vouchersExportPM = "//*[@id=\"app\"]/div/div[2]/section/div/div/div[2]/div/div[1]/div/button[2]";


    public static String getProductPick3() {
        return productPick3;
    }

    public static String getProductSeacheB() {
        return productSeacheB;
    }

    public static String getProductComfirmB() {
        return productComfirmB;
    }

    public static String getOrderSetHtml() {
        return orderSetHtml;
    }

    public static String getOrderTypeHtml() {
        return orderTypeHtml;
    }

    public static String getTypeName() {
        return typeName;
    }

    public static String getRange() {
        return range;
    }

    public static String getChooseRange() {
        return chooseRange;
    }

    public static String getSearchAnything() {
        return searchAnything;
    }

    public static String getBrand() {
        return brand;
    }

    public static String getChooseBrand() {
        return chooseBrand;
    }

    public static String getAvailable() {
        return available;
    }

    public static String getChooseAvailable() {
        return chooseAvailable;
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

    public static String getWindowsCancel() {
        return windowsCancel;
    }

    public static String getTypeName_new() {
        return typeName_new;
    }

    public static String getBrand_new() {
        return brand_new;
    }

    public static String getChooseBrand_new() {
        return chooseBrand_new;
    }

    public static String getRemarks() {
        return remarks;
    }

    public static String getAvailable_new() {
        return available_new;
    }

    public static String getStoreRange() {
        return storeRange;
    }

    public static String getChooseStoreRange() {
        return chooseStoreRange;
    }

    public static String getProductRange() {
        return productRange;
    }

    public static String getChooseProductRange() {
        return chooseProductRange;
    }

    public static String getWindowComfirm() {
        return windowComfirm;
    }

    public static String getVoucherEdit() {
        return voucherEdit;
    }

    public static String getVouchersExport() {
        return vouchersExport;
    }

    public static String getProductMixHtml() {
        return productMixHtml;
    }

    public static String getProductName() {
        return productName;
    }

    public static String getRelationshipTypes() {
        return relationshipTypes;
    }

    public static String getChooseRelationshipTypes() {
        return chooseRelationshipTypes;
    }

    public static String getProductBrand() {
        return productBrand;
    }

    public static String getChooseProductBrand() {
        return chooseProductBrand;
    }

    public static String getAvailablePM() {
        return availablePM;
    }

    public static String getChooseAvailablePM() {
        return chooseAvailablePM;
    }

    public static String getSearchButtonPM() {
        return searchButtonPM;
    }

    public static String getResetButtonPM() {
        return resetButtonPM;
    }

    public static String getNewButtonPM() {
        return newButtonPM;
    }

    public static String getWindowsCancelPM() {
        return windowsCancelPM;
    }

    public static String getBrandPM_new() {
        return brandPM_new;
    }

    public static String getChooseBrandPM_new() {
        return chooseBrandPM_new;
    }

    public static String getRelationshipTypes_new() {
        return relationshipTypes_new;
    }

    public static String getChooseRelationshipTypes_new() {
        return chooseRelationshipTypes_new;
    }

    public static String getProduct() {
        return product;
    }

    public static String getProductNumImport() {
        return productNumImport;
    }

    public static String getProductNameImport() {
        return productNameImport;
    }

    public static String getProductPick() {
        return productPick;
    }

    public static String getSearchButton1() {
        return searchButton1;
    }

    public static String getProductComfirm() {
        return productComfirm;
    }

    public static String getRemarksPM() {
        return remarksPM;
    }

    public static String getProductAdd_new() {
        return productAdd_new;
    }

    public static String getProductPick1() {
        return productPick1;
    }

    public static String getProductRemove() {
        return productRemove;
    }

    public static String getWindowComfirmPM() {
        return windowComfirmPM;
    }

    public static String getVoucherEditPM() {
        return voucherEditPM;
    }

    public static String getVouchersExportPM() {
        return vouchersExportPM;
    }

    public static String getProductPick2() {
        return productPick2;
    }
}
