package condition.ex;

public class CondOpEx {
    public static void main(String[] args) {
        // 삼항연산자를 이용하여 두 숫자 중 더 큰 숫자를 출력하는 코드 작성

        int a = 10;
        int b = 20;

        int max = (a>b) ? a:b;
        System.out.println("더 큰 숫자는 "+max+"입니다");
    }
}
