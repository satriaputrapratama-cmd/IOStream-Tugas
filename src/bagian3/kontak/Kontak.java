package bagian3.kontak;

public class Kontak {
    private String nama;
    private String nomorTelepon;

    public Kontak(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + " | Telepon: " + nomorTelepon);
    }
}