package bagian3.kontak;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainKontak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Kontak: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Nomor Telepon: ");
        String telepon = input.nextLine();
        
        Kontak k = new Kontak(nama, telepon);
        
        try {
            FileWriter penulis = new FileWriter("data_kontak.txt", true);
            penulis.write("Nama: " + k.getNama() + ", Telepon: " + k.getNomorTelepon() + "\n");
            penulis.close();
            System.out.println("Kontak berhasil disimpan ke file!");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan kontak.");
            e.printStackTrace();
        }
        
        input.close();
    }
}