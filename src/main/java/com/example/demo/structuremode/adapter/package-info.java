/**
 * 适配器的主要意图就是在于把原本不兼容的接口，通过适配修改到统一
 * 就像我们提到的万能充、数据线、MAC笔记本的转接头等
 * 强调一下，适配器不只是可以适配接口往往还可以适配一些属性信息
 *
 *
 * 这里可以应用于MQ处， 比如：
 * （开户、内部订单、外部订单） -> 消息适配器 -> 统一的消息字段 -> 业务处理
 *
 *
 *
 * @author xiaolin
 * @date 2021/1/9 15:58
 */
package com.example.demo.structuremode.adapter;