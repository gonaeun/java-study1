package condition;

public class CondOp2 {
    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = "+age+" status = "+status);

        // 참과 거짓 여부에 따라 status 변수의 값이 달라진다
        // 삼항연산자를 사용
        // 조건 ? 참일때 : 거짓일때
    }
}
