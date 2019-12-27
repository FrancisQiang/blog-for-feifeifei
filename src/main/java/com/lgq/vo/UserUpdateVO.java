package com.lgq.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lgq
 * @date 2019/12/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateVO {

    private String username;

    private String userPassword;

    private String userAvatar;

    private String userDescription;

}
