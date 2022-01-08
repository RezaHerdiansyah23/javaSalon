/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import java.io.IOException;
import java.util.Scanner;

import Operasi.Operasi;
import Operasi.Utility;
import Operasi.List;

/**
 *
 * @author REZA
 */
public class SalonLagi {

    public static void menu() throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;

        // perulangan di mulai
        while (isLanjutkan) {
            Utility.clearScreen();
            System.out.println("╔════════════════════════════════════════════╗");
            System.out.println("║               AAN SALON BEAUTY             ║");
            System.out.println("╚════════════════════════════════════════════╝");
            System.out.println("╔═════╦═════════════════════════════════════╗");
            System.out.println("║ No  ║             MENU                    ║");
            System.out.println("╠═════╬═════════════════════════════════════╬");
            System.out.println("║   1 ║ List layanan                        ║");
            System.out.println("║   2 ║ Transaksi                           ║");
            System.out.println("║   3 ║ Tampilkan data penjualan            ║");
            System.out.println("║   4 ║ Cari data penjualan                 ║");
            System.out.println("║   5 ║ Keluar                              ║");
            System.out.println("╚═════╩═════════════════════════════════════╝");

            System.out.print("\n\nPilihan Anda : ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("╔════════════════════════════════════════════╗");
                    System.out.println("║                  LIST LAYANAN              ║");
                    System.out.println("╚════════════════════════════════════════════╝");
                    List.listLayanan();
                    break;
                case "2":
                    System.out.println("╔════════════════════════════════════════════╗");
                    System.out.println("║                  TRANSAKSI                 ║");
                    System.out.println("╚════════════════════════════════════════════╝");
                    ;
                    Operasi.layanan();
                    break;
                case "3":
                    System.out.println("╔════════════════════════════════════════════╗");
                    System.out.println("║                  DATA PENJUALAN            ║");
                    System.out.println("╚════════════════════════════════════════════╝");
                    Operasi.tampilkanData();
                    break;
                case "4":
                    System.out.println("╔════════════════════════════════════════════╗");
                    System.out.println("║                 CARI DATA PENJUALAN        ║");
                    System.out.println("╚════════════════════════════════════════════╝");
                    Operasi.cariData();
                    break;
                case "5":
                    System.out.println("╔════════════════════════════════════════════╗");
                    System.out.println("║                  KELUAR                    ║");
                    System.out.println("╚════════════════════════════════════════════╝");
                    System.exit(0);
                    break;
                default:
                    System.err.print("\nInput anda tidak ditemukan\n SILAHKAN PILIH [1-5]");

            }
            isLanjutkan = Utility.getYesOrNo("Apakah anda Ingin Lanjutkan : ");

        }

    }

}