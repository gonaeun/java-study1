package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 여러 개의 숫자를 입력받고, 그 숫자들의 합계와 평균을 계산하시오
        // 모든 숫자의 입력이 끝난 후에는, 숫자들의 합계와 평균(소수점 아래까지 계산) 출력
        // -1을 입력하여 숫자 입력 종료

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요 : ");
/*        while (true) {
            input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            sum += input;
            count++; // 평균을 구하기 위해 갯수를 세어줘야 함
        }
 */
        while ((input = scanner.nextInt()) != -1) {
            sum += input;
            count ++;
        }
        // 이런식으로 간단하게 코드 입력 가능
        // 첫번째 코드는 if문을 입력해서 break를 걸었던 방식이고
        // 두번째 코드는 while문의 조건이 참이 아니라면 (-1 입력시) 실행되지 않고 빠져나가도록 하는 방식

        double average = (double) sum / count;
        // sum, count는 int이니까 명시적 형변환해줌
        System.out.println("입력한 숫쟈들의 합계 : "+sum);
        System.out.println("입력한 숫쟈들의 평균 : "+average);

    }
}
