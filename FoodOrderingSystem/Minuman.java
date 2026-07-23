/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FoodOrderingSystem;

/**
 *
 * @author Kelompok 6
 */
class Minuman extends DaftarMenu { 
    private String ukuran; //Variabel atribut ukuran (misalnya: kecil, sedang, besar) dengan akses private

    // Konstruktor
    public Minuman(String nama, int harga, String ukuran) { //Konstruktor untuk membuat objek Minuman dengan parameter nama, harga, dan ukuran
        super(nama, harga); //Memanggil konstruktor dari class induk (DaftarMenu) untuk mengisi nama dan harga
        this.ukuran = ukuran; //Mengisi nilai atribut ukuran dengan parameter yang diberikan
    }

    // Getter
    public String getUkuran() { //Method untuk mengambil nilai ukuran
        return ukuran; //Mengembalikan nilai dari variabel ukuran
    }

    // Setter
    public void setUkuran(String ukuran) { //Method untuk mengubah nilai ukuran
        this.ukuran = ukuran; //Mengganti nilai atribut ukuran dengan nilai baru
    }

    // Override (Polimorfisme)
    @Override
    public void tampil() { //Method ini menimpa (override) method tampil() dari class DaftarMenu
        System.out.println(getNama() + //Menampilkan nama minuman dengan memanggil method dari class induk
                " (" + ukuran + ") - Rp" + getHarga()); //Menampilkan ukuran minuman dan harga dalam format rapi
    }
}
