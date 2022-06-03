/*Punto 2*/
DROP DATABASE IF EXISTS universidad;
CREATE DATABASE universidad CHARACTER SET utf8mb4;
USE universidad;
/*Punto 3*/
CREATE TABLE departamento (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);

CREATE TABLE persona (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nif VARCHAR(9) UNIQUE,
    nombre VARCHAR(25) NOT NULL,
    apellido1 VARCHAR(50) NOT NULL,
    apellido2 VARCHAR(50),
    ciudad VARCHAR(25) NOT NULL,
    direccion VARCHAR(50) NOT NULL,
    telefono VARCHAR(9),
    fecha_nacimiento DATE NOT NULL,
    sexo ENUM('H', 'M') NOT NULL,
    tipo ENUM('profesor', 'alumno') NOT NULL
);
 
CREATE TABLE profesor (
    id_profesor INT UNSIGNED PRIMARY KEY,
    id_departamento INT UNSIGNED NOT NULL,
    FOREIGN KEY (id_profesor) REFERENCES persona(id),
    FOREIGN KEY (id_departamento) REFERENCES departamento(id)
);
 
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
 
 /*Punto 4*/
 
 /* Departamento */
INSERT INTO departamento VALUES (1, 'Informática');
INSERT INTO departamento VALUES (2, 'Matemáticas');
INSERT INTO departamento VALUES (3, 'Economía y Empresa');
INSERT INTO departamento VALUES (4, 'Educación');
INSERT INTO departamento VALUES (5, 'Agronomía');
INSERT INTO departamento VALUES (6, 'Química y Física');
INSERT INTO departamento VALUES (7, 'Filología');
INSERT INTO departamento VALUES (8, 'Derecho');
INSERT INTO departamento VALUES (9, 'Biología y Geología');
 
 
 /*Punto 5*/
 /* Persona */
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

/*Punto 6*/ 
/* Profesor */
INSERT INTO profesor VALUES (3, 1);
INSERT INTO profesor VALUES (5, 2);
INSERT INTO profesor VALUES (8, 3);
INSERT INTO profesor VALUES (10, 4);
 
 /*Punto 7*/
 /* Grado */
INSERT INTO grado VALUES (1, 'Grado en Ingeniería Agrícola (Plan 2015)');
INSERT INTO grado VALUES (2, 'Grado en Ingeniería Eléctrica (Plan 2014)');
INSERT INTO grado VALUES (3, 'Grado en Ingeniería Electrónica Industrial (Plan 2010)');
INSERT INTO grado VALUES (4, 'Grado en Ingeniería Informática (Plan 2015)');
INSERT INTO grado VALUES (5, 'Grado en Ingeniería Mecánica (Plan 2010)');
INSERT INTO grado VALUES (6, 'Grado en Ingeniería Química Industrial (Plan 2010)');
INSERT INTO grado VALUES (7, 'Grado en Biotecnología (Plan 2015)');
INSERT INTO grado VALUES (8, 'Grado en Ciencias Ambientales (Plan 2009)');
INSERT INTO grado VALUES (9, 'Grado en Matemáticas (Plan 2010)');
INSERT INTO grado VALUES (10, 'Grado en Química (Plan 2009)');
 
/*Punto 8*/
/* Asignatura */
INSERT INTO asignatura VALUES (1, 'Álgegra lineal y matemática discreta', 6, 'básica', 1, 1, 3, 4);
INSERT INTO asignatura VALUES (2, 'Cálculo', 6, 'básica', 1, 1, 5, 4);
INSERT INTO asignatura VALUES (3, 'Física para informática', 6, 'básica', 1, 1, 3, 4);
INSERT INTO asignatura VALUES (4, 'Introducción a la programación', 6, 'básica', 1, 1, 8, 4);
INSERT INTO asignatura VALUES (5, 'Organización y gestión de empresas', 6, 'básica', 1, 1, 10, 4);
INSERT INTO asignatura VALUES (6, 'Estadística', 6, 'básica', 1, 2, 3, 4);
INSERT INTO asignatura VALUES (7, 'Estructura y tecnología de computadores', 6, 'básica', 1, 2, 5, 4);
INSERT INTO asignatura VALUES (8, 'Fundamentos de electrónica', 6, 'básica', 1, 2, 8, 4);
INSERT INTO asignatura VALUES (9, 'Lógica y algorítmica', 6, 'básica', 1, 2, 8, 4);
INSERT INTO asignatura VALUES (10, 'Metodología de la programación', 6, 'básica', 1, 2, 10, 4);


/*Punto 9*/
/* Curso escolar */
INSERT INTO curso_escolar VALUES (1, 2014, 2015);
INSERT INTO curso_escolar VALUES (2, 2015, 2016);
INSERT INTO curso_escolar VALUES (3, 2016, 2017);
INSERT INTO curso_escolar VALUES (4, 2017, 2018);
INSERT INTO curso_escolar VALUES (5, 2018, 2019);


/*Punto 10*/
/* Alumno se matricula en asignatura */
INSERT INTO alumno_se_matricula_asignatura VALUES (1, 1, 1);
INSERT INTO alumno_se_matricula_asignatura VALUES (1, 2, 1);
INSERT INTO alumno_se_matricula_asignatura VALUES (2, 3, 1);
INSERT INTO alumno_se_matricula_asignatura VALUES (2, 4, 2);
INSERT INTO alumno_se_matricula_asignatura VALUES (4, 5, 2);
INSERT INTO alumno_se_matricula_asignatura VALUES (5, 6, 2);
INSERT INTO alumno_se_matricula_asignatura VALUES (6, 7, 3);
INSERT INTO alumno_se_matricula_asignatura VALUES (6, 8, 3);
INSERT INTO alumno_se_matricula_asignatura VALUES (7, 9, 4);
INSERT INTO alumno_se_matricula_asignatura VALUES (6, 10, 4);
INSERT INTO alumno_se_matricula_asignatura VALUES (9, 1, 4);
INSERT INTO alumno_se_matricula_asignatura VALUES (9, 2, 5);
INSERT INTO alumno_se_matricula_asignatura VALUES (10, 3, 5);
INSERT INTO alumno_se_matricula_asignatura VALUES (10, 4, 5);