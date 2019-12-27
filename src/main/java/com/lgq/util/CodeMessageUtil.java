package com.lgq.util;

import com.lgq.constant.Constants;
import com.lgq.exception.BlogException;

/**
 * @author lgq
 * @date 2019/12/25
 */
public class CodeMessageUtil {

    public static String addMessage(int row) throws BlogException {
        if (row != 0) {
            return Constants.SuccessMessage.ADD_SUCCESS;
        } else {
            throw new BlogException(Constants.ErrorMessage.INSERT_ERROR);
        }
    }

    public static String deleteMessage(int row) throws BlogException {
        if (row != 0) {
            return Constants.SuccessMessage.DELETE_SUCCESS;
        } else {
            throw new BlogException(Constants.ErrorMessage.DELETE_ERROR);
        }
    }

    public static String updateMessage(int row) throws BlogException {
        if (row != 0) {
            return Constants.SuccessMessage.UPDATE_SUCCESS;
        } else {
            throw new BlogException(Constants.ErrorMessage.UPDATE_ERROR);
        }
    }

}
