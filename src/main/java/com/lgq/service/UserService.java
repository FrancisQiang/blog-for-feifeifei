package com.lgq.service;

import com.lgq.domain.User;
import com.lgq.dto.UserLoginDTO;
import com.lgq.exception.BlogException;
import com.lgq.vo.UserLoginVO;
import com.lgq.vo.UserUpdateVO;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
public interface UserService {

    /**
     * 添加用户
     * @param user 添加的用户信息
     * @return 插入用户返回信息
     * @throws BlogException 异常
     */
    String addUser(User user) throws BlogException;

    /**
     * 获取所有用户信息
     * @return 返回所有用户信息
     * @throws BlogException 异常
     */
    List<User> getAll() throws BlogException;

    /**
     * 登录
     * @param user 用户账号密码
     * @return 登录信息
     * @throws BlogException 异常
     */
    UserLoginDTO signIn(UserLoginVO user) throws BlogException;

    /**
     * 删除指定用户
     * @param account 用户账号
     * @return 删除信息
     * @throws BlogException 异常
     */
    String deleteUser(String account) throws BlogException;

    /**
     * 更新指定用户
     * @param user 用户更新信息
     * @return 更新情况
     * @throws BlogException 异常
     */
    String updateUser(User user) throws BlogException;
}
