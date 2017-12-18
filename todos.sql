/*
Navicat MySQL Data Transfer

Source Server         : mysql5.7.20
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : todos

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2017-12-18 17:20:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for todo
-- ----------------------------
DROP TABLE IF EXISTS `todo`;
CREATE TABLE `todo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `action` varchar(255) DEFAULT NULL,
  `finished` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of todo
-- ----------------------------
INSERT INTO `todo` VALUES ('1', 'reading', '0');
INSERT INTO `todo` VALUES ('2', 'watching', '1');
INSERT INTO `todo` VALUES ('3', 'fishing', '0');
INSERT INTO `todo` VALUES ('4', 'basketball', '1');
INSERT INTO `todo` VALUES ('5', 'film', '0');
INSERT INTO `todo` VALUES ('14', 'ddd', '0');
INSERT INTO `todo` VALUES ('15', 'eee', '0');
INSERT INTO `todo` VALUES ('16', 'fff', '0');
INSERT INTO `todo` VALUES ('17', 'ddd', '0');
SET FOREIGN_KEY_CHECKS=1;
