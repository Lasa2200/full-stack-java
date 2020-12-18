--creacion de tabla--
CREATE TABLE --nombre_de_tabla ();--

CREATE TABLE personas(
    id INT,
    nombre VARCHAR(255),
    apellido VARCHAR (255)
);
-- para saber las tablas que hay en mi base de datos--
 show tables,
 -- eliminar una tabla dentro de la base de datos--
 DROP TABLE nombre_tabla

 --INSERTAR REGISTROs insert into nombre_tabla(columna1,columna2,...) value (valor1,valor2,...)
 insert into personas ( id,nombre,apellido) value (1,"alexis", "quezada");
  insert into personas ( id,nombre,apellido) value (1,"lisbeth", "soto");

  --CONSULTA DE REGISTROS (SELECT) (*TODOS)--
  -- SELECT * FROM nombre_tabla;
  select *from personas

  --FILTRAR--
SELECT * FROM personas;
WHERE  id 2
WHERE  ID <2
;

--LIKE-- LIKE "%le%"--
SELECT * FROM  personas;
WHERE nombre LIKE "%a%"