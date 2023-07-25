package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        int n = input.nextInt();

        System.out.print("r değerini giriniz: ");
        int r = input.nextInt();

        int faktoriyel = 1;
        for (int i = 1; i <= r; i++) {
            faktoriyel *= (n - r + i);
            faktoriyel /= i;
        }

        System.out.println(+n + " ve " + r + " girdisinin faktöriyeli " + faktoriyel);
    }
}

