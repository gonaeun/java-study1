package loop;

public class While1_2 {
    public static void main(String[] args) {
        int count = 0;

        while (count < 3) {
            count = count +1;
            System.out.println("현재 숫자는 : "+count);
        }
        // 조건문이 참이면 코드 블럭을 실행 / 거짓이면 while문을 벗어남
        // >> 코드 블럭이 끝나면 다시 돌아가서 조건식 검사
    }
}
