package com.example.demo.buildermode.abstractfacorty.version.impl;

import com.example.demo.buildermode.abstractfacorty.base.RedisUtils;
import com.example.demo.buildermode.abstractfacorty.version.CacheService;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaolin
 * @date 2021/1/9 15:20
 */
public class CacheServiceImpl implements CacheService {
    private RedisUtils redisUtils = new RedisUtils();

    public String get(String key) {
        return redisUtils.get(key);
    }

    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        redisUtils.del(key);
    }

}
