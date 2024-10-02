package operator;

public class Operator3 {
    public static void main(String[] args) {
        // 연산자 우선순위
        // 덧셈보다 곱셈이 우선순위가 높다
        // 연산자 우선순위를 변경하려면, 수학과 마찬가지로 괄호 사용

        int sum1 = 1+2*3;  // 1+(2*3)=7
        int sum2 = (1+2)*3; // 9
        System.out.println("sum1 = "+sum1);
        System.out.println("sum2 = "+sum2);
    }
}
