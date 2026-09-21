package Controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Sampah;
import model.SampahAnorganik;
import model.SampahOrganik;

public class SampahCRUD {

    private ArrayList<Sampah> daftarSampah;

    public SampahCRUD() {

        daftarSampah = new ArrayList<Sampah>();

        daftarSampah.add(new SampahOrganik(1, "Organik", 5.0, "Ya"));
        daftarSampah.add(new SampahAnorganik(2, "Anorganik", 3.5, "Ya"));
    }

    private boolean cekIdSudahAda(int id) {

        for (int i = 0; i < daftarSampah.size(); i++) {
            if (daftarSampah.get(i).getIdSampah() == id) {
                return true;
            }
        }

        return false;
    }

    public void tambahSampah(Scanner scanner) {

        System.out.println("\n--- TAMBAH DATA SAMPAH ---");

        int id = 0;
        boolean idValid = false;

        while (!idValid) {

            id = InputCek.cekAngka(scanner, "Masukkan ID sampah: ");

            if (cekIdSudahAda(id)) {
                System.out.println("ID sudah digunakan!");
            } else {
                idValid = true;
            }
        }

        String jenis = InputCek.cekJenis(scanner);
        double berat = InputCek.cekDesimal(scanner, "Masukkan berat (kg): ");

        if (jenis.equalsIgnoreCase("Organik")) {

            String mudahTerurai = InputCek.cekYaTidak(scanner,
                    "Apakah mudah terurai (Ya/Tidak): ");

            daftarSampah.add(new SampahOrganik(id, "Organik", berat, mudahTerurai));

        } else {

            String dapatDidaurUlang = InputCek.cekYaTidak(scanner,
                    "Apakah dapat didaur ulang (Ya/Tidak): ");

            daftarSampah.add(new SampahAnorganik(id, "Anorganik", berat, dapatDidaurUlang));
        }

        System.out.println("Data berhasil ditambahkan!");
    }

    public void tampilkanSampah() {

        System.out.println("\n--- DAFTAR DATA SAMPAH ---");

        if (daftarSampah.size() == 0) {
            System.out.println("Data masih kosong!");
        } else {

            for (Sampah sampah : daftarSampah) {
                System.out.println("------------------------------------");
                sampah.tampilkanInfo();
                sampah.cetakStatus();
            }

            System.out.println("------------------------------------");
        }
    }

    public void updateSampah(Scanner scanner) {

        System.out.println("\n--- UPDATE DATA SAMPAH ---");

        if (daftarSampah.size() == 0) {
            System.out.println("Data masih kosong!");
            return;
        }

        int id = InputCek.cekAngka(scanner, "Masukkan ID sampah yang akan diupdate: ");
        boolean ditemukan = false;

        for (int i = 0; i < daftarSampah.size(); i++) {

            Sampah sampah = daftarSampah.get(i);

            if (sampah.getIdSampah() == id) {

                ditemukan = true;
                sampah.tampilkanInfo();

                double berat = InputCek.cekDesimal(scanner, "Masukkan berat baru (kg): ");
                sampah.setBerat(berat);

                if (sampah.getJenisSampah().equalsIgnoreCase("Organik")) {

                    SampahOrganik organik = (SampahOrganik) sampah;

                    String mudahTerurai = InputCek.cekYaTidak(scanner,
                            "Apakah mudah terurai (Ya/Tidak): ");

                    organik.setMudahTerurai(mudahTerurai);

                } else {

                    SampahAnorganik anorganik = (SampahAnorganik) sampah;

                    String dapatDidaurUlang = InputCek.cekYaTidak(scanner,
                            "Apakah dapat didaur ulang (Ya/Tidak): ");

                    anorganik.setDapatDidaurUlang(dapatDidaurUlang);
                }

                System.out.println("Data berhasil diupdate!");
            }
        }

        if (!ditemukan) {
            System.out.println("Data tidak ditemukan!");
        }
    }

    public void hapusSampah(Scanner scanner) {

        System.out.println("\n--- HAPUS DATA SAMPAH ---");

        if (daftarSampah.size() == 0) {
            System.out.println("Data masih kosong!");
            return;
        }

        int id = InputCek.cekAngka(scanner, "Masukkan ID sampah yang akan dihapus: ");
        boolean ditemukan = false;

        for (int i = 0; i < daftarSampah.size(); i++) {

            if (daftarSampah.get(i).getIdSampah() == id) {

                daftarSampah.remove(i);
                ditemukan = true;
                System.out.println("Data berhasil dihapus!");
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Data tidak ditemukan!");
        }
    }
}