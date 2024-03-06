package com.example.algorithm.baekjoon.step3;

import java.io.*;

/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
public class B_11022 {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            String line;
            int maxCnt = 0;
            int cnt = 0;


            while ((line = reader.readLine()) != null) {
                if (maxCnt == 0) {
                    maxCnt = Integer.parseInt(line);
                } else {
                    cnt = cnt + 1;

                    String[] lineStr = line.split(" ");

                    bufferedWriter.write(String.format("Case #%s: %s + %s = %s \n", cnt,Integer.parseInt(lineStr[0]), Integer.parseInt(lineStr[1]), (Integer.parseInt(lineStr[0]) + Integer.parseInt(lineStr[1]))));
                }
            }
            reader.close();
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.fillInStackTrace();
        }

    }

}
