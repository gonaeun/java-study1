package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2;  // int/int=int
        System.out.println("div1 = "+div1);  // 1 출력

        double div2 = 3 / 2;  // int/int=int
        // double div2 = int 1 -> double 1.0 으로 자동 형변환 발생
        // double div2 = 1.0
        System.out.println("div2 = "+div2);  // 1.0 출력

        double div3 = 3.0 / 2;  // 1.5
        // double/int 이므로, int는 double로 형변환이 일어남
        // double/double = double
        System.out.println("div3 = "+div3);  // 1.5 출력

        double div4 = (double) 3 / 2;  // 1.5
        // 명시적 형변환 사용
        // (double)int / int = (double)int / (double)int = double
        System.out.println("div4 = "+div4);  // 1.5 출력

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result);  // 1.5 출력

        // JAVA에서 계산할 때 2가지 원칙
        // 1. 같은 타입끼리의 계산은 같은 타입의 결과를 낸다
        // 2. 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다
    }
}
