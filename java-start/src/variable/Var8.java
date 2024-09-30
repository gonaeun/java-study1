package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수 (기본은 int형)
        byte b = 127; // -128~127
        short s = 32767; // -32,768~32,767
        int i = 2147483647; // -2,147,483,648~2,147,483,647(약20억)
        long l = 9223372036854775807L; // -9,223,372,036,854,775,808~9,223,372,036,854,775,807

        // 실수 (기본은 double형)
        float f = 10.0f;
        double d = 10.0; // float보다 더 정밀도 높음

        // 변수를 선언하면 표현 범위에 따라 메모리 공간을 차지함 >> 필요에 맞는 다양한 타입 제공
        // 메모리 용량 저렴 >> 개발속도나 효율에 초점 맞추기 >> Java는 기본으로 4byte=int를 효율적으로 계산하도록 설계됨
        // 자주 사용하는 타입 : int,long, double, boolean, String
    }
}
