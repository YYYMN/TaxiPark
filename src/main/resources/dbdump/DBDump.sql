CREATE DATABASE taxipark;
USE taxipark;

DROP TABLE IF EXISTS `driver`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `driver`
(
  `id`                   int(11) NOT NULL AUTO_INCREMENT,
  `surname`              varchar(255) DEFAULT NULL,
  `name`                 varchar(255) DEFAULT NULL,
  `patronymic`           varchar(255) DEFAULT NULL,
  `birthday`             date         DEFAULT NULL,
  `sex`                  char(1)      DEFAULT NULL,
  `address`              varchar(255) DEFAULT NULL,
  `drive_license_number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE = MyISAM
  AUTO_INCREMENT = 30
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;



LOCK TABLES `driver` WRITE;
/*!40000 ALTER TABLE `driver`
  DISABLE KEYS */;
INSERT INTO `driver`
VALUES (1, 'Гладкевич', 'Иван', 'Иванович', '1998-07-09', 'М', 'г. Минск ', '15544789'),
       (2, 'Петров', 'Денис', 'Александрович', '1996-04-15', 'М', 'г. Минск', '26331548'),
       (3, 'Жнай', 'Максим', 'Викторович', '1969-04-22', 'М', 'г. Витебск', '48115478'),
       (4, 'Марков', 'Александр', 'Николаевич', '1979-11-05', 'М', 'г. Витебск', '66841125'),
       (5, 'Панин', 'Семен', 'Владимирович', '1984-10-25', 'М', 'г. Минск', '34117856'),
       (6, 'Акулич', 'Александра', 'Семеновна', '1996-04-11', 'Ж', 'г. Минск', '2211004'),
       (7, 'Макаров', 'Артем', 'Артемьевич', '1990-09-01', 'М', 'г. Брест', '10455646'),
       (8, 'Хвалей', 'Константин', 'Михайлович', '1994-09-01', 'М', 'г. Дзержинск', '01546845'),
       (9, 'Иванов', 'Сергей', 'Петрович', '1984-09-24', 'М', 'г. Бобруйск', '54684651'),
       (10, 'Шагинова', 'Екатерина', 'Игоревна', '1998-03-08', 'Ж', 'г. Минск', '44789546'),
       (11, 'Денисов', 'Сергей', 'Владимирович', '1988-07-15', 'М', 'г. Минск', '422315667');
/*!40000 ALTER TABLE `driver`
  ENABLE KEYS */;
UNLOCK TABLES;