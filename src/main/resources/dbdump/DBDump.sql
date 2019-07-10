--
-- Table structure for table `driver`
--

DROP TABLE IF EXISTS `driver`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `driver` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) DEFAULT NULL,
  `second_name` varchar(255) DEFAULT NULL,
  `birth_day` date DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `drive_license_number` varchar(255) DEFAULT NULL,
  `patronymic` varchar(255) DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driver`
--

LOCK TABLES `driver` WRITE;
/*!40000 ALTER TABLE `driver` DISABLE KEYS */;
INSERT INTO `driver` VALUES
(1,'Lenia','22222','1996-01-06','Minsk','115566','ll','M'),
(21,'Misha','Novikau','2015-08-24','Minsk','115566','Andr','M'),
(22,'Misha','Novikau','2015-08-24','Minsk','115566','Andr','M'),
(28,'Сашка','ssss','1986-12-08','Minsk','123','yesy','M'),
(29,'Driver','ssss','1996-12-08','Minsk','123','yesy','M');
/*!40000 ALTER TABLE `driver` ENABLE KEYS */;
UNLOCK TABLES;