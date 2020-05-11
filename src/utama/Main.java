package utama;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char balik;
        int menu=0;
        do {
        System.out.println("== MENU FORM PENDAFTARAN ==");
        System.out.println("1. Asisten Laboratorium");
        System.out.println("2. Admin Laboratorium");
        System.out.print("Pilih : ");
        try {
            menu = input.nextInt();
            System.out.println("");
            switch(menu){
                case 1:{
                    int jumlah=0;
                    String nama;
                    int nim, nilai_tulis,nilai_coding,nilai_wawancara,nilai_microteaching;
                    System.out.println("FORM PENDAFTARAN ASISTEN LABORATORIUM");
                    System.out.print("Input berapa banyak data : ");
                    jumlah = input.nextInt();
                    for (int i = 0; i < jumlah; i++) {
                        System.out.print("Input NIM : ");
                        nim = input.nextInt();
                        System.out.print("Input Nama : ");
                        input.nextLine();
                        nama = input.nextLine();
                        System.out.print("Input Nilai Tulis : ");
                        nilai_tulis = input.nextInt();
                        System.out.print("Input Nilai Coding : ");
                        nilai_coding = input.nextInt();
                        System.out.print("Input Nilai Wawancara : ");
                        nilai_wawancara = input.nextInt();
                        System.out.print("Input Nilai Microteaching : ");
                        nilai_microteaching = input.nextInt();
                        Asisten pAsisten = new Asisten(nama, nim, nilai_tulis, nilai_coding, nilai_wawancara, nilai_microteaching);
                        System.out.println("Nilai Rata-rata : " + pAsisten.nilai_rata);
                        if(pAsisten.nilai_rata > 85){
                            System.out.println("KETERANGAN : LOLOS");
                            System.out.println("Selamat kepada Nim "+pAsisten.nim+" telah diterima sebagai Aslab");
                        }
                        else{
                            System.out.println("KETERANGAN : TIDAK LOLOS");
                            System.out.println("Mohon maaf kepada Nim "+pAsisten.nim+" anda tidak diterima sebagai Aslab. Coba lagi tahun depan");
                        }
                    }
                    break;
                }
                case 2:{
                    int jumlah=0;
                    String nama;
                    int nim, nilai_tulis,nilai_coding,nilai_wawancara,nilai_praktek;
                    System.out.println("FORM PENDAFTARAN ADMIN LABORATORIUM");
                    System.out.print("Input berapa banyak data : ");
                    jumlah = input.nextInt();
                    for (int i = 0; i < jumlah; i++) {
                        System.out.print("Input NIM : ");
                        nim = input.nextInt();
                        System.out.print("Input Nama : ");
                        input.nextLine();
                        nama = input.nextLine();
                        System.out.print("Input Nilai Tulis : ");
                        nilai_tulis = input.nextInt();
                        System.out.print("Input Nilai Coding : ");
                        nilai_coding = input.nextInt();
                        System.out.print("Input Nilai Wawancara : ");
                        nilai_wawancara = input.nextInt();
                        System.out.print("Input Nilai Tes Jaringan : ");
                        nilai_praktek = input.nextInt();
                        Admin pAdmin = new Admin(nama, nim, nilai_tulis, nilai_coding, nilai_wawancara, nilai_praktek);
                        System.out.println("Nilai Rata-rata : " + pAdmin.nilai_rata);
                        if(pAdmin.nilai_rata > 85){
                            System.out.println("KETERANGAN : LOLOS");
                            System.out.println("Selamat kepada Nim "+pAdmin.nim+" telah diterima sebagai Admin Lab");
                            System.out.println("");
                        }
                        else{
                            System.out.println("KETERANGAN : TIDAK LOLOS");
                            System.out.println("Mohon maaf kepada Nim "+pAdmin.nim+" anda tidak diterima sebagai Admin Lab. Coba lagi tahun depan");
                            System.out.println("");
                        }
                    }
                    break;
                }
            }
            
        } catch (InputMismatchException e) {
            System.err.println("Input harus berupa angka!");
            input.nextLine();
        }
            System.out.print("Kembali ke menu? (y/n) : ");
            balik = input.next().charAt(0);
            System.out.println("");
        } while (balik == 'y' || balik == 'Y');
        
    }
   
}
