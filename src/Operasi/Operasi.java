/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operasi;

// import java library
import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

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
    static int i = 0;
    static int n = 0;

    // Penjumlahan all
    static int jumlah;
    static int totalLayanan = 0;
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
                case 3:
                    System.out.println("Pesanan anda              : " + listLayanan[2][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[2][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[2][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[2][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 4:
                    System.out.println("Pesanan anda              : " + listLayanan[3][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[3][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[3][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[3][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 5:
                    System.out.println("Pesanan anda              : " + listLayanan[4][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[4][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[4][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[4][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 6:
                    System.out.println("Pesanan anda              : " + listLayanan[5][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[5][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[5][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[5][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 7:
                    System.out.println("Pesanan anda              : " + listLayanan[6][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[6][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[6][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[6][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 8:
                    System.out.println("Pesanan anda              : " + listLayanan[7][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[7][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[7][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[7][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 9:
                    System.out.println("Pesanan anda              : " + listLayanan[8][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[8][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[8][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[8][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 10:
                    System.out.println("Pesanan anda              : " + listLayanan[9][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[9][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[9][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[9][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 11:
                    System.out.println("Pesanan anda              : " + listLayanan[10][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[10][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[10][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[10][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 12:
                    System.out.println("Pesanan anda              : " + listLayanan[11][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[11][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[11][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[11][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 13:
                    System.out.println("Pesanan anda              : " + listLayanan[12][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[12][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[12][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[12][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 14:
                    System.out.println("Pesanan anda              : " + listLayanan[13][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[13][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[13][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[13][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 15:
                    System.out.println("Pesanan anda              : " + listLayanan[14][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[14][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[14][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[14][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 16:
                    System.out.println("Pesanan anda              : " + listLayanan[15][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[15][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[15][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[15][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 17:
                    System.out.println("Pesanan anda              : " + listLayanan[16][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[16][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[16][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[16][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 18:
                    System.out.println("Pesanan anda              : " + listLayanan[17][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[17][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[17][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[17][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 19:
                    System.out.println("Pesanan anda              : " + listLayanan[18][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[18][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[18][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[18][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 20:
                    System.out.println("Pesanan anda              : " + listLayanan[19][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[19][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[19][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[19][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 21:
                    System.out.println("Pesanan anda              : " + listLayanan[20][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[20][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[20][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[20][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 22:
                    System.out.println("Pesanan anda              : " + listLayanan[21][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[21][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[21][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[21][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 23:
                    System.out.println("Pesanan anda              : " + listLayanan[22][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[22][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[22][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[22][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 24:
                    System.out.println("Pesanan anda              : " + listLayanan[23][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[23][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[23][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[23][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 25:
                    System.out.println("Pesanan anda              : " + listLayanan[24][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[24][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[24][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[24][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 26:
                    System.out.println("Pesanan anda              : " + listLayanan[25][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[25][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[25][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[25][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 27:
                    System.out.println("Pesanan anda              : " + listLayanan[26][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[26][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[26][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[26][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 28:
                    System.out.println("Pesanan anda              : " + listLayanan[27][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[27][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[27][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[27][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 29:
                    System.out.println("Pesanan anda              : " + listLayanan[28][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[28][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[28][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[28][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 30:
                    System.out.println("Pesanan anda              : " + listLayanan[29][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[29][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[29][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[29][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 31:
                    System.out.println("Pesanan anda              : " + listLayanan[30][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[30][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[30][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[30][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 32:
                    System.out.println("Pesanan anda              : " + listLayanan[31][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[31][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[31][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[31][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 33:
                    System.out.println("Pesanan anda              : " + listLayanan[32][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[32][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[32][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[32][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 34:
                    System.out.println("Pesanan anda              : " + listLayanan[33][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[33][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[33][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[33][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 35:
                    System.out.println("Pesanan anda              : " + listLayanan[34][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[34][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[34][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[34][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 36:
                    System.out.println("Pesanan anda              : " + listLayanan[35][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[35][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[35][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[35][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 37:
                    System.out.println("Pesanan anda              : " + listLayanan[36][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[36][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[36][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[36][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 38:
                    System.out.println("Pesanan anda              : " + listLayanan[37][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[37][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[37][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[37][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 39:
                    System.out.println("Pesanan anda              : " + listLayanan[38][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[38][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[38][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[38][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 40:
                    System.out.println("Pesanan anda              : " + listLayanan[39][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[39][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[39][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[39][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 41:
                    System.out.println("Pesanan anda              : " + listLayanan[40][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[40][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[40][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[40][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 42:
                    System.out.println("Pesanan anda              : " + listLayanan[41][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[41][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[41][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[41][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 43:
                    System.out.println("Pesanan anda              : " + listLayanan[42][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[42][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[42][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[42][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                case 44:
                    System.out.println("Pesanan anda              : " + listLayanan[43][0]);
                    System.out.println("Harga                     : Rp. " + listLayanan[43][1]);
                    System.out.print("jumlah  : ");
                    namaLayanan[i] = listLayanan[43][0];
                    jumlahPesan[i] = input.nextInt();
                    jumlah = Integer.parseInt(listLayanan[43][1]) * jumlahPesan[i];
                    totalHarga[i] = jumlah;
                    break;
                default:
                    System.err.print("\nInput anda tidak ditemukan\n SILAHKAN PILIH [1-44]");
                    break;
            }
            totalBayarJenis = totalHarga[i];
            totalBayar = totalBayar + totalBayarJenis;

            isLanjutkan = Utility.getYesOrNo("Apakah anda Ingin Lanjutkan : ");
        }
        System.out.println("\n");

        System.out
                .println("╔═════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out
                .println("║           NAMA LAYANAN            JUMLAH           HARGA                                ║");
        System.out
                .println("╠═════════════════════════════════════════════════════════════════════════════════════════╣");

        for (i = 1; i <= n; i++) {
            System.out.println(
                    "╠" + namaLayanan[i] + "\t\t" + jumlahPesan[i] + "\t\t Rp." + totalHarga[i] + "\t\t╣");
        }

        System.out.println();
        System.out
                .println("╚══════════════════════════════════╩═════════╩════════════════════════════════════════════╝");
        System.out.println("                       \t\t\tTotal Bayar : Rp. " + totalBayar);
        System.out
                .println("═══════════════════════════════════════════════════════════════════════════════════════════");

        while (uangBayar < totalBayar) {
            System.out.print("Masukan Pembayaran Anda : Rp. ");
            uangBayar = input.nextInt();

            if (uangBayar < totalBayar) {
                kurang = totalBayar - uangBayar;
                System.out.println("╔═════════════════════════════════════════════════════════════════════╗");
                System.out.println("║                          !!!!UANG ANDA KURANG !!!!                  ║");
                System.out.println("╠═════════════════════════════════════════════════════════════════════╣");
                System.out.println("Maaf Uang Anda Kurang = Rp. " + kurang);
                System.out.println("╚═════════════════════════════════════════════════════════════════════╝");
            } else {
                kurang = uangBayar - totalBayar;
                System.out.println("═══════════════════════════════════════════════════════════════════════════");
                System.out.println("Kembalian = Rp. " + kurang);
                System.out.println();
                System.out.println("Terima Kasih");
                System.out.println("═══════════════════════════════════════════════════════════════════════════");
            }
        }

        // menambahkan data pembukuan pelanggan
        FileWriter fileOutput = new FileWriter("penjualan.txt", true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        // mengambil input dari user
        Scanner terminalInput = new Scanner(System.in);
        String kasir, date;

        System.out.print("masukan nama penulis: ");
        kasir = terminalInput.nextLine();
        System.out.print("masukan tanggal transaksi , format=(yyyy.MM.dd): ");
        date = Utility.ambilDate();

        String[] keywords = {
                date + "," + kasir + "," + namaLayanan[i] + "," + jumlahPesan[i] + "," + totalHarga[i] };
        System.out.println(Arrays.toString(keywords));

        // menulis data di databse

        // fiersabesari_2012_1,2012,fiersa besari,media kita,jejak langkah
        System.out.println(Utility.ambilEntryDate(kasir, date));
        long nomorEntry = Utility.ambilEntryDate(kasir, date) + 1;
        for (i = 1; i <= n; i++) {
            String kasirTanpaSpasi = kasir.replaceAll("\\s+", "");
            String primaryKey = kasirTanpaSpasi + "_" + date + "_" + nomorEntry;
            System.out.println("\nData yang akan anda masukan adalah");
            System.out.println("════════════════════════════════════════");
            System.out.println("primary key       : " + primaryKey);
            System.out.println("tanggal transaksi : " + date);
            System.out.println("Kasir             : " + kasir);
            System.out.println("total        : " + jumlahPesan[i]);
            System.out.println("nama layanan : " + namaLayanan[i]);
            System.out.println("harga        : " + totalHarga[i]);

            boolean isTambah = Utility.getYesOrNo("Apakah akan ingin menambah data tersebut? ");

            if (isTambah) {
                bufferOutput.write(primaryKey + "," + date + "," + kasir + "," + namaLayanan[i] + "," + totalHarga[i]
                        + "," + jumlahPesan[i]);
                bufferOutput.newLine();
                bufferOutput.flush();
            }
        }
        bufferOutput.close();
    }

    // menampilkan data semua data penjualan

    public static void tampilkanData() throws IOException {

        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("penjualan.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e) {
            System.err.println("file Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahoeloe");
            layanan();
            return;
        }

        System.out.println(
                "\n║  No ║ \tTahun ║ \tKasir                ║ \tNama Layanan               ║ \tharga Layanan");
        System.out.println(
                "════════════════════════════════════════════════════════════════════════════════════════════════════════════");

        String data = bufferInput.readLine();
        int nomorData = 0;
        while (data != null) {
            nomorData++;

            StringTokenizer stringToken = new StringTokenizer(data, ",");

            stringToken.nextToken();
            System.out.printf("║  %2d ", nomorData);
            System.out.printf("║ \t%4s  ", stringToken.nextToken());
            System.out.printf("║ \t%-20s   ", stringToken.nextToken());
            System.out.printf("║ \t%-20s   ", stringToken.nextToken());
            System.out.printf("║ \t%s   ", stringToken.nextToken());
            System.out.print("\n");

            data = bufferInput.readLine();
        }

        System.out.println(
                "════════════════════════════════════════════════════════════════════════════════════════════════════════════");
    }

    // mencari data
    public static void cariData() throws IOException {

        // membaca database ada atau tidak

        try {
            File file = new File("penjualan.txt");
        } catch (Exception e) {
            System.err.println("file Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahoeloe");
            layanan();
            return;
        }

        // ambil keyword dari user
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukan kata kunci untuk mencari data: ");
        String cariString = terminalInput.nextLine();
        String[] keywords = cariString.split("\\s+");

        // cek keyword di database
        Utility.cekDataPenjualan(keywords, true);

    }
}
