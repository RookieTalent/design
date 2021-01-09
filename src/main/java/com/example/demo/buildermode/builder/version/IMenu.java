package com.example.demo.buildermode.builder.version;

import com.example.demo.buildermode.builder.base.Matter;

/**
 * @author xiaolin
 * @date 2021/1/9 15:36
 */
public interface IMenu {

    /**
     * 吊顶
     */
    IMenu appendCeiling(Matter matter);

    /**
     * 涂料
     */
    IMenu appendCoat(Matter matter);

    /**
     * 地板
     */
    IMenu appendFloor(Matter matter);

    /**
     * 地砖
     */
    IMenu appendTile(Matter matter);

    /**
     * 明细
     */
    String getDetail();

}
