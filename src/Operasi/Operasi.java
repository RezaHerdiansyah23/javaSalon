/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operasi;

// import java library
import java.io.IOException;
import java.util.Scanner;

// import CRUD library
import Driver.SalonLagi;

/**
 *
 * @author REZA
 */
public class Operasi {

    /**
     * @param args the command line arguments
     */
    static boolean isLanjutkan = true;
    static Scanner input = new Scanner(System.in);

    static int pilihLayanan;

    static String listLayanan[][] = {
            // perawatan rambutt
            { "Potong Rambut", "15000" }, { "Masker + catok + blow ", "50000" }, { "Smooting", "200000" },
            { "Warna Rambut", "100000" }, { "creambath + hair spa", "40000" }, { "masker + hair spa", "50000" },
            { "toning", "100000" }, { "masker kutu", "70000" },

            // perawatan gigi
            { "Venner Gigi", "300000" }, { "Gigi Kelinci", "150000" }, { "Gigi gingsul dan taring", "100000" },
            { "Tambal gigi", "100000" }, { "Behel Fashion", "120000" }, { "Behel transparan", "150000" },
            { "Behel Perwatan", "300000" },
            { "Behel Thailand", "60000" }, { "Diamond gigi", "30000" }, { "Bleaching gigi", "50000" },
            { "ganti kawat dan karet", "15000" },

            // tindik
            { "Tindik hidung free anting", "50000" }, { "Tindik telinga anting", "50000" },

            // perawatan wajah
            { "Eylish exttension", "80000" }, { "Keriting Bulu mata", "60000" }, { "Facial treatment", "60000" },
            { "Facial acne", "80000" },
            { "Facial Detok", "80000" }, { "Face LED Laser", "60000" }, { "Facial komplit", "100000" },
            { "Sedot Komedo", "50000" },
            { "Setrika wajah", "50000" }, { "BB glowing", "100000" }, { "BB blush-on", "80000" },
            { "BB liptint", "80000" }, { "Henna alis dan bibir", "30000" },
            { "nail art and kuku palsu", "60000" },

            // sulam
            { "Sulam Alis microShanding", "350000" }, { "Sulam Alis microBleending", "350000" },
            { "Sulam bibir", "300000" }, { "Sulam Eyeliner", "300000" },
            { "Sulam Tahi lalat", "150000" },

            // perawatan tubuh
            { "Massange", "70000" }, { "Terapy telinga", "40000" }, { "Lulur Scrub + vit e", "50000" },
            { "bleaching + vit e", "100000" }
    };

    // variabel penampung pesanan pelanggan
    static String namaLayanan[] = new String[1000];
    static int hargaLayanan[] = new int[1000];
    static int jumlahPesan[] = new int[1000];
    static int totalHarga[] = new int[1000];
    static int p = 0;
    static int i = 0;
    static int n = 0;

    // Penjumlahan all
    static int jumlah;
    static int totalLayanan = 0;
    static int totalJenis = 0;
    static int uangBayar = 0;
    static int totalBayarJenis = 0;
    static int totalBayar = 0;
    static int kurang = 0;
    static int kembalian = 0;

    public static void layanan() throws IOException {
        while (isLanjutkan) {
            List.listLayanan();
            i++;
            n++;
            System.out.print("Pilih List Produk : ");
            pilihLayanan = input.nextInt();
            switch (pilihLayanan) {
                case 1:
                    System.out.println("Pesanan anda              : " + listLayanan[0][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[0][1]);
                    System.out.print("jumlah   : ");
                    namaLayanan[i] = listLayanan[0][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[0][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;

                    System.out.println("----------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Pesanan anda              : " + listLayanan[1][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[1][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[1][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[1][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                default:
                    System.err.print("\nInput anda tidak ditemukan\n SILAHKAN PILIH [1-5]");
                    break;
            }
            totalBayarJenis = totalHarga[i];
            totalBayar = totalBayar + totalBayarJenis;

            isLanjutkan = Utility.getYesOrNo("Apakah anda Ingin Lanjutkan : ");
        }
        System.out.println("\n");
        System.out.println("----------------------------------------------------------------");
        System.out.println("                           STRUK PESANAN                        ");

        System.out.println("----------------------------------------------------------------");
        System.out.println("Nama Produk                  Jumlah                       Harga");
        System.out.println("----------------------------------------------------------------");

        for (i = 1; i <= n; i++) {
            System.out.println("" + namaLayanan[i] + "    \t\t" + jumlahPesan[i] + "  \t\t\t Rp." + totalHarga[i]);
        }

        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("                       \t\t\tTotal Bayar : Rp. " + totalBayar);
        System.out.println("----------------------------------------------------------------");

        while (uangBayar < totalBayar) {
            System.out.print("Masukan Pembayaran Anda : Rp. ");
            uangBayar = input.nextInt();

            if (uangBayar < totalBayar) {
                kurang = totalBayar - uangBayar;
                System.out.println("============================Warining!!!==========================");
                System.out.println("Maaf Uang Anda Kurang = Rp. " + kurang);
                System.out.println("-----------------------------------------------------------------");
            } else {
                kurang = uangBayar - totalBayar;
                System.out.println("=================================================================");
                System.out.println("Kembalian = Rp. " + kurang);
                System.out.println();
                System.out.println("Terima Kasih");
                System.out.println("-----------------------------------------------------------------");
            }
        }
    }

}
