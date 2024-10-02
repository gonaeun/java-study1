package condition;

public class CondOp1 {
    public static void main(String[] args) {
        int age = 16;
        String status;
        if (age >= 18){
            status = "성인";
        } else {
            status = "미성년자";
        }
        System.out.println("age = "+age+" status = "+status);
        // 참과 거짓 여부에 따라 status 변수의 값이 달라진다
        // 삼항연산자를 사용 할 수 있음
    }
}
