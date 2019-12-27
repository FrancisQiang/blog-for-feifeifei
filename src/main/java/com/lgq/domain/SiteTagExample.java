package com.lgq.domain;

import java.util.ArrayList;
import java.util.List;

public class SiteTagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SiteTagExample() {
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

        public Criteria andSiteTagIdIsNull() {
            addCriterion("site_tag_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteTagIdIsNotNull() {
            addCriterion("site_tag_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteTagIdEqualTo(Integer value) {
            addCriterion("site_tag_id =", value, "siteTagId");
            return (Criteria) this;
        }

        public Criteria andSiteTagIdNotEqualTo(Integer value) {
            addCriterion("site_tag_id <>", value, "siteTagId");
            return (Criteria) this;
        }

        public Criteria andSiteTagIdGreaterThan(Integer value) {
            addCriterion("site_tag_id >", value, "siteTagId");
            return (Criteria) this;
        }

        public Criteria andSiteTagIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("site_tag_id >=", value, "siteTagId");
            return (Criteria) this;
        }

        public Criteria andSiteTagIdLessThan(Integer value) {
            addCriterion("site_tag_id <", value, "siteTagId");
            return (Criteria) this;
        }

        public Criteria andSiteTagIdLessThanOrEqualTo(Integer value) {
            addCriterion("site_tag_id <=", value, "siteTagId");
            return (Criteria) this;
        }

        public Criteria andSiteTagIdIn(List<Integer> values) {
            addCriterion("site_tag_id in", values, "siteTagId");
            return (Criteria) this;
        }

        public Criteria andSiteTagIdNotIn(List<Integer> values) {
            addCriterion("site_tag_id not in", values, "siteTagId");
            return (Criteria) this;
        }

        public Criteria andSiteTagIdBetween(Integer value1, Integer value2) {
            addCriterion("site_tag_id between", value1, value2, "siteTagId");
            return (Criteria) this;
        }

        public Criteria andSiteTagIdNotBetween(Integer value1, Integer value2) {
            addCriterion("site_tag_id not between", value1, value2, "siteTagId");
            return (Criteria) this;
        }

        public Criteria andSiteTagNameIsNull() {
            addCriterion("site_tag_name is null");
            return (Criteria) this;
        }

        public Criteria andSiteTagNameIsNotNull() {
            addCriterion("site_tag_name is not null");
            return (Criteria) this;
        }

        public Criteria andSiteTagNameEqualTo(String value) {
            addCriterion("site_tag_name =", value, "siteTagName");
            return (Criteria) this;
        }

        public Criteria andSiteTagNameNotEqualTo(String value) {
            addCriterion("site_tag_name <>", value, "siteTagName");
            return (Criteria) this;
        }

        public Criteria andSiteTagNameGreaterThan(String value) {
            addCriterion("site_tag_name >", value, "siteTagName");
            return (Criteria) this;
        }

        public Criteria andSiteTagNameGreaterThanOrEqualTo(String value) {
            addCriterion("site_tag_name >=", value, "siteTagName");
            return (Criteria) this;
        }

        public Criteria andSiteTagNameLessThan(String value) {
            addCriterion("site_tag_name <", value, "siteTagName");
            return (Criteria) this;
        }

        public Criteria andSiteTagNameLessThanOrEqualTo(String value) {
            addCriterion("site_tag_name <=", value, "siteTagName");
            return (Criteria) this;
        }

        public Criteria andSiteTagNameLike(String value) {
            addCriterion("site_tag_name like", value, "siteTagName");
            return (Criteria) this;
        }

        public Criteria andSiteTagNameNotLike(String value) {
            addCriterion("site_tag_name not like", value, "siteTagName");
            return (Criteria) this;
        }

        public Criteria andSiteTagNameIn(List<String> values) {
            addCriterion("site_tag_name in", values, "siteTagName");
            return (Criteria) this;
        }

        public Criteria andSiteTagNameNotIn(List<String> values) {
            addCriterion("site_tag_name not in", values, "siteTagName");
            return (Criteria) this;
        }

        public Criteria andSiteTagNameBetween(String value1, String value2) {
            addCriterion("site_tag_name between", value1, value2, "siteTagName");
            return (Criteria) this;
        }

        public Criteria andSiteTagNameNotBetween(String value1, String value2) {
            addCriterion("site_tag_name not between", value1, value2, "siteTagName");
            return (Criteria) this;
        }

        public Criteria andSiteTagColorIsNull() {
            addCriterion("site_tag_color is null");
            return (Criteria) this;
        }

        public Criteria andSiteTagColorIsNotNull() {
            addCriterion("site_tag_color is not null");
            return (Criteria) this;
        }

        public Criteria andSiteTagColorEqualTo(String value) {
            addCriterion("site_tag_color =", value, "siteTagColor");
            return (Criteria) this;
        }

        public Criteria andSiteTagColorNotEqualTo(String value) {
            addCriterion("site_tag_color <>", value, "siteTagColor");
            return (Criteria) this;
        }

        public Criteria andSiteTagColorGreaterThan(String value) {
            addCriterion("site_tag_color >", value, "siteTagColor");
            return (Criteria) this;
        }

        public Criteria andSiteTagColorGreaterThanOrEqualTo(String value) {
            addCriterion("site_tag_color >=", value, "siteTagColor");
            return (Criteria) this;
        }

        public Criteria andSiteTagColorLessThan(String value) {
            addCriterion("site_tag_color <", value, "siteTagColor");
            return (Criteria) this;
        }

        public Criteria andSiteTagColorLessThanOrEqualTo(String value) {
            addCriterion("site_tag_color <=", value, "siteTagColor");
            return (Criteria) this;
        }

        public Criteria andSiteTagColorLike(String value) {
            addCriterion("site_tag_color like", value, "siteTagColor");
            return (Criteria) this;
        }

        public Criteria andSiteTagColorNotLike(String value) {
            addCriterion("site_tag_color not like", value, "siteTagColor");
            return (Criteria) this;
        }

        public Criteria andSiteTagColorIn(List<String> values) {
            addCriterion("site_tag_color in", values, "siteTagColor");
            return (Criteria) this;
        }

        public Criteria andSiteTagColorNotIn(List<String> values) {
            addCriterion("site_tag_color not in", values, "siteTagColor");
            return (Criteria) this;
        }

        public Criteria andSiteTagColorBetween(String value1, String value2) {
            addCriterion("site_tag_color between", value1, value2, "siteTagColor");
            return (Criteria) this;
        }

        public Criteria andSiteTagColorNotBetween(String value1, String value2) {
            addCriterion("site_tag_color not between", value1, value2, "siteTagColor");
            return (Criteria) this;
        }

        public Criteria andSiteTagDescriptionIsNull() {
            addCriterion("site_tag_description is null");
            return (Criteria) this;
        }

        public Criteria andSiteTagDescriptionIsNotNull() {
            addCriterion("site_tag_description is not null");
            return (Criteria) this;
        }

        public Criteria andSiteTagDescriptionEqualTo(String value) {
            addCriterion("site_tag_description =", value, "siteTagDescription");
            return (Criteria) this;
        }

        public Criteria andSiteTagDescriptionNotEqualTo(String value) {
            addCriterion("site_tag_description <>", value, "siteTagDescription");
            return (Criteria) this;
        }

        public Criteria andSiteTagDescriptionGreaterThan(String value) {
            addCriterion("site_tag_description >", value, "siteTagDescription");
            return (Criteria) this;
        }

        public Criteria andSiteTagDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("site_tag_description >=", value, "siteTagDescription");
            return (Criteria) this;
        }

        public Criteria andSiteTagDescriptionLessThan(String value) {
            addCriterion("site_tag_description <", value, "siteTagDescription");
            return (Criteria) this;
        }

        public Criteria andSiteTagDescriptionLessThanOrEqualTo(String value) {
            addCriterion("site_tag_description <=", value, "siteTagDescription");
            return (Criteria) this;
        }

        public Criteria andSiteTagDescriptionLike(String value) {
            addCriterion("site_tag_description like", value, "siteTagDescription");
            return (Criteria) this;
        }

        public Criteria andSiteTagDescriptionNotLike(String value) {
            addCriterion("site_tag_description not like", value, "siteTagDescription");
            return (Criteria) this;
        }

        public Criteria andSiteTagDescriptionIn(List<String> values) {
            addCriterion("site_tag_description in", values, "siteTagDescription");
            return (Criteria) this;
        }

        public Criteria andSiteTagDescriptionNotIn(List<String> values) {
            addCriterion("site_tag_description not in", values, "siteTagDescription");
            return (Criteria) this;
        }

        public Criteria andSiteTagDescriptionBetween(String value1, String value2) {
            addCriterion("site_tag_description between", value1, value2, "siteTagDescription");
            return (Criteria) this;
        }

        public Criteria andSiteTagDescriptionNotBetween(String value1, String value2) {
            addCriterion("site_tag_description not between", value1, value2, "siteTagDescription");
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