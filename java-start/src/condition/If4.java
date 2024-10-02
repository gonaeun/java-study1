package condition;

public class If4 {
    public static void main(String[] args) {

        int age = 8;

        if (age <= 7) {
            System.out.println("미취학");
        } else if (age <= 13 ) {   // 앞선 조건이 거짓임(age>7)이 이미 포함됨 >> 코드 중복 줄임
            System.out.println("초등학생");
        } else if (age <= 16 ) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else {                    // else 코드는 생략할 수 있다
            System.out.println("성인");
        }
    }
}
