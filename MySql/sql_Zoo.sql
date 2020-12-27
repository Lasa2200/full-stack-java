SELECT basics
https://sqlzoo.net/wiki/SELECT_basics

--1--
SELECT capital
  FROM world
 WHERE name = 'France';

--2--
 SELECT name, population FROM world
  WHERE name IN ('Sweden', 'Norway','Denmark');

--3--
  SELECT name, area FROM world
  WHERE area BETWEEN 200000 AND 250000;



  SELECT from WORLD Tutorial
  https://sqlzoo.net/wiki/SELECT_from_WORLD_Tutorial

  --1--
  SELECT name, continent, population FROM world;

  --2--
  SELECT name
  FROM world
 WHERE population > 200000000;

 --3--
 SELECT name, GDP/population
  FROM world
 WHERE population > 200000000;

 --4--
SELECT name,population/1000000
FROM world
WHERE  continent = 'South America' ;

 --5--
 SELECT name, population 
FROM world
WHERE name IN ('France', 'Germany','Italy');

--6--
 SELECT name
 FROM world
 WHERE name LIKE '%United%'

 --7--
 SELECT name, population, area
 FROM world
 WHERE area > 3000000 or population > 250000000

 --8--
 SELECT name, population, area
 FROM world
 WHERE   population > 250000000 xor  area > 3000000 

 --9--
 SELECT name,
       ROUND(population/1000000,2),(GDP/1000000000,1)
     FROM world
where continent ='South America'-- falta GDP, no lo muestra--