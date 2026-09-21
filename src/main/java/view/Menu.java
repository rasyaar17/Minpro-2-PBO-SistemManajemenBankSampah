package view;

import Controller.InputCek;
import Controller.SampahCRUD;
import java.util.Scanner;

public class Menu {

    private Scanner scanner;
    private SampahCRUD sampahCRUD;

    public Menu() {

        scanner = new Scanner(System.in);
        sampahCRUD = new SampahCRUD();
    }

    public void tampilkanMenu() {

        while (true) {

            System.out.println("\n====================================");
            System.out.println("     SISTEM MANAJEMEN BANK SAMPAH");
            System.out.println("====================================");
            System.out.println("1. Tambah Data Sampah");
            System.out.println("2. Tampilkan Data Sampah");
            System.out.println("3. Update Data Sampah");
            System.out.println("4. Hapus Data Sampah");
            System.out.println("5. Keluar");
            System.out.println("====================================");

            int pilihan = InputCek.cekPilihan(scanner);

            switch (pilihan) {

                case 1:
                    sampahCRUD.tambahSampah(scanner);
                    break;

                case 2:
                    sampahCRUD.tampilkanSampah();
                    break;

                case 3:
                    sampahCRUD.updateSampah(scanner);
                    break;

                case 4:
                    sampahCRUD.hapusSampah(scanner);
                    break;

                case 5:
                    System.out.println("\nProgram selesai. Terima kasih.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan menu tidak tersedia!");
            }
        }
    }
}