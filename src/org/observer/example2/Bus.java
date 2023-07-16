package org.observer.example2;

/**
 * @author Ben Yang
 * @date 2021/9/26 11:42
 * @desc
 * @since 1.0
 */
public class Bus implements LightColorChangeHandler{
    @Override
    public void doHandler(LightEvent event) {
        TrafficLight trafficLight = (TrafficLight) event.getSource();
        if (trafficLight.getColor().equals("红")) {
            System.out.println("红灯 bus 停止");
        } else if (trafficLight.getColor().equals("绿")) {
            System.out.println("绿灯 bus 行驶");
        } else {
            System.out.println("黄灯 bus 注意");
        }
    }
}
