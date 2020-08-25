/*
Navicat MySQL Data Transfer

Source Server         : my
Source Server Version : 50627
Source Host           : 127.0.0.1:3306
Source Database       : zgdb

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2020-08-25 14:35:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ordes
-- ----------------------------
DROP TABLE IF EXISTS `ordes`;
CREATE TABLE `ordes` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `OrderDate` date DEFAULT NULL,
  `OrderPrice` int(128) DEFAULT NULL,
  `Customer` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of ordes
-- ----------------------------
INSERT INTO `ordes` VALUES ('1', '2008-12-29', '1000', 'Bush');
INSERT INTO `ordes` VALUES ('2', '2008-11-23', '1600', 'Carter');
INSERT INTO `ordes` VALUES ('3', '2008-10-05', '700', 'Bush');
INSERT INTO `ordes` VALUES ('4', '2008-09-28', '300', 'Bush');
INSERT INTO `ordes` VALUES ('5', '2008-08-06', '2000', 'Adams');
INSERT INTO `ordes` VALUES ('6', '2008-07-21', '100', 'Carter');
