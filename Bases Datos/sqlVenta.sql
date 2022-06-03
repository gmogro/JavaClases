CREATE TABLE Cliente
(
	id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
	direccion VARCHAR(50) NOT NULL,
	telefono VARCHAR(9),
	observacion VARCHAR(45)
);

CREATE TABLE Venta
(
	id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    fecha VARCHAR(30) NOT NULL,
	observacion VARCHAR(45),
    id_cliente INT,
    FOREIGN KEY (id_cliente) REFERENCES cliente(id)
);