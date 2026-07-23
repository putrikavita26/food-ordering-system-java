/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FoodOrderingSystem;

/**
 *
 * @author Kelompok 6
 */

import java.util.ArrayList;

class Pesanan { //class Pesanan untuk menyimpan data pesanan

    // Class untuk menyimpan item pesanan
    class ItemPesanan {
        DaftarMenu menu; // Menyimpan data menu yang dipilih
        int jumlah; // Menyimpan jumlah pesanan

        ItemPesanan(DaftarMenu menu, int jumlah) {   // Konstruktor
            this.menu = menu; //mengisi menu
            this.jumlah = jumlah; //mengisi jumlah menu yang akan dipesan
        }
    }

    private ArrayList<ItemPesanan> daftar = new ArrayList<>(); 
    // list untuk menyimpan semua pesanan
    // dibuat private agar tidak bisa diakses langsung dari luar

    //  Method utama
    public void tambahPesanan(DaftarMenu menu, int jumlah) { // Method untuk menambahkan pesanan baru

        daftar.add(new ItemPesanan(menu, jumlah)); // Menambahkan item baru ke dalam list
        System.out.println("Item: " + menu.getNama() + 
                           " | Jumlah: " + jumlah + 
                           " | Total: Rp" + (menu.getHarga() * jumlah)); // Menampilkan informasi item yang baru ditambahkan
    }

    // method overloading, kalo jumlah nya ga diisi maka otomatis keisi 1
    public void tambahPesanan(DaftarMenu menu) { // Method overload (nama sama, parameter beda)
        tambahPesanan(menu, 1); // Jika jumlah tidak diisi, otomatis defauult  1
    }

    // Tampilkan pesanan
    public void tampilPesanan() { // Method ini untuk menampilkan semua pesanan
        System.out.println("\n=== PESANAN ===");

        int no = 1; //nomor urutan pesanan
        for (ItemPesanan item : daftar) { // perulangan untuk membaca semua item dalam list
            System.out.println(no++ + ". " + 
                item.menu.getNama() + 
                " x" + item.jumlah + 
                " = Rp" + (item.menu.getHarga() * item.jumlah));
        } // Menampilkan nama, jumlah, dan total harga tiap item

        System.out.println("Total Item : " + daftar.size()); // Menampilkan jumlah jenis item (bukan total semua barang)
        System.out.println("Total Harga: Rp" + hitungTotal());// Menampilkan total harga semua pesanan
    }

    //  Hitung total harga
    public int hitungTotal() { // Method untuk menghitung total harga semua pesanan
        int total = 0; // Variabel untuk menyimpan total
        for (ItemPesanan item : daftar) {// perulangan untuk semua item
            total += item.menu.getHarga() * item.jumlah; // Menambahkan harga, dikali jumlah ke total
        }
        return total; // Mengembalikan hasil total
    }

    //  Getter
    public ArrayList<ItemPesanan> getDaftar() { // Method ini untuk mengambil data daftar pesanan
        return daftar;// return untuk Mengembalikan list pesanan
    }
}