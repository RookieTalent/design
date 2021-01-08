package com.example.demo.buildermode.factory.version1;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 *
 * 这种方式能很快的完成你的业务
 * 但是随着几次的迭代和拓展 奖品类型的增多 接收这段代码的研发者肯定恨不得把你拽过来揍你一顿
 * 这也是为什么大家都不爱接收别人代码的原因
 *
 * 所以有时候千万不要 if elseif 到底 为你的后辈好好考虑考虑
 *
 * @author xiaolin
 * @date 2021/1/8 17:24
 */
public class PrizeController {

    private Logger logger = LoggerFactory.getLogger(PrizeController.class);

    public AwardRes awardToUser(AwardReq req) {
        String reqJson = JSON.toJSONString(req);
        AwardRes awardRes = null;
        try {
            logger.info("奖品发放开始{}。req:{}", req.getUId(), reqJson);
            // 按照不同类型方法商品[1优惠券、2实物商品、3第三方兑换卡(爱奇艺)]
            if(req.getAwardType() == 1){
                // 调用couponService发送优惠券
                // 判断是否发放成功
            }else if(req.getAwardType() == 2){
                // 调用goodsService发放实物商品
                // 判断是否发放成功
            }else if(req.getAwardType() == 3){
                // 调用IQiYiCardService发送实物商品
                // 判断是否发放成功
            }
            awardRes = new AwardRes("0000", "发放成功");
            logger.info("奖品发放完成{}。", req.getUId());
        }catch (Exception e){
            logger.error("奖品发放失败{}。req:{}", req.getUId(), reqJson, e);
            awardRes = new AwardRes("0001", e.getMessage());
        }

        return awardRes;
    }

    private String queryUserName(String uId) {
        return "花花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }
}
