package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clock = sc.nextInt();
        int h = clock / 3600;
        int mm = (clock % 3600) / 60;
        int ss = clock % 60;
        System.out.printf("%01d:%02d:%02d", h, mm, ss);


    }

}
