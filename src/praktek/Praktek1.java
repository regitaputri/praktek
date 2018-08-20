/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Praktek1 {
    public static void main(String[] args) {
        String namaToko = "Toko Regita";
        System.out.println("Nama Toko: " + namaToko);
        
        System.out.println("rincian: ");
        System.out.println(" total lebih dari 100000 = diskon 10%");
        System.out.println(" total lebih dari 200000 = diskon 20%");
        System.out.println(" total lebih dari 500000 = diskon 50%");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("nama barang: ");
        System.out.println("1. tas");
        System.out.println("2. buku");
        System.out.println("3. crayon");
        System.out.println("4. kotak pensil");
        System.out.println("masukkan nomor pilihan anda: ");
        int harga1 = scanner.nextInt();
        
        scanner = new Scanner(System.in);
        System.out.println("masukkan jumlah: ");
        System.out.println();
        int harga2 = scanner.nextInt();
        
        scanner = new Scanner(System.in);
        System.out.println("hitung: ");
        System.out.println();
        
        int harga3 = scanner.nextInt();
        
        int hasil;
        hasil = harga2 * harga3;
        System.out.println(harga2+"*"+harga3+"="+hasil);
        
        scanner = new Scanner(System.in);
        System.out.println("diskon: ");
        System.out.println();
       
        int diskon;
        diskon = scanner.nextInt();
        int total;
    }
}