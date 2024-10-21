package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number);    // int에서 double로 자동형변환
    }

    public static void printNumber(double n){
        System.out.println("숫자 : "+ n);
    }

    // 메서드를 호출할 때, 매개변수에 값을 전달하는 것도 변수에 값을 대입하는 것이다. 자동 형변환이 그대로 적용된다.
}
