package com.lgq.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lgq
 * @date 2019/12/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginVO {

    private String userAccount;

    private String userPassword;

}
