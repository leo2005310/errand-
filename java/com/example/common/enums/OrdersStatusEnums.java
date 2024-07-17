package com.example.common.enums;

public enum OrdersStatusEnums {

    CANCEL("已取消"),
    NO_ACCEPT("待接单"),
    NO_ARRIVE("待送达"),
    NO_RECEIVE("待收货"),
    NO_COMMENT("待评价"),
    DONE("已完成"),
    ;

    OrdersStatusEnums(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}