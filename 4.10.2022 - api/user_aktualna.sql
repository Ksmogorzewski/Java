-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Czas generowania: 18 Paź 2022, 09:34
-- Wersja serwera: 10.4.21-MariaDB
-- Wersja PHP: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `4ptb2sklep`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `user`
--

CREATE TABLE `user` (
  `id` int(3) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `surname` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `role` int(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `user`
--

INSERT INTO `user` (`id`, `name`, `surname`, `email`, `password`, `role`) VALUES
(1, 'Jan1', 'Kowalski1', 'k1@gmail.com', '1111', 1),
(2, 'Jan2', 'Kowalski2', 'k2@gmail.com', '2222', 1),
(3, 'Jan3', 'Kowalski3', 'k3@gmail.com', '3333', 1),
(4, 'Jan4', 'Kowalski4', 'k1@gmail.com', '1111', 1),
(5, 'Jan5', 'Kowalski5', 'k2@gmail.com', '2222', 1),
(6, 'Jan6', 'Kowalski6', 'k3@gmail.com', '3333', 1);

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT dla zrzuconych tabel
--

--
-- AUTO_INCREMENT dla tabeli `user`
--
ALTER TABLE `user`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
