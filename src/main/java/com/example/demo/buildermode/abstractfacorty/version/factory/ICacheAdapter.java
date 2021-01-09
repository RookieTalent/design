package com.example.demo.buildermode.abstractfacorty.version.factory;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaolin
 * @date 2021/1/9 15:13
 */
public interface ICacheAdapter {
    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
