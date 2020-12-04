-- para conectar a mysql por la consola usamos
mysql -u root -p

--mostrar todas las bases de datos en el equipo
SHOW DATABASES;

-- crear una base de datos en mysql
CREATE DATABASE palma;

-- ELIMINAR UNA BASE DE DATOS (DANGER!!!!) (usar bajo su responsabilidad)
DROP DATABASE worl;

-- para poder usar una base de datos especifica en la consola
USE palma;

-- creacion de tabla dentro de la base datos PALMA
-- CREATE TABLE nombre_de_tabla();

CREATE TABLE persona(
    id INT,
    nombre VARCHAR(255),
    apellido VARCHAR(255)
);

-- para saber las tablas en mi base de datos
SHOW TABLES;

-- Eliminar una tabla de la base de datos DROP TABLE nombre_tabla
DROP TABLE persona;

CREATE TABLE personas(
    id INT,
    nombre VARCHAR(255),
    apellido VARCHAR(255)
);

-- INSERTAR REGISTROS
-- INSERT INTO nombre_tabla (columna1, columna2...) VALUES (valor1, valor2...);

INSERT INTO personas (id, nombre,apellido) VALUES (1, "alexis", "quezada");
INSERT INTO personas (id, nombre,apellido) VALUES (2, "isra", "palma");

-- Para saber la estructura de las columnas en una tabla
-- DESCRIBE nombre_tabla;
DESCRIBE personas;

-- CONSULTA DE REGISTROS (SELECT) (* todos)
-- SELECT * FROM nombre_tabla;
SELECT * FROM personas;

SELECT nombre FROM personas;
SELECT id, nombre FROM personas;--SELECT nombre,id FROM personas;

-- FILTRAR
SELECT * FROM personas 
WHERE id < 2
;
-- LIKE --> like '%le%'
SELECT * FROM personas 
WHERE nombre LIKE '%a%'; -- '%A%';
-- like 'a%'
SELECT * FROM personas 
WHERE nombre LIKE 'a%';

-- like '%a'
SELECT * FROM personas 
WHERE nombre LIKE '%a';

SELECT * FROM personas 
WHERE apellido LIKE '%alma';