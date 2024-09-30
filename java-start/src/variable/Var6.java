package variable;

public class Var6 {
    public static void main(String[] args) {
        int a;
        // sout를 주석처리하면 out폴더에 Var 생성되지만, 컴파일 코드엔 존재하지 않음
        // >> 변수를 선언했지만 사용하지 않으므로, java가 최적화 한 것

//        System.out.println(a);
        // JAVA에서 지역변수의 값을 초기화 하지 않으면, 컴파일 에러 발생
        // 컴파일 되지 않음 == out 폴더에도 Var6 생성되지 않음
    }
}




