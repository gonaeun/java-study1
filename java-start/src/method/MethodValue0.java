package method;

public class MethodValue0 {
    // JAVA는 항상 변수의 값을 복사해서 대입한다!
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1;   // num1의 값을 읽고 복사해서 num2에 넣는 것. 대입한다고 표현
        num2 = 10;

        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
    }
}
