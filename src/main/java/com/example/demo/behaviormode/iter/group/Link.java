package com.example.demo.behaviormode.iter.group;

import lombok.Data;

/**
 * 树结点
 *
 * 这个类⽤于描述结构树中的各个节点之间的关系链，也就是 A to B 、 B to C 、 B to D ，以此
 * 描述出⼀套完整的树组织结构
 *
 * @author lingSong
 * @date 2021/1/11 22:44
 */
@Data
public class Link {

    private String fromId; // 雇员ID
    private String toId;   // 雇员ID

    public Link(String fromId, String toId) {
        this.fromId = fromId;
        this.toId = toId;
    }


}
