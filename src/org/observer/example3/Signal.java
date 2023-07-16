package org.observer.example3;

import java.util.Observable;

/**
 * @author Ben Yang
 * @date 2021/9/26 20:41
 * @desc 抽象的信号
 * @since 1.0
 */
public abstract class Signal extends Observable {

    private String tag;

    public Signal() {
        setChanged();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
        notifyObservers(this);
    }
}
