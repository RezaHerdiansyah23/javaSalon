package Operasi;

import java.io.IOException;
import java.util.Scanner;

public class List {

    public static void listLayanan() throws IOException {
        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        Utility.clearScreen();
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║               LIST LAYANAN                 ║");
        System.out.println("╚════════════════════════════════════════════╝");
        System.out.println("╔═════╦═════════════════════════════════════╗");
        System.out.println("║ No  ║     Kategori Layanan                ║");
        System.out.println("╠═════╬═════════════════════════════════════╬");
        System.out.println("║   1 ║ Perawatan Rambut                    ║");
        System.out.println("║   2 ║ Perwatan Gigi                       ║");
        System.out.println("║   3 ║ Tindik                              ║");
        System.out.println("║   4 ║ Perawatan Wajah                     ║");
        System.out.println("║   5 ║ Sulam                               ║");
        System.out.println("║   6 ║ Perwatan Tubuh                      ║");
        System.out.println("╚═════╩═════════════════════════════════════╝");
        System.out.print("\n\nPilihan Anda : ");
        pilihanUser = terminalInput.next();
        switch (pilihanUser) {
            case "1":
                System.out.println("╔════════════════════════════════════════════╗");
                System.out.println("║               PERWATAN RAMBUT              ║");
                System.out.println("╚════════════════════════════════════════════╝");
                System.out.println("╔═════╦══════════════════════╦═══════════════╗");
                System.out.println("║ No  ║     Nama Layanan     ║ Harga Layanan ║");
                System.out.println("╠═════╬══════════════════════╬═══════════════╣");
                System.out.println("║   1 ║ Potong Rambut        ║Rp15.000       ║");
                System.out.println("║   2 ║ Masker+catok+Blow    ║Rp50.000       ║");
                System.out.println("║   3 ║ Smooting             ║Rp200.000      ║");
                System.out.println("║   4 ║ Bonding              ║Rp150.000      ║");
                System.out.println("║   5 ║ Creambath+ hari spa  ║Rp40.000       ║");
                System.out.println("║   6 ║ Masker+hair  spa     ║Rp50.000       ║");
                System.out.println("║   7 ║ Toning               ║Rp100.000      ║");
                System.out.println("║   8 ║ Masker Kutu          ║Rp70.000       ║");
                System.out.println("╚═════╩══════════════════════╩═══════════════╝");
                break;
            case "2":
                System.out.println("╔═══════════════════════════════════════════════╗");
                System.out.println("║               PERWATAN GIGI                   ║");
                System.out.println("╚═══════════════════════════════════════════════╝");
                System.out.println("╔═════╦═════════════════════════╦═══════════════╗");
                System.out.println("║ No  ║     Nama Layanan        ║ Harga Layanan ║");
                System.out.println("╠═════╬═════════════════════════╬═══════════════╣");
                System.out.println("║   9 ║ Venner Gigi             ║Rp300.000      ║");
                System.out.println("║  10 ║ Gigi Kelinci            ║Rp150.000      ║");
                System.out.println("║  11 ║ Gigi gingsul dan taring ║Rp100.000      ║");
                System.out.println("║  12 ║ Tambal gigi             ║Rp100.000      ║");
                System.out.println("║  13 ║ Behel fashion           ║Rp120.000      ║");
                System.out.println("║  14 ║ Behel perawatan         ║Rp120.000      ║");
                System.out.println("║  15 ║ Behel transparan        ║Rp150.000      ║");
                System.out.println("║  16 ║ Behel Thailand          ║Rp60.000       ║");
                System.out.println("║  17 ║ Diamond gigi            ║Rp30.000       ║");
                System.out.println("║  18 ║ Bleaching gigi          ║Rp50.000       ║");
                System.out.println("║  19 ║ Ganti kawat dan karet   ║Rp15.000       ║");
                System.out.println("╚═════╩═════════════════════════╩═══════════════╝");
                break;
            case "3":
                System.out.println("╔════════════════════════════════════════════════════╗");
                System.out.println("║                      TINDIK                        ║");
                System.out.println("╚════════════════════════════════════════════════════╝");
                System.out.println("╔═════╦══════════════════════════════╦═══════════════╗");
                System.out.println("║ No  ║     Nama Layanan             ║ Harga Layanan ║");
                System.out.println("╠═════╬══════════════════════════════╬═══════════════╣");
                System.out.println("║  20 ║ Tindik hidung free anting    ║Rp50.000       ║");
                System.out.println("║  21 ║ Tindik telinga free anting   ║Rp50.000       ║");
                System.out.println("╚═════╩══════════════════════════════╩═══════════════╝");
                break;
            case "4":
                System.out.println("╔═══════════════════════════════════════════════╗");
                System.out.println("║               PERWATAN WAJAH                   ║");
                System.out.println("╚═══════════════════════════════════════════════╝");
                System.out.println("╔═════╦═════════════════════════╦═══════════════╗");
                System.out.println("║ No  ║     Nama Layanan        ║ Harga Layanan ║");
                System.out.println("╠═════╬═════════════════════════╬═══════════════╣");
                System.out.println("║  22 ║ Eyelash extension       ║Rp80.000       ║");
                System.out.println("║  23 ║ Keriting bulu mata      ║Rp60.000       ║");
                System.out.println("║  24 ║ Facial treatment        ║Rp60.000       ║");
                System.out.println("║  25 ║ Facial acne             ║Rp80.000       ║");
                System.out.println("║  26 ║ Facial detok            ║Rp80.000       ║");
                System.out.println("║  27 ║ Facial LED laser        ║Rp80.000       ║");
                System.out.println("║  28 ║ Facial komplit          ║Rp100.000      ║");
                System.out.println("║  29 ║ Sedot Komedo            ║Rp50.000       ║");
                System.out.println("║  30 ║ Setrika wajah           ║Rp50.000       ║");
                System.out.println("║  31 ║ BB glowing              ║Rp100.000      ║");
                System.out.println("║  32 ║ BB blush-on             ║Rp80.000       ║");
                System.out.println("║  33 ║ BB liptint              ║Rp80.000       ║");
                System.out.println("║  34 ║ Henna alis dan bibir    ║Rp30.000       ║");
                System.out.println("║  35 ║ Nail art dan kuku palsu ║Rp60.000       ║");
                System.out.println("╚═════╩═════════════════════════╩═══════════════╝");
                break;
            case "5":
                System.out.println("╔═════════════════════════════════════════════════╗");
                System.out.println("║                   SULAM                         ║");
                System.out.println("╚═════════════════════════════════════════════════╝");
                System.out.println("╔═════╦═══════════════════════════╦═══════════════╗");
                System.out.println("║ No  ║     Nama Layanan          ║ Harga Layanan ║");
                System.out.println("╠═════╬═══════════════════════════╬═══════════════╣");
                System.out.println("║  36 ║ Sulam alis microShhanding ║Rp350.000      ║");
                System.out.println("║  37 ║ Sulam alis microBleeading ║Rp350.000      ║");
                System.out.println("║  38 ║ Sulam bibir               ║Rp300.000      ║");
                System.out.println("║  39 ║ Sulam Eyeliner            ║Rp300.000      ║");
                System.out.println("║  40 ║ Sulam tahi lalat          ║Rp150.000      ║");
                System.out.println("╚═════╩═══════════════════════════╩═══════════════╝");
                break;
            case "6":
                System.out.println("╔═════════════════════════════════════════════════╗");
                System.out.println("║                 PERWATAN TUBUH                  ║");
                System.out.println("╚═════════════════════════════════════════════════╝");
                System.out.println("╔═════╦═══════════════════════════╦═══════════════╗");
                System.out.println("║ No  ║     Nama Layanan          ║ Harga Layanan ║");
                System.out.println("╠═════╬═══════════════════════════╬═══════════════╣");
                System.out.println("║  41 ║ Massange                  ║Rp70.000       ║");
                System.out.println("║  42 ║ Terapy telinga            ║Rp40.000       ║");
                System.out.println("║  43 ║ Lulur scrub + VIt e kulit ║Rp50.000       ║");
                System.out.println("║  44 ║ Bleaching + vit e kulit   ║Rp100.000      ║");
                System.out.println("╚═════╩═══════════════════════════╩═══════════════╝");
                break;

        }
    }

}
