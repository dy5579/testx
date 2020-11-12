package com.game.db.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class GoodsInfo {
    public static final Boolean IS_DELETED = Deleted.IS_DELETED.value();

    public static final Boolean NOT_DELETED = Deleted.NOT_DELETED.value();

    private Integer id;

    private Integer reqLevel;

    private Integer type;

    private Integer equipType;

    private Integer itemType;

    private Integer attrib;

    private Integer icon;

    private String name;

    private String color;

    private String unit;

    private Integer maxDurability;

    private Integer value;

    private Integer gender;

    private Integer polar;

    private Integer magPower;

    private Integer phyPower;

    private Integer maxLife;

    private Integer maxMana;

    private Integer def;

    private Integer speed;

    private Integer doubleType;

    private Date addTime;

    private Date updateTime;

    private Boolean deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReqLevel() {
        return reqLevel;
    }

    public void setReqLevel(Integer reqLevel) {
        this.reqLevel = reqLevel;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getEquipType() {
        return equipType;
    }

    public void setEquipType(Integer equipType) {
        this.equipType = equipType;
    }

    public Integer getItemType() {
        return itemType;
    }

    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    public Integer getAttrib() {
        return attrib;
    }

    public void setAttrib(Integer attrib) {
        this.attrib = attrib;
    }

    public Integer getIcon() {
        return icon;
    }

    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Integer getMaxDurability() {
        return maxDurability;
    }

    public void setMaxDurability(Integer maxDurability) {
        this.maxDurability = maxDurability;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getPolar() {
        return polar;
    }

    public void setPolar(Integer polar) {
        this.polar = polar;
    }

    public Integer getMagPower() {
        return magPower;
    }

    public void setMagPower(Integer magPower) {
        this.magPower = magPower;
    }

    public Integer getPhyPower() {
        return phyPower;
    }

    public void setPhyPower(Integer phyPower) {
        this.phyPower = phyPower;
    }

    public Integer getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(Integer maxLife) {
        this.maxLife = maxLife;
    }

    public Integer getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(Integer maxMana) {
        this.maxMana = maxMana;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getDoubleType() {
        return doubleType;
    }

    public void setDoubleType(Integer doubleType) {
        this.doubleType = doubleType;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? Deleted.IS_DELETED.value() : Deleted.NOT_DELETED.value());
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public static GoodsInfo.Builder builder() {
        return new GoodsInfo.Builder();
    }

    public static class Builder {
        private GoodsInfo obj;

        public Builder() {
            this.obj = new GoodsInfo();
        }

        public Builder id(Integer id) {
            obj.setId(id);
            return this;
        }

        public Builder reqLevel(Integer reqLevel) {
            obj.setReqLevel(reqLevel);
            return this;
        }

        public Builder type(Integer type) {
            obj.setType(type);
            return this;
        }

        public Builder equipType(Integer equipType) {
            obj.setEquipType(equipType);
            return this;
        }

        public Builder itemType(Integer itemType) {
            obj.setItemType(itemType);
            return this;
        }

        public Builder attrib(Integer attrib) {
            obj.setAttrib(attrib);
            return this;
        }

        public Builder icon(Integer icon) {
            obj.setIcon(icon);
            return this;
        }

        public Builder name(String name) {
            obj.setName(name);
            return this;
        }

        public Builder color(String color) {
            obj.setColor(color);
            return this;
        }

        public Builder unit(String unit) {
            obj.setUnit(unit);
            return this;
        }

        public Builder maxDurability(Integer maxDurability) {
            obj.setMaxDurability(maxDurability);
            return this;
        }

        public Builder value(Integer value) {
            obj.setValue(value);
            return this;
        }

        public Builder gender(Integer gender) {
            obj.setGender(gender);
            return this;
        }

        public Builder polar(Integer polar) {
            obj.setPolar(polar);
            return this;
        }

        public Builder magPower(Integer magPower) {
            obj.setMagPower(magPower);
            return this;
        }

        public Builder phyPower(Integer phyPower) {
            obj.setPhyPower(phyPower);
            return this;
        }

        public Builder maxLife(Integer maxLife) {
            obj.setMaxLife(maxLife);
            return this;
        }

        public Builder maxMana(Integer maxMana) {
            obj.setMaxMana(maxMana);
            return this;
        }

        public Builder def(Integer def) {
            obj.setDef(def);
            return this;
        }

        public Builder speed(Integer speed) {
            obj.setSpeed(speed);
            return this;
        }

        public Builder doubleType(Integer doubleType) {
            obj.setDoubleType(doubleType);
            return this;
        }

        public Builder addTime(Date addTime) {
            obj.setAddTime(addTime);
            return this;
        }

        public Builder updateTime(Date updateTime) {
            obj.setUpdateTime(updateTime);
            return this;
        }

        public Builder deleted(Boolean deleted) {
            obj.setDeleted(deleted);
            return this;
        }

        public GoodsInfo build() {
            return this.obj;
        }
    }

    public enum Deleted {
        NOT_DELETED(new Boolean("0"), "未删除"),
        IS_DELETED(new Boolean("1"), "已删除");

        private final Boolean value;

        private final String name;

        Deleted(Boolean value, String name) {
            this.value = value;
            this.name = name;
        }

        public Boolean getValue() {
            return this.value;
        }

        public Boolean value() {
            return this.value;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        reqLevel("req_level", "reqLevel", "INTEGER", false),
        type("type", "type", "INTEGER", true),
        equipType("equip_type", "equipType", "INTEGER", false),
        itemType("item_type", "itemType", "INTEGER", false),
        attrib("attrib", "attrib", "INTEGER", false),
        icon("icon", "icon", "INTEGER", false),
        name("name", "name", "VARCHAR", true),
        color("color", "color", "VARCHAR", false),
        unit("unit", "unit", "VARCHAR", false),
        maxDurability("max_durability", "maxDurability", "INTEGER", false),
        value("value", "value", "INTEGER", true),
        gender("gender", "gender", "INTEGER", false),
        polar("polar", "polar", "INTEGER", false),
        magPower("mag_power", "magPower", "INTEGER", false),
        phyPower("phy_power", "phyPower", "INTEGER", false),
        maxLife("max_life", "maxLife", "INTEGER", false),
        maxMana("max_mana", "maxMana", "INTEGER", false),
        def("def", "def", "INTEGER", false),
        speed("speed", "speed", "INTEGER", false),
        doubleType("double_type", "doubleType", "INTEGER", false),
        addTime("add_time", "addTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        deleted("deleted", "deleted", "BIT", false);

        private static final String BEGINNING_DELIMITER = "`";

        private static final String ENDING_DELIMITER = "`";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public static Column[] all() {
            return Column.values();
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}