/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FoodOrderingSystem;

/**
 *
 * @author Kelompok 6
 */
class DaftarMenu { // Class utama untuk menyimpan data menu (parent class)

    private String nama; // Variabel untuk menyimpan nama menu (dibuat private biar aman)
    private int harga;   // Variabel untuk menyimpan harga menu

    // Konstruktor (dipanggil saat object dibuat pertama kali)
    public DaftarMenu(String nama, int harga) {
        this.nama = nama;   // Mengisi nilai nama dari parameter ke variabel class
        this.harga = harga; // Mengisi nilai harga dari parameter ke variabel class
    }

    // Getter untuk mengambil nilai nama dari luar class
    public String getNama() {
        return nama; // Mengembalikan nilai nama
    }

    // Setter untuk mengubah nilai nama
    public void setNama(String nama) {
        this.nama = nama; // Mengganti nilai nama dengan yang baru
    }

    // Getter untuk mengambil nilai harga
    public int getHarga() {
        return harga; // Mengembalikan nilai harga
    }

    // Setter untuk mengubah harga
    public void setHarga(int harga) {
        this.harga = harga; // Mengganti nilai harga dengan yang baru
    }

    // Method untuk menampilkan data menu ke layar
    public void tampil() {
        System.out.println(nama + " - Rp" + harga); // Menampilkan nama dan harga menu
    }
}