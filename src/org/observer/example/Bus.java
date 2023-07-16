package org.observer.example;

/**
 * @author Ben Yang
 * @date 2021/9/25 20:50
 * @desc 大巴车（观察者）
 * @since 1.0
 */
public class Bus implements Observer {

    private final TrafficLight trafficLight;

    public Bus(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void update() {
        if (trafficLight.getColor().equals("红")) {
            System.out.println("红灯 bus 停止");
        } else if (trafficLight.getColor().equals("绿")) {
            System.out.println("绿灯 bus 行驶");
        } else {
            System.out.println("黄灯 bus 注意");
        }
    }
}
