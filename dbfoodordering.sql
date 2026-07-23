-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 23 Jul 2026 pada 04.25
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbfoodordering`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `id_menu` int(10) NOT NULL,
  `kategori` varchar(50) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `harga` int(100) NOT NULL,
  `gambar` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id_menu`, `kategori`, `nama`, `harga`, `gambar`) VALUES
(1, 'Makanan', 'Beef Burger', 75000, 'D:\\KULIAH SEMESTER 4\\Pemrograman Berorientasi Objek\\MENU\\BURGER.jpg'),
(2, 'Minuman', 'Orange Juice', 35000, 'D:\\KULIAH SEMESTER 4\\Pemrograman Berorientasi Objek\\MENU\\ORANGE JUICE.jpg'),
(3, 'Makanan', 'Pepperoni Pizza', 95000, 'D:\\KULIAH SEMESTER 4\\Pemrograman Berorientasi Objek\\MENU\\PIZZA.jpg'),
(4, 'Makanan', 'Chicken Papper', 85000, 'D:\\KULIAH SEMESTER 4\\Pemrograman Berorientasi Objek\\MENU\\CHICKEN BLACKPAPPER.jpg'),
(6, 'Minuman', 'Matcha Latte', 45000, 'D:\\KULIAH SEMESTER 4\\Pemrograman Berorientasi Objek\\MENU\\MILK MATCHA.jpg'),
(7, 'Makanan', 'Chicken Katsu', 65000, 'D:\\KULIAH SEMESTER 4\\Pemrograman Berorientasi Objek\\MENU\\CHICKEN KATSU.jpg'),
(9, 'Makanan', 'Nasi Goreng', 40000, 'D:\\KULIAH SEMESTER 4\\Pemrograman Berorientasi Objek\\MENU\\NASI GORENG.jpg');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pesanan`
--

CREATE TABLE `pesanan` (
  `id_pesanan` int(10) NOT NULL,
  `daftar_menu` text NOT NULL,
  `total_bayar` int(11) NOT NULL,
  `metode_pembayaran` varchar(20) NOT NULL,
  `bukti_pembayaran` text DEFAULT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `riwayat_transaksi`
--

CREATE TABLE `riwayat_transaksi` (
  `id_transaksi` int(10) NOT NULL,
  `id_pesanan` int(10) NOT NULL,
  `daftar_menu` text NOT NULL,
  `total_bayar` int(255) NOT NULL,
  `metode_pembayaran` varchar(20) NOT NULL,
  `waktu_transaksi` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `riwayat_transaksi`
--

INSERT INTO `riwayat_transaksi` (`id_transaksi`, `id_pesanan`, `daftar_menu`, `total_bayar`, `metode_pembayaran`, `waktu_transaksi`) VALUES
(1, 1, 'Beef Burger (5), MILK MATCHA (2), CHICKEN BLACKPAPPER (1), ', 550000, 'Cash', '2026-05-26 08:48:11'),
(2, 2, 'PEPPERONI PIZZA (1), CHICKEN BLACKPAPPER (2), MILK MATCHA (5), ', 490000, 'QRIS', '2026-05-26 08:53:48'),
(3, 3, 'Beef Burger (1), Pepperoni Pizza (1), Chicken Katsu (1), ', 235000, 'Cash', '2026-05-26 12:12:23'),
(4, 5, 'Pepperoni Pizza (2), Matcha Latte (3), ', 325000, 'QRIS', '2026-06-04 05:10:03'),
(5, 4, 'Beef Burger (100), Orange Juice (20), ', 8200000, 'Cash', '2026-06-04 05:10:29'),
(6, 6, 'Nasi Goreng (2), Matcha Latte (2), ', 170000, 'Cash', '2026-06-10 12:30:40'),
(7, 7, 'Beef Burger (1), ', 75000, 'QRIS', '2026-06-10 12:35:02'),
(8, 9, 'Matcha Latte (5), ', 225000, 'QRIS', '2026-06-11 01:26:11'),
(9, 8, 'Beef Burger (2), Orange Juice (2), ', 220000, 'Cash', '2026-06-11 01:26:30');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_menu`);

--
-- Indeks untuk tabel `pesanan`
--
ALTER TABLE `pesanan`
  ADD PRIMARY KEY (`id_pesanan`);

--
-- Indeks untuk tabel `riwayat_transaksi`
--
ALTER TABLE `riwayat_transaksi`
  ADD PRIMARY KEY (`id_transaksi`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `admin`
--
ALTER TABLE `admin`
  MODIFY `id_menu` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT untuk tabel `pesanan`
--
ALTER TABLE `pesanan`
  MODIFY `id_pesanan` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT untuk tabel `riwayat_transaksi`
--
ALTER TABLE `riwayat_transaksi`
  MODIFY `id_transaksi` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
