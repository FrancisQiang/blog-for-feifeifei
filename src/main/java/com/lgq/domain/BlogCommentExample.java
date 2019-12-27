package com.lgq.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogCommentExample() {
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

        public Criteria andBlogCommentIdIsNull() {
            addCriterion("blog_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdIsNotNull() {
            addCriterion("blog_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdEqualTo(Integer value) {
            addCriterion("blog_comment_id =", value, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdNotEqualTo(Integer value) {
            addCriterion("blog_comment_id <>", value, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdGreaterThan(Integer value) {
            addCriterion("blog_comment_id >", value, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_comment_id >=", value, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdLessThan(Integer value) {
            addCriterion("blog_comment_id <", value, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("blog_comment_id <=", value, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdIn(List<Integer> values) {
            addCriterion("blog_comment_id in", values, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdNotIn(List<Integer> values) {
            addCriterion("blog_comment_id not in", values, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("blog_comment_id between", value1, value2, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_comment_id not between", value1, value2, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameIsNull() {
            addCriterion("blog_comment_username is null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameIsNotNull() {
            addCriterion("blog_comment_username is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameEqualTo(String value) {
            addCriterion("blog_comment_username =", value, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameNotEqualTo(String value) {
            addCriterion("blog_comment_username <>", value, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameGreaterThan(String value) {
            addCriterion("blog_comment_username >", value, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("blog_comment_username >=", value, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameLessThan(String value) {
            addCriterion("blog_comment_username <", value, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameLessThanOrEqualTo(String value) {
            addCriterion("blog_comment_username <=", value, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameLike(String value) {
            addCriterion("blog_comment_username like", value, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameNotLike(String value) {
            addCriterion("blog_comment_username not like", value, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameIn(List<String> values) {
            addCriterion("blog_comment_username in", values, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameNotIn(List<String> values) {
            addCriterion("blog_comment_username not in", values, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameBetween(String value1, String value2) {
            addCriterion("blog_comment_username between", value1, value2, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameNotBetween(String value1, String value2) {
            addCriterion("blog_comment_username not between", value1, value2, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentBlogIdIsNull() {
            addCriterion("blog_comment_blog_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentBlogIdIsNotNull() {
            addCriterion("blog_comment_blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentBlogIdEqualTo(Integer value) {
            addCriterion("blog_comment_blog_id =", value, "blogCommentBlogId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentBlogIdNotEqualTo(Integer value) {
            addCriterion("blog_comment_blog_id <>", value, "blogCommentBlogId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentBlogIdGreaterThan(Integer value) {
            addCriterion("blog_comment_blog_id >", value, "blogCommentBlogId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentBlogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_comment_blog_id >=", value, "blogCommentBlogId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentBlogIdLessThan(Integer value) {
            addCriterion("blog_comment_blog_id <", value, "blogCommentBlogId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentBlogIdLessThanOrEqualTo(Integer value) {
            addCriterion("blog_comment_blog_id <=", value, "blogCommentBlogId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentBlogIdIn(List<Integer> values) {
            addCriterion("blog_comment_blog_id in", values, "blogCommentBlogId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentBlogIdNotIn(List<Integer> values) {
            addCriterion("blog_comment_blog_id not in", values, "blogCommentBlogId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentBlogIdBetween(Integer value1, Integer value2) {
            addCriterion("blog_comment_blog_id between", value1, value2, "blogCommentBlogId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentBlogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_comment_blog_id not between", value1, value2, "blogCommentBlogId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateIsNull() {
            addCriterion("blog_comment_date is null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateIsNotNull() {
            addCriterion("blog_comment_date is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateEqualTo(Date value) {
            addCriterion("blog_comment_date =", value, "blogCommentDate");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateNotEqualTo(Date value) {
            addCriterion("blog_comment_date <>", value, "blogCommentDate");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateGreaterThan(Date value) {
            addCriterion("blog_comment_date >", value, "blogCommentDate");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("blog_comment_date >=", value, "blogCommentDate");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateLessThan(Date value) {
            addCriterion("blog_comment_date <", value, "blogCommentDate");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateLessThanOrEqualTo(Date value) {
            addCriterion("blog_comment_date <=", value, "blogCommentDate");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateIn(List<Date> values) {
            addCriterion("blog_comment_date in", values, "blogCommentDate");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateNotIn(List<Date> values) {
            addCriterion("blog_comment_date not in", values, "blogCommentDate");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateBetween(Date value1, Date value2) {
            addCriterion("blog_comment_date between", value1, value2, "blogCommentDate");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateNotBetween(Date value1, Date value2) {
            addCriterion("blog_comment_date not between", value1, value2, "blogCommentDate");
            return (Criteria) this;
        }

        public Criteria andBlogCommentParentIdIsNull() {
            addCriterion("blog_comment_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentParentIdIsNotNull() {
            addCriterion("blog_comment_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentParentIdEqualTo(Integer value) {
            addCriterion("blog_comment_parent_id =", value, "blogCommentParentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentParentIdNotEqualTo(Integer value) {
            addCriterion("blog_comment_parent_id <>", value, "blogCommentParentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentParentIdGreaterThan(Integer value) {
            addCriterion("blog_comment_parent_id >", value, "blogCommentParentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_comment_parent_id >=", value, "blogCommentParentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentParentIdLessThan(Integer value) {
            addCriterion("blog_comment_parent_id <", value, "blogCommentParentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("blog_comment_parent_id <=", value, "blogCommentParentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentParentIdIn(List<Integer> values) {
            addCriterion("blog_comment_parent_id in", values, "blogCommentParentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentParentIdNotIn(List<Integer> values) {
            addCriterion("blog_comment_parent_id not in", values, "blogCommentParentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentParentIdBetween(Integer value1, Integer value2) {
            addCriterion("blog_comment_parent_id between", value1, value2, "blogCommentParentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_comment_parent_id not between", value1, value2, "blogCommentParentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDeleteFlagIsNull() {
            addCriterion("blog_comment_delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDeleteFlagIsNotNull() {
            addCriterion("blog_comment_delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDeleteFlagEqualTo(Boolean value) {
            addCriterion("blog_comment_delete_flag =", value, "blogCommentDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDeleteFlagNotEqualTo(Boolean value) {
            addCriterion("blog_comment_delete_flag <>", value, "blogCommentDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDeleteFlagGreaterThan(Boolean value) {
            addCriterion("blog_comment_delete_flag >", value, "blogCommentDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDeleteFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("blog_comment_delete_flag >=", value, "blogCommentDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDeleteFlagLessThan(Boolean value) {
            addCriterion("blog_comment_delete_flag <", value, "blogCommentDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDeleteFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("blog_comment_delete_flag <=", value, "blogCommentDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDeleteFlagIn(List<Boolean> values) {
            addCriterion("blog_comment_delete_flag in", values, "blogCommentDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDeleteFlagNotIn(List<Boolean> values) {
            addCriterion("blog_comment_delete_flag not in", values, "blogCommentDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDeleteFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("blog_comment_delete_flag between", value1, value2, "blogCommentDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDeleteFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("blog_comment_delete_flag not between", value1, value2, "blogCommentDeleteFlag");
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