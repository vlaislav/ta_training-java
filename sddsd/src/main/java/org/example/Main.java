package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int allMoney = sc.nextInt();
        int people = sc.nextInt();
        if(allMoney >= 0 && people > 0){
            int portion = (allMoney / people) ;
            int procent = portion * 10 /100 ;
            int Monay = portion + procent;
            if (Monay > 0)
            System.out.println(Monay);
            else System.out.println(1);
        }
        else if(allMoney < 0)
            System.out.println("Number of friends cannot be negative or zero");
        else
            System.out.println("Bill total amount cannot be negative");
        }}
