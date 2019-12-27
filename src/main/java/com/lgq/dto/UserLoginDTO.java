package com.lgq.dto;

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
public class UserLoginDTO {

    private String userAccount;

    private String username;

    private String userAvatar;

    private String userDescription;

}
