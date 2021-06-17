package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi, toplam=0;
        do {
            System.out.print("sayi giriniz : ");
            sayi = scanner.nextInt();

            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam+=sayi;

            }
            else if (sayi%2==1){
                break;
            }


        }while (sayi<0 || sayi>0);
        System.out.println("toplam  = " + toplam);

    }
}