package com.example.demo.behaviormode.iter.lang;


/**
 * 定义了两个泛型 <E, L> ，因为我们的数据结构⼀个是⽤于添加元素，另外
 * ⼀个是⽤于添加树节点的链路关
 *
 * @author lingSong
 * @date 2021/1/11 22:46
 */
public interface Collection<E, L> extends Iterable<E> {

    boolean add(E e);

    boolean remove(E e);

    boolean addLink(String key, L l);

    boolean removeLink(String key);

    Iterator<E> iterator();

}