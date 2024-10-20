package method;

public class Method2 {

    // 매개변수, 반환 타입이 없는 경우

    public static void main(String[] args) {
        printHeader();
        // 매개변수가 없음 >> 인수를 비워두고 호출
        // 반환 타입이 없음 >> 메서드만 호출하고, 반환 값은 받지 않음
        System.out.println(" = 프로그램이 동작합니다 =");
        printFooter();
    }

    public static void printHeader() {
        // 매개변수가 없음 >> 매개변수를 비워두고 정의
        // 반환 타입이 없음 >> 타입을 void로 정의
        System.out.println(" = 프로그램을 시작합니다 =");
        return; // void인 경우 >> return 생략 가능. return을 만나면 메서드 종료
    }

    public static void printFooter() {
        System.out.println(" = 프로그램을 종료합니다 =");
    }
}
