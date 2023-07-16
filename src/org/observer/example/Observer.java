package org.observer.example;

/**
 * @author Ben Yang
 * @date 2021/9/24 17:03
 * @desc 抽象观察者，也可以使用java.util.Observer
 * @since 1.0
 */
public interface Observer {
    void update();
}
