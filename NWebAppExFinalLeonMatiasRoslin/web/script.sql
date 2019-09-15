-- creamos la base de datos
create database cibertec;

-- creamos las tablas
CREATE TABLE `documentos` (
  `iddocumento` int(11) NOT NULL AUTO_INCREMENT,
  `tipodocumento` varchar(15) DEFAULT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`iddocumento`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Agregamos tipos de documentos a usar
INSERT INTO cibertec.documentos (tipodocumento,descripcion) values ('DNI','DNI'),('RUC','RUC'),('PAS','PASAPORTE');


CREATE TABLE `personas` (
  `idpersona` int(11) NOT NULL AUTO_INCREMENT,
  `iddocumento` int(11) DEFAULT NULL,
  `nombres` varchar(100) DEFAULT NULL,
  `apellidos` varchar(100) DEFAULT NULL,
  `edad` varchar(100) DEFAULT NULL,
  `sexo` varchar(5) DEFAULT NULL,
  `numdocumento` varchar(20) NOT NULL,
  PRIMARY KEY (`idpersona`),
  KEY `personas_fk` (`iddocumento`),
  CONSTRAINT `personas_fk` FOREIGN KEY (`iddocumento`) REFERENCES `documentos` (`iddocumento`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

INSERT INTO cibertec.personas (iddocumento,nombres,apellidos,edad,sexo,numdocumento) VALUES 
(1,'Roslin','Leon Matias','25 ','M','89564872')
,(1,'alfredo','ramirez smith','55 ','M','51542335')
,(1,'Jasmin','Obispo solis','23 ','F','78545326')
,(1,'ricardo','perez garcia','45 ','M','21563689')
,(1,'giovana','ferreyros montana','38 ','F','23567823')
,(1,'pedro','chavez riva','58 ','M','02158426')
,(1,'Roslin Pineda','LEON MATIAS','25','M','47512042')
,(1,'Roslin Pineda','matias','25','M','47512042')
,(1,'Roslin Pineda','matias','25','M','47512042')
,(1,'Roslin Pineda','matias','25','M','47512042')
;
INSERT INTO cibertec.personas (iddocumento,nombres,apellidos,edad,sexo,numdocumento) VALUES 
(1,'giovana','loja fernandez','20','F','12457889')
,(1,'chapatin','del ocho','85','M','36985214');

-- creamos la tabla de usuarios

CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `idpersona` int(11) DEFAULT NULL,
  `usuario` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `perfil` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idusuario`),
  KEY `usuario_fk` (`idpersona`),
  CONSTRAINT `usuario_fk` FOREIGN KEY (`idpersona`) REFERENCES `personas` (`idpersona`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

INSERT INTO cibertec.usuario (idpersona,usuario,password,perfil) VALUES 
(1,'rleon','1234','ADMIN')
,(2,'doc01','1234','doc')
,(3,'user01','1234','user')
,(4,'doc02','1234','doc')
,(5,'doc03','1234','doc')
,(6,'doc04','1234','doc');



CREATE TABLE `pacientes` (
  `idpaciente` int(11) NOT NULL AUTO_INCREMENT,
  `idpersona` int(11) DEFAULT NULL,
  `diagnostico` varchar(300) DEFAULT NULL,
  `estado` int(11) DEFAULT '0',
  PRIMARY KEY (`idpaciente`),
  KEY `pacientes_fk` (`idpersona`),
  CONSTRAINT `pacientes_fk` FOREIGN KEY (`idpersona`) REFERENCES `personas` (`idpersona`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1

INSERT INTO cibertec.pacientes (idpersona,diagnostico) VALUES 
(10,'sano')
,(3,'Gastritis Leve')
,(15,'sana');

CREATE TABLE `doctores` (
  `iddoctor` int(11) NOT NULL AUTO_INCREMENT,
  `idpersona` int(11) DEFAULT NULL,
  `especialidad` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`iddoctor`),
  KEY `doctores_fk` (`idpersona`),
  CONSTRAINT `doctores_fk` FOREIGN KEY (`idpersona`) REFERENCES `personas` (`idpersona`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

INSERT INTO cibertec.doctores (idpersona,especialidad) VALUES 
(4,'Inmunologa')
,(5,'Pediatra')
,(6,'gastroenterologia')
,(16,'neurologo');


