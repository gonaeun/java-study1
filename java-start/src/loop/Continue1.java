package loop;

public class Continue1 {
    public static void main(String[] args) {
        // 1부터 5까지의 숫자를 출력하는데, 숫자가 3일 때는 출력을 건너뛰어야 한다
        // continue : 반복문의 나머지 부분을 건너뛰고 다음 반복으로 진행한다

        int i = 1;
        while (i <= 5){
            if (i == 3) {
                i++;
                continue;
                // 숫자가 3일 때는 출력을 건너뛴다! (밑의 코드를 무시하고 바로 while의 조건식으로 감)
            }
            System.out.println(i);
            i++;
        }
    }
}
