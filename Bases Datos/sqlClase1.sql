DROP DATABASE IF EXISTS universidad;
CREATE DATABASE universidad CHARACTER SET utf8mb4;
USE universidad;

CREATE TABLE departamento(
	id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100)
);

INSERT INTO departamento VALUES (1,'INFORMATICA');
INSERT INTO departamento VALUES (2,'FISICA');

SELECT id,nombre FROM departamento WHERE id = 1;
/*id INT (PK)
nif VARCHAR(9)
nombre VARCHAR(25)
apellido1 VARCHAR(50)
apellido2 VARCHAR(50)
ciudad VARCHAR(25)
direccion VARCHAR(50)
telefono VARCHAR(9)
fecha_nacimiento DATE
sexo ENUM('H', 'M')
tipo ENUM('profesor', 'alumno')*/

CREATE TABLE persona
(
	id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	nif VARCHAR(9) NOT NULL,
    nombre VARCHAR(30) NOT NULL,
    apellido1 VARCHAR(30) NOT NULL,
    apellido2 VARCHAR(30),
    ciudad VARCHAR(25),
	direccion VARCHAR(50) NOT NULL,
	telefono VARCHAR(9),
	fecha_nacimiento DATE,
    sexo ENUM('H', 'M') NOT NULL,
	tipo ENUM('profesor', 'alumno') NOT NULL
);
/*profesor
id_profesor INT (PK)
id_departamento INT
id_profesor(FK) ---> persona(id)
id_departamento(FK) ---> departamento(id)*/

CREATE TABLE profesor(
	id_profesor INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    id_departamento INT UNSIGNED,
    FOREIGN KEY (id_departamento) REFERENCES departamento(id),
    FOREIGN KEY (id_profesor) references persona(id)
);

-- -----------------------------------------------------
-- Table `mydb`.`grado`
-- -----------------------------------------------------
 CREATE TABLE grado (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
  );

CREATE TABLE asignatura (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    creditos FLOAT UNSIGNED NOT NULL,
    tipo ENUM('básica', 'obligatoria', 'optativa') NOT NULL,
    curso TINYINT UNSIGNED NOT NULL,
    cuatrimestre TINYINT UNSIGNED NOT NULL,
    id_profesor INT UNSIGNED,
    id_grado INT UNSIGNED NOT NULL,
    FOREIGN KEY(id_profesor) REFERENCES profesor(id_profesor),
    FOREIGN KEY(id_grado) REFERENCES grado(id)
  );
 
CREATE TABLE curso_escolar (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    anyo_inicio YEAR NOT NULL,
    anyo_fin YEAR NOT NULL
  );

CREATE TABLE alumno_se_matricula_asignatura (
    id_alumno INT UNSIGNED NOT NULL,
    id_asignatura INT UNSIGNED NOT NULL,
    id_curso_escolar INT UNSIGNED NOT NULL,
    PRIMARY KEY (id_alumno, id_asignatura, id_curso_escolar),
    FOREIGN KEY (id_alumno) REFERENCES persona(id),
    FOREIGN KEY (id_asignatura) REFERENCES asignatura(id),
    FOREIGN KEY (id_curso_escolar) REFERENCES curso_escolar(id)
  );

/*otra manera de crear table profesor*/
CREATE TABLE profesor(
	id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	id_persona INT UNSIGNED,
    id_departamento INT UNSIGNED,
    FOREIGN KEY (id_departamento) REFERENCES departamento(id),
    FOREIGN KEY (id_persona) REFERENCES persona(id)
);

INSERT INTO departamento VALUES (1,'INFORMATICA');
INSERT INTO departamento VALUES (2,'FISICA');
INSERT INTO departamento VALUES (3, 'Matemáticas');
INSERT INTO departamento VALUES (4, 'Economía y Empresa');
INSERT INTO departamento VALUES (5, 'Educación');
INSERT INTO departamento VALUES (6, 'Agronomía');
INSERT INTO departamento VALUES (7, 'Química y Física');
INSERT INTO departamento VALUES (8, 'Filología');
INSERT INTO departamento VALUES (9, 'Derecho');
INSERT INTO departamento VALUES (10, 'Biología y Geología');
INSERT INTO departamento VALUES (11,'Ingenieria');
select * FROM departamento;

INSERT INTO persona VALUES (1, '26902806M', 'Salvador', 'Sánchez', 'Pérez', 'Almería', 'C/ Real del barrio alto', '950254837', '1991/03/28', 'H', 'alumno');
INSERT INTO persona VALUES (2, '89542419S', 'Juan', 'Saez', 'Vega', 'Almería', 'C/ Mercurio', '618253876', '1992/08/08', 'H', 'alumno');
INSERT INTO persona VALUES (3, '11105554G', 'Zoe', 'Ramirez', 'Gea', 'Almería', 'C/ Marte', '618223876', '1979/08/19', 'M', 'profesor');
INSERT INTO persona VALUES (4, '17105885A', 'Pedro', 'Heller', 'Pagac', 'Almería', 'C/ Estrella fugaz', NULL, '2000/10/05', 'H', 'alumno');
INSERT INTO persona VALUES (5, '38223286T', 'David', 'Schmidt', 'Fisher', 'Almería', 'C/ Venus', '678516294', '1978/01/19', 'H', 'profesor');
INSERT INTO persona VALUES (6, '04233869Y', 'José', 'Koss', 'Bayer', 'Almería', 'C/ Júpiter', '628349590', '1998/01/28', 'H', 'alumno');
INSERT INTO persona VALUES (7, '97258166K', 'Ismael', 'Strosin', 'Turcotte', 'Almería', 'C/ Neptuno', NULL, '1999/05/24', 'H', 'alumno');
INSERT INTO persona VALUES (8, '79503962T', 'Cristina', 'Lemke', 'Rutherford', 'Almería', 'C/ Saturno', '669162534', '1977/08/21', 'M', 'profesor');
INSERT INTO persona VALUES (9, '82842571K', 'Ramón', 'Herzog', 'Tremblay', 'Almería', 'C/ Urano', '626351429', '1996/11/21', 'H', 'alumno');
INSERT INTO persona VALUES (10, '61142000L', 'Esther', 'Spencer', 'Lakin', 'Almería', 'C/ Plutón', NULL, '1977/05/19', 'M', 'profesor');

Select * FROM persona where sexo = 'M';
Select * FROM persona where tipo = 'profesor';

Select count(id) FROM persona where tipo = 'alumno' and sexo = 'H';

Select * FROM persona where fecha_nacimiento BETWEEN '1990-01-01' AND '2010-01-01';

Select * FROM persona where fecha_nacimiento > '1990-01-01' OR fecha_nacimiento <'2010-01-01';



INSERT INTO profesor VALUES (3, 1);
INSERT INTO profesor VALUES (5, 2);
INSERT INTO profesor VALUES (8, 3);
INSERT INTO profesor VALUES (10, 4);


select p.id_profesor,per.nombre,p.id_departamento,d.nombre AS Departamento from profesor AS p 
INNER JOIN departamento AS d ON p.id_departamento = d.id
INNER JOIN persona AS per ON p.id_profesor = per.id


