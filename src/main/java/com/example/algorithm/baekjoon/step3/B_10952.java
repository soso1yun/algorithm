package com.example.algorithm.baekjoon.step3;


import java.util.Scanner;

public class B_10952 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            int a = Integer.parseInt(String.valueOf(line.charAt(0)));
            int b = Integer.parseInt(String.valueOf(line.charAt(2)));

            if (a + b == 0) {
                scanner.close();
                break;
            }

            System.out.println(a + b);
        }

    }

}
