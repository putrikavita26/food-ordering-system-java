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

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // membuat alat untuk membaca input user
        Pesanan pesanan = new Pesanan(); // objek untuk menyimpan semua pesanan user
        Transaksi transaksi = new Transaksi(); // objek untuk proses pembayaran

        // Data makanan (disimpan dalam array)
        DaftarMenu[] makanan = {
            new Makanan("Nasi Goreng", 15000, "Goreng"), // objek makanan 1
            new Makanan("Mie Ayam", 12000, "Rebus"),     // objek makanan 2
            new Makanan("Ayam Bakar", 18000, "Bakar"),   // objek makanan 3
            new Makanan("Sate", 20000, "Bakar"),         // objek makanan 4
            new Makanan("Bakso", 13000, "Kuah")          // objek makanan 5
        };

        // Data minuman (disimpan dalam array)
        DaftarMenu[] minuman = {
            new Minuman("Es Teh", 5000, "M"),        // minuman 1
            new Minuman("Jus Jeruk", 8000, "L"),     // minuman 2
            new Minuman("Kopi", 7000, "M"),          // minuman 3
            new Minuman("Susu", 9000, "L"),          // minuman 4
            new Minuman("Air Mineral", 4000, "S")    // minuman 5
        };

        int pilih; // variabel untuk menyimpan pilihan menu utama

        do { // perulangan agar menu terus muncul sampai user keluar
            System.out.println("\n=== ANATASTE FOOD ORDER ===");
            System.out.println("1. Pesan Makanan"); // menu 1
            System.out.println("2. Pesan Minuman"); // menu 2
            System.out.println("3. Lihat Pesanan"); // menu 3
            System.out.println("4. Bayar");         // menu 4
            System.out.println("5. Keluar");        // menu 5
            System.out.print("Pilih: ");
            pilih = input.nextInt(); // membaca pilihan user

            switch (pilih) {

                case 1: // jika user pilih menu makanan
                    int pilihM;
                    do { // loop supaya bisa pilih makanan berkali-kali
                        System.out.println("\n--- DAFTAR MAKANAN ---");

                        for (int i = 0; i < makanan.length; i++) { // menampilkan semua makanan
                            System.out.print((i + 1) + ". "); // nomor menu
                            makanan[i].tampil(); // menampilkan detail makanan
                        }

                        System.out.println("0. Kembali"); // opsi keluar
                        System.out.print("Pilih: ");
                        pilihM = input.nextInt(); // input pilihan makanan

                        if (pilihM >= 1 && pilihM <= makanan.length) { // cek apakah valid
                            System.out.print("Jumlah: ");
                            int jumlah = input.nextInt(); // jumlah item
                            pesanan.tambahPesanan(makanan[pilihM - 1], jumlah); // simpan ke pesanan
                        } else if (pilihM != 0) { // kalau bukan 0 dan bukan pilihan valid
                            System.out.println("Pilihan tidak valid!"); // kasih peringatan
                        }

                    } while (pilihM != 0); // berhenti kalau pilih 0
                    break;

                case 2: // jika user pilih minuman
                    int pilihD;
                    do { // loop pilih minuman
                        System.out.println("\n--- DAFTAR MINUMAN ---");

                        for (int i = 0; i < minuman.length; i++) { // tampilkan semua minuman
                            System.out.print((i + 1) + ". ");
                            minuman[i].tampil();
                        }

                        System.out.println("0. Kembali");
                        System.out.print("Pilih: ");
                        pilihD = input.nextInt(); // input pilihan

                        if (pilihD >= 1 && pilihD <= minuman.length) { // validasi
                            System.out.print("Jumlah: ");
                            int jumlah = input.nextInt();
                            pesanan.tambahPesanan(minuman[pilihD - 1], jumlah); // simpan pesanan
                        } else if (pilihD != 0) {
                            System.out.println("Pilihan tidak valid!");
                        }

                    } while (pilihD != 0); // keluar kalau 0
                    break;

                case 3:
                    pesanan.tampilPesanan(); // menampilkan semua pesanan user
                    break;

                case 4:
                    transaksi.cetakStruk(pesanan); // proses pembayaran + tampilkan struk
                    pesanan = new Pesanan(); // reset pesanan agar user berikutnya mulai dari kosong
                    break;

                case 5:
                    System.out.println("Terima kasih!"); // keluar program
                    break;

                default:
                    System.out.println("Pilihan tidak valid!"); // jika input tidak sesuai menu
            }

        } while (pilih != 5); // program berhenti kalau user pilih 5
    }
}