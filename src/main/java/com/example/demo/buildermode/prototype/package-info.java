/**
 *
 * 原型模式主要解决的问题就是创建重复对象，⽽而这部分对象内容本身⽐比较复杂，生成过程可能从库或者
 * RPC接口中获取数据的耗时较长，因此采用克隆隆的方式节省时间
 *
 * 这里建造一个题库题目的场景类信息，用于创建； 选择题、 问答题
 *
 * @author xiaolin
 * @date 2021/1/9 15:39
 */
package com.example.demo.buildermode.prototype;