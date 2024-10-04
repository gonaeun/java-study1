package condition.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        // 정수 x가 홀수인지 짝수인지 출력하는 프로그램 작성
        // x % 2 를 이용하면 홀수, 짝수 쉽게 구분 가능

        int x = 3;

        String result = (x%2==0) ? "짝수":"홀수";
        System.out.println("x = "+x+", "+result);
    }
}
