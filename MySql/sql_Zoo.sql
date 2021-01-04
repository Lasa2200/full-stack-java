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
       ROUND(population/1000000,2),
       ROUND(GDP/1000000000,2)
     FROM world
where continent ='South America'

--10--
SELECT name,
       ROUND(GDP/population,-3)
     FROM world
WHERE GDP >1000000000000


--11--
SELECT name, capital    
  FROM world
  WHERE  LENGTH(name)=LENGTH(capital)


--12--
SELECT name,capital
FROM world
where LEFT(name,1)= LEFT(capital,1) 
and name <> capital

--13--
SELECT name
   FROM world
   WHERE name LIKE '%a%'
   and name LIKE '%e%'
   and name LIKE '%i%'
   and name LIKE '%o%'
   and name LIKE '%u%'
   AND name NOT LIKE '% %'



   --https://sqlzoo.net/wiki/The_JOIN_operation--


   --1--
SELECT matchid, player
 FROM goal 
 WHERE teamid= 'GER'


   --2--
SELECT id,stadium,team1,team2
  FROM game 
where id = 1012

--3--
SELECT goal.player,goal.teamid,game.stadium,game.mdate
  FROM game JOIN goal ON (game.id=goal.matchid)
where teamid = 'GER'

--4--
SELECT game.team1, game.team2,goal.player
FROM game JOIN goal ON (game.id=goal.matchid)
where player LIKE 'Mario%'

--5--

