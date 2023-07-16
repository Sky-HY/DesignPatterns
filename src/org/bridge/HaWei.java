package org.bridge;

public class HaWei extends Phone {
    public HaWei(Software software) {
        super(software);
    }

    @Override
    public void run() {
        System.out.println("华为手机 >>> ");
        software.run();
    }
}
