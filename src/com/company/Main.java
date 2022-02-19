package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int i = 1;
        while(true) {
            System.out.print(i);
            i = 1 + (i + m - 2) % n;
            if (i == 1)
                break;
        }
        System.out.print("");
    }
}
