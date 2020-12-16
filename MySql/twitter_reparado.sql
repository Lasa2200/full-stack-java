-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-12-2020 a las 16:58:23
-- Versión del servidor: 10.4.16-MariaDB
-- Versión de PHP: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `twitter`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `faves`
--
CREATE DATABASE  IF NOT EXISTS `twitter`;
USE `twitter`;

CREATE TABLE `faves` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `tweet_id` int(11) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `faves`
--

INSERT INTO `faves` (`id`, `user_id`, `tweet_id`, `created_at`, `updated_at`) VALUES
(1, 2, 1, '2010-02-01 00:00:01', '2010-02-01 00:00:01'),
(2, 2, 2, '2010-02-01 00:00:01', '2010-02-01 00:00:01'),
(3, 3, 4, '2010-02-01 00:00:01', '2010-02-01 00:00:01'),
(4, 4, 3, '2010-02-01 00:00:01', '2010-02-01 00:00:01'),
(5, 1, 9, '2010-02-01 00:00:01', '2010-02-01 00:00:01'),
(6, 1, 10, '2010-02-01 00:00:01', '2010-02-01 00:00:01'),
(7, 1, 11, '2010-02-01 00:00:01', '2010-02-01 00:00:01');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `follows`
--

CREATE TABLE `follows` (
  `id` int(11) NOT NULL,
  `followed_id` int(11) NOT NULL,
  `follower_id` int(11) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `follows`
--

INSERT INTO `follows` (`id`, `followed_id`, `follower_id`, `created_at`, `updated_at`) VALUES
(1, 1, 2, '2010-02-01 00:00:01', '2010-02-01 00:00:01'),
(2, 1, 3, '2010-02-01 00:00:01', '2010-02-01 00:00:01'),
(3, 1, 4, '2010-02-01 00:00:01', '2010-02-01 00:00:01'),
(4, 1, 5, '2010-02-01 00:00:01', '2010-02-01 00:00:01'),
(5, 3, 4, '2010-02-01 00:00:01', '2010-02-01 00:00:01'),
(6, 3, 5, '2010-02-01 00:00:01', '2010-02-01 00:00:01'),
(7, 2, 4, '2010-02-01 00:00:01', '2010-02-01 00:00:01');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tweets`
--

CREATE TABLE `tweets` (
  `id` int(11) NOT NULL,
  `tweet` varchar(140) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tweets`
--

INSERT INTO `tweets` (`id`, `tweet`, `user_id`, `created_at`, `updated_at`) VALUES
(1, 'There is power in understanding the journey of others to help create your own', 1, '2002-02-01 00:00:01', '2002-02-01 00:00:01'),
(2, 'Congrats Coach K! Amazing accomplishment #1KforCoachK #Duke', 1, '2005-02-01 00:00:01', '2005-02-01 00:00:01'),
(3, 'This is what happens when I pass too much! #ShoulderShock thank u all for ur thoughts and prayers #team @DrinkBODYARMOR @Lakers #oneluv', 1, '2004-02-01 00:00:01', '2004-02-01 00:00:01'),
(4, 'Feeling a mix of emotions I haven\'t felt in 18yrs of being a pro #journey #19th', 1, '2012-02-01 00:00:01', '2012-02-01 00:00:01'),
(5, 'Thank you everyone for the birthday wishes. I appreciate you all.', 2, '2011-02-01 00:00:01', '2011-02-01 00:00:01'),
(6, 'I\'d like to wish everyone a very Merry Christmas. 1 love to all \"Be Safe\"', 2, '2009-02-01 00:00:01', '2009-02-01 00:00:01'),
(7, 'Thanks to all who helped with the Christmas food baskets today. Your time is greatly appreciated. Love & Respect!! ', 2, '2008-02-01 00:00:01', '2008-02-01 00:00:01'),
(8, 'I took on the ALS Challenge from Monta Ellis. I challenge @coolkesh42 Jameer Nelson, Dionne Calhoun ... http://tmi.me/1eFAxT ', 2, '2003-02-01 00:00:01', '2003-02-01 00:00:01'),
(9, 'Well done lil bro, you deserve it!! @KingJames', 3, '2006-02-01 00:00:01', '2006-02-01 00:00:01'),
(10, 'For my basketball clinic with @manilacone 11/4/14, we still have a few slots left for the main game. See you all 11/5/14 Philippines', 3, '2001-02-01 00:00:01', '2001-02-01 00:00:01'),
(11, 'Always have a great time with my big little brother. ', 4, '2011-02-01 00:00:01', '2011-02-01 00:00:01'),
(12, 'Happy Labor Day..', 4, '2014-02-01 00:00:01', '2014-02-01 00:00:01');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `handle` varchar(255) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `users`
--

INSERT INTO `users` (`id`, `first_name`, `last_name`, `handle`, `birthday`, `created_at`, `updated_at`) VALUES
(1, 'Kobe', 'Bryant', 'kobebryant', '1978-08-23', '2010-02-01 00:00:01', '2011-07-01 00:00:01'),
(2, 'Vince', 'Carter', 'mrvincecarter15', '1977-01-26', '2007-08-11 00:00:01', '2010-01-01 00:00:01'),
(3, 'Allen', 'Iverson', 'alleniverson', '1975-06-07', '2005-09-01 00:00:01', '2011-04-21 00:00:01'),
(4, 'Tracy', 'McGrady', 'Real_T_Mac', '1979-05-24', '2002-12-01 00:00:01', '2005-11-21 00:00:01'),
(5, 'Rajon', 'Rondo', 'RajonRondo', '1986-02-22', '2001-02-01 00:00:01', '2002-01-01 00:00:01');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `faves`
--
ALTER TABLE `faves`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_faves_users1_idx` (`user_id`),
  ADD KEY `fk_faves_tweets1_idx` (`tweet_id`);

--
-- Indices de la tabla `follows`
--
ALTER TABLE `follows`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_follows_users_idx` (`followed_id`);

--
-- Indices de la tabla `tweets`
--
ALTER TABLE `tweets`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_tweets_users1_idx` (`user_id`);

--
-- Indices de la tabla `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `faves`
--
ALTER TABLE `faves`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `follows`
--
ALTER TABLE `follows`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `tweets`
--
ALTER TABLE `tweets`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `faves`
--
ALTER TABLE `faves`
  ADD CONSTRAINT `fk_faves_tweets1` FOREIGN KEY (`tweet_id`) REFERENCES `tweets` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_faves_users1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `follows`
--
ALTER TABLE `follows`
  ADD CONSTRAINT `fk_follows_users` FOREIGN KEY (`followed_id`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tweets`
--
ALTER TABLE `tweets`
  ADD CONSTRAINT `fk_tweets_users1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
