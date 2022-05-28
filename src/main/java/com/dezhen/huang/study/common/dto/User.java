package com.dezhen.huang.study.common.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data

public class User {
    private String name;
    private Integer age;
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("11.00");
        System.out.println(bigDecimal.stripTrailingZeros());


    }


}
