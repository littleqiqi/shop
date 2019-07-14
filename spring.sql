/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : spring

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2019-07-14 16:09:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for administrator
-- ----------------------------
DROP TABLE IF EXISTS `administrator`;
CREATE TABLE `administrator` (
  `id` bigint(20) NOT NULL,
  `uname` char(50) DEFAULT NULL,
  `passwd` char(50) DEFAULT NULL,
  `power` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of administrator
-- ----------------------------
INSERT INTO `administrator` VALUES ('1', 'Juliet Ingram', '1582375754', '2');
INSERT INTO `administrator` VALUES ('2', 'David Payne', '1449381900', '2');
INSERT INTO `administrator` VALUES ('3', 'Carla Snow', '321460445', '2');
INSERT INTO `administrator` VALUES ('4', 'Nicholas Archer', '1216357967', '2');
INSERT INTO `administrator` VALUES ('5', 'Taylor Grant', '1907564960', '0');
INSERT INTO `administrator` VALUES ('6', 'Shannon Jeffery', '1399116808', '1');
INSERT INTO `administrator` VALUES ('7', 'Jasmine Niles', '1374101682', '0');
INSERT INTO `administrator` VALUES ('8', 'Luke Phillips', '1404941845', '2');
INSERT INTO `administrator` VALUES ('9', 'Jack Rivers', '691730459', '0');
INSERT INTO `administrator` VALUES ('10', 'Joseph Thomson', '416250224', '2');

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart` (
  `id` bigint(20) NOT NULL,
  `uid` bigint(20) DEFAULT NULL,
  `goods_id` bigint(20) DEFAULT NULL,
  `goods_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cart
-- ----------------------------

-- ----------------------------
-- Table structure for cata
-- ----------------------------
DROP TABLE IF EXISTS `cata`;
CREATE TABLE `cata` (
  `id` bigint(20) NOT NULL,
  `name` char(20) DEFAULT NULL,
  `tnum` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cata
-- ----------------------------

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` bigint(20) NOT NULL,
  `uname` char(50) DEFAULT NULL,
  `email` char(50) DEFAULT NULL,
  `passwd` char(50) DEFAULT NULL,
  `address` char(255) DEFAULT NULL,
  `balance` float DEFAULT NULL,
  `tel` char(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1', 'George Armstrong', 'George_Armstrong2@zorer.org', '663241633', 'Saint Paul', '509.33', '0-353-773-8878');
INSERT INTO `customer` VALUES ('2', 'Helen Mcnally', 'Helen_Mcnally2@naiker.biz', '914176031', 'Irving', '894.813', '8-611-651-2676');
INSERT INTO `customer` VALUES ('3', 'Abdul Mullins', 'Abdul_Mullins1@womeona.net', '302076836', 'Garland', '413.397', '5-024-585-3646');
INSERT INTO `customer` VALUES ('4', 'Adelaide Harrison', 'Adelaide_Harrison1@eirey.tech', '892350177', 'Madrid', '662.181', '5-120-008-6002');
INSERT INTO `customer` VALUES ('5', 'Daria Owen', 'Daria_Owen2@irrepsy.com', '392132430', 'Cincinnati', '588.817', '8-652-041-0771');
INSERT INTO `customer` VALUES ('6', 'Mary Farrant', 'Mary_Farrant2@typill.biz', '1621752975', 'Paris', '407.582', '0-836-118-1448');
INSERT INTO `customer` VALUES ('7', 'Kurt Thatcher', 'Kurt_Thatcher2@womeona.net', '414731993', 'Venice', '22.4979', '7-782-717-0660');
INSERT INTO `customer` VALUES ('8', 'Nicholas Grant', 'Nicholas_Grant1@joiniaa.com', '1633618476', 'Honolulu', '118.868', '5-042-753-7078');
INSERT INTO `customer` VALUES ('9', 'Cara Waterson', 'Cara_Waterson1@infotech44.tech', '1668312292', 'Stockton', '844.995', '3-847-451-7004');
INSERT INTO `customer` VALUES ('10', 'Rocco Reynolds', 'Rocco_Reynolds2@jiman.org', '1924180584', 'Phoenix', '372.228', '7-087-611-3241');
INSERT INTO `customer` VALUES ('11', 'Regina King', 'Regina_King2@grannar.com', '1131332628', 'Reno', '741.255', '3-468-330-0088');
INSERT INTO `customer` VALUES ('12', 'Madison Uttridge', 'Madison_Uttridge1@ovock.tech', '342273979', 'Saint Paul', '166.335', '4-755-815-6512');
INSERT INTO `customer` VALUES ('13', 'Jolene Harrington', 'Jolene_Harrington1@supunk.biz', '1737220320', 'Milwaukee', '436.314', '1-132-574-3826');
INSERT INTO `customer` VALUES ('14', 'Michael Woodley', 'Michael_Woodley2@extex.org', '1623825052', 'Denver', '979.249', '7-337-633-5777');
INSERT INTO `customer` VALUES ('15', 'Marilyn Egerton', 'Marilyn_Egerton1@joiniaa.com', '452887559', 'Washington', '989.131', '5-163-420-4312');
INSERT INTO `customer` VALUES ('16', 'Alison Nicholls', 'Alison_Nicholls2@bauros.biz', '1138094454', 'Columbus', '492.162', '4-850-377-6131');
INSERT INTO `customer` VALUES ('17', 'Chester Harvey', 'Chester_Harvey2@vetan.org', '1339195690', 'Lisbon', '305.478', '3-725-557-8235');
INSERT INTO `customer` VALUES ('18', 'Belinda Ring', 'Belinda_Ring2@womeona.net', '1417574977', 'Dallas', '929.668', '4-228-850-1581');
INSERT INTO `customer` VALUES ('19', 'Mark Baker', 'Mark_Baker2@muall.tech', '1655604280', 'Lyon', '529.821', '8-736-637-2181');
INSERT INTO `customer` VALUES ('20', 'Barney Collins', 'Barney_Collins1@cispeto.com', '9061733', 'Escondido', '617.925', '4-533-284-7000');
INSERT INTO `customer` VALUES ('21', 'Percy Terry', 'Percy_Terry2@ovock.tech', '1511553494', 'Omaha', '239.607', '7-705-715-5061');
INSERT INTO `customer` VALUES ('22', 'Molly Fisher', 'Molly_Fisher1@joiniaa.com', '694099616', 'Amarillo', '498.831', '7-021-757-8831');
INSERT INTO `customer` VALUES ('23', 'Bart Benson', 'Bart_Benson2@iatim.tech', '267804800', 'Houston', '649.059', '2-773-861-4732');
INSERT INTO `customer` VALUES ('24', 'Valentina Hill', 'Valentina_Hill2@cispeto.com', '1591254224', 'San Bernardino', '774.175', '3-565-512-3456');
INSERT INTO `customer` VALUES ('25', 'Adela Hogg', 'Adela_Hogg1@liret.org', '1169288827', 'Berlin', '259.196', '4-314-107-5231');
INSERT INTO `customer` VALUES ('26', 'Wendy Reading', 'Wendy_Reading2@atink.com', '1515172908', 'Denver', '771.719', '3-601-656-5764');
INSERT INTO `customer` VALUES ('27', 'Andrea Morgan', 'Andrea_Morgan1@kideod.biz', '1471350077', 'Paris', '529.48', '2-611-385-7687');
INSERT INTO `customer` VALUES ('28', 'Bridget Marshall', 'Bridget_Marshall2@bretoux.com', '1834413381', 'Lyon', '841.546', '3-264-751-3761');
INSERT INTO `customer` VALUES ('29', 'Rick Nanton', 'Rick_Nanton2@vetan.org', '877186419', 'New York', '786.793', '8-888-744-0686');
INSERT INTO `customer` VALUES ('30', 'Bryon Willis', 'Bryon_Willis1@bungar.biz', '218699767', 'Scottsdale', '321.782', '6-200-684-7111');
INSERT INTO `customer` VALUES ('31', 'Sonya Bell', 'Sonya_Bell1@acrit.org', '1356481185', 'San Antonio', '653.337', '1-167-875-5136');
INSERT INTO `customer` VALUES ('32', 'Ryan Dann', 'Ryan_Dann2@guentu.biz', '126584273', 'San Bernardino', '272.978', '0-584-621-2356');
INSERT INTO `customer` VALUES ('33', 'Eduardo Saunders', 'Eduardo_Saunders2@gompie.com', '1331837008', 'Bellevue', '42.9102', '2-757-417-2885');
INSERT INTO `customer` VALUES ('34', 'Maya Burnley', 'Maya_Burnley2@tonsy.org', '703634446', 'Laredo', '89.7139', '5-324-550-5340');
INSERT INTO `customer` VALUES ('35', 'Harvey Wheeler', 'Harvey_Wheeler1@bungar.biz', '1513360242', 'Fort Lauderdale', '13.6549', '4-823-015-2503');
INSERT INTO `customer` VALUES ('36', 'Alba Middleton', 'Alba_Middleton2@grannar.com', '680174541', 'Salt Lake City', '163.913', '0-274-776-1815');
INSERT INTO `customer` VALUES ('37', 'Marilyn Poole', 'Marilyn_Poole2@yahoo.com', '571024090', 'New York', '504.404', '8-782-065-4065');
INSERT INTO `customer` VALUES ('38', 'Chuck Campbell', 'Chuck_Campbell1@sveldo.biz', '1349931190', 'Moreno Valley', '505.195', '4-324-332-5068');
INSERT INTO `customer` VALUES ('39', 'Blake Riley', 'Blake_Riley1@bretoux.com', '1977247993', 'Murfreesboro', '518.174', '1-111-470-0704');
INSERT INTO `customer` VALUES ('40', 'Domenic Ellis', 'Domenic_Ellis2@grannar.com', '1854272258', 'Springfield', '893.666', '4-033-702-1138');
INSERT INTO `customer` VALUES ('41', 'Alan Henderson', 'Alan_Henderson1@bretoux.com', '2136348678', 'Toledo', '17.6337', '2-170-152-2835');
INSERT INTO `customer` VALUES ('42', 'Benjamin Tanner', 'Benjamin_Tanner1@sheye.org', '1514241732', 'Houston', '328.492', '5-773-180-0242');
INSERT INTO `customer` VALUES ('43', 'Lucas Brennan', 'Lucas_Brennan1@tonsy.org', '846177826', 'Louisville', '189.263', '6-827-708-3575');
INSERT INTO `customer` VALUES ('44', 'Cristal Thomson', 'Cristal_Thomson1@twipet.com', '123027813', 'Orlando', '844.257', '5-183-014-3438');
INSERT INTO `customer` VALUES ('45', 'Ruth Mcguire', 'Ruth_Mcguire2@grannar.com', '1566500980', 'Lincoln', '565.14', '8-634-866-7188');
INSERT INTO `customer` VALUES ('46', 'Ryan Morris', 'Ryan_Morris2@ovock.tech', '1516925374', 'Amarillo', '738.626', '4-581-718-6737');
INSERT INTO `customer` VALUES ('47', 'Cedrick Vallory', 'Cedrick_Vallory2@bauros.biz', '685447741', 'Chicago', '422.358', '4-514-327-5316');
INSERT INTO `customer` VALUES ('48', 'Ciara Stubbs', 'Ciara_Stubbs1@bauros.biz', '1290004999', 'Albuquerque', '667.743', '6-007-167-7577');
INSERT INTO `customer` VALUES ('49', 'Clint Richards', 'Clint_Richards2@kideod.biz', '340766006', 'Orlando', '806.574', '3-225-618-8081');
INSERT INTO `customer` VALUES ('50', 'Harvey Sylvester', 'Harvey_Sylvester1@cispeto.com', '1267811969', 'Seattle', '303.654', '3-804-220-8757');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` bigint(20) NOT NULL,
  `gname` char(50) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `inventory` int(11) DEFAULT NULL,
  `pic` char(255) DEFAULT NULL,
  `detail` longtext,
  `sale_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------

-- ----------------------------
-- Table structure for log
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log` (
  `id` bigint(20) NOT NULL,
  `date` datetime DEFAULT NULL,
  `ip` char(50) DEFAULT NULL,
  `uid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of log
-- ----------------------------

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` bigint(20) NOT NULL,
  `uid` bigint(20) DEFAULT NULL,
  `total` float DEFAULT NULL,
  `address` char(255) DEFAULT NULL,
  `tel` char(20) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `ispay` int(11) DEFAULT NULL,
  `location` char(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------

-- ----------------------------
-- Table structure for order_detail
-- ----------------------------
DROP TABLE IF EXISTS `order_detail`;
CREATE TABLE `order_detail` (
  `id` bigint(20) NOT NULL,
  `order_id` bigint(20) DEFAULT NULL,
  `goods_id` bigint(20) DEFAULT NULL,
  `inventory` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_detail
-- ----------------------------

-- ----------------------------
-- Table structure for statistics
-- ----------------------------
DROP TABLE IF EXISTS `statistics`;
CREATE TABLE `statistics` (
  `id` bigint(20) NOT NULL,
  `saloe` float DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of statistics
-- ----------------------------
