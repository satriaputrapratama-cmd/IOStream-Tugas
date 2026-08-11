package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class Latihan2 {
    public static void main(String[] args) {
        File berkas = new File("catatan_penting.txt");
        
        try {
            if (berkas.createNewFile()) {
                System.out.println("Berkas berhasil dibuat: " + berkas.getName());
            } else {
                System.out.println("Berkas sudah ada sebelumnya.");
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membuat berkas.");
            e.printStackTrace();
        }
    }
}