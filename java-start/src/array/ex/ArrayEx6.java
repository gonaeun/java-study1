package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        // 사용자에게 입력받은 정수 중, 배열 내에서 가장 큰수와 작은수를 출력하라
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력 받을 숫자의 갯수를 입력하세요 : ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int minNum, maxNum;

        System.out.println(n +"개의 정수를 입력하세요 : ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        minNum = maxNum = numbers[0];
        for (int i = 0; i < n; i++){
            if(numbers[i] < minNum){
                minNum = numbers[i];
            }
            if(numbers[i] > maxNum){
                maxNum = numbers[i];
            }
        }

        System.out.println("가장 작은 정수 : " + minNum);
        System.out.println("가장 큰 정수 : " + maxNum);
    }
}
