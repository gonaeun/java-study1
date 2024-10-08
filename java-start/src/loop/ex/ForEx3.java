package loop.ex;

public class ForEx3 {
    public static void main(String[] args) {
        // 1부터 max까지의 합을 계산하고 출력하는 프로그램 작성
        // sum이라는 변수 사용하여 누적 합 표현
        // i라는 변수 사용하여 카운트 수행 (1부터 max까지 증가하는 변수)
        // while문, for문 2가지 버전의 정답 작성

        int max = 100;

        int sum = 0;
        for(int i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
