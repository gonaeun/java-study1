package array;

public class ArrayDimension3 {
    public static void main(String[] args) {
        // 2x3의 2차원 배열 만든다

        // 2차원 배열의 초기화 리팩토링
        int[][] arr = new int[][]{
                {1,2,3},
                {4,5,6}
        };  // 행2,열3

        for (int row = 0; row<2; row++ ) {
            for (int column = 0; column<3; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); // 한 행이 끝나면 라인을 변경
        }
    }
}
