package model;

public class SampahOrganik extends Sampah {

    private String mudahTerurai;

    public SampahOrganik(int idSampah, String jenisSampah,
            double berat, String mudahTerurai) {

        super(idSampah, jenisSampah, berat);
        this.mudahTerurai = mudahTerurai;
    }

    public String getMudahTerurai() {
        return mudahTerurai;
    }

    public void setMudahTerurai(String mudahTerurai) {
        if (mudahTerurai.trim().equals("")) {
            System.out.println("Data tidak boleh kosong!");
        } else {
            this.mudahTerurai = mudahTerurai;
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Mudah Terurai : " + mudahTerurai);
    }
}