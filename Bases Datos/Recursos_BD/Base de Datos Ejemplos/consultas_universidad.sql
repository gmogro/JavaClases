use universidad;
/*Ejercicio 13*/
/*Todas las personas que tengan como valor 'M' en su atributo sexo */
SELECT * FROM persona where (sexo = 'M');
/*Todas las personas que tenagn como valor 'profesor' en su atributo tipo */
SELECT * FROM persona where (tipo = 'profesor');
/*Existe algun profesor hombre en la universidad ? */
SELECT * FROM persona where (sexo= "H" and tipo = 'profesor');
/*Cuantos son los alumnos Hombres en la universidad ? */
SELECT COUNT(*) cant FROM persona where (sexo= "H" and tipo = 'alumno');
/*Nombre de alumno/s que empieza con la letra 'J'*/
SELECT * FROM persona where nombre LIKE 'J%';
/*Cual es el numero de telefono de el registro de la tabla persona cuyo atributo nombre es 'Juan' y su atributo apellido1 es 'Saez'*/
SELECT telefono FROM persona WHERE (nombre = 'Juan' and apellido1 = 'Saez');
/*Ordenar alfabeticamente por apellido1 los alumnos*/
SELECT count(id), apellido1, nombre FROM persona WHERE (tipo = 'alumno') GROUP BY nombre ORDER BY apellido1;

/*Punto 14*/
/*Utilizando JOINS*/
/*Selecciona el nombre y apellido1 de las personas que son profesores*/
SELECT nombre, apellido1 FROM persona INNER JOIN profesor ON persona.id = profesor.id_profesor;

/*Menciona los Departamentos que tienen un profesor asignado*/
SELECT * FROM departamento;
SELECT nombre FROM departamento INNER JOIN profesor ON departamento.id = profesor.id_departamento;

/*Selecciona todas las Materias que tengan un profesr asignado*/
SELECT nombre FROM asignatura INNER JOIN profesor ON asignatura.id_profesor = profesor.id_profesor;
