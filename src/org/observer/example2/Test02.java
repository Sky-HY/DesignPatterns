package org.observer.example2;

/**
 * @author Ben Yang
 * @date 2021/9/26 11:42
 * @desc
 * @since 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        Bus bus = new Bus();
        Car car = new Car();
        trafficLight.addHandler(bus);
        trafficLight.addHandler(car);
        trafficLight.setColor("绿");
        trafficLight.setColor("红");
    }
}
