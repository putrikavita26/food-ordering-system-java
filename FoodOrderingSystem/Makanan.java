/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FoodOrderingSystem;

/**
 *
 * @author Kelompok 6
 */
class Makanan extends DaftarMenu { 
    private String jenis; //Variabel atribut jenis (misalnya: makanan berat, ringan, dll) dengan akses private (hanya bisa diakses dalam class ini)

    // Konstruktor
    public Makanan(String nama, int harga, String jenis) { //Konstruktor untuk membuat objek Makanan dengan parameter nama, harga, dan jenis
        super(nama, harga); //Memanggil konstruktor dari class induk (DaftarMenu) untuk mengisi nama dan harga
        this.jenis = jenis; //Mengisi nilai atribut jenis dengan nilai parameter yang diberikan
    }

    // Getter
    public String getJenis() { //Method untuk mengambil (mengembalikan) nilai jenis
        return jenis; //Mengembalikan nilai dari variabel jenis
    }

    // Setter
    public void setJenis(String jenis) { //Method untuk mengubah nilai jenis
        this.jenis = jenis; //Mengganti nilai atribut jenis dengan nilai baru dari parameter
    }

    // Override (Polimorfisme)
    @Override
    public void tampil() { //Method ini menimpa (override) method tampil() dari class induk (DaftarMenu)
        System.out.println(getNama() + //Menampilkan nama makanan dengan memanggil method getNama() dari class induk
                " (" + jenis + ") - Rp" + getHarga()); //Menampilkan jenis makanan dan harga dalam format yang rapi
    }
}