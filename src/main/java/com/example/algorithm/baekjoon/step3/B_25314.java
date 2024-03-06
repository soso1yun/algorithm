package com.example.algorithm.baekjoon.step3;

import java.util.Scanner;

/**
 * 혜아가 N 바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력하여라.
 */
public class B_25314 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt() / 4;

        System.out.println("long ".repeat(Math.max(0, size)) + "int");

    }

}
