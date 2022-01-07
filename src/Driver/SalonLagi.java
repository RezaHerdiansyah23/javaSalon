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
            System.out.println("Database Salon\n");
            System.out.println("1.\tLihat Seluruh Menu\n");
            System.out.println("2.\tTransaksi \n");
            System.out.println("3.\tKeluar\n");

            System.out.print("\n\nPilihan Anda : ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("====================");
                    System.out.println("LIST LAYANAN ");
                    System.out.println("====================");
                    Operasi.layanan();
                    break;
                case "2":
                    System.out.println("===========");
                    System.out.println("TRANSAKSI ");
                    System.out.println("==========");
                    Operasi.layanan();
                    break;
                case "3":
                    System.out.println("===========");
                    System.out.println("KELUAR");
                    System.out.println("==========");

                    break;
                default:
                    System.err.print("\nInput anda tidak ditemukan\n SILAHKAN PILIH [1-5]");

            }
            isLanjutkan = Utility.getYesOrNo("Apakah anda Ingin Lanjutkan : ");

        }

    }

}