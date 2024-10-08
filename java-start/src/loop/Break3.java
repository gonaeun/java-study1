package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; ; i++) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i="+i+" sum="+sum);
                break;
                // Break2 파일을 for문에 맞게 수정
                // >> i에 대한 초기값, 증감 조건식을 한눈에 확인 가능
            }
        }
    }
}
