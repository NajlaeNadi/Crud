-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : lun. 13 fév. 2023 à 15:43
-- Version du serveur : 10.4.21-MariaDB
-- Version de PHP : 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `product`
--

-- --------------------------------------------------------

--
-- Structure de la table `prod`
--

CREATE TABLE `prod` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `brand` varchar(50) NOT NULL,
  `Price` double NOT NULL,
  `date` date NOT NULL,
  `category` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `prod`
--

INSERT INTO `prod` (`id`, `name`, `brand`, `Price`, `date`, `category`) VALUES
(1, 'Dairy Milk', 'American Milk', 12, '2023-02-01', 'Food'),
(2, 'Star Bucks', 'American MC', 12, '2023-02-16', 'Food'),
(3, 'Hair Dryer', 'Dyson', 24, '2023-02-08', 'Cosmetics'),
(4, 'Couton desks', 'AloeCottn', 17, '2023-02-11', 'Hygien'),
(5, 'Coffee', 'Germany Coffee', 20, '2023-02-12', 'Food'),
(6, 'Chocolate', 'Brown Sugar', 13, '2023-02-13', 'Food'),
(7, 'Facial moisturising lotion ', 'Cerave', 190, '2023-02-13', 'Cosmetics');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `prod`
--
ALTER TABLE `prod`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `prod`
--
ALTER TABLE `prod`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
