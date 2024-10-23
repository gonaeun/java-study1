package method;

public class Overloading1 {
    // 메서드의 오버로딩 : 이름이 같아도 매개변수의 타입, 순서가 다르면 다른 메서드로 구분
    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1,2, 3));
    }

    public static int add(int a, int b){
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}
