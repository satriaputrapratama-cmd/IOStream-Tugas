package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.IOException;

public class Latihan1 {
    public static void main(String[] args) {
        try {
            FileWriter penulis = new FileWriter("catatan.txt");
            penulis.write("Belajar Pemrograman Berorientasi Objek - IO Stream.\n");
            penulis.write("Menulis data ke dalam file teks.");
            penulis.close();
            System.out.println("Berhasil menulis ke dalam file.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan.");
            e.printStackTrace();
        }
    }
}