package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        // 사용자에게 두 개의 정수를 입력받고, 이 두 정수 사이의 모든 정수를 출력하시오
        // 첫번째 숫자가 두번째 숫자보다 크다면, 두 숫자를 교환하세요 (임시 변수 사용)
        // num1부터 num2까지의 각 숫자를 출력하세요 (,로 구분해서 출력)

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();

        // num1 > num2인 경우, 두 숫자를 교환
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("두 숫자 사이의 모든 정수 : ");
        for (int i = num1; i<=num2; i++) {
            System.out.print(i);
            if (i != num2) {
                System.out.print(",");
            }
        }

    }
}
