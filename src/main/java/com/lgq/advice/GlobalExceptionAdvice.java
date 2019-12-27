package com.lgq.advice;

import com.lgq.exception.BlogException;
import com.lgq.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lgq
 * @date 2019/11/22
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = BlogException.class)
    public CommonResponse<String> handlerAdException(HttpServletRequest request,
                                                     BlogException ex) {
        CommonResponse<String> response = new CommonResponse<>(1, "business error");
        response.setData(ex.getMessage());
        return response;
    }

}
