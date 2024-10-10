package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        // 하나의 정수를 입력받고, 홀수인지 짝수인지 판별하시오
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number+"은 짝수입니다");
        } else {
            System.out.println(number+"은 홀수입니다");
        }
    }
}
