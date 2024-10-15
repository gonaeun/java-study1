package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        // 사용자로부터 이름과 나이를 반복해서 입력받아서 출력하기
        // 사용자가 "종료"를 입력하면 프로그램이 종료됨
        // Scanner와 반복문 활용
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료됩니다) : ");
            String name = input.nextLine();

            if (name.equals("종료")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요 : ");
            int age = input.nextInt();  // 20\n 입력하면 숫자만 인식되므로, \n같은 기호들이 남아있을 수 있음
            input.nextLine();   // \n 인식하도록 해당 코드 입력함. 숫자 입력 후의 줄바꿈 기호를 처리
            // 두번째 반복때, <이름을 입력하세요 (종료를 입력하면 종료됩니다) : 나이를 입력하세요 : > 라고 출력되는 문제 해결하기 위함

            System.out.println("입력한 이름 : "+name+", 나이 : "+age);

        }
    }
}
