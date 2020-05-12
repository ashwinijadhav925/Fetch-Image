-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 03, 2020 at 11:01 AM
-- Server version: 5.7.26
-- PHP Version: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fetch_imgdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `image_tb`
--

DROP TABLE IF EXISTS `image_tb`;
CREATE TABLE IF NOT EXISTS `image_tb` (
  `location_name` varchar(50) NOT NULL,
  `image_name` varchar(50) NOT NULL,
  `info` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `image_tb`
--

INSERT INTO `image_tb` (`location_name`, `image_name`, `info`) VALUES
('Basilica of Bom Jesus', 'BomJesus.jpg', 'The Basilica of Bom Jesus church is one of a kind in India and is known for its exemplary baroque architecture. Built in the year 1594 and consecrated in 1605, the building of this church coincides with the beginning of Christianity in India. The church is located in Old Goa in Bainguinim about 10 km away from Panjim. The oldest church in Goa, Basilica of Bom Jesus holds the remains of St. Francis Xavier, a special friend of St. Ignatius Loyola with whom he founded the Society of Jesus (Jesuits). Even after 400 years, the remains are in a good condition and are taken out once every decade.  A site with rich cultural and religious significance, the Basilica of Bom Jesus has been declared a World Heritage Site by UNESCO.'),
('Fort Aguada', 'FortAguada.jpg', 'Fort Aguada is an epitome of Portuguese architecture built in the 17th century. Its lighthouse and the fort itself have braved the ravages of time and stand like silent sentinels on the Sinquerim Beach, approximately 18 km from Panjim. Built-in 1612 as a protection from Dutch and Marathas, it was the most prized and crucial fort for the Portuguese and covers the entire peninsula at the southwestern tip of Bardez. The view from the fort is breathtaking as it overlooks the confluence of Mandovi River and the Arabian Sea. \r\n\r\nThe fort is so named after the Portuguese Word for water i.e. \'Agua\' and used to be a replenishing source of freshwater for sailors. In fact, it has the capacity to hold 2,376,000 gallons of water and was one of the biggest freshwater reservoirs of Asia.\r\nFort Aguada has also been used as Aguada jail. A statue in front of the jail salutes the freedom fighters, giving the fort a touch of patriotism.'),
('Calangute Beach', 'CalanguteBeach.jpg', 'Situated 15 km from Panjim, Calangute Beach is the longest beach in North Goa, stretching from Candolim to Baga. Due to its sheer size and popularity, it is a hub for tourists and backpackers from all over the world.\r\n\r\nPopular as the \"Queen of Beaches\", the Calangute Beach of Goa is among the top ten bathing beaches in the world. Being one of the busiest and most commercial beaches of Goa, it is swarming with eating joints, shacks and clubs serving cocktails, beer and seafood. The Calangute Beach is also known for its water sports activities like parasailing, water surfing, banana ride and jet-skiing. While the days here are filled with beach fun, nights call for upbeat parties and letting your hair down. Calangute is also popular for staying in Goa as it keeps you well-connected to the other beaches in the north such as Baga, Anjuna, Candolim, Aguada and many more.'),
('Church of St. Cajetan', 'ChurchCajetan.jpg', 'This church has a significant resemblance with the St. Peters Basilica in Rome. On the left, there are three altars dedicated to the Holy Family, Our Lady of Piety and St.Clare and the right-side altars are dedicated to St. Agnes, St. Cajetan and St. John. Though the building is 300 years old, it has been wonderfully preserved and is still visited in large numbers by Catholic devotees and tourists alike.\r\n\r\nThe Church of Saint Cajetan is the church of the Roman Catholic Archdiocese of Goa and Daman built in the second half of the 17th century. Initially called the Church of Our Lady of Divine Providence the church is a part of the World heritage site, churches, and convents. One of the must-visits of Goa, the church is admired for its wonderful and graceful architecture that reminds you of Basilica of St. Peter in Rome. The only surviving domed structure in Goa, the beautiful tourist destination is named after the founder of the Theatine order, St. Cajetan even though the church is dedicated to Our Lady of Divine Providence.');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
