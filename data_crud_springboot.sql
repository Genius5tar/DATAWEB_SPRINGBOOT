-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-05-2023 a las 05:56:26
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `data_crud_jsp`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulos`
--

CREATE TABLE `articulos` (
  `id` int(11) NOT NULL,
  `cod` int(8) NOT NULL,
  `marca` varchar(25) NOT NULL,
  `p_venta` float NOT NULL,
  `p_compra` float NOT NULL,
  `iva` int(11) NOT NULL,
  `modelo` varchar(30) NOT NULL,
  `proveedor` varchar(25) NOT NULL,
  `tienda` varchar(20) NOT NULL,
  `cantidad` int(10) NOT NULL,
  `descripcion` varchar(300) NOT NULL,
  `categoria` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `articulos`
--

INSERT INTO `articulos` (`id`, `cod`, `marca`, `p_venta`, `p_compra`, `iva`, `modelo`, `proveedor`, `tienda`, `cantidad`, `descripcion`, `categoria`) VALUES
(12, 2322, 'asdasd', 25.07, 55.07, 0, 'hhhh', 'asdasd', '0', 77777, '0', '0'),
(26, 959, 'asd', 62, 62, 19, 'ads', 'asd', 'aasd', 19, 'ads', 'asd'),
(27, 54858, 'Apple', 1699, 1699, 19, 'Iphone 13', 'apple inc', 'apple', 20, 'telefono ulta gama alta ', 'telefonos'),
(28, 8855, 'lenovo', 355501, 25501, 19, 'Galaxia 20', 'Lenovo Enterprise', 'Lenovo online', 3001, 'computador de otro mundo', 'Portatiles PC');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `username` varchar(15) NOT NULL,
  `nombre` varchar(11) NOT NULL,
  `documento` int(10) NOT NULL,
  `password` varchar(255) NOT NULL,
  `user_type` int(11) NOT NULL DEFAULT 2
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `username`, `nombre`, `documento`, `password`, `user_type`) VALUES
(1, 'admin', 'Pedro', 1007972063, 'admin', 0),
(3, 'yuyu', 'cualquiera', 1223355688, '123a', 1),
(25, 'yuyu1', 'asd', 1255, '123a', 1),
(33, 'dfgd', 'dfg', 558888, '123', 1),
(39, 'fsdsadf', 'sdf', 659, '1', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `articulos`
--
ALTER TABLE `articulos`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `cod` (`cod`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `articulos`
--
ALTER TABLE `articulos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
