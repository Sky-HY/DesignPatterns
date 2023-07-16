package org.observer.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ben Yang
 * @date 2021/9/24 17:03
 * @desc 抽象主题，也可以使用java.util.Observable
 * @since 1.0
 */
public abstract class Subject {

    private final List<Observer> observerList;

    public Subject() {
        this(new ArrayList<>());
    }

    public Subject(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public abstract void notifyA();
}
