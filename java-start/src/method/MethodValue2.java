package method;

public class MethodValue2 {
    // 이번에는 main()에서 정의한 변수와 changeNumber 메서드의 매개변수 이름이 number로 서로 같다

    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number : "+number);  // 5
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number : "+number);  // 5
    }

    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, number : "+number);  // 5
        number = number *2;
        System.out.println("3. changeNumber 변경 후, number : "+number);  // 10
    }
    // main()도 사실 메서드야!
    // 각각의 메서드 안에서 사용하는 변수는 완전히 분리된 서로 다른 변수이다 >> main()의 number != changeNumber()의 number
}
