package element.orderManagement;

public class shippingAddress {
    //收货地址页面
    private static String getShippingAddress = "//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[2]/li/ul/div[4]/a/li";
    //店铺编号
    private static String storeNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[1]/input";
    //店铺名称
    private static String storeName = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[2]/input";
    //店铺状态下拉框
    private static String storeState ="//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[3]/div[1]/input";
    //店铺状态选择
    private static String chooseStoreState = "/html/body/div[7]/div[1]/div[1]/ul/li[2]";
    //联系人
    private static String contact = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[4]/input";
    //联系电话
    private static String contactNum = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[5]/input";
    //收货地址
    private static String shippingAddress = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[6]/input";
    //是否可用下拉框
    private static String available = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[7]/div[1]/input";
    //选择
    private static String chooseAvailable = "/html/body/div[8]/div[1]/div[1]/ul/li[1]";
    //是否默认下拉框
    private static String defaultT = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[1]/div[8]/div[1]/input";
    //选择
    private static String  chooseDfaultT = "/html/body/div[9]/div[1]/div[1]/ul/li[1]";
    //搜索键
    private static String searchButton = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[1]/i";
    private static String resetButton = "//*[@id=\"app\"]/div/div[2]/section/div/div[1]/div[2]/div/div[2]/button[2]/i";

    //新建
    private static String newButton = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[1]/span";
    //窗口取消
    private static String windowsCancel = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[3]/div/button[1]";

    //店铺编码
    private static String storeNum_new = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[2]/form/div[1]/div/div/input";
    //店铺编码输入
    private static String storeNumImport = "//*[@id=\"app\"]/div/div[2]/section/div/div[4]/div/div[2]/div/div[1]/div[1]/input";
    //店铺名称输入
    private static String storeNameImport = "//*[@id=\"app\"]/div/div[2]/section/div/div[4]/div/div[2]/div/div[1]/div[2]/input";
    //店铺选择
    private static String storePick = "//*[@id=\"app\"]/div/div[2]/section/div/div[4]/div/div[2]/div/div[2]/div[3]/table/tbody/tr[1]/td[1]/div";
    //查询
    private static String searchButton1 = "//*[@id=\"app\"]/div/div[2]/section/div/div[4]/div/div[2]/div/div[1]/button[1]";
    //确认
    private static String storeComfirm = "//*[@id=\"app\"]/div/div[2]/section/div/div[4]/div/div[2]/div/div[1]/button[2]";
    //站点名称
    private static String siteName = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[2]/form/div[3]/div/div/input";
    //省市区
    private static String provinces = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[2]/form/div[4]/div/div/div/input";
    private static String provice = "//*[@id=\"cascader-menu-5535-0-21\"]/span";
    //市
    private static String city = "//*[@id=\"cascader-menu-7225-1-0\"]/span";
    //区
    private static String region = "//*[@id=\"cascader-menu-6309-2-2\"]/span";
    //收货地址
    private static String address = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[2]/form/div[5]/div/div/input";
    //联系人
    private static String contact_new = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[2]/form/div[6]/div/div/input";
    //联系方式
    private static String contactNum_new = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[2]/form/div[7]/div/div/input";
    //是否可用
    //是否可用下拉框
    private static String available_new = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[2]/form/div[8]/div/div/span";
    //窗口确认
    private static String windowsComfirm = "//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div[3]/div/button[2]";

    //单据编辑
    private static String voucherEdit = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[2]/div[3]/table/tbody/tr[2]/td[15]/div/button/i";

    //导出
    private static String vouchersExport = "//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div/div[1]/div/button[2]/i";

    public static String getGetShippingAddress() {
        return getShippingAddress;
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

    public static String getContact() {
        return contact;
    }

    public static String getContactNum() {
        return contactNum;
    }

    public static String getShippingAddress() {
        return shippingAddress;
    }

    public static String getAvailable() {
        return available;
    }

    public static String getChooseAvailable() {
        return chooseAvailable;
    }

    public static String getDefaultT() {
        return defaultT;
    }

    public static String getChooseDfaultT() {
        return chooseDfaultT;
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

    public static String getStoreNum_new() {
        return storeNum_new;
    }

    public static String getStoreNumImport() {
        return storeNumImport;
    }

    public static String getStoreNameImport() {
        return storeNameImport;
    }

    public static String getStorePick() {
        return storePick;
    }

    public static String getSearchButton1() {
        return searchButton1;
    }

    public static String getStoreComfirm() {
        return storeComfirm;
    }

    public static String getWindowsCancel() {
        return windowsCancel;
    }

    public static String getSiteName() {
        return siteName;
    }

    public static String getProvinces() {
        return provinces;
    }

    public static String getAddress() {
        return address;
    }

    public static String getContact_new() {
        return contact_new;
    }

    public static String getContactNum_new() {
        return contactNum_new;
    }

    public static String getAvailable_new() {
        return available_new;
    }

    public static String getWindowsComfirm() {
        return windowsComfirm;
    }

    public static String getCity() {
        return city;
    }

    public static String getRegion() {
        return region;
    }

    public static String getVoucherEdit() {
        return voucherEdit;
    }

    public static String getVouchersExport() {
        return vouchersExport;
    }
}
