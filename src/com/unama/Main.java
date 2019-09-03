package com.unama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalcopia;
        System.out.println("Informe o total de copias");
        totalcopia = sc.nextInt();
        double totalPago;
        if(totalcopia <= 100) {
            totalPago = totalcopia * 0.25;
        }else{
            totalPago = totalcopia * 0.20;

        }
        System.out.println("Total a ser pago é R$ " + totalPago);
    }
}
