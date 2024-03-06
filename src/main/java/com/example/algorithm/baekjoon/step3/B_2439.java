package com.example.algorithm.baekjoon.step3;

import java.util.Scanner;

public class B_2439 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();

        for (int i=1; i<=cnt; i++){
            System.out.println(" ".repeat(cnt-i) + "*".repeat(i));
        }

    }

}
