package operator;

public class Operator4 {

    public static void main(String[] args) {

        // 연산이 복잡한 경우에는 괄호를 명시적으로 사용해주자!

        int sum3 = 2*2+3*3;      // (2*2) + (3*3) = 13
        int sum4 = (2*2) + (3*3); // sum3과 같다
        System.out.println("sum3 = "+sum3);
        System.out.println("sum4 = "+sum4);

        // 코드를 몇자 줄여서 모호하고 복잡해지는 것보다는,
        // 코드가 많더라도 명확하고 단순한 것이 유지보수 하기 좋다!
    }
}
