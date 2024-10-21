package method;

public class MethodValue3 {

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1 : "+num1);  // 5
        num1 = changeNumber(num1);
        // 메서드를 사용해서 값을 변경하려면? 메서드의 호출 결과를 반환받자!
        System.out.println("changeNumber 호출 후, num1 : "+num1);  // 10
    }

    public static int changeNumber(int num2) {
        num2 = num2 * 2;
        return num2;
    }
}
