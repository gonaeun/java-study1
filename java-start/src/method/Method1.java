package method;

public class Method1 {
    public static void main(String[] args) {
        // 계산1
        int a = 1;
        int b = 2;
        System.out.println(a + " + " + b + " 연산 수행");
        int sum1 = a + b;
        System.out.println("결과1 출력 : " + sum1);

        // 계산2
        int x = 10;
        int y = 20;
        System.out.println(x + " + " + y + " 연산 수행");
        int sum2 = x + y;
        System.out.println("결과2 출력 : " + sum2);

        // 계산1,2 둘 다 같은 코드를 반복함
        // 부분을 수정할 때, 한꺼번에 동시에 수정할 수 있도록 >> 함수 정의 & 호출
    }
}
