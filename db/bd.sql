CREATE DATABASE  IF NOT EXISTS farmacia_2018;
use farmacia_2018;
CREATE TABLE `tb_laboratorio` (
  `cod_lab` int(11) NOT NULL AUTO_INCREMENT,
  `des_lab` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cod_lab`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
CREATE TABLE `tb_medicamento` (
  `cod_med` int(11) NOT NULL AUTO_INCREMENT,
  `nom_med` varchar(50) DEFAULT NULL,
  `cod_lab` int(11) DEFAULT NULL,
  `stock_med` int(11) DEFAULT NULL,
  `pre_med` double DEFAULT NULL,
  `fec_ven_med` date DEFAULT NULL,
  PRIMARY KEY (`cod_med`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

ALTER TABLE tb_medicamento ADD constraint FK1 foreign key(COD_LAB) references tb_laboratorio(COD_LAB);

INSERT INTO `tb_laboratorio` VALUES (1,'ABABOR PHARMACEUTICALS, S.L.'),(2,'ABALON PHARMA, S.L.'),(3,'ABAMED PHARMA'),(4,'ABBOTT LABORATORIES, S.A.'),(5,'ABBVIE FARMACEUTICA, S.L.U.'),(6,'ABBVIE SPAIN, S.L.U.'),(7,'ABELLO LINDE'),(8,'ACCORD HEALTHCARE S.L.U.');
INSERT INTO `tb_medicamento` VALUES (1,'Aspirina',1,100,11.11,'2017-03-29'),(2,'Atenolol',1,54,152.65,'2018-03-25'),(3,'Atorvastatina',2,68,254.65,'2018-03-25'),
(4,'Atovacuona',3,47,248.85,'2018-03-25'),(5,'Salbutamol ',2,98,12.69,'2018-03-25'),(6,'Amlexanox',2,75,45.66,'2018-03-25');
