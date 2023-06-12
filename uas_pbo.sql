-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 12, 2023 at 05:40 PM
-- Server version: 8.0.31
-- PHP Version: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `uas_pbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
CREATE TABLE IF NOT EXISTS `item` (
  `code` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `price` float NOT NULL,
  `kategori` int DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=MyISAM AUTO_INCREMENT=208 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`code`, `name`, `price`, `kategori`) VALUES
(1, 'Chitato Snack Potato Chips', 9000, 11),
(2, 'Qtela Keripik Singkong', 10000, 1),
(3, 'Happytos Snack Tortilla', 12000, 1),
(4, 'Garuda Kacang Telur', 11000, 1),
(5, 'Dua Kelinci Snack Pilus', 7000, 1),
(6, 'Roti Tawar Sari Roti', 20000, 1),
(7, 'Ultra Teh Kotak', 6000, 1),
(8, 'Yakult', 23000, 1),
(9, 'Energen Cereal', 13000, 1),
(10, 'SilverQueen Almond', 12000, 1),
(11, 'Wafer Chocolate', 7000, 1),
(12, 'Good Time Cookies', 8000, 1),
(13, 'Yupi Breakfast', 14000, 1),
(14, 'Ice Cream Cornetto', 14000, 1),
(15, 'Cha Cha', 8000, 1),
(18, 'Telkomsel 50000', 55000, 2),
(17, 'Telkomsel 30000', 35000, 2),
(16, 'Telkomsel 20000', 25000, 2),
(19, 'Indosat 20000', 25000, 2),
(20, 'Indosat 30000', 35000, 2),
(21, 'Indosat 50000', 55000, 2),
(22, 'Axis 20000', 25000, 2),
(23, 'Axis 30000', 35000, 2),
(24, 'Axis 50000', 55000, 2),
(25, 'Token 100000', 100000, 3),
(26, 'Token 500000', 500000, 3),
(27, 'Token 2000000', 2000000, 3),
(28, 'Token 4000000', 4000000, 3);

-- --------------------------------------------------------

--
-- Table structure for table `listrik`
--

DROP TABLE IF EXISTS `listrik`;
CREATE TABLE IF NOT EXISTS `listrik` (
  `NoMeteran` varchar(20) DEFAULT NULL,
  `nominal` float DEFAULT NULL,
  `token` varchar(20) NOT NULL,
  `id_transaksi` int DEFAULT NULL,
  PRIMARY KEY (`token`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `makanan`
--

DROP TABLE IF EXISTS `makanan`;
CREATE TABLE IF NOT EXISTS `makanan` (
  `id_barang` int NOT NULL AUTO_INCREMENT,
  `kadaluarsa` date DEFAULT NULL,
  PRIMARY KEY (`id_barang`)
) ENGINE=MyISAM AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `makanan`
--

INSERT INTO `makanan` (`id_barang`, `kadaluarsa`) VALUES
(1, '2025-06-11'),
(2, '2026-11-20'),
(3, '2024-11-02'),
(4, '2025-09-11'),
(5, '2028-06-13'),
(6, '2023-09-16'),
(7, '2026-10-01'),
(8, '2019-06-25'),
(9, '2024-08-05'),
(10, '2023-11-22'),
(11, '2024-02-14'),
(12, '2024-07-22'),
(13, '2027-06-24'),
(14, '2023-06-03'),
(15, '2026-05-05');

-- --------------------------------------------------------

--
-- Table structure for table `pulsa`
--

DROP TABLE IF EXISTS `pulsa`;
CREATE TABLE IF NOT EXISTS `pulsa` (
  `id_pulsa` int NOT NULL AUTO_INCREMENT,
  `id_item` int DEFAULT NULL,
  `id_transaksi` int DEFAULT NULL,
  `operator` varchar(20) DEFAULT NULL,
  `no_telepon` varchar(15) DEFAULT NULL,
  `harga` float DEFAULT NULL,
  `nominal` float DEFAULT NULL,
  PRIMARY KEY (`id_pulsa`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `qris`
--

DROP TABLE IF EXISTS `qris`;
CREATE TABLE IF NOT EXISTS `qris` (
  `id` int NOT NULL AUTO_INCREMENT,
  `qriscontent` varchar(255) DEFAULT NULL,
  `invoice_ID` int DEFAULT NULL,
  `NMID` varchar(255) DEFAULT NULL,
  `request_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `qris`
--

INSERT INTO `qris` (`id`, `qriscontent`, `invoice_ID`, `NMID`, `request_time`) VALUES
(1, '3YXDwy1q0e2UXrJRARkr7c5PtcCUn4FZAOxSRpl9HDluE7UknbNzNYC2Qc0u3x7QW1uTkarL0WnWKOKnY5M1UVk8KBhKClQafkVPmOsmyBlgLj2sj25jJ2KREQXPwVXr2KLzqRQpPjtIqZLOfvjVP0iok2hmd34bzXuNrKKay87qlDK11W4NK74pYTjUEzjFd1DISh78zbZrBTJQlB0vT7q9ycU2f9lzQvjxqtTl7YkgXplkzZ', 376546, 'ID1020044722814', '2023-06-11 17:49:55'),
(2, 'cmOQhAYTZ7OHI4emTG6BbhdWNd2PPuSqgmY6JeONrYKJwUhDcBWsYLmkzk5aJRWc4agxGuRfYlMm7Tszc7ig9YogrKdCFlrQTDnYGY5GyQUzhuvwNAqSE2cqN5fumy0cKeI2a7j1P1CZ4JWtC5HNQV7LbVMqb8lrGE4JUGYjrnsEDqUgJm6PGLGeb9QOV3dFskWZFyw8ckALW7ZBhJflRZf0hCiDTDnmKFInwnBRqWo8F2PbCa', 775438, 'ID1020044722814', '2023-06-12 08:15:43'),
(3, 'cJu9h6dlAEOLTFDC2wzgT9wyS5TECZUOE1YKGWegOdMexWE7yMUo9bYGRp54VdJbQ19UnUZM1M1FSBPesB8OUwhVuXCUpyzNI4sCW9ge0g7175SXuCleZimeHN9A17BGvkwqZIt63R588IEkibRIFTHvdHwQs8vB3d3xwiahs4dISADbjavLswUiU75XkiPdluQHzgYtSpyCBz5nmtNB14NqR5m6gxkwcifw1uugbvd0TA3ViU', 745146, 'ID1020044722814', '2023-06-12 17:36:42');

-- --------------------------------------------------------

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
CREATE TABLE IF NOT EXISTS `token` (
  `id_token` int NOT NULL AUTO_INCREMENT,
  `id_item` int DEFAULT NULL,
  `id_transaksi` int DEFAULT NULL,
  `token_code` varchar(20) DEFAULT NULL,
  `no_meteran` varchar(11) DEFAULT NULL,
  `harga` float DEFAULT NULL,
  `nominal` float DEFAULT NULL,
  PRIMARY KEY (`id_token`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `token`
--

INSERT INTO `token` (`id_token`, `id_item`, `id_transaksi`, `token_code`, `no_meteran`, `harga`, `nominal`) VALUES
(33, 25, 907163, '70670437134488573471', '12312312312', 100000, 89000),
(34, 28, 745146, '90469003084354808033', '12312312312', 4000000, 3560000);

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

DROP TABLE IF EXISTS `transaksi`;
CREATE TABLE IF NOT EXISTS `transaksi` (
  `id_transaksi` int NOT NULL,
  `total_harga` float NOT NULL,
  `total_bayar` float NOT NULL,
  `total_kembalian` int NOT NULL,
  `payment_method` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_transaksi`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `total_harga`, `total_bayar`, `total_kembalian`, `payment_method`) VALUES
(97332, 35000, 50000, 15000, NULL),
(419672, 27000, 30000, 3000, NULL),
(773459, 82000, 85000, 3000, NULL),
(190262, 8000, 15000, 7000, NULL),
(657129, 441000, 500000, 59000, NULL),
(384187, 63000, 65000, 2000, NULL),
(925595, 91000, 100000, 9000, NULL),
(236819, 49000, 10000000, 9951000, NULL),
(249123, 19000, 50000, 31000, NULL),
(639221, 9000, 50000, 41000, NULL),
(406545, 319000, 500000, 181000, NULL),
(367906, 63000, 90000, 27000, NULL),
(376546, 131000, 131000, 0, 'QRIS'),
(775438, 55000, 55000, 0, 'QRIS'),
(335987, 100000, 100000, 0, 'Kartu Debit'),
(907163, 100000, 150000, 50000, 'Cash'),
(745146, 4000000, 4000000, 0, 'QRIS');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi_barang`
--

DROP TABLE IF EXISTS `transaksi_barang`;
CREATE TABLE IF NOT EXISTS `transaksi_barang` (
  `id_transaksi` int NOT NULL,
  `id_barang` int NOT NULL,
  `jumlah_barang` int DEFAULT NULL,
  `harga_barang` float DEFAULT NULL,
  PRIMARY KEY (`id_transaksi`,`id_barang`),
  KEY `id_barang` (`id_barang`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `transaksi_barang`
--

INSERT INTO `transaksi_barang` (`id_transaksi`, `id_barang`, `jumlah_barang`, `harga_barang`) VALUES
(848181, 1, 1, NULL),
(199978, 2, 1, NULL),
(997931, 2, 1, NULL),
(997931, 3, 1, NULL),
(97332, 14, 1, NULL),
(97332, 5, 3, NULL),
(419672, 1, 3, NULL),
(773459, 13, 5, NULL),
(773459, 3, 1, NULL),
(190262, 12, 1, NULL),
(657129, 7, 8, NULL),
(657129, 13, 20, NULL),
(657129, 15, 3, NULL),
(657129, 9, 5, NULL),
(657129, 10, 2, NULL),
(384187, 13, 4, NULL),
(384187, 5, 1, NULL),
(925595, 3, 7, NULL),
(925595, 5, 1, NULL),
(236819, 1, 1, NULL),
(236819, 2, 1, NULL),
(236819, 3, 1, NULL),
(249123, 1, 1, NULL),
(249123, 2, 1, NULL),
(639221, 1, 1, NULL),
(406545, 1, 1, NULL),
(406545, 2, 1, NULL),
(406545, 3, 1, NULL),
(367906, 1, 1, NULL),
(367906, 2, 1, NULL),
(367906, 3, 1, NULL),
(367906, 4, 1, NULL),
(367906, 5, 3, NULL),
(775438, 21, 1, 55000),
(335987, 25, 1, 100000),
(907163, 25, 1, 100000),
(745146, 28, 1, 4000000);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
