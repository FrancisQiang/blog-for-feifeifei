package com.lgq.controller;

import com.qiniu.util.Auth;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lgq
 * @date 2019/12/25
 */
@RestController
@CrossOrigin
@Api(tags = "获取Token")
@Slf4j
public class TokenController {

    @RequestMapping(value = "/token", method = RequestMethod.GET)
    public String getToken(){
        log.info("FrancisBlog: getToken");
        String accessKey = "VxHyI0oEEQapsj7PjTDxE9ydhduF1AbyAjExc7ry";
        String secretKey = "dbelSqf9Zrs48b5hT6upq4xVr35n-sCiKCCd52fO";
        String bucket = "francisqblog";
        Auth auth = Auth.create(accessKey, secretKey);
        return auth.uploadToken(bucket, null, 36000, null, true);
    }

}

