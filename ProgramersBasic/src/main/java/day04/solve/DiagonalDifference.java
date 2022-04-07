package day04.solve;

import java.util.*;
import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
 */
public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftAndRightSum = 0;
        int rightAndLeftSum = 0;

        int SIZE = arr.size();
        for (int i = 0; i < SIZE; i++) {
            leftAndRightSum += arr.get(i).get(i);
            rightAndLeftSum += arr.get(i).get(SIZE - i - 1);
        }

        return Math.abs(leftAndRightSum) - Math.abs(rightAndLeftSum);
    }

    public static void main(String[] args) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.add(Arrays.asList(11, 2, 4));
        list.add(Arrays.asList(4, 5, 6));
        list.add(Arrays.asList(10, 9, -12));

        DiagonalDifference diagonalDifference = new DiagonalDifference();
        System.out.println(diagonalDifference
                .diagonalDifference(list));

//        new ArrayList<>() {
//                        Arrays.asList(0,1,2),
//                                Arrays.asList(0,1,2),
//                                Arrays.asList(0,1,2)
//        }

    }
}
