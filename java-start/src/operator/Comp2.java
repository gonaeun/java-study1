package operator;

public class Comp2 {
    public static void main(String[] args) {
        // ==을 사용하면 성공할 때도, 실패할 때도 있으므로
        // 문자열이 같은지 비교할 때는 .equals() 메서드를 사용하자

        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello");  // 리터럴 비교
        boolean result2 = str1.equals("문자열1");    // 문자열 변수와 리터럴 비교
        boolean result3 = str1.equals(str2);        // 문자열 변수 비교

        System.out.println(result1);   // true
        System.out.println(result2);   // true
        System.out.println(result3);   // false
    }
}
