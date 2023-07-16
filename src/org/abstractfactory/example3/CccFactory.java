package org.abstractfactory.example3;


/**
 * 三c工厂，创建电子产品
 */
public class CccFactory {

    private static final String brand = "xiaomi";

    private CccFactory() {

    }

    public static TV createTV() {
        TV tv;
        switch (brand) {
            case "samsung":
                tv = new SamsungTV();
                break;
            case "apple":
                tv = new AppleTV();
                break;
            case "xiaomi":
                tv = new XiaoMiTV();
                break;
            default:
                throw new IllegalArgumentException("无效的品牌" + brand);
        }

        return tv;
    }

    public static Phone createPhone() {
        Phone phone;
        switch (brand) {
            case "samsung":
                phone = new SamsungPhone();
                break;
            case "apple":
                phone = new IPhone();
                break;
            case "xiaomi":
                phone = new XiaoMiPhone();
                break;
            default:
                throw new IllegalArgumentException("无效的品牌" + brand);
        }
        return phone;
    }
}
