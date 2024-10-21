package method;

public class MethodValue1 {

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1 : "+num1);
        changeNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1 : "+num1);
        // changeNumber 메서드를 겪었음에도, num2는 num1의 값을 복사해서 대입한 것이기 때문에, 4번의 num1값은 변하지 않는다!
        // JAVA는 항상 변수의 값을 복사해서 대입한다!
    }

    public static void changeNumber(int num2) {
        System.out.println("2. changeNumber 변경 전, num2 : "+num2);
        num2 = num2 *2;
        System.out.println("3. changeNumber 변경 후, num2 : "+num2);
    }
}
