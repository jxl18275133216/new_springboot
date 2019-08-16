CREATE TABLE `shabby`.`user`  (
  `ID` int(4) NOT NULL COMMENT ''主键，各个表主要使用ID互相关联'',
  `GRADE` int(1) NULL COMMENT ''0-root;1-manager;8-member;9-visitor'',
  `USERNAME` varchar(15) CHARACTER SET utf8 NOT NULL COMMENT ''可重复'',
  `USERPWD` varchar(20) CHARACTER SET utf8 NOT NULL,
  `CREATETIME` timestamp(6) NULL,
  PRIMARY KEY (`ID`)
) ENGINE = InnoDB CHARACTER SET = utf8;