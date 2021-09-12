-- #电商交易场景建表语句

CREATE DATABASE if not exists `shop`;

--1.用户表
CREATE TABLE IF NOT EXISTS `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，用户id',
  `name` varchar(16) NOT NULL COMMENT '名称',
  `password` varchar(16) NOT NULL COMMENT '密码',
  `phone_number` varchar(15) NOT NULL COMMENT '手机号码',
  `identify_card` varchar(16) NOT NULL COMMENT '身份证',
  `account_balance` int(11) NOT NULL COMMENT '账户余额',
  `create_time` timestamp NOT NULL COMMENT '创建时间',
  `update_time` timestamp NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='用户表'

--2.店铺表
CREATE TABLE IF NOT EXISTS `t_store` (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，店铺id',
    `name` varchar(16) NOT NULL COMMENT '店铺名称',
    `introduce` varchar(1024) NOT NULL COMMENT '介绍',
    `create_time` timestamp NOT NULL COMMENT '创建时间',
    `update_time` timestamp NOT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='店铺表'

--3.商品表
CREATE TABLE IF NOT EXISTS `t_goods` (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，商店id',
    `name` varchar(16) NOT NULL COMMENT '商品名称',
    `description` varchar(1024) NOT NULL COMMENT '描述',
    `price` decimal(6,2) NOT NULL COMMENT '价格',
    `weight` int(11) NOT NULL COMMENT '重量',
    `store_id` int(11) NOT NULL COMMENT '所属店铺id',
    `store_name` varchar(16) NOT NULL COMMENT '所属店铺名称',
    `status` tinyint(1) NOT NULL COMMENT '商品状态，下架0，上架1，无货2',
    `create_time` timestamp NOT NULL COMMENT '创建时间',
    `update_time` timestamp NOT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`),
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='商品表'

--4.订单表
CREATE TABLE IF NOT EXISTS `t_orders` (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，订单id',
    `user_id` int(11) NOT NULL COMMENT '用户id',
    `goods_list` varchar(10024) NOT NULL COMMENT '商品列表',
    `order_status` tinyint(1) NOT NULL COMMENT '订单状态，待支付0，支付中1，已支付2',
    `deliver_status` tinyint(1) NOT NULL COMMENT '物流状态，待发货0，已发货1，已完成2',
    `total_price` decimal(6,2) NOT NULL COMMENT '总价',
    `create_time` timestamp NOT NULL COMMENT '创建时间',
    `update_time` timestamp NOT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`),
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='订单表'
