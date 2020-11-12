package com.game.db.domain.example;

import com.game.db.domain.GoodsInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andReqLevelIsNull() {
            addCriterion("req_level is null");
            return (Criteria) this;
        }

        public Criteria andReqLevelIsNotNull() {
            addCriterion("req_level is not null");
            return (Criteria) this;
        }

        public Criteria andReqLevelEqualTo(Integer value) {
            addCriterion("req_level =", value, "reqLevel");
            return (Criteria) this;
        }

        public Criteria andReqLevelNotEqualTo(Integer value) {
            addCriterion("req_level <>", value, "reqLevel");
            return (Criteria) this;
        }

        public Criteria andReqLevelGreaterThan(Integer value) {
            addCriterion("req_level >", value, "reqLevel");
            return (Criteria) this;
        }

        public Criteria andReqLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("req_level >=", value, "reqLevel");
            return (Criteria) this;
        }

        public Criteria andReqLevelLessThan(Integer value) {
            addCriterion("req_level <", value, "reqLevel");
            return (Criteria) this;
        }

        public Criteria andReqLevelLessThanOrEqualTo(Integer value) {
            addCriterion("req_level <=", value, "reqLevel");
            return (Criteria) this;
        }

        public Criteria andReqLevelIn(List<Integer> values) {
            addCriterion("req_level in", values, "reqLevel");
            return (Criteria) this;
        }

        public Criteria andReqLevelNotIn(List<Integer> values) {
            addCriterion("req_level not in", values, "reqLevel");
            return (Criteria) this;
        }

        public Criteria andReqLevelBetween(Integer value1, Integer value2) {
            addCriterion("req_level between", value1, value2, "reqLevel");
            return (Criteria) this;
        }

        public Criteria andReqLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("req_level not between", value1, value2, "reqLevel");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIsNull() {
            addCriterion("equip_type is null");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIsNotNull() {
            addCriterion("equip_type is not null");
            return (Criteria) this;
        }

        public Criteria andEquipTypeEqualTo(Integer value) {
            addCriterion("equip_type =", value, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNotEqualTo(Integer value) {
            addCriterion("equip_type <>", value, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeGreaterThan(Integer value) {
            addCriterion("equip_type >", value, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("equip_type >=", value, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeLessThan(Integer value) {
            addCriterion("equip_type <", value, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeLessThanOrEqualTo(Integer value) {
            addCriterion("equip_type <=", value, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIn(List<Integer> values) {
            addCriterion("equip_type in", values, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNotIn(List<Integer> values) {
            addCriterion("equip_type not in", values, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeBetween(Integer value1, Integer value2) {
            addCriterion("equip_type between", value1, value2, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("equip_type not between", value1, value2, "equipType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNull() {
            addCriterion("item_type is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("item_type is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(Integer value) {
            addCriterion("item_type =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(Integer value) {
            addCriterion("item_type <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(Integer value) {
            addCriterion("item_type >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_type >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(Integer value) {
            addCriterion("item_type <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(Integer value) {
            addCriterion("item_type <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<Integer> values) {
            addCriterion("item_type in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<Integer> values) {
            addCriterion("item_type not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(Integer value1, Integer value2) {
            addCriterion("item_type between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("item_type not between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andAttribIsNull() {
            addCriterion("attrib is null");
            return (Criteria) this;
        }

        public Criteria andAttribIsNotNull() {
            addCriterion("attrib is not null");
            return (Criteria) this;
        }

        public Criteria andAttribEqualTo(Integer value) {
            addCriterion("attrib =", value, "attrib");
            return (Criteria) this;
        }

        public Criteria andAttribNotEqualTo(Integer value) {
            addCriterion("attrib <>", value, "attrib");
            return (Criteria) this;
        }

        public Criteria andAttribGreaterThan(Integer value) {
            addCriterion("attrib >", value, "attrib");
            return (Criteria) this;
        }

        public Criteria andAttribGreaterThanOrEqualTo(Integer value) {
            addCriterion("attrib >=", value, "attrib");
            return (Criteria) this;
        }

        public Criteria andAttribLessThan(Integer value) {
            addCriterion("attrib <", value, "attrib");
            return (Criteria) this;
        }

        public Criteria andAttribLessThanOrEqualTo(Integer value) {
            addCriterion("attrib <=", value, "attrib");
            return (Criteria) this;
        }

        public Criteria andAttribIn(List<Integer> values) {
            addCriterion("attrib in", values, "attrib");
            return (Criteria) this;
        }

        public Criteria andAttribNotIn(List<Integer> values) {
            addCriterion("attrib not in", values, "attrib");
            return (Criteria) this;
        }

        public Criteria andAttribBetween(Integer value1, Integer value2) {
            addCriterion("attrib between", value1, value2, "attrib");
            return (Criteria) this;
        }

        public Criteria andAttribNotBetween(Integer value1, Integer value2) {
            addCriterion("attrib not between", value1, value2, "attrib");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(Integer value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(Integer value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(Integer value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(Integer value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(Integer value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(Integer value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<Integer> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<Integer> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(Integer value1, Integer value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(Integer value1, Integer value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andMaxDurabilityIsNull() {
            addCriterion("max_durability is null");
            return (Criteria) this;
        }

        public Criteria andMaxDurabilityIsNotNull() {
            addCriterion("max_durability is not null");
            return (Criteria) this;
        }

        public Criteria andMaxDurabilityEqualTo(Integer value) {
            addCriterion("max_durability =", value, "maxDurability");
            return (Criteria) this;
        }

        public Criteria andMaxDurabilityNotEqualTo(Integer value) {
            addCriterion("max_durability <>", value, "maxDurability");
            return (Criteria) this;
        }

        public Criteria andMaxDurabilityGreaterThan(Integer value) {
            addCriterion("max_durability >", value, "maxDurability");
            return (Criteria) this;
        }

        public Criteria andMaxDurabilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_durability >=", value, "maxDurability");
            return (Criteria) this;
        }

        public Criteria andMaxDurabilityLessThan(Integer value) {
            addCriterion("max_durability <", value, "maxDurability");
            return (Criteria) this;
        }

        public Criteria andMaxDurabilityLessThanOrEqualTo(Integer value) {
            addCriterion("max_durability <=", value, "maxDurability");
            return (Criteria) this;
        }

        public Criteria andMaxDurabilityIn(List<Integer> values) {
            addCriterion("max_durability in", values, "maxDurability");
            return (Criteria) this;
        }

        public Criteria andMaxDurabilityNotIn(List<Integer> values) {
            addCriterion("max_durability not in", values, "maxDurability");
            return (Criteria) this;
        }

        public Criteria andMaxDurabilityBetween(Integer value1, Integer value2) {
            addCriterion("max_durability between", value1, value2, "maxDurability");
            return (Criteria) this;
        }

        public Criteria andMaxDurabilityNotBetween(Integer value1, Integer value2) {
            addCriterion("max_durability not between", value1, value2, "maxDurability");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("`value` is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("`value` is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(Integer value) {
            addCriterion("`value` =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(Integer value) {
            addCriterion("`value` <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(Integer value) {
            addCriterion("`value` >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("`value` >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(Integer value) {
            addCriterion("`value` <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(Integer value) {
            addCriterion("`value` <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<Integer> values) {
            addCriterion("`value` in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<Integer> values) {
            addCriterion("`value` not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(Integer value1, Integer value2) {
            addCriterion("`value` between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(Integer value1, Integer value2) {
            addCriterion("`value` not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andPolarIsNull() {
            addCriterion("polar is null");
            return (Criteria) this;
        }

        public Criteria andPolarIsNotNull() {
            addCriterion("polar is not null");
            return (Criteria) this;
        }

        public Criteria andPolarEqualTo(Integer value) {
            addCriterion("polar =", value, "polar");
            return (Criteria) this;
        }

        public Criteria andPolarNotEqualTo(Integer value) {
            addCriterion("polar <>", value, "polar");
            return (Criteria) this;
        }

        public Criteria andPolarGreaterThan(Integer value) {
            addCriterion("polar >", value, "polar");
            return (Criteria) this;
        }

        public Criteria andPolarGreaterThanOrEqualTo(Integer value) {
            addCriterion("polar >=", value, "polar");
            return (Criteria) this;
        }

        public Criteria andPolarLessThan(Integer value) {
            addCriterion("polar <", value, "polar");
            return (Criteria) this;
        }

        public Criteria andPolarLessThanOrEqualTo(Integer value) {
            addCriterion("polar <=", value, "polar");
            return (Criteria) this;
        }

        public Criteria andPolarIn(List<Integer> values) {
            addCriterion("polar in", values, "polar");
            return (Criteria) this;
        }

        public Criteria andPolarNotIn(List<Integer> values) {
            addCriterion("polar not in", values, "polar");
            return (Criteria) this;
        }

        public Criteria andPolarBetween(Integer value1, Integer value2) {
            addCriterion("polar between", value1, value2, "polar");
            return (Criteria) this;
        }

        public Criteria andPolarNotBetween(Integer value1, Integer value2) {
            addCriterion("polar not between", value1, value2, "polar");
            return (Criteria) this;
        }

        public Criteria andMagPowerIsNull() {
            addCriterion("mag_power is null");
            return (Criteria) this;
        }

        public Criteria andMagPowerIsNotNull() {
            addCriterion("mag_power is not null");
            return (Criteria) this;
        }

        public Criteria andMagPowerEqualTo(Integer value) {
            addCriterion("mag_power =", value, "magPower");
            return (Criteria) this;
        }

        public Criteria andMagPowerNotEqualTo(Integer value) {
            addCriterion("mag_power <>", value, "magPower");
            return (Criteria) this;
        }

        public Criteria andMagPowerGreaterThan(Integer value) {
            addCriterion("mag_power >", value, "magPower");
            return (Criteria) this;
        }

        public Criteria andMagPowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("mag_power >=", value, "magPower");
            return (Criteria) this;
        }

        public Criteria andMagPowerLessThan(Integer value) {
            addCriterion("mag_power <", value, "magPower");
            return (Criteria) this;
        }

        public Criteria andMagPowerLessThanOrEqualTo(Integer value) {
            addCriterion("mag_power <=", value, "magPower");
            return (Criteria) this;
        }

        public Criteria andMagPowerIn(List<Integer> values) {
            addCriterion("mag_power in", values, "magPower");
            return (Criteria) this;
        }

        public Criteria andMagPowerNotIn(List<Integer> values) {
            addCriterion("mag_power not in", values, "magPower");
            return (Criteria) this;
        }

        public Criteria andMagPowerBetween(Integer value1, Integer value2) {
            addCriterion("mag_power between", value1, value2, "magPower");
            return (Criteria) this;
        }

        public Criteria andMagPowerNotBetween(Integer value1, Integer value2) {
            addCriterion("mag_power not between", value1, value2, "magPower");
            return (Criteria) this;
        }

        public Criteria andPhyPowerIsNull() {
            addCriterion("phy_power is null");
            return (Criteria) this;
        }

        public Criteria andPhyPowerIsNotNull() {
            addCriterion("phy_power is not null");
            return (Criteria) this;
        }

        public Criteria andPhyPowerEqualTo(Integer value) {
            addCriterion("phy_power =", value, "phyPower");
            return (Criteria) this;
        }

        public Criteria andPhyPowerNotEqualTo(Integer value) {
            addCriterion("phy_power <>", value, "phyPower");
            return (Criteria) this;
        }

        public Criteria andPhyPowerGreaterThan(Integer value) {
            addCriterion("phy_power >", value, "phyPower");
            return (Criteria) this;
        }

        public Criteria andPhyPowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("phy_power >=", value, "phyPower");
            return (Criteria) this;
        }

        public Criteria andPhyPowerLessThan(Integer value) {
            addCriterion("phy_power <", value, "phyPower");
            return (Criteria) this;
        }

        public Criteria andPhyPowerLessThanOrEqualTo(Integer value) {
            addCriterion("phy_power <=", value, "phyPower");
            return (Criteria) this;
        }

        public Criteria andPhyPowerIn(List<Integer> values) {
            addCriterion("phy_power in", values, "phyPower");
            return (Criteria) this;
        }

        public Criteria andPhyPowerNotIn(List<Integer> values) {
            addCriterion("phy_power not in", values, "phyPower");
            return (Criteria) this;
        }

        public Criteria andPhyPowerBetween(Integer value1, Integer value2) {
            addCriterion("phy_power between", value1, value2, "phyPower");
            return (Criteria) this;
        }

        public Criteria andPhyPowerNotBetween(Integer value1, Integer value2) {
            addCriterion("phy_power not between", value1, value2, "phyPower");
            return (Criteria) this;
        }

        public Criteria andMaxLifeIsNull() {
            addCriterion("max_life is null");
            return (Criteria) this;
        }

        public Criteria andMaxLifeIsNotNull() {
            addCriterion("max_life is not null");
            return (Criteria) this;
        }

        public Criteria andMaxLifeEqualTo(Integer value) {
            addCriterion("max_life =", value, "maxLife");
            return (Criteria) this;
        }

        public Criteria andMaxLifeNotEqualTo(Integer value) {
            addCriterion("max_life <>", value, "maxLife");
            return (Criteria) this;
        }

        public Criteria andMaxLifeGreaterThan(Integer value) {
            addCriterion("max_life >", value, "maxLife");
            return (Criteria) this;
        }

        public Criteria andMaxLifeGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_life >=", value, "maxLife");
            return (Criteria) this;
        }

        public Criteria andMaxLifeLessThan(Integer value) {
            addCriterion("max_life <", value, "maxLife");
            return (Criteria) this;
        }

        public Criteria andMaxLifeLessThanOrEqualTo(Integer value) {
            addCriterion("max_life <=", value, "maxLife");
            return (Criteria) this;
        }

        public Criteria andMaxLifeIn(List<Integer> values) {
            addCriterion("max_life in", values, "maxLife");
            return (Criteria) this;
        }

        public Criteria andMaxLifeNotIn(List<Integer> values) {
            addCriterion("max_life not in", values, "maxLife");
            return (Criteria) this;
        }

        public Criteria andMaxLifeBetween(Integer value1, Integer value2) {
            addCriterion("max_life between", value1, value2, "maxLife");
            return (Criteria) this;
        }

        public Criteria andMaxLifeNotBetween(Integer value1, Integer value2) {
            addCriterion("max_life not between", value1, value2, "maxLife");
            return (Criteria) this;
        }

        public Criteria andMaxManaIsNull() {
            addCriterion("max_mana is null");
            return (Criteria) this;
        }

        public Criteria andMaxManaIsNotNull() {
            addCriterion("max_mana is not null");
            return (Criteria) this;
        }

        public Criteria andMaxManaEqualTo(Integer value) {
            addCriterion("max_mana =", value, "maxMana");
            return (Criteria) this;
        }

        public Criteria andMaxManaNotEqualTo(Integer value) {
            addCriterion("max_mana <>", value, "maxMana");
            return (Criteria) this;
        }

        public Criteria andMaxManaGreaterThan(Integer value) {
            addCriterion("max_mana >", value, "maxMana");
            return (Criteria) this;
        }

        public Criteria andMaxManaGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_mana >=", value, "maxMana");
            return (Criteria) this;
        }

        public Criteria andMaxManaLessThan(Integer value) {
            addCriterion("max_mana <", value, "maxMana");
            return (Criteria) this;
        }

        public Criteria andMaxManaLessThanOrEqualTo(Integer value) {
            addCriterion("max_mana <=", value, "maxMana");
            return (Criteria) this;
        }

        public Criteria andMaxManaIn(List<Integer> values) {
            addCriterion("max_mana in", values, "maxMana");
            return (Criteria) this;
        }

        public Criteria andMaxManaNotIn(List<Integer> values) {
            addCriterion("max_mana not in", values, "maxMana");
            return (Criteria) this;
        }

        public Criteria andMaxManaBetween(Integer value1, Integer value2) {
            addCriterion("max_mana between", value1, value2, "maxMana");
            return (Criteria) this;
        }

        public Criteria andMaxManaNotBetween(Integer value1, Integer value2) {
            addCriterion("max_mana not between", value1, value2, "maxMana");
            return (Criteria) this;
        }

        public Criteria andDefIsNull() {
            addCriterion("def is null");
            return (Criteria) this;
        }

        public Criteria andDefIsNotNull() {
            addCriterion("def is not null");
            return (Criteria) this;
        }

        public Criteria andDefEqualTo(Integer value) {
            addCriterion("def =", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefNotEqualTo(Integer value) {
            addCriterion("def <>", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefGreaterThan(Integer value) {
            addCriterion("def >", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefGreaterThanOrEqualTo(Integer value) {
            addCriterion("def >=", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefLessThan(Integer value) {
            addCriterion("def <", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefLessThanOrEqualTo(Integer value) {
            addCriterion("def <=", value, "def");
            return (Criteria) this;
        }

        public Criteria andDefIn(List<Integer> values) {
            addCriterion("def in", values, "def");
            return (Criteria) this;
        }

        public Criteria andDefNotIn(List<Integer> values) {
            addCriterion("def not in", values, "def");
            return (Criteria) this;
        }

        public Criteria andDefBetween(Integer value1, Integer value2) {
            addCriterion("def between", value1, value2, "def");
            return (Criteria) this;
        }

        public Criteria andDefNotBetween(Integer value1, Integer value2) {
            addCriterion("def not between", value1, value2, "def");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNull() {
            addCriterion("speed is null");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNotNull() {
            addCriterion("speed is not null");
            return (Criteria) this;
        }

        public Criteria andSpeedEqualTo(Integer value) {
            addCriterion("speed =", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotEqualTo(Integer value) {
            addCriterion("speed <>", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThan(Integer value) {
            addCriterion("speed >", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("speed >=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThan(Integer value) {
            addCriterion("speed <", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThanOrEqualTo(Integer value) {
            addCriterion("speed <=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedIn(List<Integer> values) {
            addCriterion("speed in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotIn(List<Integer> values) {
            addCriterion("speed not in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedBetween(Integer value1, Integer value2) {
            addCriterion("speed between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotBetween(Integer value1, Integer value2) {
            addCriterion("speed not between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andDoubleTypeIsNull() {
            addCriterion("double_type is null");
            return (Criteria) this;
        }

        public Criteria andDoubleTypeIsNotNull() {
            addCriterion("double_type is not null");
            return (Criteria) this;
        }

        public Criteria andDoubleTypeEqualTo(Integer value) {
            addCriterion("double_type =", value, "doubleType");
            return (Criteria) this;
        }

        public Criteria andDoubleTypeNotEqualTo(Integer value) {
            addCriterion("double_type <>", value, "doubleType");
            return (Criteria) this;
        }

        public Criteria andDoubleTypeGreaterThan(Integer value) {
            addCriterion("double_type >", value, "doubleType");
            return (Criteria) this;
        }

        public Criteria andDoubleTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("double_type >=", value, "doubleType");
            return (Criteria) this;
        }

        public Criteria andDoubleTypeLessThan(Integer value) {
            addCriterion("double_type <", value, "doubleType");
            return (Criteria) this;
        }

        public Criteria andDoubleTypeLessThanOrEqualTo(Integer value) {
            addCriterion("double_type <=", value, "doubleType");
            return (Criteria) this;
        }

        public Criteria andDoubleTypeIn(List<Integer> values) {
            addCriterion("double_type in", values, "doubleType");
            return (Criteria) this;
        }

        public Criteria andDoubleTypeNotIn(List<Integer> values) {
            addCriterion("double_type not in", values, "doubleType");
            return (Criteria) this;
        }

        public Criteria andDoubleTypeBetween(Integer value1, Integer value2) {
            addCriterion("double_type between", value1, value2, "doubleType");
            return (Criteria) this;
        }

        public Criteria andDoubleTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("double_type not between", value1, value2, "doubleType");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andLogicalDeleted(boolean deleted) {
            return deleted ? andDeletedEqualTo(GoodsInfo.Deleted.IS_DELETED.value()) : andDeletedNotEqualTo(GoodsInfo.Deleted.IS_DELETED.value());
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