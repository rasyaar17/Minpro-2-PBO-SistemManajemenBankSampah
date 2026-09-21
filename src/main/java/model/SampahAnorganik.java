package model;

public class SampahAnorganik extends Sampah {

    private String dapatDidaurUlang;

    public SampahAnorganik(int idSampah, String jenisSampah,
            double berat, String dapatDidaurUlang) {

        super(idSampah, jenisSampah, berat);
        this.dapatDidaurUlang = dapatDidaurUlang;
    }

    public String getDapatDidaurUlang() {
        return dapatDidaurUlang;
    }

    public void setDapatDidaurUlang(String dapatDidaurUlang) {
        if (dapatDidaurUlang.trim().equals("")) {
            System.out.println("Data tidak boleh kosong!");
        } else {
            this.dapatDidaurUlang = dapatDidaurUlang;
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Dapat Didaur Ulang : " + dapatDidaurUlang);
    }
}