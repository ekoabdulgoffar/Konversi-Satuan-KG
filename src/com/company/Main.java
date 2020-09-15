package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create Geerman locale separator (,) dan decimal (.).
        Locale locale1 = new Locale("de_DE");
        Locale.setDefault(locale1);

        // deklarasi variable
        float pon = (float) 0.0;
        float ons = (float) 0.0;
        float gram = (float) 0.0;
        float kg = (float) 0.0;
        String inputan_pengguna;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Kilogram yang akan di Konversi = ");
        inputan_pengguna = input.nextLine();
        if (cek_angka_decimal(inputan_pengguna)) {
            kg = Float.valueOf(inputan_pengguna);
            pon = kg * 2;
            ons = kg * 10;
            gram = kg * 1000;
            System.out.println(kg + " kilogram sama dengan = " + pon + " pon " + ons + " ons " + gram + " gram");
        } else {
            System.out.println("Inputan Anda ada yang bukan angka atau koma decimal (.).");
        }
    }

    static boolean cek_angka_decimal(String number) {
        // validasi untuk cek apakah bukan angka
        boolean isdigit = true;
        for (char c : number.toCharArray()) {
            if (!Character.isDigit(c)) { // cek jika buka angka
                if (c != '.') {
                    isdigit = false;
                    break;
                }
            }
        }
        return isdigit;
    }
}
