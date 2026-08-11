package bagian2.bacatulis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        try {
            File berkas = new File("catatan.txt");
            Scanner pembaca = new Scanner(berkas);
            while (pembaca.hasNextLine()) {
                String data = pembaca.nextLine();
                System.out.println(data);
            }
            pembaca.close();
        } catch (FileNotFoundException e) {
            System.out.println("Terjadi kesalahan, file tidak ditemukan.");
            e.printStackTrace();
        }
    }
}