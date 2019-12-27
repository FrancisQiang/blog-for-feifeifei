package com.lgq.controller;

import com.alibaba.fastjson.JSON;
import com.lgq.constant.Constants;
import com.lgq.domain.User;
import com.lgq.dto.UserLoginDTO;
import com.lgq.exception.BlogException;
import com.lgq.service.UserService;
import com.lgq.vo.CommonResponse;
import com.lgq.vo.UserLoginVO;
import com.lgq.vo.UserUpdateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
@Slf4j
@RestController
@CrossOrigin
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/admin", method = RequestMethod.POST)
    public String addUser(@RequestBody User user) throws BlogException {
        log.info("FrancisBlog: addUser -> {}",
                JSON.toJSONString(user));
        return userService.addUser(user);
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public List<User> getAllUser() throws BlogException{
        log.info("FrancisBlog: getAllUser");
        return userService.getAll();
    }

    @RequestMapping(value = "/sign_in", method = RequestMethod.POST)
    public UserLoginDTO signIn(@RequestBody UserLoginVO user) throws BlogException{
        log.info("FrancisBlog: signIn -> {}",
                JSON.toJSONString(user));
        return userService.signIn(user);
    }

    @RequestMapping(value = "/admin/{user_account}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable(value = "user_account") String account) throws BlogException{
        log.info("FrancisBlog: signIn ->" + account);
        return userService.deleteUser(account);
    }

    @RequestMapping(value = "/admin", method = RequestMethod.PUT)
    public String updateUser(@RequestBody User user) throws BlogException{
        log.info("FrancisBlog: updateUser -> {}",
                JSON.toJSONString(user));
        return userService.updateUser(user);
    }

}
