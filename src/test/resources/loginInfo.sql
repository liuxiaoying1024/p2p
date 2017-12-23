--删除表
	DROP FROM t_loginInfo;
--创建表
  CREATE TABLE `t_logininfo` (
  `lid` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(32) DEFAULT NULL,
  `password` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`lid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
--测试数据
	INSERT INTO `t_logininfo`('lid','username','password') VALUES (1,'user1', '123456');
	
--事务提交
	COMMIT;	