package com.example.demo.buildermode.factory.version2;

/**
 * 这样你半夜接到BUG， 也不会因为看到一坨坨代码感到过于恶心了
 * 不喜欢ifelse 还可以用switch
 * @author xiaolin
 * @date 2021/1/9 14:37
 */
public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }

}
