-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.12-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema titulacion
--

CREATE DATABASE IF NOT EXISTS titulacion;
USE titulacion;

--
-- Definition of table `alumno`
--

DROP TABLE IF EXISTS `alumno`;
CREATE TABLE `alumno` (
  `codigo_alumno` varchar(45) NOT NULL,
  `contra` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `correo` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `modalidad` varchar(45) NOT NULL,
  `ingreso` varchar(45) NOT NULL,
  `egreso` varchar(45) NOT NULL,
  `promedio` varchar(45) NOT NULL,
  `archivo` varchar(45) NOT NULL,
  `estado` varchar(45) DEFAULT NULL,
  `registro` varchar(45) NOT NULL,
  PRIMARY KEY (`codigo_alumno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `alumno`
--

/*!40000 ALTER TABLE `alumno` DISABLE KEYS */;
INSERT INTO `alumno` (`codigo_alumno`,`contra`,`nombre`,`correo`,`telefono`,`modalidad`,`ingreso`,`egreso`,`promedio`,`archivo`,`estado`,`registro`) VALUES 
 ('2020','123','jose','jose@hotmail.com','23456','promedio','02/11/2015','22/12/2015','100','archivo','Pendiente','2/12/2015'),
 ('23','scdsd','sdf','dani@hotmail.com','334','modo','','','34','archivo','Pendiente','2/12/2015'),
 ('8253','123','eduardo','skate2612@hotmail.com','11871258','tesis','16/11/2015','31/12/2015','80','archivo','Aceptado','2/12/2015');
/*!40000 ALTER TABLE `alumno` ENABLE KEYS */;


--
-- Definition of table `cuentas`
--

DROP TABLE IF EXISTS `cuentas`;
CREATE TABLE `cuentas` (
  `codigo_alumno` varchar(45) NOT NULL,
  `contra` varchar(45) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  PRIMARY KEY (`codigo_alumno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cuentas`
--

/*!40000 ALTER TABLE `cuentas` DISABLE KEYS */;
INSERT INTO `cuentas` (`codigo_alumno`,`contra`,`tipo`) VALUES 
 ('2020','123','usuario'),
 ('23','scdsd','usuario'),
 ('8253','123','usuario'),
 ('9090','123','administrador');
/*!40000 ALTER TABLE `cuentas` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
