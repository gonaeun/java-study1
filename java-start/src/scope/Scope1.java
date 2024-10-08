package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        if (true) {
            int x = 20; // x 생존 시작
            System.out.println("if m = "+ m);
            System.out.println("if x = "+ x);
        } // x 생존 종료
        // System.out.println("main x = "+ x); // 오류. 변수x에 접근 불가
        System.out.println("main m = "+ m);
    } // m 생존 종료

    // 지역 변수 : 본인의 코드 블록 안에서만 생존
    // 스코프(scope.범위) : 변수의 접근 가능한 범위
    // int m은 main{} 전체에서 접근 가능 == 스코프가 넓음
    // int x는 if{} 코드블록 안에서만 접근 가능 == 스코프가 짧음
}
