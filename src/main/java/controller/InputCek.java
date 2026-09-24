package controller;

import java.util.Scanner;

public class InputCek {

    public static int cekAngka(Scanner scanner, String pesan) {

        int angka = 0;
        boolean valid = false;

        while (!valid) {

            System.out.print(pesan);
            String input = scanner.nextLine();

            try {
                angka = Integer.parseInt(input.trim());

                if (angka > 0) {
                    valid = true;
                } else {
                    System.out.println("ID harus lebih dari 0!");
                }

            } catch (NumberFormatException e) {
                System.out.println("ID harus berupa angka!");
            }
        }

        return angka;
    }

    public static double cekDesimal(Scanner scanner, String pesan) {

        double angka = 0;
        boolean valid = false;

        while (!valid) {

            System.out.print(pesan);
            String input = scanner.nextLine();

            try {
                angka = Double.parseDouble(input.trim());

                if (angka <= 0) {
                    System.out.println("Berat harus lebih dari 0!");
                } else if (angka > 1000) {
                    System.out.println("Berat maksimal 1000 kg!");
                } else {
                    valid = true;
                }

            } catch (NumberFormatException e) {
                System.out.println("Berat harus berupa angka!");
            }
        }

        return angka;
    }

    public static String cekJenis(Scanner scanner) {

        String jenis = "";
        boolean valid = false;

        while (!valid) {

            System.out.print("Masukkan jenis sampah (Organik/Anorganik): ");
            jenis = scanner.nextLine().trim();

            if (!jenis.equalsIgnoreCase("Organik")
                    && !jenis.equalsIgnoreCase("Anorganik")) {
                System.out.println("Jenis sampah hanya Organik atau Anorganik!");
            } else {
                valid = true;
            }
        }

        return jenis;
    }

    public static String cekYaTidak(Scanner scanner, String pesan) {

        String jawaban = "";
        boolean valid = false;

        while (!valid) {

            System.out.print(pesan);
            jawaban = scanner.nextLine().trim();

            if (!jawaban.equalsIgnoreCase("Ya")
                    && !jawaban.equalsIgnoreCase("Tidak")) {
                System.out.println("Jawaban hanya Ya atau Tidak!");
            } else {
                valid = true;
            }
        }

        return jawaban;
    }

    public static int cekPilihan(Scanner scanner) {

        int pilihan = 0;
        boolean valid = false;

        while (!valid) {

            System.out.print("Masukkan pilihan menu: ");
            String input = scanner.nextLine();

            try {
                pilihan = Integer.parseInt(input.trim());
                valid = true;

            } catch (NumberFormatException e) {
                System.out.println("Pilihan menu harus berupa angka!");
            }
        }

        return pilihan;
    }
}