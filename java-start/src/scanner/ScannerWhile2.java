package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        // 첫번째 숫자와 두번째 숫자를 더해서 출력하는 프로그램 개발
        // 첫번째 숫자와 두번째 숫자 모두 0을 입력하면 프로그램 종료한다
        // 프로그램은 반복해서 실행된다

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자와 두번째 숫자 모두 0을 입력하면 프로그램이 종료됩니다");
        while (true) {
            System.out.println("첫번째 숫자를 입력하세요 : ");
            int num1 = scanner.nextInt();
            System.out.println("두번째 숫자를 입력하세요 : ");
            int num2 = scanner.nextInt();
            if ( num1 == 0 && num2 == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            int sum = num1 + num2;
            System.out.println("두 숫자의 합은 "+sum+"입니다");
        }

    }
}
