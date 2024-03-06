package com.example.algorithm.baekjoon.step3;

import java.util.Scanner;

/**
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 */
public class B_8393 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        int sum = 0;

        for (int i=1; i<=cnt; i++){
            sum += i;
        }

        System.out.println(sum);



    }

}
