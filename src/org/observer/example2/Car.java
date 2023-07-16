package org.observer.example2;


/**
 * @author Ben Yang
 * @date 2021/9/26 11:37
 * @desc
 * @since 1.0
 */
public class Car implements LightColorChangeHandler{
    @Override
    public void doHandler(LightEvent event) {
        TrafficLight trafficLight = (TrafficLight) event.getSource();
        if (trafficLight.getColor().equals("红")) {
            System.out.println("红灯 car 停止");
        } else if (trafficLight.getColor().equals("绿")) {
            System.out.println("绿灯 car 行驶");
        } else {
            System.out.println("黄灯 car 注意");
        }
    }
}
