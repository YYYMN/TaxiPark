CREATE DATABASE taxipark;
USE taxipark;

DROP TABLE IF EXISTS `driver`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
SET character_set_client = utf8mb4;
CREATE TABLE `driver`
(
  id                    int(11) NOT NULL AUTO_INCREMENT,
  `surname`              varchar(255) DEFAULT NULL,
  `name`                 varchar(255) DEFAULT NULL,
  `patronymic`           varchar(255) DEFAULT NULL,
  `birthday`             date         DEFAULT NULL,
  `sex`                  char(1)      DEFAULT NULL,
  `address`              varchar(255) DEFAULT NULL,
  `drive_license_number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE = MyISAM;


LOCK TABLES `driver` WRITE;
/*!40000 ALTER TABLE `driver`
  DISABLE KEYS */;
INSERT INTO `driver`
VALUES (1, 'Markov', 'Ivan', 'Ivanovich', '1998-07-09', 'M', 'Minsk', '15544789'),
       (2, 'Petrov', 'Denis', 'Alekseevich', '1996-04-15', 'M', 'Minsk', '26331548'),
       (3, 'Jnai', 'Maksim', 'Viktorovich', '1969-04-22', 'M', 'Vitebsk', '48115478'),
       (4, 'Akulich', 'Aleksandr', 'Nikolaevich', '1979-11-05', 'M', 'Vitebsk', '66841125'),
       (5, 'Petrova', 'Anna', 'Semenovna','1987-10-15', 'F', 'Minsk', '125554687' ),
       (6, 'Panin', 'Semen', 'Vladimirovich', '1984-10-25', 'M', 'Minsk', '34117856');
/*!40000 ALTER TABLE `driver`
  ENABLE KEYS */;
UNLOCK TABLES;