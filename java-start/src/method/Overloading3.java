package method;

public class Overloading3 {
    // 메서드 이름은 같지만, 매개변수 유형이 다른 경우 >> 다른 메서드!

    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        // int add 매서드 삭제해도 3.0의 결과값 그대로 나옴 >> 자동형변환
        // 본인의 타입에 가장 적합한 메서드가 없으면, 형 변환 가능한 타입의 메서드를 찾아서 실행한다!
        System.out.println("2: " + add(1.2,1.5));
    }

//    public static int add(int a, int b){
//        System.out.println("1번 호출");
//        return a + b;
//    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
