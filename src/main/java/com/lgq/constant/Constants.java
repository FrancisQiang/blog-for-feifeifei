package com.lgq.constant;

/**
 * @author lgq
 * @date 2019/11/26
 */
public class Constants {

    public static class ErrorMessage {

        public static final String REQUEST_PARAM_ERROR = "请求参数错误";
        public static final String INSERT_ERROR = "插入异常";
        public static final String LOGIN_ERROR = "登录失败";
        public static final String DELETE_ERROR = "删除失败";
        public static final String UPDATE_ERROR = "更新失败";

    }

    public static class SuccessMessage {

        public static final String ADD_SUCCESS = "添加成功";
        public static final String DELETE_SUCCESS = "删除成功";
        public static final String UPDATE_SUCCESS = "更新成功";

    }

    public static class RedisKey {
        public static final String TOTAL_PAGE_VIEW = "TOTAL_PAGE_VIEW";
        public static final String DAY_PAGE_VIEW_PREFIX = "DAY_PAGE_VIEW_PREFIX";
        public static final String BLOG_VIEW_MAP = "BLOG_VIEW_MAP";
        public static final String EXPIRE_FLAG = "EXPIRE_FLAG";
    }

}
