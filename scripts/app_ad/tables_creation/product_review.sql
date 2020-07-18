CREATE TABLE `product_review` (
  `id` int NOT NULL AUTO_INCREMENT,
  `score` decimal(3,0) DEFAULT NULL,
  `comment` varchar(45) DEFAULT NULL,
  `username_writer` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_productReview_user_idx` (`username_writer`),
  CONSTRAINT `fk_productReview_user` FOREIGN KEY (`username_writer`) REFERENCES `user` (`username`)
) 