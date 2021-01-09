package com.example.demo.buildermode.factory.version2;

import java.util.Map;

/**
 * @author xiaolin
 * @date 2021/1/9 14:34
 */
public interface ICommodity {
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
