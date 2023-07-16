package org.observer.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ben Yang
 * @date 2021/9/26 11:32
 * @desc
 * @since 1.0
 */
public class TrafficLight {

    private List<LightColorChangeHandler> handlerList = new ArrayList<>();

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;

        LightEvent event = new LightEvent(this);

        for (LightColorChangeHandler handler : handlerList) {
            handler.doHandler(event);
        }

    }

    public void addHandler(LightColorChangeHandler handler){
        handlerList.add(handler);
    }
}
