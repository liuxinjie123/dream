package com.dream.representation.common;

public enum EnumCommonString {
    ;

    public String name;

    EnumCommonString() {
    }

    EnumCommonString(String name) {
        this.name = name;
    }

    public static final String LocalDate_Pattern = "yyyy-MM-dd";
    public static final String LocalDateTime_Pattern = "yyyy-MM-dd HH:mm:ss";
    public static final String GMT_8 = "GMT+8";
}
