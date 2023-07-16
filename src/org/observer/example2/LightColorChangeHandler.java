package org.observer.example2;

import java.util.EventListener;

/**
 * @author Ben Yang
 * @date 2021/9/26 11:29
 * @desc 交通灯验证的处理
 * @since 1.0
 */
public interface LightColorChangeHandler extends EventListener {

    void doHandler(LightEvent event);

}
