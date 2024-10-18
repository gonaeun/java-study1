package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        // 이전 문제에서 학생 수를 입력받도록 개선하자

        Scanner scanner = new Scanner(System.in);
        System.out.println("학생 수를 입력하세요 : ");
        int count = scanner.nextInt();
        int[][] scores = new int[count][3]; // 학생n명, 3 과목
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < count; i++){
            System.out.println((i+1)+"번 학생의 성적을 입력하세요 : ");
            for (int j = 0; j <3; j++){
                System.out.print(subjects[j]+" 점수 : ");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < count; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;  // 한 학생에 대한 루프가 끝나기 전에, 평균 내주기!
            System.out.println((i+1) + "번 학생의 총점 : "+ total + ", 평균 : " + average);
        }
    }
}
