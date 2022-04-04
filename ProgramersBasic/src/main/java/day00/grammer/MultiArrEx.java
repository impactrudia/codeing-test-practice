package day00.grammer;

import java.util.Scanner;

/**
 * 좌표에 X표하기 - 입력한 2차원 좌표의 위치에 X를 표시
 */
public class MultiArrEx {
    public static void main(String[] args) {
        final int SIZE = 10;
        int x = 0, y = 0;

        char[][] board = new char[SIZE][SIZE];
        byte[][] shipBoard = {
                {1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        // 1행에 행번호를, 1열에 열번호를 저장한다.
        for (int i = 1; i < SIZE; i++) {
            board[0][i] = board[i][0] = (char) (i + '0');//숫자 1에 문자 '0'을 더하면 문자 1이 된다.
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("좌표를 입력하세요. (종료는 00) >");
            String input = scanner.nextLine();// 화면입력받은 내용을 input에 저장
            if (input.length() == 2) {// 두 글자를 입력한 경우
                x = input.charAt(0) - '0';// 문자를 숫자로 변환
                y = input.charAt(1) - '0';

                if (x == 0 && y == 0)
                    break;
            }
            if (input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) {
                System.out.printf("잘못된 입력입니다. 다시 입력하세요.");
                continue;
            }
            // shipBoard[x-1][y-1]의 값이 1이면, 'O'을 board[x][y]에 저장한다.
            board[x][y] = shipBoard[x - 1][y - 1] == 1 ? 'O' : 'X';

            // 배열 board의 내용을 화면에 출력한다.
            for (int i = 0; i < SIZE; i++) {
                System.out.println(board[i]);// baord[i]는 1차원 배열
            }
            System.out.printf("");
        }
    }// main의 끝
}
