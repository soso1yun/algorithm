package com.example.algorithm.baekjoon.step3;

import java.util.Scanner;

public class B_10951 {

//    이문제 왜 종료 기준이 없지..
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            int a = Integer.parseInt(String.valueOf(line.charAt(0)));
            int b = Integer.parseInt(String.valueOf(line.charAt(2)));

            if (line.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println(a + b);
        }


        scanner.close();

    }

}
