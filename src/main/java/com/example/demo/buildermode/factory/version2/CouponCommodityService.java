package com.example.demo.buildermode.factory.version2;

import java.util.Map;

/**
 * @author xiaolin
 * @date 2021/1/9 14:35
 */
public class CouponCommodityService implements ICommodity{

    // 模拟注入

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        // 默契发送优惠券
    }
}
