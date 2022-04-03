package sort.day02;

import java.util.Arrays;

public class BestBigNumber {
    // 내가 푼 문제
//    public String solution(int[] numbers) {
//        Arrays.sort(numbers);
//        StringBuilder builder = new StringBuilder();
//        for (int number : numbers) {
//            builder.append(number);
//        }
//        return builder.toString();
//    }

    /**
     * 정확성: 100.0
     * 합계: 100.0 / 100.0
     */
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if (str[0].equals("0")) {
            return "0";
        }

        for (String s : str)
            answer += s;

        return answer;
    }

    public static void main(String[] args) {
        BestBigNumber bestBigNumber = new BestBigNumber();
        int numbers[] = {6, 10, 2};
        System.out.println(bestBigNumber.solution(numbers));
    }
}
