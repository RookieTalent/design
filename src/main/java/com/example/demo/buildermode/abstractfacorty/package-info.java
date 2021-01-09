/**
 *
 * 这个就不怎么熟练了!!!!!!
 *
 * 抽象工厂与工厂模式虽然意图主要是为了解决接口的问题 但在实现上：
 *      抽象工厂是一个中心工厂 创建其他工厂的模式
 *
 * 模拟场景： 在app上线的初期系统压力较小、并发访问不大的情况下， redis的单机就可以承载住压力
 * 但伴随着业务的飞速发展，需要更换更为健壮的redis集群服务
 *
 * 随着这次升级：
 *  1. 很多服务⽤用到了了Redis需要⼀一起升级到集群。
 *  2. 需要兼容集群A和集群B，便于后续的灾备。
 *  3. 两套集群提供的接⼝口和⽅方法各有差异，需要做适配。
 *  4. 不不能影响到⽬目前正常运⾏行行的系统。
 *
 * 模拟2个集群服务，添加2套实现同样功能的不同服务（方法名与各业务中使用的方法名不同）
 * 如果不采用抽象工厂，那么在CacheServiceImpl的实现里，肯定是new出两个集群服务的操作对象
 *              private EGM egm = new EGM();
 *              private IIR iir = new IIR();
 * 然后要求前端操作时传入一个写死的参数，判断是调用哪个集群，这样又是一大长串的ifelse（没有ifslse解决不了的方案）
 *
 * 解决方案：
 *  1、抽象工厂的创建和获取方式，会采用代理理类的方式进行实现
 *  2、还有⼀一点⾮非常重要，由于集群A和集群B在部分⽅方法提供上是不同的，因此需要做⼀一个接口适配，
 * 而这个适配类就相当于工厂中的工厂，用于创建把不不同的服务抽象为统一的接口做相同的业务
 *
 * 抽象⼯工⼚厂模式，所要解决的问题就是在⼀一个产品族，存在多个不不同类型的产品(Redis集群、操作系
 * 统)情况下，接⼝口选择的问题。⽽而这种场景在业务开发中也是⾮非常多⻅见的，只不不过可能有时候没有
 * 将它们抽象化出来
 *
 * @author xiaolin
 * @date 2021/1/9 14:39
 */
package com.example.demo.buildermode.abstractfacorty;