--Usando el siguiente ERD como referencia, escribe una consulta SQL 
--que devuelva una lista de usuarios junto con los nombres de sus amigos.
SELECT users.first_name, users.last_name, user2.first_name AS friends_first_name, user2.last_name AS friends_last_name
FROM users
LEFT JOIN friendships ON users.id = friendships.user_id -- usuarios
LEFT JOIN users as user2 ON friendships.friend_id = user2.id; -- los mejores amigos de los usuarios


--Ejercicio Adicional

--1.-Devuelva a todos los usuarios que son amigos de Kermit, asegúrese de que sus nombres se muestren en los resultados.

SELECT users.first_name, users.last_name, user2.first_name AS friends_first_name, user2.last_name AS friends_last_name
FROM users
LEFT JOIN friendships ON users.id = friendships.user_id -- usuarios
LEFT JOIN users as user2 ON friendships.friend_id = user2.id -- los mejores amigos de los usuarios
where users.first_name ='Kermit';

--2.-Devuelve el recuento de todas las amistades.

select count(friendships.friend_id),users.first_name
from friendships
join users on users.id = friendships.user_id
group by friendships.user_id


--3.-Descubre quién tiene más amigos y devuelve el recuento de sus amigos.

select count(friendships.friend_id) As numero_amigos,users.first_name
from friendships
join users on users.id = friendships.user_id
group by friendships.user_id
order by numero_amigos desc
limit 1;

--4.-Crea un nuevo usuario y hazlos amigos de Eli Byers, Kermit The Frog y Marky Mark.
insert into users ( id, first_name, last_name)
value(7,'Jason','Killer');
select* from friendships;
insert into friendships (user_id,friend_id)
values (6,2);
insert into friendships (user_id,friend_id)
values (6,5);
insert into friendships (user_id,friend_id)
values (6,4);

--5.-Devuelve a los amigos de Eli en orden alfabético.
SELECT users.first_name, users.last_name, user2.first_name AS friends_first_name, user2.last_name AS friends_last_name
FROM users
LEFT JOIN friendships ON users.id = friendships.user_id -- usuarios
LEFT JOIN users as user2 ON friendships.friend_id = user2.id -- los mejores amigos de los usuarios
where users.first_name ='Eli'
ORDER BY first_name DESC;

--6.-Eliminar a Marky Mark de los amigos de Eli.
delete from friendships 
where friendships.friend_id =5 and friendships.user_id=2;

--7.-Devuelve todas las amistades, mostrando solo el nombre y apellido de ambos amigos
SELECT users.first_name, users.last_name, user2.first_name AS friends_first_name, user2.last_name AS friends_last_name
FROM users
LEFT JOIN friendships ON users.id = friendships.user_id 
LEFT JOIN users as user2 ON friendships.friend_id = user2.id 