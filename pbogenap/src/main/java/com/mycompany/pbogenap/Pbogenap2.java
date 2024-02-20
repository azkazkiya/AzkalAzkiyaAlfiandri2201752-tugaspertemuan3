/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbogenap;
import java.util.Scanner;
/**
 *
 * @author azkiy
 */
public class Pbogenap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input tabungan
        System.out.print("Masukkan jumlah tabungan (dalam juta): ");
        double tabungan = scanner.nextDouble();

        // Input status calon pasangan
        System.out.print("Apakah sudah memiliki calon pasangan? (true/false): ");
        boolean calonPasangan = scanner.nextBoolean();

        // Menentukan keputusan
        if (tabungan > 100 && calonPasangan) {
            System.out.println("Selamat, Anda dapat menikah horee!");
        } else {
            System.out.println("Anda belum dapat menikah:( Perbanyak tabungan "
                    + "dan jangan lupa cari calon pasangan!");
        }

        // Menutup Scanner
        scanner.close();
    }
}
