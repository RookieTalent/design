package com.example.demo.buildermode.abstractfacorty.base;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaolin
 * @date 2021/1/9 14:51
 */
public interface CacheService {

    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);

}
