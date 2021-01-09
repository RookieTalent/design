package com.example.demo.buildermode.abstractfacorty.version.factory.impl;

import com.example.demo.buildermode.abstractfacorty.base.matter.EGM;
import com.example.demo.buildermode.abstractfacorty.version.factory.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaolin
 * @date 2021/1/9 15:13
 */
public class EGMCacheAdapter implements ICacheAdapter {

    private EGM egm = new EGM();

    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    public void set(String key, String value) {
        egm.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        egm.delete(key);
    }
}
