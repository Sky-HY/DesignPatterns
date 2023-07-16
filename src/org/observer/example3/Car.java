package org.observer.example3;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Ben Yang
 * @date 2021/9/26 20:52
 * @desc
 * @since 1.0
 */
public class Car implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Signal signal = (Signal) arg;
        String tag = signal.getTag();
        if (tag.equals("1")) {
            System.out.println("红灯 bus 停止");
        } else if (tag.equals("2")) {
            System.out.println("绿灯 bus 行驶");
        } else {
            System.out.println("黄灯 bus 注意");
        }
    }
}
