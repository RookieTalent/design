package com.example.demo.buildermode.factory.version2;

import java.util.Map;

/**
 * @author xiaolin
 * @date 2021/1/9 14:36
 */
public class GoodsCommodityService implements ICommodity{

    // 模拟注入

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        // 模拟实物发放
    }
}
