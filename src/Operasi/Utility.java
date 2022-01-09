package Operasi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.text.*;

public class Utility {

    public static boolean getYesOrNo(String message) {
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n" + message + " (y/n)? ");
        String pilihanUser = terminalInput.next();

        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("Pilihan anda bukan y atau n");
            System.out.print("\n" + message + " (y/n)? ");
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");

    }

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex) {
            System.err.println("tidak bisa clear screen");
        }
    }

    protected static String ambilDate() throws IOException {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        boolean dateValid = false;
        Scanner terminalInput = new Scanner(System.in);
        String dateInput = terminalInput.nextLine();
        while (!dateValid) {
            try {
                ft.parse(dateInput);
                dateValid = true;
            } catch (Exception e) {
                System.out.println("Format tanggal yang anda masukan salah, format=(yyyy.MM.dd)");
                System.out.print("silahkan masukan tahun terbit lagi: ");
                dateValid = false;
                dateInput = terminalInput.nextLine();
            }
        }

        return dateInput;
    }

    static long ambilEntryDate(String kasir, String date) throws IOException {
        FileReader fileInput = new FileReader("penjualan.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        long entry = 0;
        String data = bufferInput.readLine();
        Scanner dataScanner;
        String primaryKey;

        while (data != null) {
            dataScanner = new Scanner(data);
            dataScanner.useDelimiter(",");
            primaryKey = dataScanner.next();
            dataScanner = new Scanner(primaryKey);
            dataScanner.useDelimiter("_");

            kasir = kasir.replaceAll("\\s+", "");

            if (kasir.equalsIgnoreCase(dataScanner.next()) && date.equalsIgnoreCase(dataScanner.next())) {
                entry = dataScanner.nextInt();
            }

            data = bufferInput.readLine();
        }

        return entry;
    }

    static boolean cekDataPenjualan(String[] keywords, boolean isDisplay) throws IOException {

        FileReader fileInput = new FileReader("penjualan.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String data = bufferInput.readLine();
        boolean isExist = false;
        int nomorData = 0;

        if (isDisplay) {
            System.out
                    .println(
                            "\n║  No ║ \tTahun ║ \tKasir                  ║ \tNama Layanan               ║ \tHarga Layanan");
            System.out.println(
                    "════════════════════════════════════════════════════════════════════════════════════════════════════════════");
        }
        while (data != null) {

            // cek keywords didalam baris
            isExist = true;

            for (String keyword : keywords) {
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }

            // jika keywordsnya cocok maka tampilkan

            if (isExist) {
                if (isDisplay) {
                    nomorData++;
                    StringTokenizer stringToken = new StringTokenizer(data, ",");

                    stringToken.nextToken();
                    System.out.printf("║  %2d ", nomorData);
                    System.out.printf("║ \t%4s  ", stringToken.nextToken());
                    System.out.printf("║ \t%-20s   ", stringToken.nextToken());
                    System.out.printf("║ \t%-20s   ", stringToken.nextToken());
                    System.out.printf("║ \t%s   ", stringToken.nextToken());
                    System.out.print("\n");
                } else {
                    break;
                }
            }

            data = bufferInput.readLine();
        }

        if (isDisplay) {
            System.out.println(
                    "════════════════════════════════════════════════════════════════════════════════════════════════════════════");
        }

        return isExist;
    }
}
