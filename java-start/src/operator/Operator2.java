package operator;

public class Operator2 {
    public static void main(String[] args) {

        // 문자열과 문자열 더하기1
        String result1 = "hello " + "world";
        System.out.println(result1);  // hello world

        // 문자열과 문자열 더하기2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);  // string1string2

        // 문자열과 숫자 더하기1
        String result3 = "a+b=" + 10;
        // java가 문자열과 더하는 다른 대상을 문자열로 변경함 ->> 숫자 10을 문자열로 변경
        // String result3 = "a+b=" + "10";
        System.out.println(result3);   // a+b=10

        // 문자열과 숫자 더하기2
        int num = 20;
        String str = "a+b=";
        String result4 = "a+b=" + 20;
        // String result4 = "a+b=" + "20";
        System.out.println(result4);

        // 정리
        // 자바는 문자열(String)과 더하는 다른 타입을 문자열로 변경하여 계산한다
    }
}
