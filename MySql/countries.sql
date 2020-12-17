-- Consultas


--1. ¿Qué consulta harías para obtener todos los países que hablan esloveno? Tu consulta debe devolver el nombre del país, 
--el idioma y el porcentaje de idioma. Tu consulta debe organizar el resultado por porcentaje de idioma en orden descendente. (1)--
SELECT * FROM `languages` 
where `language` like 'Sl%'
order by `language`asc -- consulta para descubrir lenguje esloveno--

SELECT * FROM `languages` 
JOIN countries on countries.id = `languages`.`country_id`
WHERE `language` like 'Sl%'
order by `language`asc -- uniendo JOIN  las tablas languages y countries pk,fk--

SELECT `countries`.`name`,`languages`.`language`, `languages`.`percentage`
FROM `languages` 
JOIN countries on countries.id = `languages`.`country_id`
WHERE `language` = 'Slovene'
order by `percentage` DESC -- terminada "languages= tabla, language= columna"


--2. ¿Qué consulta ejecutarías para mostrar el número total de ciudades para cada país? Su consulta debe devolver 
--el nombre del país y el número total de ciudades. Tu consulta debe organizar el resultado por el número 
--de ciudades en orden descendente. (3)

SELECT   `countries`.`name`, COUNT(`cities`.`country_id`) as total_ciudades
FROM `cities` 
JOIN `countries`
ON `cities`.`country_id` = `countries`.`id`
group BY `cities`.`country_id`
ORDER BY total_ciudades DESC


SELECT  co.`name` AS Pais,COUNT(ci.`country_id`) AS total_ciudades
FROM `cities` ci
JOIN `countries` co
ON ci.`country_id` = co.`id`
GROUP BY ci.`country_id`
ORDER by total_ciudades DESC -- uso de alias ci, co--


--3. ¿Qué consulta harías para obtener todas las ciudades de México con una población de más de 500,000?
-- Tu consulta debe organizar el resultado por población en orden descendente. (1)

select id , name
from countries 
where name = "Mexico" -- consultar el id de mexico


select name , population 
from cities
where country_id = 136
and cities.population > 500000
order by cities.population desc;-- commo llego ahi?

select cities.name As ciudad, cities.population As poblacion
from cities 
join countries on countries.id = cities.country_id
where countries.name = "Mexico"
and cities.population > 500000 
order by cities.population desc;


select name , population 
from cities
JOIN countries
on cities. countries_id = ¨Mexico¨
 group by cities population > 500000
order by cities.population desc;-- lo que estaba haciendo yo --

--4. ¿Qué consulta ejecutarías para obtener todos los idiomas en cada país con un porcentaje
-- superior al 89%? Tu consulta debe organizar el resultado por porcentaje en orden descendente. (1)
SELECT `countries`.`name` As Pais,`languages`.`language`, `languages`.`percentage`
FROM `languages` 
JOIN countries on countries.id = `languages`.`country_id`
where `percentage` > 89
order by `percentage` DESC

--5. ¿Qué consulta haría para obtener todos los países con un área de superficie inferior a 501 y una población superior a 100,000? (2)--

SELECT * from countries
where population > 100000.00
and surface_area < 501

--6. ¿Qué consulta harías para obtener países con solo Monarquía Constitucional--
--con un capital superior a 200 y una esperanza de vida superior a 75 años? (1)--

SELECT * from countries
where government_form = 'Constitutional Monarchy'
and life_expectancy > 75


--7. ¿Qué consulta harías para obtener todas las ciudades de Argentina dentro del distrito de Buenos Aires 
--y tener una población superior a 500,000? La consulta debe devolver el nombre del país, el nombre de la ciudad,
-- el distrito y la población. (2)

select countries.name As Pais, cities.name As Ciudad, cities.district As distrito, cities.population As poblacion
from cities join countries 
on countries.id = cities.country_id 
where cities.district = "Buenos Aires"
and cities.population > 500000

--8. ¿Qué consulta harías para resumir el número de países en cada región? 
--La consulta debe mostrar el nombre de la región y el número de países. Además,
-- la consulta debe organizar el resultado por el número de países en orden descendente. (2)--

select region, count(id) As Paises from countries
group by region
order by  paises desc 
