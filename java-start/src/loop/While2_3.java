package loop;

public class While2_3 {
    public static void main(String[] args) {

        // i부터 endNum만큼 코드를 반복하도록
        // 코드가 실행되는 횟수를 유연하게 바꾸어야 함 >> while문 사용

        int sum = 0;
        int i = 1;
        int endNum = 3;

        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i="+i+ " sum="+sum);
            i++;
        }
        // 코드가 몇번 반복되는지 확인~!
    }
}
