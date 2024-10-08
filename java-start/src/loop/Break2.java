package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for(;;) {  // 조건식 없음 >> 무한 반복하는 코드
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i="+i+" sum="+sum);
                break;
                // 무한 반복하다가 sum>10 조건을 만족하면 break를 사용해서 반복문을 빠져나감
            }
            i++;
        }
    }
}
