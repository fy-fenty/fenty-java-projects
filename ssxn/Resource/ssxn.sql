-- MySQL dump 10.13  Distrib 5.6.10, for Win32 (x86)
--
-- Host: localhost    Database: ssxn
-- ------------------------------------------------------
-- Server version	5.6.10

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `clientchoose`
--

DROP TABLE IF EXISTS `clientchoose`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientchoose` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `addPicNum` int(11) DEFAULT NULL,
  `alreadyAdvice` bit(1) DEFAULT NULL,
  `balance` float DEFAULT NULL,
  `chooseDate` datetime DEFAULT NULL,
  `chooseOutlets` varchar(255) DEFAULT NULL,
  `endProduct` varchar(255) DEFAULT NULL,
  `lastPicNum` int(11) DEFAULT NULL,
  `laterMoney` float DEFAULT NULL,
  `originalPicNum` int(11) DEFAULT NULL,
  `repairIng` bit(1) DEFAULT NULL,
  `sendDate` datetime DEFAULT NULL,
  `serviceComment` varchar(255) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientchoose`
--

LOCK TABLES `clientchoose` WRITE;
/*!40000 ALTER TABLE `clientchoose` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientchoose` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientlook`
--

DROP TABLE IF EXISTS `clientlook`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientlook` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `adviceFirst` varchar(255) DEFAULT NULL,
  `adviceSecond` varchar(255) DEFAULT NULL,
  `adviceThirdly` varchar(255) DEFAULT NULL,
  `alreadyAdvice` bit(1) DEFAULT NULL,
  `changeRequire` varchar(255) DEFAULT NULL,
  `designIng` bit(1) DEFAULT NULL,
  `lookDate` datetime DEFAULT NULL,
  `sendDate` datetime DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientlook`
--

LOCK TABLES `clientlook` WRITE;
/*!40000 ALTER TABLE `clientlook` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientlook` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientsend`
--

DROP TABLE IF EXISTS `clientsend`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientsend` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `adviceOn` varchar(255) DEFAULT NULL,
  `adviceTh` varchar(255) DEFAULT NULL,
  `adviceTw` varchar(255) DEFAULT NULL,
  `alreadyAdvice` bit(1) DEFAULT NULL,
  `alreadySure` bit(1) DEFAULT NULL,
  `clientAlreadyGet` varchar(255) DEFAULT NULL,
  `clientContentOnToday` varchar(255) DEFAULT NULL,
  `clientGetAllOnDate` datetime DEFAULT NULL,
  `clientGetTime` datetime DEFAULT NULL,
  `oweProduct` varchar(255) DEFAULT NULL,
  `returnTimes` varchar(255) DEFAULT NULL,
  `sendDate` datetime DEFAULT NULL,
  `sendFactoryContent` varchar(255) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientsend`
--

LOCK TABLES `clientsend` WRITE;
/*!40000 ALTER TABLE `clientsend` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientsend` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientshoot`
--

DROP TABLE IF EXISTS `clientshoot`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientshoot` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `cameramanComment` varchar(255) DEFAULT NULL,
  `cameramanEvaluate` varchar(255) DEFAULT NULL,
  `cosmeticConsum` varchar(255) DEFAULT NULL,
  `dresserComment` varchar(255) DEFAULT NULL,
  `dresserEvaluate` varchar(255) DEFAULT NULL,
  `shootDate` datetime DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientshoot`
--

LOCK TABLES `clientshoot` WRITE;
/*!40000 ALTER TABLE `clientshoot` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientshoot` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contact`
--

DROP TABLE IF EXISTS `contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contact` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `addr` varchar(255) DEFAULT NULL,
  `mbi` int(11) DEFAULT NULL,
  `mr` bit(1) DEFAULT NULL,
  `pro` varchar(255) DEFAULT NULL,
  `qq` int(11) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact`
--

LOCK TABLES `contact` WRITE;
/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `identity`
--

DROP TABLE IF EXISTS `identity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `identity` (
  `iid` int(11) NOT NULL AUTO_INCREMENT,
  `iname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`iid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `identity`
--

LOCK TABLES `identity` WRITE;
/*!40000 ALTER TABLE `identity` DISABLE KEYS */;
/*!40000 ALTER TABLE `identity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `member` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `mno` varchar(255) DEFAULT NULL,
  `mscore` double DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `morder`
--

DROP TABLE IF EXISTS `morder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `morder` (
  `oid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `brideConsultant` int(11) DEFAULT NULL,
  `brideConsultantEvaluateForClient` varchar(255) DEFAULT NULL,
  `choicenessPic` varchar(255) DEFAULT NULL,
  `frontMoney` float DEFAULT NULL,
  `frontMoneyDate` datetime DEFAULT NULL,
  `innerShooting` varchar(255) DEFAULT NULL,
  `marryServiceForDay` varchar(255) DEFAULT NULL,
  `outShooting` varchar(255) DEFAULT NULL,
  `productContent` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `setMealPrice` float DEFAULT NULL,
  `shootDress` varchar(255) DEFAULT NULL,
  `spareMoney` float DEFAULT NULL,
  `spareMoneyDate` datetime DEFAULT NULL,
  `totalityServiceForClient` varchar(255) DEFAULT NULL,
  `weddingDay` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `morder`
--

LOCK TABLES `morder` WRITE;
/*!40000 ALTER TABLE `morder` DISABLE KEYS */;
INSERT INTO `morder` VALUES (1,1,1,'1','1',1,'2013-04-09 21:45:25','1','1','1','1','1',1,'1',1,'2013-04-09 21:45:12','1','1'),(2,2,2,'2','2',2,'2013-04-09 21:45:37','2','2','2','2','2',2,'2',2,'2013-04-09 21:45:45','2','2'),(3,3,3,'3','3',3,'2013-04-09 21:45:53','3','3','3','3','3',3,'3',3,'2013-04-09 21:46:00','3','3'),(4,4,4,'4','4',4,'2013-04-09 21:46:18','4','4','4','4','4',4,'4',4,'2013-04-09 21:46:25','4','4');
/*!40000 ALTER TABLE `morder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `muser`
--

DROP TABLE IF EXISTS `muser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `muser` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(255) DEFAULT NULL,
  `upwd` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `muser`
--

LOCK TABLES `muser` WRITE;
/*!40000 ALTER TABLE `muser` DISABLE KEYS */;
INSERT INTO `muser` VALUES (1,'admin','admin'),(2,'employee','employee'),(3,'member','member'),(4,'anonymous','anonymous');
/*!40000 ALTER TABLE `muser` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-04-09 23:20:40
