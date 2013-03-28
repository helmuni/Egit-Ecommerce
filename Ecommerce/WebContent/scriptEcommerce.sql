-- phpMyAdmin SQL Dump
-- version 3.4.9
-- http://www.phpmyadmin.net
--
-- Client: 127.0.0.1
-- Généré le : Jeu 28 Mars 2013 à 17:57
-- Version du serveur: 5.5.20
-- Version de PHP: 5.3.9

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `ecommerce`
--

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `login` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `pass` varchar(20) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Contenu de la table `admin`
--

INSERT INTO `admin` (`login`, `pass`) VALUES
('hamid', '12345');

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cin` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `login` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `pass` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `nom` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `prenom` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `tel` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `dateInscription` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=4 ;

--
-- Contenu de la table `client`
--

INSERT INTO `client` (`id`, `cin`, `login`, `pass`, `nom`, `prenom`, `email`, `tel`, `dateInscription`) VALUES
(1, 'df', 'df', 'dfd', 'df', 'fdf', 'df', 'dfdf', '2013-02-27'),
(2, 'df', 'dfd', 'df', 'dfd', 'dfd', 'dfd', 'dfd', '2013-03-18'),
(3, 'gfh', 'dfd', 'djngj', 'f', 'sqd', 'qsd', 'qsd', '2013-03-28');

-- --------------------------------------------------------

--
-- Structure de la table `produit`
--

CREATE TABLE IF NOT EXISTS `produit` (
  `id_produit` int(11) NOT NULL AUTO_INCREMENT,
  `intitile_produit` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `quantite_produit` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `prix_produit` int(11) NOT NULL,
  `date_ajout_produit` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `image_produit` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id_produit`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=8 ;

--
-- Contenu de la table `produit`
--

INSERT INTO `produit` (`id_produit`, `intitile_produit`, `quantite_produit`, `prix_produit`, `date_ajout_produit`, `image_produit`) VALUES
(2, 'Clavier 23', '12', 300, '12-02-12', 'C:\\Users\\Hamid\\workspace\\Ecommerce\\WebContent\\imagetest\\1.jpg'),
(3, 'ere', 'ere', 2432, '2013-03-28 01:15:01', 'Video-Italie-Allemagne-Euro-2012.jpeg'),
(5, 'RTRTRT', 'ERER', 133, '2013-03-28 14:50:20', '550053_583250025027161_1307127951_n.jpg');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) DEFAULT NULL,
  `email` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `motDePasse` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `nom` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `dateInscription` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`id`, `email`, `motDePasse`, `nom`, `dateInscription`) VALUES
(NULL, 'rtrtrt', 'ffgfg', 'fgfdgf', '2013-02-20');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
