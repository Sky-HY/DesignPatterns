package org.observer.example;

/**
 * @author Ben Yang
 * @date 2021/9/25 20:46
 * @desc 小汽车（观察者）
 * @since 1.0
 */
public class Car implements Observer {

    private final TrafficLight trafficLight;

    public Car(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void update() {
        if (trafficLight.getColor().equals("红")) {
            System.out.println("红灯 car 停止");
        } else if (trafficLight.getColor().equals("绿")) {
            System.out.println("绿灯 car 行驶");
        } else {
            System.out.println("黄灯 car 注意");
        }
    }
}
