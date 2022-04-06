package day04.solve;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 회고 : 문제를 너무 어렵게 생각함. 문제 분석 잘 못함.
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true
 */
public class AVeryBigSum {

    /**
     * 잘 못 생각한 문제
     * @param ar
     * @return
     */
    public static long aVeryBigSum(List<Long> ar) {
        int[] answers = new int[Long.toString(ar.get(0)).length()];
        for (long a : ar) {
            String temp = Long.toString(a);
            for (int j = 0; j < answers.length; j++) {
                answers[j] += temp.charAt(j) - '0';
            }
        }

        StringBuilder builder = new StringBuilder();
        for (int number : answers) {
            builder.append(number);
        }
        return Long.parseLong(builder.toString());
    }

    public static long aVeryBigSum2(List<Long> ar) {
        long result = 0L;
        for (Long items : ar) {
            result += items;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        List<Long> items = new ArrayList<>();
        items.add(1000000001L);
        items.add(1000000002L);
        items.add(1000000003L);
        items.add(1000000004L);
        items.add(1000000005L);

        AVeryBigSum test = new AVeryBigSum();
        System.out.println(test.aVeryBigSum2(items));
    }

}
