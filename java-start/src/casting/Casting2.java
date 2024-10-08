package casting;

public class Casting2 {
    public static void main(String[] args) {
        // 큰 범위에서 작은 범위로의 대입은 명시적 형변환이 필요
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; // 컴파일 오류 발생 (작은 범위에 대입 불가)

        intValue = (int) doubleValue; // 소수점 버리더라도 강제로 형변환!
        System.out.println(intValue); // 1 출력
        System.out.println("doubleValue = " + doubleValue); // 1.5 출력

        // 형변환을 하면 그 안에 있는 값이 변경되는 것은 아님. 읽은 값을 형변환 하는 것!
        // douvleValue 안에 들어있는 값은 1.5 그대로 유지됨
        // 변수의 값은 대입연산자(=)를 사용해서 직접 대입할 때만 변경됨!


    }
}
