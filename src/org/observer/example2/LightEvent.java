package org.observer.example2;

import java.util.EventObject;

/**
 * @author Ben Yang
 * @date 2021/9/26 11:31
 * @desc 交通灯事件
 * @since 1.0
 */
public class LightEvent extends EventObject {

    public LightEvent(Object source) {
        super(source);
    }



}
