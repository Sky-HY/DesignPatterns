package org.observer.example3;

/**
 * @author Ben Yang
 * @date 2021/9/26 20:53
 * @desc
 * @since 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        TrafficPolice police = new TrafficPolice();
        Car car = new Car();
        Bus bus = new Bus();
        police.addObserver(car);
        police.addObserver(bus);

        police.setTag("1");
    }
}
