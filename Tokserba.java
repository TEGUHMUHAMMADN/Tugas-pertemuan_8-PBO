/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg8;

/**
 *
 * @author 62859
 */
import java.util.Scanner;

public class Tokserba {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] kodeBarang = new String[5];
        String[] namaBarang = {"Penghapus", "Buku", "Pensil", "Pulpen", "Spidol"};
        int[] hargaBarang = {2000, 3000, 4000, 5000, 6000};
        int[] jumlahBeli = new int[5];
        int[] jumlahBayar = new int[5];
        int totalBayar = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Masukkan Kode Barang (001-005): ");
            kodeBarang[i] = scanner.next();
            System.out.print("Masukkan Jumlah Beli: ");
            jumlahBeli[i] = scanner.nextInt();
            int index = Integer.parseInt(kodeBarang[i]) - 1;
            jumlahBayar[i] = hargaBarang[index] * jumlahBeli[i];
            totalBayar += jumlahBayar[i];
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (hargaBarang[i] > hargaBarang[j]) {
                    int tempHarga = hargaBarang[i];
                    hargaBarang[i] = hargaBarang[j];
                    hargaBarang[j] = tempHarga;
                    
                    String tempNama = namaBarang[i];
                    namaBarang[i] = namaBarang[j];
                    namaBarang[j] = tempNama;
                    
                    String tempKode = kodeBarang[i];
                    kodeBarang[i] = kodeBarang[j];
                    kodeBarang[j] = tempKode;
                    
                    int tempJumlahBeli = jumlahBeli[i];
                    jumlahBeli[i] = jumlahBeli[j];
                    jumlahBeli[j] = tempJumlahBeli;
                    
                    int tempJumlahBayar = jumlahBayar[i];
                    jumlahBayar[i] = jumlahBayar[j];
                    jumlahBayar[j] = tempJumlahBayar;
                }
            }
        }
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("**************************************************");
        System.out.printf("%-3s %-10s %-15s %-10s %-12s %-10s\n", 
                "No", "Kode", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
        System.out.println("==============================================================");

        for (int i = 0; i < 5; i++) {
            int index = Integer.parseInt(kodeBarang[i]) - 1;
            System.out.printf("%-3d %-10s %-15s %-10d %-12d %-10d\n", 
                (i + 1), kodeBarang[i], namaBarang[index], hargaBarang[i], jumlahBeli[i], jumlahBayar[i]);
        }
        
        System.out.println("==============================================================");
        System.out.println("Total Bayar: \t\t " + totalBayar);
        System.out.println("==============================================================");

        scanner.close();
    }
}
