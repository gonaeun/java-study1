package method.ex;

public class MethodEx3Ref {
    // 입금 출금 리팩토링
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 1000);
        balance = withdraw(balance, 2000);

        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int balance, int amount){
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }

    // 입금 출금 부분이 메서드로 명확하게 분리되었기 때문에 읽기도 좋고 유지보수 하기도 좋아짐!
    // 재사용 목적이 아니더라도 한눈에 보기 좋음
    // 이런 리팩토링을 "메서드 추출" 이라고 한다
}