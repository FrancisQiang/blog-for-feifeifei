package com.lgq.service.impl;

import com.lgq.constant.Constants;
import com.lgq.dao.UserMapper;
import com.lgq.domain.User;
import com.lgq.dto.UserLoginDTO;
import com.lgq.exception.BlogException;
import com.lgq.service.UserService;
import com.lgq.util.CodeMessageUtil;
import com.lgq.vo.UserLoginVO;
import com.lgq.vo.UserUpdateVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Autowired
    @SuppressWarnings("all")
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public String addUser(User user) throws BlogException {
        int row = userMapper.insert(user);
        return CodeMessageUtil.addMessage(row);
    }

    @Override
    public List<User> getAll() throws BlogException{
        return userMapper.selectByExample(null);
    }

    @Override
    @SuppressWarnings("all")
    public UserLoginDTO signIn(UserLoginVO user) throws BlogException {
        User selectUser = userMapper.selectByPrimaryKey(user.getUserAccount());
        if (selectUser.getUserPassword().equals(user.getUserPassword())) {
            UserLoginDTO userLoginDTO = new UserLoginDTO();
            BeanUtils.copyProperties(selectUser, userLoginDTO);
            return userLoginDTO;
        } else {
            throw new BlogException(Constants.ErrorMessage.LOGIN_ERROR);
        }
    }

    @Override
    public String deleteUser(String account) throws BlogException {
        int row = userMapper.deleteByPrimaryKey(account);
        return CodeMessageUtil.deleteMessage(row);
    }

    @Override
    public String updateUser(User user) throws BlogException {
        int row = userMapper.updateByPrimaryKeySelective(user);
        return CodeMessageUtil.updateMessage(row);
    }
}
