package day04.solve;

/**
 * https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true
 */
public class Staircase {

    /**
     * n = 4 | numSpaces | numSymbols
     * ___#         3           1
     * __##         2           2
     * _###         1           3
     * ####         0           4
     */
    public void result(int n) {
        for (int numSymbols = 1; numSymbols <= n; numSymbols++) {
            int numSpace = n - numSymbols;
            for (int i = 0; i < numSpace; i++) {
                System.out.print(' ');
            }
            for (int i = 0; i < numSymbols; i++) {
                System.out.print("#");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Staircase staircase = new Staircase();
        staircase.result(4);
    }
}
