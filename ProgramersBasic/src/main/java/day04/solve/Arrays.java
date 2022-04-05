package day04.solve;

public class Arrays {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        for (int t : arr) {
            if (t % divisor == 0) {
                int leng = answer.length;
                answer = java.util.Arrays.copyOf(answer, leng + 1);
                answer[leng] = t;
            }
        }
        if (answer.length == 0) {
            int leng = answer.length;
            answer = java.util.Arrays.copyOf(answer, leng + 1);
            answer[leng] = -1;
        }
        java.util.Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        int arr[] = {5, 9, 7, 10};
        Arrays main = new Arrays();
        for (int i : main.solution(arr, 5)) {
            System.out.print(i + " ");
        }
    }
}
