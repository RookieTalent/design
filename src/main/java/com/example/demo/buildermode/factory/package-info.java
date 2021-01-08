/**
 * 工厂模式的主要意图： 顶一个创建对象的接口， 让其子类自己决定实例化哪一个工厂类， 工程模式使其创建过程延迟到子类进行
 * 实现方式就是： 其在父类中提供一个创建对象的方法，允许子类决定实例化对象的类型
 *
 * 假定现在存在一个业务场景：
 *      你的公司为某家超市定制了服务系统， 在这个服务系统里支持用户通过打卡、分享、留言等操作进行返利积分的累计，
 *      积分可以用来兑换商品实物、优惠券、兑换卡
 *
 *  此时：
 *      优惠券 -> CouponResult sendCoupon(String uId, String couponNumber, String uuid)
 *      实物商品 -> Boolean deliverGoods(DeliverReq req)
 *      第三⽅方爱奇艺兑换卡 -> void grantToken(String bindMobileNumber, String cardId)
 *
 *  你首先打算怎么实现？
 *
 *
 *  针对快速开发的流程： 肯定是开放一个兑换接口： 然后接收封装好的请求， 然后做ifelse判断
 *  模拟场景移步version1
 *
 * @author xiaolin
 * @date 2021/1/8 17:06
 */
package com.example.demo.buildermode.factory;