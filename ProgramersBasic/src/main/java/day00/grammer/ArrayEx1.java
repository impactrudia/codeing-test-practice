package day00.grammer;

public class ArrayEx1 {
    public static void main(String[] args) {
//         배열의 길이는 배열의 요소의 갯수, 즉 값을 저장할 수 잇는 공간의 개수
//         int타입의 최대값, 약 20억이다. 20억까지는 안 쓰니 거의 제한 없다라는 뜻.
        int[] score = new int[5];// 길이가 5인 int배열. index의 범위는 0~4
        int[] score1 = new int[0];// 길이가 0인 배열도 생성이 가능하다!!!
//        score.length = 10// 에러. 배열의 길이는 변경할 수 없음.
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k + 1] = 70;    // score[2] = 70
        score[3] = 80;
        score[4] = 90;

        int tmp = score[k + 2] + score[4];    //  int tmp = score[3] + score[4]

//         for문 배열의 모든 요소룰 출력한다.
        for (int i = 0; i < 5; i++) {
            System.out.printf("score[%d]:%d%n", i, score[i]);
        }
        System.out.printf("tmp:%d%n", tmp);
//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Exception : Index 7 out of bounds for length 5
        System.out.printf("score[%d]:%d%n", 7, score[7]);
    }}
