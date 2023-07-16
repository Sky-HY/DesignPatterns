package org.observer.example;

/**
 * @author Ben Yang
 * @date 2021/9/25 20:38
 * @desc 交通灯
 * @since 1.0
 */
public class TrafficLight extends Subject {

    private String color;

    public TrafficLight() {
    }


    @Override
    public void notifyA() {
        for (Observer observer : getObserverList()) {
            observer.update();
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
