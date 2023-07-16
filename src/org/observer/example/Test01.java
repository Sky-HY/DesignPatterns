package org.observer.example;

/**
 * @author Ben Yang
 * @date 2021/9/24 11:57
 * @desc 观察者模式，交通灯-汽车
 * @since 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        Car car = new Car(trafficLight);
        Bus bus = new Bus(trafficLight);
        trafficLight.attach(car);
        trafficLight.attach(bus);

        trafficLight.setColor("绿");
        trafficLight.notifyA();

        trafficLight.setColor("红");
        trafficLight.notifyA();
    }
}
