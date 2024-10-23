package method;

public class Overloading2 {
    // 매개변수의 타입이 다른 매서드는 다른 매서드!
    public static void main(String[] args) {
        myMtehod(1, 1.2);
        myMtehod(1.2, 1);
    }

    public static void myMtehod(int a, double b){
        System.out.println("int a, double b");
    }

    public static void myMtehod(double a, int b) {
        System.out.println("double a, int b");
    }
}
