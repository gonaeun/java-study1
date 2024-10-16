package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        // 5개의 정수를 입력받아서 배열에 저장하고, 입력 순서대로 출력하자
        // 쉼표를 사용하여 구분하고, 마지막에는 쉼표를 넣지 않아야 함
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i <numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            if (i < numbers.length-1) {
                System.out.print(", ");
            }
        }
    }
}
