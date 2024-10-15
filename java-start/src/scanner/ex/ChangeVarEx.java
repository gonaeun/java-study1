package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        // 다음 코드에서 시작과 종료 부분 사이에 변수의 값을 교환하는 코드 작성
        // a와 b를 한번에 서로 교환할 수 없으므로, temp라는 임시 변수 활용
        int a = 10;
        int b = 20;
        int temp;

        temp = a; //10
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
