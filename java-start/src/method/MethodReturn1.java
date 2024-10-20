package method;

public class MethodReturn1 {

    // 반환 타입이 있는 경우

    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
        // else문이 없다면, 컴파일 오류 : return문 누락 (java: missing return statement)
    }

    public static boolean odd(int i){
        if ( i % 2 == 1){
            return true;
        } else {
            return false;
        }
    }
}
