package com.lgq.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBlogIdIsNull() {
            addCriterion("blog_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNotNull() {
            addCriterion("blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogIdEqualTo(Integer value) {
            addCriterion("blog_id =", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotEqualTo(Integer value) {
            addCriterion("blog_id <>", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThan(Integer value) {
            addCriterion("blog_id >", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_id >=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThan(Integer value) {
            addCriterion("blog_id <", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThanOrEqualTo(Integer value) {
            addCriterion("blog_id <=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdIn(List<Integer> values) {
            addCriterion("blog_id in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotIn(List<Integer> values) {
            addCriterion("blog_id not in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdBetween(Integer value1, Integer value2) {
            addCriterion("blog_id between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_id not between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeIsNull() {
            addCriterion("blog_create_time is null");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeIsNotNull() {
            addCriterion("blog_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeEqualTo(Date value) {
            addCriterion("blog_create_time =", value, "blogCreateTime");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeNotEqualTo(Date value) {
            addCriterion("blog_create_time <>", value, "blogCreateTime");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeGreaterThan(Date value) {
            addCriterion("blog_create_time >", value, "blogCreateTime");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("blog_create_time >=", value, "blogCreateTime");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeLessThan(Date value) {
            addCriterion("blog_create_time <", value, "blogCreateTime");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("blog_create_time <=", value, "blogCreateTime");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeIn(List<Date> values) {
            addCriterion("blog_create_time in", values, "blogCreateTime");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeNotIn(List<Date> values) {
            addCriterion("blog_create_time not in", values, "blogCreateTime");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeBetween(Date value1, Date value2) {
            addCriterion("blog_create_time between", value1, value2, "blogCreateTime");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("blog_create_time not between", value1, value2, "blogCreateTime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdateTimeIsNull() {
            addCriterion("blog_update_time is null");
            return (Criteria) this;
        }

        public Criteria andBlogUpdateTimeIsNotNull() {
            addCriterion("blog_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andBlogUpdateTimeEqualTo(Date value) {
            addCriterion("blog_update_time =", value, "blogUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdateTimeNotEqualTo(Date value) {
            addCriterion("blog_update_time <>", value, "blogUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdateTimeGreaterThan(Date value) {
            addCriterion("blog_update_time >", value, "blogUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("blog_update_time >=", value, "blogUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdateTimeLessThan(Date value) {
            addCriterion("blog_update_time <", value, "blogUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("blog_update_time <=", value, "blogUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdateTimeIn(List<Date> values) {
            addCriterion("blog_update_time in", values, "blogUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdateTimeNotIn(List<Date> values) {
            addCriterion("blog_update_time not in", values, "blogUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("blog_update_time between", value1, value2, "blogUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBlogUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("blog_update_time not between", value1, value2, "blogUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIsNull() {
            addCriterion("blog_title is null");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIsNotNull() {
            addCriterion("blog_title is not null");
            return (Criteria) this;
        }

        public Criteria andBlogTitleEqualTo(String value) {
            addCriterion("blog_title =", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotEqualTo(String value) {
            addCriterion("blog_title <>", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleGreaterThan(String value) {
            addCriterion("blog_title >", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleGreaterThanOrEqualTo(String value) {
            addCriterion("blog_title >=", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLessThan(String value) {
            addCriterion("blog_title <", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLessThanOrEqualTo(String value) {
            addCriterion("blog_title <=", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLike(String value) {
            addCriterion("blog_title like", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotLike(String value) {
            addCriterion("blog_title not like", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIn(List<String> values) {
            addCriterion("blog_title in", values, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotIn(List<String> values) {
            addCriterion("blog_title not in", values, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleBetween(String value1, String value2) {
            addCriterion("blog_title between", value1, value2, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotBetween(String value1, String value2) {
            addCriterion("blog_title not between", value1, value2, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogViewsIsNull() {
            addCriterion("blog_views is null");
            return (Criteria) this;
        }

        public Criteria andBlogViewsIsNotNull() {
            addCriterion("blog_views is not null");
            return (Criteria) this;
        }

        public Criteria andBlogViewsEqualTo(Integer value) {
            addCriterion("blog_views =", value, "blogViews");
            return (Criteria) this;
        }

        public Criteria andBlogViewsNotEqualTo(Integer value) {
            addCriterion("blog_views <>", value, "blogViews");
            return (Criteria) this;
        }

        public Criteria andBlogViewsGreaterThan(Integer value) {
            addCriterion("blog_views >", value, "blogViews");
            return (Criteria) this;
        }

        public Criteria andBlogViewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_views >=", value, "blogViews");
            return (Criteria) this;
        }

        public Criteria andBlogViewsLessThan(Integer value) {
            addCriterion("blog_views <", value, "blogViews");
            return (Criteria) this;
        }

        public Criteria andBlogViewsLessThanOrEqualTo(Integer value) {
            addCriterion("blog_views <=", value, "blogViews");
            return (Criteria) this;
        }

        public Criteria andBlogViewsIn(List<Integer> values) {
            addCriterion("blog_views in", values, "blogViews");
            return (Criteria) this;
        }

        public Criteria andBlogViewsNotIn(List<Integer> values) {
            addCriterion("blog_views not in", values, "blogViews");
            return (Criteria) this;
        }

        public Criteria andBlogViewsBetween(Integer value1, Integer value2) {
            addCriterion("blog_views between", value1, value2, "blogViews");
            return (Criteria) this;
        }

        public Criteria andBlogViewsNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_views not between", value1, value2, "blogViews");
            return (Criteria) this;
        }

        public Criteria andBlogReplyIsNull() {
            addCriterion("blog_reply is null");
            return (Criteria) this;
        }

        public Criteria andBlogReplyIsNotNull() {
            addCriterion("blog_reply is not null");
            return (Criteria) this;
        }

        public Criteria andBlogReplyEqualTo(Integer value) {
            addCriterion("blog_reply =", value, "blogReply");
            return (Criteria) this;
        }

        public Criteria andBlogReplyNotEqualTo(Integer value) {
            addCriterion("blog_reply <>", value, "blogReply");
            return (Criteria) this;
        }

        public Criteria andBlogReplyGreaterThan(Integer value) {
            addCriterion("blog_reply >", value, "blogReply");
            return (Criteria) this;
        }

        public Criteria andBlogReplyGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_reply >=", value, "blogReply");
            return (Criteria) this;
        }

        public Criteria andBlogReplyLessThan(Integer value) {
            addCriterion("blog_reply <", value, "blogReply");
            return (Criteria) this;
        }

        public Criteria andBlogReplyLessThanOrEqualTo(Integer value) {
            addCriterion("blog_reply <=", value, "blogReply");
            return (Criteria) this;
        }

        public Criteria andBlogReplyIn(List<Integer> values) {
            addCriterion("blog_reply in", values, "blogReply");
            return (Criteria) this;
        }

        public Criteria andBlogReplyNotIn(List<Integer> values) {
            addCriterion("blog_reply not in", values, "blogReply");
            return (Criteria) this;
        }

        public Criteria andBlogReplyBetween(Integer value1, Integer value2) {
            addCriterion("blog_reply between", value1, value2, "blogReply");
            return (Criteria) this;
        }

        public Criteria andBlogReplyNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_reply not between", value1, value2, "blogReply");
            return (Criteria) this;
        }

        public Criteria andBlogRecommendIsNull() {
            addCriterion("blog_recommend is null");
            return (Criteria) this;
        }

        public Criteria andBlogRecommendIsNotNull() {
            addCriterion("blog_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andBlogRecommendEqualTo(Boolean value) {
            addCriterion("blog_recommend =", value, "blogRecommend");
            return (Criteria) this;
        }

        public Criteria andBlogRecommendNotEqualTo(Boolean value) {
            addCriterion("blog_recommend <>", value, "blogRecommend");
            return (Criteria) this;
        }

        public Criteria andBlogRecommendGreaterThan(Boolean value) {
            addCriterion("blog_recommend >", value, "blogRecommend");
            return (Criteria) this;
        }

        public Criteria andBlogRecommendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("blog_recommend >=", value, "blogRecommend");
            return (Criteria) this;
        }

        public Criteria andBlogRecommendLessThan(Boolean value) {
            addCriterion("blog_recommend <", value, "blogRecommend");
            return (Criteria) this;
        }

        public Criteria andBlogRecommendLessThanOrEqualTo(Boolean value) {
            addCriterion("blog_recommend <=", value, "blogRecommend");
            return (Criteria) this;
        }

        public Criteria andBlogRecommendIn(List<Boolean> values) {
            addCriterion("blog_recommend in", values, "blogRecommend");
            return (Criteria) this;
        }

        public Criteria andBlogRecommendNotIn(List<Boolean> values) {
            addCriterion("blog_recommend not in", values, "blogRecommend");
            return (Criteria) this;
        }

        public Criteria andBlogRecommendBetween(Boolean value1, Boolean value2) {
            addCriterion("blog_recommend between", value1, value2, "blogRecommend");
            return (Criteria) this;
        }

        public Criteria andBlogRecommendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("blog_recommend not between", value1, value2, "blogRecommend");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteFlagIsNull() {
            addCriterion("blog_delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteFlagIsNotNull() {
            addCriterion("blog_delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteFlagEqualTo(Boolean value) {
            addCriterion("blog_delete_flag =", value, "blogDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteFlagNotEqualTo(Boolean value) {
            addCriterion("blog_delete_flag <>", value, "blogDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteFlagGreaterThan(Boolean value) {
            addCriterion("blog_delete_flag >", value, "blogDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("blog_delete_flag >=", value, "blogDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteFlagLessThan(Boolean value) {
            addCriterion("blog_delete_flag <", value, "blogDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("blog_delete_flag <=", value, "blogDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteFlagIn(List<Boolean> values) {
            addCriterion("blog_delete_flag in", values, "blogDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteFlagNotIn(List<Boolean> values) {
            addCriterion("blog_delete_flag not in", values, "blogDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("blog_delete_flag between", value1, value2, "blogDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("blog_delete_flag not between", value1, value2, "blogDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdIsNull() {
            addCriterion("blog_category_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdIsNotNull() {
            addCriterion("blog_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdEqualTo(Integer value) {
            addCriterion("blog_category_id =", value, "blogCategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdNotEqualTo(Integer value) {
            addCriterion("blog_category_id <>", value, "blogCategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdGreaterThan(Integer value) {
            addCriterion("blog_category_id >", value, "blogCategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_category_id >=", value, "blogCategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdLessThan(Integer value) {
            addCriterion("blog_category_id <", value, "blogCategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("blog_category_id <=", value, "blogCategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdIn(List<Integer> values) {
            addCriterion("blog_category_id in", values, "blogCategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdNotIn(List<Integer> values) {
            addCriterion("blog_category_id not in", values, "blogCategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("blog_category_id between", value1, value2, "blogCategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_category_id not between", value1, value2, "blogCategoryId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}