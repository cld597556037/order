DROP TABLE IF EXISTS `t_order`;
CREATE TABLE IF NOT EXISTS `t_order`(
   `order_id` BIGINT NOT NULL,
   `status` TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
   `ct_time` datetime NOT NULL COMMENT '创建时间',
   `mod_time` datetime NOT NULL COMMENT '创建时间',
   PRIMARY KEY ( `order_id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;