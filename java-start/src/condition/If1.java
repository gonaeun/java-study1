package condition;

public class If1 {
    public static void main(String[] args) {

        int age = 20; // 사용자의 나이

        if (age >= 18){
            System.out.println("성인입니다");
        }  // 성인입니다

        if (age < 18){
            System.out.println("미성년자입니다");
        }  // false는 코드블럭을 실행하지 않음
    }
}
