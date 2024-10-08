package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(true) {
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i="+i+" sum="+sum);
                break;
                // sum>10인 경우 break
                // break가 없으면 중간에 빠져나올 수 없음
            }
            i++;
        }
    }
}
