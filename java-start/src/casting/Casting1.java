package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;  // int -> long
        System.out.println("longValue = " + longValue);
        
        doubleValue = intValue;  // int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L;  // long -> double
        System.out.println("doubleValue2 = " + doubleValue);

        // JAVA는 기본적으로 같은 타입에 값을 대입할 수 있음
        // 다른 타입에 값을 대입하는 것은?
        // 작은 범위에서 큰 범위로 값을 넣는 것도 허용함 (>> 자동 형변환. 묵시적 형변환)
        // int < long < double
    }
}
