package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 +1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println("maxIntValue casting = " + intValue); // 2147483647 출력

        intValue = (int) maxIntOver; // 형변환
        System.out.println("maxIntOver casting = " + intValue); // -2147483648 출력
        // int로 표현할 수 있는 숫자보다 더 큰 숫자를 int로 형변환 >> 오버플로우 현상 (전혀 다른 숫자가 표현됨)
        // 오버플로우가 발생하지 않도록 막아야 함! (오버플로우 값 계산하고 있지마!)
        // >> 단순히 변수의 타입을 int에서 long으로 사이즈 변경해주면 해결!


    }
}
