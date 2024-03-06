package com.example.algorithm.baekjoon.step3;

import java.io.*;

/**
 * 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
 */
public class B_15552 {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            String line;
            int maxCnt = 0;

            while ((line = reader.readLine()) != null) {
                if (maxCnt ==0){
                    maxCnt = Integer.parseInt(line);
                }else {
                    String[] lineStr = line.split(" ");
                    bufferedWriter.write(Integer.parseInt(lineStr[0]) + Integer.parseInt(lineStr[1]) +"\n");
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
