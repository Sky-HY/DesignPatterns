package org.bridge;

public class Test {
    public static void main(String[] args) {
        Software software = new Mp3();
        Phone phone = new XiaoMi(software);
        phone.run();
    }
}
