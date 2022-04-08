package day04.solve;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
 */
public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double results[] = new double[3];
        for(int ar : arr){
            if(ar == 0) {
                results[2] += 1;
            }else if(ar < 0) {
                results[1] += 1;
            }else {
                results[0] += 1;
            }
        }
        for(int i = 0 ; i< results.length ; i++){
            double count = results[i];
            if(count != 0){
                results[i] = count / arr.size();
            }else {
                results[i] = 0;
            }
            System.out.println(results[i]);
        }
    }

    public static void main(String[] args) {
        plusMinus(java.util.Arrays.asList(-4, 3, -9, 0, 4, 1));
    }
}
