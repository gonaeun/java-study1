package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        // 5개의 정수를 입력받아서 이들의 합계와 평균을 계산하자
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;   // sum = 0이라고 위에서 먼저 선언해주자 >> 그리고 밑에서 누적 더하기!

        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];  // 혼자 풀 때 여기 코드만 못 적었음
        }

        double average = (double) sum / (numbers.length);

        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + average);

    }
}
