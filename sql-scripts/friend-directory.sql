CREATE DATABASE  IF NOT EXISTS `friend_directory`;
USE `friend_directory`;

--
-- Table structure for table `friend`
--

DROP TABLE IF EXISTS `friend`;

CREATE TABLE `friend` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `balance` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `friend`
--

INSERT INTO `employee` VALUES 
	(1,'Leslie','Andrews','leslie@luv2code.com', 23.45),
	(2,'Emma','Baumgarten','emma@luv2code.com', 143.43),
	(3,'Avani','Gupta','avani@luv2code.com', 12.34),
	(4,'Yuri','Petrov','yuri@luv2code.com', 34.54),
	(5,'Juan','Vega','juan@luv2code.com', 234.34);

