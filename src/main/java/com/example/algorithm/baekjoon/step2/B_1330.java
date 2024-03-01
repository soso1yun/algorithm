package com.example.algorithm.baekjoon.step2;


import java.util.Scanner;

/**
 * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 */
public class B_1330 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b){
            System.out.println(">");
        }else if (a < b){
            System.out.println("<");
        }else {
            System.out.println("==");
        }

    }

}
