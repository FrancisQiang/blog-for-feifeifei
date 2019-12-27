package com.lgq.domain;

import java.util.ArrayList;
import java.util.List;

public class AlbumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlbumExample() {
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

        public Criteria andAlbumIdIsNull() {
            addCriterion("album_id is null");
            return (Criteria) this;
        }

        public Criteria andAlbumIdIsNotNull() {
            addCriterion("album_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumIdEqualTo(Integer value) {
            addCriterion("album_id =", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdNotEqualTo(Integer value) {
            addCriterion("album_id <>", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdGreaterThan(Integer value) {
            addCriterion("album_id >", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("album_id >=", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdLessThan(Integer value) {
            addCriterion("album_id <", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdLessThanOrEqualTo(Integer value) {
            addCriterion("album_id <=", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdIn(List<Integer> values) {
            addCriterion("album_id in", values, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdNotIn(List<Integer> values) {
            addCriterion("album_id not in", values, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdBetween(Integer value1, Integer value2) {
            addCriterion("album_id between", value1, value2, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdNotBetween(Integer value1, Integer value2) {
            addCriterion("album_id not between", value1, value2, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumNameIsNull() {
            addCriterion("album_name is null");
            return (Criteria) this;
        }

        public Criteria andAlbumNameIsNotNull() {
            addCriterion("album_name is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumNameEqualTo(String value) {
            addCriterion("album_name =", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameNotEqualTo(String value) {
            addCriterion("album_name <>", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameGreaterThan(String value) {
            addCriterion("album_name >", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameGreaterThanOrEqualTo(String value) {
            addCriterion("album_name >=", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameLessThan(String value) {
            addCriterion("album_name <", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameLessThanOrEqualTo(String value) {
            addCriterion("album_name <=", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameLike(String value) {
            addCriterion("album_name like", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameNotLike(String value) {
            addCriterion("album_name not like", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameIn(List<String> values) {
            addCriterion("album_name in", values, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameNotIn(List<String> values) {
            addCriterion("album_name not in", values, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameBetween(String value1, String value2) {
            addCriterion("album_name between", value1, value2, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameNotBetween(String value1, String value2) {
            addCriterion("album_name not between", value1, value2, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionIsNull() {
            addCriterion("album_description is null");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionIsNotNull() {
            addCriterion("album_description is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionEqualTo(String value) {
            addCriterion("album_description =", value, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionNotEqualTo(String value) {
            addCriterion("album_description <>", value, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionGreaterThan(String value) {
            addCriterion("album_description >", value, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("album_description >=", value, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionLessThan(String value) {
            addCriterion("album_description <", value, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionLessThanOrEqualTo(String value) {
            addCriterion("album_description <=", value, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionLike(String value) {
            addCriterion("album_description like", value, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionNotLike(String value) {
            addCriterion("album_description not like", value, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionIn(List<String> values) {
            addCriterion("album_description in", values, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionNotIn(List<String> values) {
            addCriterion("album_description not in", values, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionBetween(String value1, String value2) {
            addCriterion("album_description between", value1, value2, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAlbumDescriptionNotBetween(String value1, String value2) {
            addCriterion("album_description not between", value1, value2, "albumDescription");
            return (Criteria) this;
        }

        public Criteria andAblumCoverIsNull() {
            addCriterion("ablum_cover is null");
            return (Criteria) this;
        }

        public Criteria andAblumCoverIsNotNull() {
            addCriterion("ablum_cover is not null");
            return (Criteria) this;
        }

        public Criteria andAblumCoverEqualTo(String value) {
            addCriterion("ablum_cover =", value, "ablumCover");
            return (Criteria) this;
        }

        public Criteria andAblumCoverNotEqualTo(String value) {
            addCriterion("ablum_cover <>", value, "ablumCover");
            return (Criteria) this;
        }

        public Criteria andAblumCoverGreaterThan(String value) {
            addCriterion("ablum_cover >", value, "ablumCover");
            return (Criteria) this;
        }

        public Criteria andAblumCoverGreaterThanOrEqualTo(String value) {
            addCriterion("ablum_cover >=", value, "ablumCover");
            return (Criteria) this;
        }

        public Criteria andAblumCoverLessThan(String value) {
            addCriterion("ablum_cover <", value, "ablumCover");
            return (Criteria) this;
        }

        public Criteria andAblumCoverLessThanOrEqualTo(String value) {
            addCriterion("ablum_cover <=", value, "ablumCover");
            return (Criteria) this;
        }

        public Criteria andAblumCoverLike(String value) {
            addCriterion("ablum_cover like", value, "ablumCover");
            return (Criteria) this;
        }

        public Criteria andAblumCoverNotLike(String value) {
            addCriterion("ablum_cover not like", value, "ablumCover");
            return (Criteria) this;
        }

        public Criteria andAblumCoverIn(List<String> values) {
            addCriterion("ablum_cover in", values, "ablumCover");
            return (Criteria) this;
        }

        public Criteria andAblumCoverNotIn(List<String> values) {
            addCriterion("ablum_cover not in", values, "ablumCover");
            return (Criteria) this;
        }

        public Criteria andAblumCoverBetween(String value1, String value2) {
            addCriterion("ablum_cover between", value1, value2, "ablumCover");
            return (Criteria) this;
        }

        public Criteria andAblumCoverNotBetween(String value1, String value2) {
            addCriterion("ablum_cover not between", value1, value2, "ablumCover");
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