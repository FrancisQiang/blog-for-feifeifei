package com.lgq.domain;

import java.util.ArrayList;
import java.util.List;

public class AlbumPictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlbumPictureExample() {
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

        public Criteria andAlbumPictureIdIsNull() {
            addCriterion("album_picture_id is null");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureIdIsNotNull() {
            addCriterion("album_picture_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureIdEqualTo(Integer value) {
            addCriterion("album_picture_id =", value, "albumPictureId");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureIdNotEqualTo(Integer value) {
            addCriterion("album_picture_id <>", value, "albumPictureId");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureIdGreaterThan(Integer value) {
            addCriterion("album_picture_id >", value, "albumPictureId");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("album_picture_id >=", value, "albumPictureId");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureIdLessThan(Integer value) {
            addCriterion("album_picture_id <", value, "albumPictureId");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureIdLessThanOrEqualTo(Integer value) {
            addCriterion("album_picture_id <=", value, "albumPictureId");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureIdIn(List<Integer> values) {
            addCriterion("album_picture_id in", values, "albumPictureId");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureIdNotIn(List<Integer> values) {
            addCriterion("album_picture_id not in", values, "albumPictureId");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureIdBetween(Integer value1, Integer value2) {
            addCriterion("album_picture_id between", value1, value2, "albumPictureId");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("album_picture_id not between", value1, value2, "albumPictureId");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureUrlIsNull() {
            addCriterion("album_picture_url is null");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureUrlIsNotNull() {
            addCriterion("album_picture_url is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureUrlEqualTo(String value) {
            addCriterion("album_picture_url =", value, "albumPictureUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureUrlNotEqualTo(String value) {
            addCriterion("album_picture_url <>", value, "albumPictureUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureUrlGreaterThan(String value) {
            addCriterion("album_picture_url >", value, "albumPictureUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureUrlGreaterThanOrEqualTo(String value) {
            addCriterion("album_picture_url >=", value, "albumPictureUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureUrlLessThan(String value) {
            addCriterion("album_picture_url <", value, "albumPictureUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureUrlLessThanOrEqualTo(String value) {
            addCriterion("album_picture_url <=", value, "albumPictureUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureUrlLike(String value) {
            addCriterion("album_picture_url like", value, "albumPictureUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureUrlNotLike(String value) {
            addCriterion("album_picture_url not like", value, "albumPictureUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureUrlIn(List<String> values) {
            addCriterion("album_picture_url in", values, "albumPictureUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureUrlNotIn(List<String> values) {
            addCriterion("album_picture_url not in", values, "albumPictureUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureUrlBetween(String value1, String value2) {
            addCriterion("album_picture_url between", value1, value2, "albumPictureUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureUrlNotBetween(String value1, String value2) {
            addCriterion("album_picture_url not between", value1, value2, "albumPictureUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureCategoryIsNull() {
            addCriterion("album_picture_category is null");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureCategoryIsNotNull() {
            addCriterion("album_picture_category is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureCategoryEqualTo(Integer value) {
            addCriterion("album_picture_category =", value, "albumPictureCategory");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureCategoryNotEqualTo(Integer value) {
            addCriterion("album_picture_category <>", value, "albumPictureCategory");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureCategoryGreaterThan(Integer value) {
            addCriterion("album_picture_category >", value, "albumPictureCategory");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("album_picture_category >=", value, "albumPictureCategory");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureCategoryLessThan(Integer value) {
            addCriterion("album_picture_category <", value, "albumPictureCategory");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("album_picture_category <=", value, "albumPictureCategory");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureCategoryIn(List<Integer> values) {
            addCriterion("album_picture_category in", values, "albumPictureCategory");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureCategoryNotIn(List<Integer> values) {
            addCriterion("album_picture_category not in", values, "albumPictureCategory");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureCategoryBetween(Integer value1, Integer value2) {
            addCriterion("album_picture_category between", value1, value2, "albumPictureCategory");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("album_picture_category not between", value1, value2, "albumPictureCategory");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureNameIsNull() {
            addCriterion("album_picture_name is null");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureNameIsNotNull() {
            addCriterion("album_picture_name is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureNameEqualTo(String value) {
            addCriterion("album_picture_name =", value, "albumPictureName");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureNameNotEqualTo(String value) {
            addCriterion("album_picture_name <>", value, "albumPictureName");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureNameGreaterThan(String value) {
            addCriterion("album_picture_name >", value, "albumPictureName");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureNameGreaterThanOrEqualTo(String value) {
            addCriterion("album_picture_name >=", value, "albumPictureName");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureNameLessThan(String value) {
            addCriterion("album_picture_name <", value, "albumPictureName");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureNameLessThanOrEqualTo(String value) {
            addCriterion("album_picture_name <=", value, "albumPictureName");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureNameLike(String value) {
            addCriterion("album_picture_name like", value, "albumPictureName");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureNameNotLike(String value) {
            addCriterion("album_picture_name not like", value, "albumPictureName");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureNameIn(List<String> values) {
            addCriterion("album_picture_name in", values, "albumPictureName");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureNameNotIn(List<String> values) {
            addCriterion("album_picture_name not in", values, "albumPictureName");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureNameBetween(String value1, String value2) {
            addCriterion("album_picture_name between", value1, value2, "albumPictureName");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureNameNotBetween(String value1, String value2) {
            addCriterion("album_picture_name not between", value1, value2, "albumPictureName");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureDescriptionIsNull() {
            addCriterion("album_picture_description is null");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureDescriptionIsNotNull() {
            addCriterion("album_picture_description is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureDescriptionEqualTo(String value) {
            addCriterion("album_picture_description =", value, "albumPictureDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureDescriptionNotEqualTo(String value) {
            addCriterion("album_picture_description <>", value, "albumPictureDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureDescriptionGreaterThan(String value) {
            addCriterion("album_picture_description >", value, "albumPictureDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("album_picture_description >=", value, "albumPictureDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureDescriptionLessThan(String value) {
            addCriterion("album_picture_description <", value, "albumPictureDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureDescriptionLessThanOrEqualTo(String value) {
            addCriterion("album_picture_description <=", value, "albumPictureDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureDescriptionLike(String value) {
            addCriterion("album_picture_description like", value, "albumPictureDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureDescriptionNotLike(String value) {
            addCriterion("album_picture_description not like", value, "albumPictureDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureDescriptionIn(List<String> values) {
            addCriterion("album_picture_description in", values, "albumPictureDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureDescriptionNotIn(List<String> values) {
            addCriterion("album_picture_description not in", values, "albumPictureDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureDescriptionBetween(String value1, String value2) {
            addCriterion("album_picture_description between", value1, value2, "albumPictureDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumPictureDescriptionNotBetween(String value1, String value2) {
            addCriterion("album_picture_description not between", value1, value2, "albumPictureDescription");
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