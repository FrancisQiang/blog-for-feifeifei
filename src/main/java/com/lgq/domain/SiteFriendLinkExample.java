package com.lgq.domain;

import java.util.ArrayList;
import java.util.List;

public class SiteFriendLinkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SiteFriendLinkExample() {
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

        public Criteria andFriendLinkIdIsNull() {
            addCriterion("friend_link_id is null");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIdIsNotNull() {
            addCriterion("friend_link_id is not null");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIdEqualTo(Integer value) {
            addCriterion("friend_link_id =", value, "friendLinkId");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIdNotEqualTo(Integer value) {
            addCriterion("friend_link_id <>", value, "friendLinkId");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIdGreaterThan(Integer value) {
            addCriterion("friend_link_id >", value, "friendLinkId");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("friend_link_id >=", value, "friendLinkId");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIdLessThan(Integer value) {
            addCriterion("friend_link_id <", value, "friendLinkId");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIdLessThanOrEqualTo(Integer value) {
            addCriterion("friend_link_id <=", value, "friendLinkId");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIdIn(List<Integer> values) {
            addCriterion("friend_link_id in", values, "friendLinkId");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIdNotIn(List<Integer> values) {
            addCriterion("friend_link_id not in", values, "friendLinkId");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIdBetween(Integer value1, Integer value2) {
            addCriterion("friend_link_id between", value1, value2, "friendLinkId");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("friend_link_id not between", value1, value2, "friendLinkId");
            return (Criteria) this;
        }

        public Criteria andFriendLinkNameIsNull() {
            addCriterion("friend_link_name is null");
            return (Criteria) this;
        }

        public Criteria andFriendLinkNameIsNotNull() {
            addCriterion("friend_link_name is not null");
            return (Criteria) this;
        }

        public Criteria andFriendLinkNameEqualTo(String value) {
            addCriterion("friend_link_name =", value, "friendLinkName");
            return (Criteria) this;
        }

        public Criteria andFriendLinkNameNotEqualTo(String value) {
            addCriterion("friend_link_name <>", value, "friendLinkName");
            return (Criteria) this;
        }

        public Criteria andFriendLinkNameGreaterThan(String value) {
            addCriterion("friend_link_name >", value, "friendLinkName");
            return (Criteria) this;
        }

        public Criteria andFriendLinkNameGreaterThanOrEqualTo(String value) {
            addCriterion("friend_link_name >=", value, "friendLinkName");
            return (Criteria) this;
        }

        public Criteria andFriendLinkNameLessThan(String value) {
            addCriterion("friend_link_name <", value, "friendLinkName");
            return (Criteria) this;
        }

        public Criteria andFriendLinkNameLessThanOrEqualTo(String value) {
            addCriterion("friend_link_name <=", value, "friendLinkName");
            return (Criteria) this;
        }

        public Criteria andFriendLinkNameLike(String value) {
            addCriterion("friend_link_name like", value, "friendLinkName");
            return (Criteria) this;
        }

        public Criteria andFriendLinkNameNotLike(String value) {
            addCriterion("friend_link_name not like", value, "friendLinkName");
            return (Criteria) this;
        }

        public Criteria andFriendLinkNameIn(List<String> values) {
            addCriterion("friend_link_name in", values, "friendLinkName");
            return (Criteria) this;
        }

        public Criteria andFriendLinkNameNotIn(List<String> values) {
            addCriterion("friend_link_name not in", values, "friendLinkName");
            return (Criteria) this;
        }

        public Criteria andFriendLinkNameBetween(String value1, String value2) {
            addCriterion("friend_link_name between", value1, value2, "friendLinkName");
            return (Criteria) this;
        }

        public Criteria andFriendLinkNameNotBetween(String value1, String value2) {
            addCriterion("friend_link_name not between", value1, value2, "friendLinkName");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconValueIsNull() {
            addCriterion("friend_link_icon_value is null");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconValueIsNotNull() {
            addCriterion("friend_link_icon_value is not null");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconValueEqualTo(String value) {
            addCriterion("friend_link_icon_value =", value, "friendLinkIconValue");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconValueNotEqualTo(String value) {
            addCriterion("friend_link_icon_value <>", value, "friendLinkIconValue");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconValueGreaterThan(String value) {
            addCriterion("friend_link_icon_value >", value, "friendLinkIconValue");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconValueGreaterThanOrEqualTo(String value) {
            addCriterion("friend_link_icon_value >=", value, "friendLinkIconValue");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconValueLessThan(String value) {
            addCriterion("friend_link_icon_value <", value, "friendLinkIconValue");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconValueLessThanOrEqualTo(String value) {
            addCriterion("friend_link_icon_value <=", value, "friendLinkIconValue");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconValueLike(String value) {
            addCriterion("friend_link_icon_value like", value, "friendLinkIconValue");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconValueNotLike(String value) {
            addCriterion("friend_link_icon_value not like", value, "friendLinkIconValue");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconValueIn(List<String> values) {
            addCriterion("friend_link_icon_value in", values, "friendLinkIconValue");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconValueNotIn(List<String> values) {
            addCriterion("friend_link_icon_value not in", values, "friendLinkIconValue");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconValueBetween(String value1, String value2) {
            addCriterion("friend_link_icon_value between", value1, value2, "friendLinkIconValue");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconValueNotBetween(String value1, String value2) {
            addCriterion("friend_link_icon_value not between", value1, value2, "friendLinkIconValue");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconColorIsNull() {
            addCriterion("friend_link_icon_color is null");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconColorIsNotNull() {
            addCriterion("friend_link_icon_color is not null");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconColorEqualTo(String value) {
            addCriterion("friend_link_icon_color =", value, "friendLinkIconColor");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconColorNotEqualTo(String value) {
            addCriterion("friend_link_icon_color <>", value, "friendLinkIconColor");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconColorGreaterThan(String value) {
            addCriterion("friend_link_icon_color >", value, "friendLinkIconColor");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconColorGreaterThanOrEqualTo(String value) {
            addCriterion("friend_link_icon_color >=", value, "friendLinkIconColor");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconColorLessThan(String value) {
            addCriterion("friend_link_icon_color <", value, "friendLinkIconColor");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconColorLessThanOrEqualTo(String value) {
            addCriterion("friend_link_icon_color <=", value, "friendLinkIconColor");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconColorLike(String value) {
            addCriterion("friend_link_icon_color like", value, "friendLinkIconColor");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconColorNotLike(String value) {
            addCriterion("friend_link_icon_color not like", value, "friendLinkIconColor");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconColorIn(List<String> values) {
            addCriterion("friend_link_icon_color in", values, "friendLinkIconColor");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconColorNotIn(List<String> values) {
            addCriterion("friend_link_icon_color not in", values, "friendLinkIconColor");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconColorBetween(String value1, String value2) {
            addCriterion("friend_link_icon_color between", value1, value2, "friendLinkIconColor");
            return (Criteria) this;
        }

        public Criteria andFriendLinkIconColorNotBetween(String value1, String value2) {
            addCriterion("friend_link_icon_color not between", value1, value2, "friendLinkIconColor");
            return (Criteria) this;
        }

        public Criteria andFriendLinkUrlIsNull() {
            addCriterion("friend_link_url is null");
            return (Criteria) this;
        }

        public Criteria andFriendLinkUrlIsNotNull() {
            addCriterion("friend_link_url is not null");
            return (Criteria) this;
        }

        public Criteria andFriendLinkUrlEqualTo(String value) {
            addCriterion("friend_link_url =", value, "friendLinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendLinkUrlNotEqualTo(String value) {
            addCriterion("friend_link_url <>", value, "friendLinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendLinkUrlGreaterThan(String value) {
            addCriterion("friend_link_url >", value, "friendLinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendLinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("friend_link_url >=", value, "friendLinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendLinkUrlLessThan(String value) {
            addCriterion("friend_link_url <", value, "friendLinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendLinkUrlLessThanOrEqualTo(String value) {
            addCriterion("friend_link_url <=", value, "friendLinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendLinkUrlLike(String value) {
            addCriterion("friend_link_url like", value, "friendLinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendLinkUrlNotLike(String value) {
            addCriterion("friend_link_url not like", value, "friendLinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendLinkUrlIn(List<String> values) {
            addCriterion("friend_link_url in", values, "friendLinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendLinkUrlNotIn(List<String> values) {
            addCriterion("friend_link_url not in", values, "friendLinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendLinkUrlBetween(String value1, String value2) {
            addCriterion("friend_link_url between", value1, value2, "friendLinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendLinkUrlNotBetween(String value1, String value2) {
            addCriterion("friend_link_url not between", value1, value2, "friendLinkUrl");
            return (Criteria) this;
        }

        public Criteria andFriendLinkDescriptionIsNull() {
            addCriterion("friend_link_description is null");
            return (Criteria) this;
        }

        public Criteria andFriendLinkDescriptionIsNotNull() {
            addCriterion("friend_link_description is not null");
            return (Criteria) this;
        }

        public Criteria andFriendLinkDescriptionEqualTo(String value) {
            addCriterion("friend_link_description =", value, "friendLinkDescription");
            return (Criteria) this;
        }

        public Criteria andFriendLinkDescriptionNotEqualTo(String value) {
            addCriterion("friend_link_description <>", value, "friendLinkDescription");
            return (Criteria) this;
        }

        public Criteria andFriendLinkDescriptionGreaterThan(String value) {
            addCriterion("friend_link_description >", value, "friendLinkDescription");
            return (Criteria) this;
        }

        public Criteria andFriendLinkDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("friend_link_description >=", value, "friendLinkDescription");
            return (Criteria) this;
        }

        public Criteria andFriendLinkDescriptionLessThan(String value) {
            addCriterion("friend_link_description <", value, "friendLinkDescription");
            return (Criteria) this;
        }

        public Criteria andFriendLinkDescriptionLessThanOrEqualTo(String value) {
            addCriterion("friend_link_description <=", value, "friendLinkDescription");
            return (Criteria) this;
        }

        public Criteria andFriendLinkDescriptionLike(String value) {
            addCriterion("friend_link_description like", value, "friendLinkDescription");
            return (Criteria) this;
        }

        public Criteria andFriendLinkDescriptionNotLike(String value) {
            addCriterion("friend_link_description not like", value, "friendLinkDescription");
            return (Criteria) this;
        }

        public Criteria andFriendLinkDescriptionIn(List<String> values) {
            addCriterion("friend_link_description in", values, "friendLinkDescription");
            return (Criteria) this;
        }

        public Criteria andFriendLinkDescriptionNotIn(List<String> values) {
            addCriterion("friend_link_description not in", values, "friendLinkDescription");
            return (Criteria) this;
        }

        public Criteria andFriendLinkDescriptionBetween(String value1, String value2) {
            addCriterion("friend_link_description between", value1, value2, "friendLinkDescription");
            return (Criteria) this;
        }

        public Criteria andFriendLinkDescriptionNotBetween(String value1, String value2) {
            addCriterion("friend_link_description not between", value1, value2, "friendLinkDescription");
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