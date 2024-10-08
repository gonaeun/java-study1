package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i<2; i++) { // i의 스코프 = 블록 내부, for문 내
            System.out.println("for m = "+m);  // 블록 내부에서 외부는 접근 가능
            System.out.println("for i = "+i);
        } // i 생존 종료

        System.out.println("main m = "+m);
        // System.out.println("main i = "+i);  // 오류. 변수 i에 접근 불가

        // for문 안의 초기식에서 직접 변수 선언 가능
        // >> 이렇게 선언한 변수는 for문의 코드 블록 안에서만 사용 가능
    }
}
