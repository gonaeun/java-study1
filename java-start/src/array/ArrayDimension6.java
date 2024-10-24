package array;

public class ArrayDimension6 {
    public static void main(String[] args) {
        // 2x3의 2차원 배열 만든다

        int[][] arr = new int[3][3];  // 배열의 크기 정하는대로 값이 들어감

        // 중첩된 for문을 이용하여 값을 입력
        int i = 1;
        for (int row = 0; row < arr.length; row++){
            for (int column = 0; column < arr[row].length; column++){
                arr[row][column] = i++;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();//한 행이 끝나면 라인을 변경한다.
        }
    }
}
