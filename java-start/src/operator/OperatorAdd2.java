package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {

        // 전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a;  // a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + ". b = " + b);   // a=2, b=2

        // 후위 증감 연산자 사용 예
        a = 1;  // a 값을 다시 1로 지정
        b = 0;  // b 값을 다시 0으로 지정

        b = a++;  // a의 현재 값을 b에 먼저 대입하고. 그 후 a값을 증가시킴
        System.out.println("a = " + a + ". b = " + b);   // a=2, b=1

        // 증감 연산자를 단독으로 사용하는 경우, 다른 연산이 없기 때문에 본인의 값만 증가한다
        // 전위 증감연산자 ++a;와 후위 증감연산자 a++;의 결과는 같다
    }
}
