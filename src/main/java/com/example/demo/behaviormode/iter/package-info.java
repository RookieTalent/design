/**
 * 迭代器模式
 *
 * 迭代器模式的特点是实现Iterable接口 通过next的方式获取
 * 集合元素，同时具备对元素的删除等操作。 而增强的for循环是不可的
 *
 * 一般公司的组织模式都是金字塔结构 对于这种偏业务性较大的树形结构可以自己实现迭代器功能
 * 几乎所有迭代器开发都会按照这个模式来实现：
 * 1、Collection：集合方法部分用于对自定义的数据结构添加通用方法： add、remove等核心
 * 2、Iterable： 提供获取迭代器， 这个接口会被Collection继承
 * 3、Iterator：提供两个方法的定义： hasNext next 会在具体的数据结构中实现方式
 *
 * @date 2021/1/11 22:36
 * @author lingSong
 */
package cEmployeeom.example.demo.behaviormode.iter;