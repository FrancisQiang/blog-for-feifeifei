package com.lgq.domain;

import java.util.ArrayList;
import java.util.List;

public class SiteIconExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SiteIconExample() {
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

        public Criteria andSiteIconIdIsNull() {
            addCriterion("site_icon_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteIconIdIsNotNull() {
            addCriterion("site_icon_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIconIdEqualTo(Integer value) {
            addCriterion("site_icon_id =", value, "siteIconId");
            return (Criteria) this;
        }

        public Criteria andSiteIconIdNotEqualTo(Integer value) {
            addCriterion("site_icon_id <>", value, "siteIconId");
            return (Criteria) this;
        }

        public Criteria andSiteIconIdGreaterThan(Integer value) {
            addCriterion("site_icon_id >", value, "siteIconId");
            return (Criteria) this;
        }

        public Criteria andSiteIconIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("site_icon_id >=", value, "siteIconId");
            return (Criteria) this;
        }

        public Criteria andSiteIconIdLessThan(Integer value) {
            addCriterion("site_icon_id <", value, "siteIconId");
            return (Criteria) this;
        }

        public Criteria andSiteIconIdLessThanOrEqualTo(Integer value) {
            addCriterion("site_icon_id <=", value, "siteIconId");
            return (Criteria) this;
        }

        public Criteria andSiteIconIdIn(List<Integer> values) {
            addCriterion("site_icon_id in", values, "siteIconId");
            return (Criteria) this;
        }

        public Criteria andSiteIconIdNotIn(List<Integer> values) {
            addCriterion("site_icon_id not in", values, "siteIconId");
            return (Criteria) this;
        }

        public Criteria andSiteIconIdBetween(Integer value1, Integer value2) {
            addCriterion("site_icon_id between", value1, value2, "siteIconId");
            return (Criteria) this;
        }

        public Criteria andSiteIconIdNotBetween(Integer value1, Integer value2) {
            addCriterion("site_icon_id not between", value1, value2, "siteIconId");
            return (Criteria) this;
        }

        public Criteria andSiteIconNameIsNull() {
            addCriterion("site_icon_name is null");
            return (Criteria) this;
        }

        public Criteria andSiteIconNameIsNotNull() {
            addCriterion("site_icon_name is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIconNameEqualTo(String value) {
            addCriterion("site_icon_name =", value, "siteIconName");
            return (Criteria) this;
        }

        public Criteria andSiteIconNameNotEqualTo(String value) {
            addCriterion("site_icon_name <>", value, "siteIconName");
            return (Criteria) this;
        }

        public Criteria andSiteIconNameGreaterThan(String value) {
            addCriterion("site_icon_name >", value, "siteIconName");
            return (Criteria) this;
        }

        public Criteria andSiteIconNameGreaterThanOrEqualTo(String value) {
            addCriterion("site_icon_name >=", value, "siteIconName");
            return (Criteria) this;
        }

        public Criteria andSiteIconNameLessThan(String value) {
            addCriterion("site_icon_name <", value, "siteIconName");
            return (Criteria) this;
        }

        public Criteria andSiteIconNameLessThanOrEqualTo(String value) {
            addCriterion("site_icon_name <=", value, "siteIconName");
            return (Criteria) this;
        }

        public Criteria andSiteIconNameLike(String value) {
            addCriterion("site_icon_name like", value, "siteIconName");
            return (Criteria) this;
        }

        public Criteria andSiteIconNameNotLike(String value) {
            addCriterion("site_icon_name not like", value, "siteIconName");
            return (Criteria) this;
        }

        public Criteria andSiteIconNameIn(List<String> values) {
            addCriterion("site_icon_name in", values, "siteIconName");
            return (Criteria) this;
        }

        public Criteria andSiteIconNameNotIn(List<String> values) {
            addCriterion("site_icon_name not in", values, "siteIconName");
            return (Criteria) this;
        }

        public Criteria andSiteIconNameBetween(String value1, String value2) {
            addCriterion("site_icon_name between", value1, value2, "siteIconName");
            return (Criteria) this;
        }

        public Criteria andSiteIconNameNotBetween(String value1, String value2) {
            addCriterion("site_icon_name not between", value1, value2, "siteIconName");
            return (Criteria) this;
        }

        public Criteria andSiteIconColorIsNull() {
            addCriterion("site_icon_color is null");
            return (Criteria) this;
        }

        public Criteria andSiteIconColorIsNotNull() {
            addCriterion("site_icon_color is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIconColorEqualTo(String value) {
            addCriterion("site_icon_color =", value, "siteIconColor");
            return (Criteria) this;
        }

        public Criteria andSiteIconColorNotEqualTo(String value) {
            addCriterion("site_icon_color <>", value, "siteIconColor");
            return (Criteria) this;
        }

        public Criteria andSiteIconColorGreaterThan(String value) {
            addCriterion("site_icon_color >", value, "siteIconColor");
            return (Criteria) this;
        }

        public Criteria andSiteIconColorGreaterThanOrEqualTo(String value) {
            addCriterion("site_icon_color >=", value, "siteIconColor");
            return (Criteria) this;
        }

        public Criteria andSiteIconColorLessThan(String value) {
            addCriterion("site_icon_color <", value, "siteIconColor");
            return (Criteria) this;
        }

        public Criteria andSiteIconColorLessThanOrEqualTo(String value) {
            addCriterion("site_icon_color <=", value, "siteIconColor");
            return (Criteria) this;
        }

        public Criteria andSiteIconColorLike(String value) {
            addCriterion("site_icon_color like", value, "siteIconColor");
            return (Criteria) this;
        }

        public Criteria andSiteIconColorNotLike(String value) {
            addCriterion("site_icon_color not like", value, "siteIconColor");
            return (Criteria) this;
        }

        public Criteria andSiteIconColorIn(List<String> values) {
            addCriterion("site_icon_color in", values, "siteIconColor");
            return (Criteria) this;
        }

        public Criteria andSiteIconColorNotIn(List<String> values) {
            addCriterion("site_icon_color not in", values, "siteIconColor");
            return (Criteria) this;
        }

        public Criteria andSiteIconColorBetween(String value1, String value2) {
            addCriterion("site_icon_color between", value1, value2, "siteIconColor");
            return (Criteria) this;
        }

        public Criteria andSiteIconColorNotBetween(String value1, String value2) {
            addCriterion("site_icon_color not between", value1, value2, "siteIconColor");
            return (Criteria) this;
        }

        public Criteria andSiteIconUrlIsNull() {
            addCriterion("site_icon_url is null");
            return (Criteria) this;
        }

        public Criteria andSiteIconUrlIsNotNull() {
            addCriterion("site_icon_url is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIconUrlEqualTo(String value) {
            addCriterion("site_icon_url =", value, "siteIconUrl");
            return (Criteria) this;
        }

        public Criteria andSiteIconUrlNotEqualTo(String value) {
            addCriterion("site_icon_url <>", value, "siteIconUrl");
            return (Criteria) this;
        }

        public Criteria andSiteIconUrlGreaterThan(String value) {
            addCriterion("site_icon_url >", value, "siteIconUrl");
            return (Criteria) this;
        }

        public Criteria andSiteIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("site_icon_url >=", value, "siteIconUrl");
            return (Criteria) this;
        }

        public Criteria andSiteIconUrlLessThan(String value) {
            addCriterion("site_icon_url <", value, "siteIconUrl");
            return (Criteria) this;
        }

        public Criteria andSiteIconUrlLessThanOrEqualTo(String value) {
            addCriterion("site_icon_url <=", value, "siteIconUrl");
            return (Criteria) this;
        }

        public Criteria andSiteIconUrlLike(String value) {
            addCriterion("site_icon_url like", value, "siteIconUrl");
            return (Criteria) this;
        }

        public Criteria andSiteIconUrlNotLike(String value) {
            addCriterion("site_icon_url not like", value, "siteIconUrl");
            return (Criteria) this;
        }

        public Criteria andSiteIconUrlIn(List<String> values) {
            addCriterion("site_icon_url in", values, "siteIconUrl");
            return (Criteria) this;
        }

        public Criteria andSiteIconUrlNotIn(List<String> values) {
            addCriterion("site_icon_url not in", values, "siteIconUrl");
            return (Criteria) this;
        }

        public Criteria andSiteIconUrlBetween(String value1, String value2) {
            addCriterion("site_icon_url between", value1, value2, "siteIconUrl");
            return (Criteria) this;
        }

        public Criteria andSiteIconUrlNotBetween(String value1, String value2) {
            addCriterion("site_icon_url not between", value1, value2, "siteIconUrl");
            return (Criteria) this;
        }

        public Criteria andSiteIconValueIsNull() {
            addCriterion("site_icon_value is null");
            return (Criteria) this;
        }

        public Criteria andSiteIconValueIsNotNull() {
            addCriterion("site_icon_value is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIconValueEqualTo(String value) {
            addCriterion("site_icon_value =", value, "siteIconValue");
            return (Criteria) this;
        }

        public Criteria andSiteIconValueNotEqualTo(String value) {
            addCriterion("site_icon_value <>", value, "siteIconValue");
            return (Criteria) this;
        }

        public Criteria andSiteIconValueGreaterThan(String value) {
            addCriterion("site_icon_value >", value, "siteIconValue");
            return (Criteria) this;
        }

        public Criteria andSiteIconValueGreaterThanOrEqualTo(String value) {
            addCriterion("site_icon_value >=", value, "siteIconValue");
            return (Criteria) this;
        }

        public Criteria andSiteIconValueLessThan(String value) {
            addCriterion("site_icon_value <", value, "siteIconValue");
            return (Criteria) this;
        }

        public Criteria andSiteIconValueLessThanOrEqualTo(String value) {
            addCriterion("site_icon_value <=", value, "siteIconValue");
            return (Criteria) this;
        }

        public Criteria andSiteIconValueLike(String value) {
            addCriterion("site_icon_value like", value, "siteIconValue");
            return (Criteria) this;
        }

        public Criteria andSiteIconValueNotLike(String value) {
            addCriterion("site_icon_value not like", value, "siteIconValue");
            return (Criteria) this;
        }

        public Criteria andSiteIconValueIn(List<String> values) {
            addCriterion("site_icon_value in", values, "siteIconValue");
            return (Criteria) this;
        }

        public Criteria andSiteIconValueNotIn(List<String> values) {
            addCriterion("site_icon_value not in", values, "siteIconValue");
            return (Criteria) this;
        }

        public Criteria andSiteIconValueBetween(String value1, String value2) {
            addCriterion("site_icon_value between", value1, value2, "siteIconValue");
            return (Criteria) this;
        }

        public Criteria andSiteIconValueNotBetween(String value1, String value2) {
            addCriterion("site_icon_value not between", value1, value2, "siteIconValue");
            return (Criteria) this;
        }

        public Criteria andSiteIconDescriptionIsNull() {
            addCriterion("site_icon_description is null");
            return (Criteria) this;
        }

        public Criteria andSiteIconDescriptionIsNotNull() {
            addCriterion("site_icon_description is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIconDescriptionEqualTo(String value) {
            addCriterion("site_icon_description =", value, "siteIconDescription");
            return (Criteria) this;
        }

        public Criteria andSiteIconDescriptionNotEqualTo(String value) {
            addCriterion("site_icon_description <>", value, "siteIconDescription");
            return (Criteria) this;
        }

        public Criteria andSiteIconDescriptionGreaterThan(String value) {
            addCriterion("site_icon_description >", value, "siteIconDescription");
            return (Criteria) this;
        }

        public Criteria andSiteIconDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("site_icon_description >=", value, "siteIconDescription");
            return (Criteria) this;
        }

        public Criteria andSiteIconDescriptionLessThan(String value) {
            addCriterion("site_icon_description <", value, "siteIconDescription");
            return (Criteria) this;
        }

        public Criteria andSiteIconDescriptionLessThanOrEqualTo(String value) {
            addCriterion("site_icon_description <=", value, "siteIconDescription");
            return (Criteria) this;
        }

        public Criteria andSiteIconDescriptionLike(String value) {
            addCriterion("site_icon_description like", value, "siteIconDescription");
            return (Criteria) this;
        }

        public Criteria andSiteIconDescriptionNotLike(String value) {
            addCriterion("site_icon_description not like", value, "siteIconDescription");
            return (Criteria) this;
        }

        public Criteria andSiteIconDescriptionIn(List<String> values) {
            addCriterion("site_icon_description in", values, "siteIconDescription");
            return (Criteria) this;
        }

        public Criteria andSiteIconDescriptionNotIn(List<String> values) {
            addCriterion("site_icon_description not in", values, "siteIconDescription");
            return (Criteria) this;
        }

        public Criteria andSiteIconDescriptionBetween(String value1, String value2) {
            addCriterion("site_icon_description between", value1, value2, "siteIconDescription");
            return (Criteria) this;
        }

        public Criteria andSiteIconDescriptionNotBetween(String value1, String value2) {
            addCriterion("site_icon_description not between", value1, value2, "siteIconDescription");
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