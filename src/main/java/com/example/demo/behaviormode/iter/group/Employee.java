package com.example.demo.behaviormode.iter.group;

import lombok.Data;

/**
 * @author lingSong
 * @date 2021/1/11 22:43
 */
@Data
public class Employee {
    private String uId;   // ID
    private String name;  // 姓名
    private String desc;  // 备注

    public Employee(String uId, String name) {
        this.uId = uId;
        this.name = name;
    }

    public Employee(String uId, String name, String desc) {
        this.uId = uId;
        this.name = name;
        this.desc = desc;
    }
}
