<!--customr for login-->
CREATE TABLE `shabby`.`customer`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '核心id',
  `CNAME` varchar(15) CHARACTER SET UTF8 NOT NULL,
  `CPASSWORD` varchar(20) CHARACTER SET UTF8 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB CHARACTER SET = utf8;
<!--timestamp 在新版的mysql中，长度表示了精度，比如6表示精确到微妙-->
ALTER TABLE `shabby`.`customer`
ADD COLUMN `GRADE` int(1) NOT NULL COMMENT '0-root;\r\n1-manage;\r\n8-member;\r\n9-visitor.' AFTER `CPASSWORD`,
ADD COLUMN `CREATETIME` timestamp(6) NOT NULL AFTER `GRADE`,
ADD COLUMN `MODIFYTIME` timestamp(6) NOT NULL AFTER `CREATETIME`;



<!--customer's grade-->
<!--放弃，合并到customer表中
CREATE TABLE `shabby`.`customer_grade`  (
  `ID` int(10) NOT NULL,
  `GRADE` int(1) NULL,
  PRIMARY KEY (`ID`)
) ENGINE = InnoDB CHARACTER SET = utf8;
ALTER TABLE `shabby`.`customer_grade`
MODIFY COLUMN `GRADE` int(1) NULL DEFAULT NULL COMMENT '0-root\r\n1-manage\r\n8-member\r\n9-visitor' AFTER `ID`;-->

<!--customer info-->
CREATE TABLE `shabby`.`Untitled`  (
  `ID` int(10) NOT NULL,
  `CNAME` varchar(15) CHARACTER SET utf8 NOT NULL,
  `IDENTIFYTYPE` int(1) NULL COMMENT '0-身份证\r\n9-其他',
  `IDENTIFYDOC` varchar(40) NULL COMMENT '身份证件内容',
  `NOTIFYTYPE` int(1) NOT NULL COMMENT '0-固定电话；\r\n1-移动电话；\r\n2-QQ;\r\n3-微信；\r\n9-其他；',
  `NOTIFYDOC` varchar(30) NOT NULL,
  `ADDRESS` varchar(255) NULL,
  `PROTECTIONTYPE` int(2) NULL COMMENT '安全问题:\r\n0-姓名;\r\n1-父生日;\r\n2-母生日;\r\n9-最喜欢的颜色;\r\n其他问题待定，预计留两位数的问题',
  `PROTECTIONDOC` varchar(255) NULL,
  `CREATETIME` timestamp(6) NOT NULL,
  `MODIFYTIME` timestamp(6) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE = InnoDB CHARACTER SET = utf8;

ALTER TABLE `shabby`.`customer_info`
ADD COLUMN `NAME` varchar(40) NOT NULL COMMENT '名字，暂不考虑外国佬' AFTER `CNAME`,
ADD COLUMN `GENDER` int(1) NOT NULL COMMENT '1-男\r\n0-女\r\n' AFTER `NAME`,
ADD COLUMN `BIRTH` timestamp(6) NULL AFTER `GENDER`;