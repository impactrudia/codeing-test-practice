package week01.solve;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true
 */
public class MiniMaxSum {

    public void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        BigDecimal sum = new BigDecimal(0);
        for (int i = 1; i <= 3; i++) {
            sum = sum.add(new BigDecimal(arr.get(i)));
        }
        System.out.print(sum.add(new BigDecimal(arr.get(0))));
        System.out.print(" ");
        System.out.print(sum.add(new BigDecimal(arr.get(4))));
    }

    public static void main(String[] args) {
        MiniMaxSum sum = new MiniMaxSum();
        sum.miniMaxSum(Arrays.asList(1, 2, 3, 4, 5));
    }
}
