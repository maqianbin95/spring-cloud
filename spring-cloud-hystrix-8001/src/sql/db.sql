
CREATE DATABASE `dept01` ;

USE `dept01`;

DROP TABLE IF EXISTS `dept`;

CREATE TABLE `dept` (
  `dept_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL,
  `db_source` varchar(30) NOT NULL,
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

insert  into `dept`(`dept_id`,`name`,`db_source`) values (1,'develop','dept01'),(2,'design','dept01'),(3,'sail','dept01');

