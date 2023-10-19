// Nama : Gilang Purnomo
// NIM  : 2341720041
// Kelas:  TI-1F

import java.util.Scanner;

public class Pajak13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.println(" Nama : Gilang Purnomo ");
        System.out.println(" NIM  : 2341720042     ");

        System.out.println("Apakah anda memiliki usaha? (Y/N)");
        String memilikiUsaha = input13.nextLine();
        
        double penghasilan = 0;
        if (memilikiUsaha.equalsIgnoreCase("Y")) {
            System.out.println("Masukkan total penghasilan dalam 1 tahun:");
            penghasilan = input13.nextDouble();
            input13.nextLine();

            double pajakPenghasilan = penghasilan * 0.15;
            System.out.println("Masukkan jumlah harta yang anda miliki: ");
            int jumlahHarta = input13.nextInt();
            input13.nextLine();
        
        double totalHartaKekayaan = 0;
        for (int i = 0; i < jumlahHarta; i++) {
            System.out.println("Masukkan nama harta yang anda miliki " + (i + 1) + ":");
            String namaHarta = input13.nextLine();
            
            System.out.println("Masukkan nilai jual " + namaHarta + ":");
            double nilaiJual = input13.nextDouble();
            input13.nextLine();
            
            totalHartaKekayaan += nilaiJual;
        }
        
        System.out.println("Apakah Anda sudah berkeluarga? (Y/N)");
        String berkeluarga = input13.nextLine();
        
        double potonganPajak = 0;
        if (berkeluarga.equalsIgnoreCase("Y")) {
            System.out.println("Berapa anak Anda yang berstatus kuliah?");
            int jumlahAnakKuliah = input13.nextInt();
            
            System.out.println("Berapa anak Anda yang berstatus SMA?");
            int jumlahAnakSMA = input13.nextInt();
            
            if (jumlahAnakKuliah == 1 && jumlahAnakSMA == 1 && totalHartaKekayaan >= 50000000) {
                potonganPajak = 0.5;
            } else if (jumlahAnakKuliah == 0 && jumlahAnakSMA == 0 && totalHartaKekayaan < 50000000) {
                potonganPajak = 0.10;
            }
        }
        
        double totalPajak =  (pajakPenghasilan + totalHartaKekayaan ) * (1 - potonganPajak);
        
        System.out.println("Total pajak yang harus Anda bayar: Rp" + totalPajak);
        }
        
        
    }
}