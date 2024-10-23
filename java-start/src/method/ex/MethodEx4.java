package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    // 사용자에게 입력받아서 입금과 출금을 반복하는 프로그램을 작성
    // 어떤 동작을 수행할지 선택할 수 있게 하자
    // 출금시 잔액이 부족하다면 안내멘트 출력

    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.println("선택 : ");

            int choice = scanner.nextInt();
            int amount;

            switch (choice) {
                case 1:
                    System.out.print("입금액을 입력하세요 : ");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요 : ");
                    amount = scanner.nextInt();
                    balance = withdraw(balance, amount);
                case 3:
                    System.out.println("현재 잔액 : " + balance + "원");
                    break;   // switch문 밖으로 빠져나가서 다시 while문이 시작됨
                case 4:
                    System.out.println("시스템을 종료합니다");
                    return;  // 아예 종료하기 위해선 break가 아니라 return
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }
        }
    }

    public static int deposit(int balance, int amount){
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액 : " + balance + "원");
        return balance;
    }
    public static int withdraw(int balance, int amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        }
        else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
