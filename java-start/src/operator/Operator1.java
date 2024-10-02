package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a+b="+sum);   // 출력 a+b=7

        // 뺄셈
        int diff = a - b;
        System.out.println("a-b="+diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a*b="+multi);

        // 나눗셈
        int div = a / b; // 5/2=2.5가 나와야하는데... int형끼리 계산은 int형으로 나와서 소수점 표현이 안 됨..
        System.out.println("a/b="+div);

        // 나머지
        int mod = a % b;
        System.out.println("a%b="+mod);

        // 0으로 나누면 프로그램 오류 발생
        // int z = 10/0;

    }
}
