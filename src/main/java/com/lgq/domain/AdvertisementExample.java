package com.lgq.domain;

import java.util.ArrayList;
import java.util.List;

public class AdvertisementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvertisementExample() {
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

        public Criteria andAdvertisementIdIsNull() {
            addCriterion("advertisement_id is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIdIsNotNull() {
            addCriterion("advertisement_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIdEqualTo(Integer value) {
            addCriterion("advertisement_id =", value, "advertisementId");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIdNotEqualTo(Integer value) {
            addCriterion("advertisement_id <>", value, "advertisementId");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIdGreaterThan(Integer value) {
            addCriterion("advertisement_id >", value, "advertisementId");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("advertisement_id >=", value, "advertisementId");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIdLessThan(Integer value) {
            addCriterion("advertisement_id <", value, "advertisementId");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIdLessThanOrEqualTo(Integer value) {
            addCriterion("advertisement_id <=", value, "advertisementId");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIdIn(List<Integer> values) {
            addCriterion("advertisement_id in", values, "advertisementId");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIdNotIn(List<Integer> values) {
            addCriterion("advertisement_id not in", values, "advertisementId");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIdBetween(Integer value1, Integer value2) {
            addCriterion("advertisement_id between", value1, value2, "advertisementId");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("advertisement_id not between", value1, value2, "advertisementId");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPictureIsNull() {
            addCriterion("advertisement_picture is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPictureIsNotNull() {
            addCriterion("advertisement_picture is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPictureEqualTo(String value) {
            addCriterion("advertisement_picture =", value, "advertisementPicture");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPictureNotEqualTo(String value) {
            addCriterion("advertisement_picture <>", value, "advertisementPicture");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPictureGreaterThan(String value) {
            addCriterion("advertisement_picture >", value, "advertisementPicture");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPictureGreaterThanOrEqualTo(String value) {
            addCriterion("advertisement_picture >=", value, "advertisementPicture");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPictureLessThan(String value) {
            addCriterion("advertisement_picture <", value, "advertisementPicture");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPictureLessThanOrEqualTo(String value) {
            addCriterion("advertisement_picture <=", value, "advertisementPicture");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPictureLike(String value) {
            addCriterion("advertisement_picture like", value, "advertisementPicture");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPictureNotLike(String value) {
            addCriterion("advertisement_picture not like", value, "advertisementPicture");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPictureIn(List<String> values) {
            addCriterion("advertisement_picture in", values, "advertisementPicture");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPictureNotIn(List<String> values) {
            addCriterion("advertisement_picture not in", values, "advertisementPicture");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPictureBetween(String value1, String value2) {
            addCriterion("advertisement_picture between", value1, value2, "advertisementPicture");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPictureNotBetween(String value1, String value2) {
            addCriterion("advertisement_picture not between", value1, value2, "advertisementPicture");
            return (Criteria) this;
        }

        public Criteria andAdvertisementUrlIsNull() {
            addCriterion("advertisement_url is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementUrlIsNotNull() {
            addCriterion("advertisement_url is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementUrlEqualTo(String value) {
            addCriterion("advertisement_url =", value, "advertisementUrl");
            return (Criteria) this;
        }

        public Criteria andAdvertisementUrlNotEqualTo(String value) {
            addCriterion("advertisement_url <>", value, "advertisementUrl");
            return (Criteria) this;
        }

        public Criteria andAdvertisementUrlGreaterThan(String value) {
            addCriterion("advertisement_url >", value, "advertisementUrl");
            return (Criteria) this;
        }

        public Criteria andAdvertisementUrlGreaterThanOrEqualTo(String value) {
            addCriterion("advertisement_url >=", value, "advertisementUrl");
            return (Criteria) this;
        }

        public Criteria andAdvertisementUrlLessThan(String value) {
            addCriterion("advertisement_url <", value, "advertisementUrl");
            return (Criteria) this;
        }

        public Criteria andAdvertisementUrlLessThanOrEqualTo(String value) {
            addCriterion("advertisement_url <=", value, "advertisementUrl");
            return (Criteria) this;
        }

        public Criteria andAdvertisementUrlLike(String value) {
            addCriterion("advertisement_url like", value, "advertisementUrl");
            return (Criteria) this;
        }

        public Criteria andAdvertisementUrlNotLike(String value) {
            addCriterion("advertisement_url not like", value, "advertisementUrl");
            return (Criteria) this;
        }

        public Criteria andAdvertisementUrlIn(List<String> values) {
            addCriterion("advertisement_url in", values, "advertisementUrl");
            return (Criteria) this;
        }

        public Criteria andAdvertisementUrlNotIn(List<String> values) {
            addCriterion("advertisement_url not in", values, "advertisementUrl");
            return (Criteria) this;
        }

        public Criteria andAdvertisementUrlBetween(String value1, String value2) {
            addCriterion("advertisement_url between", value1, value2, "advertisementUrl");
            return (Criteria) this;
        }

        public Criteria andAdvertisementUrlNotBetween(String value1, String value2) {
            addCriterion("advertisement_url not between", value1, value2, "advertisementUrl");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameIsNull() {
            addCriterion("advertisement_name is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameIsNotNull() {
            addCriterion("advertisement_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameEqualTo(String value) {
            addCriterion("advertisement_name =", value, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameNotEqualTo(String value) {
            addCriterion("advertisement_name <>", value, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameGreaterThan(String value) {
            addCriterion("advertisement_name >", value, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameGreaterThanOrEqualTo(String value) {
            addCriterion("advertisement_name >=", value, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameLessThan(String value) {
            addCriterion("advertisement_name <", value, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameLessThanOrEqualTo(String value) {
            addCriterion("advertisement_name <=", value, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameLike(String value) {
            addCriterion("advertisement_name like", value, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameNotLike(String value) {
            addCriterion("advertisement_name not like", value, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameIn(List<String> values) {
            addCriterion("advertisement_name in", values, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameNotIn(List<String> values) {
            addCriterion("advertisement_name not in", values, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameBetween(String value1, String value2) {
            addCriterion("advertisement_name between", value1, value2, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameNotBetween(String value1, String value2) {
            addCriterion("advertisement_name not between", value1, value2, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementDescriptionIsNull() {
            addCriterion("advertisement_description is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementDescriptionIsNotNull() {
            addCriterion("advertisement_description is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementDescriptionEqualTo(String value) {
            addCriterion("advertisement_description =", value, "advertisementDescription");
            return (Criteria) this;
        }

        public Criteria andAdvertisementDescriptionNotEqualTo(String value) {
            addCriterion("advertisement_description <>", value, "advertisementDescription");
            return (Criteria) this;
        }

        public Criteria andAdvertisementDescriptionGreaterThan(String value) {
            addCriterion("advertisement_description >", value, "advertisementDescription");
            return (Criteria) this;
        }

        public Criteria andAdvertisementDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("advertisement_description >=", value, "advertisementDescription");
            return (Criteria) this;
        }

        public Criteria andAdvertisementDescriptionLessThan(String value) {
            addCriterion("advertisement_description <", value, "advertisementDescription");
            return (Criteria) this;
        }

        public Criteria andAdvertisementDescriptionLessThanOrEqualTo(String value) {
            addCriterion("advertisement_description <=", value, "advertisementDescription");
            return (Criteria) this;
        }

        public Criteria andAdvertisementDescriptionLike(String value) {
            addCriterion("advertisement_description like", value, "advertisementDescription");
            return (Criteria) this;
        }

        public Criteria andAdvertisementDescriptionNotLike(String value) {
            addCriterion("advertisement_description not like", value, "advertisementDescription");
            return (Criteria) this;
        }

        public Criteria andAdvertisementDescriptionIn(List<String> values) {
            addCriterion("advertisement_description in", values, "advertisementDescription");
            return (Criteria) this;
        }

        public Criteria andAdvertisementDescriptionNotIn(List<String> values) {
            addCriterion("advertisement_description not in", values, "advertisementDescription");
            return (Criteria) this;
        }

        public Criteria andAdvertisementDescriptionBetween(String value1, String value2) {
            addCriterion("advertisement_description between", value1, value2, "advertisementDescription");
            return (Criteria) this;
        }

        public Criteria andAdvertisementDescriptionNotBetween(String value1, String value2) {
            addCriterion("advertisement_description not between", value1, value2, "advertisementDescription");
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