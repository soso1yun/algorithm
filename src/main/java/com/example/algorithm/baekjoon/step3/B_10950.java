package com.example.algorithm.baekjoon.step3;

import java.util.Scanner;

/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
public class B_10950 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxCnt = scanner.nextInt();

        for (int i = 0; i < maxCnt; i++){
            System.out.println(scanner.nextInt() + scanner.nextInt());
        }

    }

}
