package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        // 처음 10개의 짝수를 출력
        // while문과 for문 2가지 버전의 정답 만들기

        int num = 2;
        int count = 1;
        while (count <= 10){
            System.out.println(num);
            num += 2;
            count++;
            // 짝수에 2씩 더하는 행위를 10번만 반복
        }
    }
}
