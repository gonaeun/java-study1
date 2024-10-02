package operator;

public class OperatorAdd1 {

    public static void main(String[] args) {
        int a = 0;

        a = a +1;
        System.out.println("a = " + a);   // 1

        a = a +1;
        System.out.println("a = " + a);   // 2

        // 증감 연산자
        ++a;   // a = a+1
        System.out.println("a = "+a);     // 3
        ++a;   // a = a+1
        System.out.println("a = "+a);     // 4

        // ++a 해당 변수에 들어있는 숫자 값을 하나 증가하는 것

        --a;
        System.out.println("a = " +a);

    }
}
