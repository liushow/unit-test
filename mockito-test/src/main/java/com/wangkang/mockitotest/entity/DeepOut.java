package com.wangkang.mockitotest.entity;

import lombok.Data;

/**
 * @author wangkang
 * @date 2020/4/6- 18:51
 * @since
 */
@Data
public class DeepOut {
    private String address;
    private DeepInner deepInner;
}
