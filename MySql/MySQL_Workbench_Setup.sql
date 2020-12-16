--Una vez que hayas conectado la base de datos, intenta las consultas 
--que necesitarías para hacer una aplicación CRUD (crear, leer, actualizar, eliminar). 
--En otras palabras, use los comandos SQL INSERT, SELECT, UPDATE y DELETE.




--insert--
insert into users( id,first_name,last_name,handle,birthday,created_at,updated_at)
value ( 'int','LUCI','CARBONADA','LOCURAS','2020-10-05', '00:00:00', '00:00:00')

--select--
select* FROM users

--update--
update users
set handle='carbonadaluci'
where id=1

-- DELETE --
delete from users
where handle ='carbonadaluci';

