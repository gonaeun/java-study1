package method;

public class Method1Ref {
    public static void main(String[] args) {
        // 계산1
        int sum1 = add(5, 10);
        System.out.println("결과1 출력 : " + sum1);

        // 계산2
        int sum2 = add(5, 20);
        System.out.println("결과2 출력 : " + sum2);

        add(100, 200);
        // 메서드 수행은 하지만, 반환값은 안 받는 경우
        // 반환 타입이 있는 메서드를 호출했는데 만약 반환 값이 필요 없다면 반환값을 사용하지 않아도 된다

    }

    // add 메서드
    public static int add(int a, int b) {
        System.out.println(a + " + " + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
}
