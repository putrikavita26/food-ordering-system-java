/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FoodOrderingSystem;

/**
 *
 * @author Kelompok 6
 */

import java.util.Scanner;

class Transaksi { // Class Transaksi digunakan untuk mengelola proses pembayaran

    public void cetakStruk(Pesanan pesanan) { // Method untuk mencetak struk berdasarkan data pesanan

        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk membaca input user
        int total = pesanan.hitungTotal();// Mengambil total harga dari semua pesanan

        System.out.println("\n===== STRUK PEMBAYARAN =====");//menampilkan teks judul struk

        int no = 1;   // Variabel untuk nomor urutan item
        for (Pesanan.ItemPesanan item : pesanan.getDaftar()) { // Loop untuk menampilkan semua item yang dipesan
            System.out.println(no++ + ". " +
                    item.menu.getNama() +
                    " x" + item.jumlah +
                    " = Rp" + (item.menu.getHarga() * item.jumlah));
        } // Menampilkan nama item, jumlah, dan total harga per item

        System.out.println("----------------------------");
        System.out.println("Total Item : " + pesanan.getDaftar().size()); // Menampilkan jumlah jenis item yang dipesan
        System.out.println("Total Harga: Rp" + total);// Menampilkan total harga keseluruhan

        int uang = 0; // Variabel untuk menyimpan uang yang dibayarkan

        // melakukan perulangan sampe uangnya cukup
        do {
            System.out.print("Masukkan uang: Rp");  // Meminta user memasukkan jumlah uang

            // dijalankan ketika input nya bukan angka
            while (!input.hasNextInt()) {  // Mengecek apakah input bukan angka
                System.out.println("Input harus angka!"); // Menampilkan pesan error jika input tidak valid
                input.next(); // Menghapus input yang salah
                System.out.print("Masukkan uang: Rp"); // Meminta pengguna input ulang
            }

            uang = input.nextInt();  // Menyimpan input uang dari user

            if (uang < total) { // Jika uang kurang dari total
                System.out.println("❌ Uang yang dibayarkan: Rp" + uang);// Menampilkan jumlah uang yang dimasukkan
                System.out.println("❌ Kekurangan: Rp" + (total - uang));// Menampilkan jumlah kekurangan
            }

        } while (uang < total); 
         // Perulangan akan terus berjalan sampai uang cukup
        int kembalian = uang - total;// Menghitung kembalian

        System.out.println("----------------------------");
        System.out.println("Uang Dibayar: Rp" + uang);  // Menampilkan jumlah uang yang dibayarkan
        System.out.println("Kembalian   : Rp" + kembalian);// Menampilkan jumlah kembalian
        System.out.println("============================");
        System.out.println("Terima kasih!");
    }
}