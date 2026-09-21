package model;

public class Sampah {

    private final int idSampah;
    protected String jenisSampah;
    protected double berat;

    public Sampah(int idSampah, String jenisSampah, double berat) {
        this.idSampah = idSampah;
        this.jenisSampah = jenisSampah;
        this.berat = berat;
    }

    public int getIdSampah() {
        return idSampah;
    }

    public String getJenisSampah() {
        return jenisSampah;
    }

    public double getBerat() {
        return berat;
    }

    public void setJenisSampah(String jenisSampah) {
        if (jenisSampah.trim().equals("")) {
            System.out.println("Jenis sampah tidak boleh kosong!");
        } else {
            this.jenisSampah = jenisSampah;
        }
    }

    public void setBerat(double berat) {
        if (berat <= 0) {
            System.out.println("Berat harus lebih dari 0!");
        } else if (berat > 1000) {
            System.out.println("Berat maksimal 1000 kg!");
        } else {
            this.berat = berat;
        }
    }

    public void tampilkanInfo() {
        System.out.println("ID Sampah    : " + idSampah);
        System.out.println("Jenis Sampah : " + jenisSampah);
        System.out.println("Berat        : " + berat + " kg");
    }

    public final void cetakStatus() {
        if (berat >= 10) {
            System.out.println("Status       : Setoran besar");
        } else {
            System.out.println("Status       : Setoran biasa");
        }
    }
}