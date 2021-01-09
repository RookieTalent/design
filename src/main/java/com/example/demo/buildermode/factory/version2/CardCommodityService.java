package com.example.demo.buildermode.factory.version2;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author xiaolin
 * @date 2021/1/9 14:35
 */
@Slf4j
public class CardCommodityService implements ICommodity{

    // 模拟注入

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        // 实现发放爱奇艺兑换卡
    }
}
