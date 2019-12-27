package com.lgq.constant;

import lombok.Getter;

/**
 * @author lgq
 * @date 2019/11/26
 */
@Getter
public enum CommonStatus {

    /**
     * 通用状态
     */
    VALID(1, "有效状态"),
    INVALID(0, "无效状态");

    private Integer status;
    private String desc;

    CommonStatus(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }
}
