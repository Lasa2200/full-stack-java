
 -- Intenta las consultas que necesitarías para hacer una aplicación CRUD (crear, leer, actualizar, eliminar). En otras palabras, use los comandos SQL INSERT, SELECT, UPDATE y DELETE.

--INSERT , Se insertaran dos registros nuevos con id, nombre y apellido

INSERT personas (id,nombre, apellido)
VALUES (4,'Puranprem', 'singh');
SELECT * from personas;


INSERT personas (id,nombre, apellido) 
VALUES (4,'Puranprem', 'singh');



--SELECT,

SELECT nombre
FROM personas
WHERE id = 4;

--UPDATE
UPDATE personas 
SET apellido ='saldaña' where id=1

--DELETE, 
DELETE FROM personas 
WHERE Id=1;