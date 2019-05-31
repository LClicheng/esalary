/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.7.21 : Database - xuexiaogongzi
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`xuexiaogongzi` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `xuexiaogongzi`;

/*Table structure for table `account` */

DROP TABLE IF EXISTS `account`;

CREATE TABLE `account` (
  `username` varchar(10) DEFAULT NULL,
  `password` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `account` */

insert  into `account`(`username`,`password`) values ('lzh',111);

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `username` varchar(10) DEFAULT NULL,
  `password` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

insert  into `employee`(`username`,`password`) values ('lzh',123),('leocheck',1231),('leo',12311),('bill',111),('张一帆',222),('石磊',333),(' 你号',222),('leo11',111);

/*Table structure for table `grxx` */

DROP TABLE IF EXISTS `grxx`;

CREATE TABLE `grxx` (
  `id` varchar(10) DEFAULT NULL,
  `username` varchar(10) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `cardNumber` varchar(10) DEFAULT NULL,
  `nation` varchar(10) DEFAULT NULL,
  `birthday` varchar(10) DEFAULT NULL,
  `department` varchar(10) DEFAULT NULL,
  `positionName` varchar(10) DEFAULT NULL,
  `telephone` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `editTime` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `grxx` */

insert  into `grxx`(`id`,`username`,`sex`,`cardNumber`,`nation`,`birthday`,`department`,`positionName`,`telephone`,`email`,`editTime`) values ('1001','bill','女','2014000','汉族','19960501','人事部','经理','21323','23232@qq.com','20180608'),('1002','张一帆','男','001','汉族','1996年12月1日','后勤部','经理','232323','232323@qq.com','20180610'),('1003','张三','男','002','朝鲜族','1996年5月6月','教科办','助手','23121323','199788@123.com','20180610'),('1004','李四','女','003','满族','20180610','会计部','秘书','232323232','132@222.com','20180610');

/*Table structure for table `hr` */

DROP TABLE IF EXISTS `hr`;

CREATE TABLE `hr` (
  `username` varchar(10) DEFAULT NULL,
  `password` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `hr` */

insert  into `hr`(`username`,`password`) values ('lzh',222);

/*Table structure for table `qdb` */

DROP TABLE IF EXISTS `qdb`;

CREATE TABLE `qdb` (
  `id` varchar(20) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `department` varchar(20) DEFAULT NULL,
  `year` varchar(20) DEFAULT NULL,
  `month` varchar(20) DEFAULT NULL,
  `get` varchar(20) DEFAULT NULL,
  `lost` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `qdb` */

insert  into `qdb`(`id`,`username`,`department`,`year`,`month`,`get`,`lost`) values ('001','张一帆','后勤部','2018年','5月','30','1'),('2','石磊','财务部','2018年','5','28','3');

/*Table structure for table `salary` */

DROP TABLE IF EXISTS `salary`;

CREATE TABLE `salary` (
  `id` varchar(20) DEFAULT NULL,
  `username` varchar(10) DEFAULT NULL,
  `year` varchar(10) DEFAULT NULL,
  `month` varchar(10) DEFAULT NULL,
  `basic` varchar(10) DEFAULT NULL,
  `overtime` varchar(10) DEFAULT NULL,
  `reward` varchar(10) DEFAULT NULL,
  `reduce` varchar(10) DEFAULT NULL,
  `revenue` varchar(200) DEFAULT NULL,
  `realWage` varchar(10) DEFAULT NULL,
  `edittime` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `salary` */

insert  into `salary`(`id`,`username`,`year`,`month`,`basic`,`overtime`,`reward`,`reduce`,`revenue`,`realWage`,`edittime`) values ('1004','leo','2018','4','8000','500','500','0','500','8500','20180419'),('1005','bill','2018','5','5000','500','500','500','500','5000','20180609');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
