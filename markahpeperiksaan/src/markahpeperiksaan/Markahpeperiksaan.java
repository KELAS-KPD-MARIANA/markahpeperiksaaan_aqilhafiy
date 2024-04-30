package markahpeperiksaan;

import java.util.Scanner;

public class Markahpeperiksaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int peperiksaan;
        double[] markah = new double[5];

        System.out.print("Peperiksaan / ujian kali ke (1/2/3): ");
        peperiksaan = input.nextInt();

        for (int i = 0; i<5; i++){
        markah[i] = input.nextDouble();
        }

        System.out.println("\n5 Markah yang dimasukkan ialah:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + markah[i]);
        }

        double jumlahmarkah = 0;
        for (int i = 0; i < 5; i++) {
            jumlahmarkah += markah[i];
        }

        double puratamarkah = jumlahmarkah / 5;
        System.out.println("\nHasil jumlah 5 markah: " + jumlahmarkah);
        System.out.println("Purata: " + puratamarkah);

        int markahmelebihipurata = 0;
        for (int i = 0; i < 5; i++) {
            if (markah[i] > puratamarkah) {
                markahmelebihipurata++;
            }
        }

        System.out.println("Bilangan markah melebihi purata: " + markahmelebihipurata);

    }
}
