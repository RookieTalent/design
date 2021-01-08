package com.example.demo.buildermode.factory.version1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaolin
 * @date 2021/1/8 17:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AwardRes {
    private String code; // 编码
    private String info; // 描述
}
