package org.bridge;

public class XiaoMi extends Phone {
    public XiaoMi(Software software) {
        super(software);
    }

    @Override
    public void run() {
        System.out.println("小米手机 >>> ");
        software.run();
    }
}
