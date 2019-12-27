package com.lgq.domain;

import java.util.ArrayList;
import java.util.List;

public class SiteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SiteExample() {
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

        public Criteria andSiteIdIsNull() {
            addCriterion("site_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("site_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(Integer value) {
            addCriterion("site_id =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(Integer value) {
            addCriterion("site_id <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(Integer value) {
            addCriterion("site_id >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("site_id >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(Integer value) {
            addCriterion("site_id <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(Integer value) {
            addCriterion("site_id <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<Integer> values) {
            addCriterion("site_id in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<Integer> values) {
            addCriterion("site_id not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(Integer value1, Integer value2) {
            addCriterion("site_id between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("site_id not between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteTitileIsNull() {
            addCriterion("site_titile is null");
            return (Criteria) this;
        }

        public Criteria andSiteTitileIsNotNull() {
            addCriterion("site_titile is not null");
            return (Criteria) this;
        }

        public Criteria andSiteTitileEqualTo(String value) {
            addCriterion("site_titile =", value, "siteTitile");
            return (Criteria) this;
        }

        public Criteria andSiteTitileNotEqualTo(String value) {
            addCriterion("site_titile <>", value, "siteTitile");
            return (Criteria) this;
        }

        public Criteria andSiteTitileGreaterThan(String value) {
            addCriterion("site_titile >", value, "siteTitile");
            return (Criteria) this;
        }

        public Criteria andSiteTitileGreaterThanOrEqualTo(String value) {
            addCriterion("site_titile >=", value, "siteTitile");
            return (Criteria) this;
        }

        public Criteria andSiteTitileLessThan(String value) {
            addCriterion("site_titile <", value, "siteTitile");
            return (Criteria) this;
        }

        public Criteria andSiteTitileLessThanOrEqualTo(String value) {
            addCriterion("site_titile <=", value, "siteTitile");
            return (Criteria) this;
        }

        public Criteria andSiteTitileLike(String value) {
            addCriterion("site_titile like", value, "siteTitile");
            return (Criteria) this;
        }

        public Criteria andSiteTitileNotLike(String value) {
            addCriterion("site_titile not like", value, "siteTitile");
            return (Criteria) this;
        }

        public Criteria andSiteTitileIn(List<String> values) {
            addCriterion("site_titile in", values, "siteTitile");
            return (Criteria) this;
        }

        public Criteria andSiteTitileNotIn(List<String> values) {
            addCriterion("site_titile not in", values, "siteTitile");
            return (Criteria) this;
        }

        public Criteria andSiteTitileBetween(String value1, String value2) {
            addCriterion("site_titile between", value1, value2, "siteTitile");
            return (Criteria) this;
        }

        public Criteria andSiteTitileNotBetween(String value1, String value2) {
            addCriterion("site_titile not between", value1, value2, "siteTitile");
            return (Criteria) this;
        }

        public Criteria andSiteSubtitleIsNull() {
            addCriterion("site_subtitle is null");
            return (Criteria) this;
        }

        public Criteria andSiteSubtitleIsNotNull() {
            addCriterion("site_subtitle is not null");
            return (Criteria) this;
        }

        public Criteria andSiteSubtitleEqualTo(String value) {
            addCriterion("site_subtitle =", value, "siteSubtitle");
            return (Criteria) this;
        }

        public Criteria andSiteSubtitleNotEqualTo(String value) {
            addCriterion("site_subtitle <>", value, "siteSubtitle");
            return (Criteria) this;
        }

        public Criteria andSiteSubtitleGreaterThan(String value) {
            addCriterion("site_subtitle >", value, "siteSubtitle");
            return (Criteria) this;
        }

        public Criteria andSiteSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("site_subtitle >=", value, "siteSubtitle");
            return (Criteria) this;
        }

        public Criteria andSiteSubtitleLessThan(String value) {
            addCriterion("site_subtitle <", value, "siteSubtitle");
            return (Criteria) this;
        }

        public Criteria andSiteSubtitleLessThanOrEqualTo(String value) {
            addCriterion("site_subtitle <=", value, "siteSubtitle");
            return (Criteria) this;
        }

        public Criteria andSiteSubtitleLike(String value) {
            addCriterion("site_subtitle like", value, "siteSubtitle");
            return (Criteria) this;
        }

        public Criteria andSiteSubtitleNotLike(String value) {
            addCriterion("site_subtitle not like", value, "siteSubtitle");
            return (Criteria) this;
        }

        public Criteria andSiteSubtitleIn(List<String> values) {
            addCriterion("site_subtitle in", values, "siteSubtitle");
            return (Criteria) this;
        }

        public Criteria andSiteSubtitleNotIn(List<String> values) {
            addCriterion("site_subtitle not in", values, "siteSubtitle");
            return (Criteria) this;
        }

        public Criteria andSiteSubtitleBetween(String value1, String value2) {
            addCriterion("site_subtitle between", value1, value2, "siteSubtitle");
            return (Criteria) this;
        }

        public Criteria andSiteSubtitleNotBetween(String value1, String value2) {
            addCriterion("site_subtitle not between", value1, value2, "siteSubtitle");
            return (Criteria) this;
        }

        public Criteria andSiteDescriptionIsNull() {
            addCriterion("site_description is null");
            return (Criteria) this;
        }

        public Criteria andSiteDescriptionIsNotNull() {
            addCriterion("site_description is not null");
            return (Criteria) this;
        }

        public Criteria andSiteDescriptionEqualTo(String value) {
            addCriterion("site_description =", value, "siteDescription");
            return (Criteria) this;
        }

        public Criteria andSiteDescriptionNotEqualTo(String value) {
            addCriterion("site_description <>", value, "siteDescription");
            return (Criteria) this;
        }

        public Criteria andSiteDescriptionGreaterThan(String value) {
            addCriterion("site_description >", value, "siteDescription");
            return (Criteria) this;
        }

        public Criteria andSiteDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("site_description >=", value, "siteDescription");
            return (Criteria) this;
        }

        public Criteria andSiteDescriptionLessThan(String value) {
            addCriterion("site_description <", value, "siteDescription");
            return (Criteria) this;
        }

        public Criteria andSiteDescriptionLessThanOrEqualTo(String value) {
            addCriterion("site_description <=", value, "siteDescription");
            return (Criteria) this;
        }

        public Criteria andSiteDescriptionLike(String value) {
            addCriterion("site_description like", value, "siteDescription");
            return (Criteria) this;
        }

        public Criteria andSiteDescriptionNotLike(String value) {
            addCriterion("site_description not like", value, "siteDescription");
            return (Criteria) this;
        }

        public Criteria andSiteDescriptionIn(List<String> values) {
            addCriterion("site_description in", values, "siteDescription");
            return (Criteria) this;
        }

        public Criteria andSiteDescriptionNotIn(List<String> values) {
            addCriterion("site_description not in", values, "siteDescription");
            return (Criteria) this;
        }

        public Criteria andSiteDescriptionBetween(String value1, String value2) {
            addCriterion("site_description between", value1, value2, "siteDescription");
            return (Criteria) this;
        }

        public Criteria andSiteDescriptionNotBetween(String value1, String value2) {
            addCriterion("site_description not between", value1, value2, "siteDescription");
            return (Criteria) this;
        }

        public Criteria andSiteLogoIsNull() {
            addCriterion("site_logo is null");
            return (Criteria) this;
        }

        public Criteria andSiteLogoIsNotNull() {
            addCriterion("site_logo is not null");
            return (Criteria) this;
        }

        public Criteria andSiteLogoEqualTo(String value) {
            addCriterion("site_logo =", value, "siteLogo");
            return (Criteria) this;
        }

        public Criteria andSiteLogoNotEqualTo(String value) {
            addCriterion("site_logo <>", value, "siteLogo");
            return (Criteria) this;
        }

        public Criteria andSiteLogoGreaterThan(String value) {
            addCriterion("site_logo >", value, "siteLogo");
            return (Criteria) this;
        }

        public Criteria andSiteLogoGreaterThanOrEqualTo(String value) {
            addCriterion("site_logo >=", value, "siteLogo");
            return (Criteria) this;
        }

        public Criteria andSiteLogoLessThan(String value) {
            addCriterion("site_logo <", value, "siteLogo");
            return (Criteria) this;
        }

        public Criteria andSiteLogoLessThanOrEqualTo(String value) {
            addCriterion("site_logo <=", value, "siteLogo");
            return (Criteria) this;
        }

        public Criteria andSiteLogoLike(String value) {
            addCriterion("site_logo like", value, "siteLogo");
            return (Criteria) this;
        }

        public Criteria andSiteLogoNotLike(String value) {
            addCriterion("site_logo not like", value, "siteLogo");
            return (Criteria) this;
        }

        public Criteria andSiteLogoIn(List<String> values) {
            addCriterion("site_logo in", values, "siteLogo");
            return (Criteria) this;
        }

        public Criteria andSiteLogoNotIn(List<String> values) {
            addCriterion("site_logo not in", values, "siteLogo");
            return (Criteria) this;
        }

        public Criteria andSiteLogoBetween(String value1, String value2) {
            addCriterion("site_logo between", value1, value2, "siteLogo");
            return (Criteria) this;
        }

        public Criteria andSiteLogoNotBetween(String value1, String value2) {
            addCriterion("site_logo not between", value1, value2, "siteLogo");
            return (Criteria) this;
        }

        public Criteria andSiteAvatarIsNull() {
            addCriterion("site_avatar is null");
            return (Criteria) this;
        }

        public Criteria andSiteAvatarIsNotNull() {
            addCriterion("site_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andSiteAvatarEqualTo(String value) {
            addCriterion("site_avatar =", value, "siteAvatar");
            return (Criteria) this;
        }

        public Criteria andSiteAvatarNotEqualTo(String value) {
            addCriterion("site_avatar <>", value, "siteAvatar");
            return (Criteria) this;
        }

        public Criteria andSiteAvatarGreaterThan(String value) {
            addCriterion("site_avatar >", value, "siteAvatar");
            return (Criteria) this;
        }

        public Criteria andSiteAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("site_avatar >=", value, "siteAvatar");
            return (Criteria) this;
        }

        public Criteria andSiteAvatarLessThan(String value) {
            addCriterion("site_avatar <", value, "siteAvatar");
            return (Criteria) this;
        }

        public Criteria andSiteAvatarLessThanOrEqualTo(String value) {
            addCriterion("site_avatar <=", value, "siteAvatar");
            return (Criteria) this;
        }

        public Criteria andSiteAvatarLike(String value) {
            addCriterion("site_avatar like", value, "siteAvatar");
            return (Criteria) this;
        }

        public Criteria andSiteAvatarNotLike(String value) {
            addCriterion("site_avatar not like", value, "siteAvatar");
            return (Criteria) this;
        }

        public Criteria andSiteAvatarIn(List<String> values) {
            addCriterion("site_avatar in", values, "siteAvatar");
            return (Criteria) this;
        }

        public Criteria andSiteAvatarNotIn(List<String> values) {
            addCriterion("site_avatar not in", values, "siteAvatar");
            return (Criteria) this;
        }

        public Criteria andSiteAvatarBetween(String value1, String value2) {
            addCriterion("site_avatar between", value1, value2, "siteAvatar");
            return (Criteria) this;
        }

        public Criteria andSiteAvatarNotBetween(String value1, String value2) {
            addCriterion("site_avatar not between", value1, value2, "siteAvatar");
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