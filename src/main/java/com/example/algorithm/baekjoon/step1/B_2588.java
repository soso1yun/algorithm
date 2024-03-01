package com.example.algorithm.baekjoon.step1;


import java.util.Scanner;

/**
 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 */
public class B_2588 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        String[] b = scanner.nextLine().split("") ;


        int c = a * Integer.parseInt(b[2]);
        int d = a * Integer.parseInt(b[1]);
        int e = a * Integer.parseInt(b[0]);

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(c+(d*10)+(e*100));

    }

}
