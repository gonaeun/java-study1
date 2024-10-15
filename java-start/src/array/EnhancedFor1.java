package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        // 일반 for문
        for (int i = 0; i <numbers.length; i++) {
            int number = numbers[i];  // 직접 인덱스를 선언하여 일련의 과정을 거침
            System.out.println(number);
        }

        // 향상된 for문 : for-each문
        for (int number : numbers) {
            // numbers라는 배열에 있는 값들이 for문이 반복될 때마다 int number에 하나씩 적용됨
            System.out.println(number);
        }

        // for-each 문을 사용할 수 없는 경우 : 증가하는 index 값을 직접 루프에서 사용하는 경우
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는 : " + numbers[i]);
        }

    }
}
