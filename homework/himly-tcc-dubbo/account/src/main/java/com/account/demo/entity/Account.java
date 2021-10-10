package com.account.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 实体：账户
 * @author peanutnowing
 */
@Data
public class Account implements Serializable {

    private Long id;

    private String name;

    private Long cny_wallet;

    private Long us_wallet;
}
