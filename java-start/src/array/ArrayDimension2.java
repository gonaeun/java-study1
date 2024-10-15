package array;

public class ArrayDimension2 {
    public static void main(String[] args) {
        // 2x3의 2차원 배열 만든다
        int[][] arr = new int[2][3]; // 행2,열3

        arr[0][0] = 1; // 0행,0열
        arr[0][1] = 2; // 0행,1열
        arr[0][2] = 3; // 0행,2열
        arr[1][0] = 4; // 1행,0열
        arr[1][1] = 5; // 1행,1열
        arr[1][2] = 6; // 1행,2열

        // for문을 중첩하여 리팩토링
        // 첫번째 for문은 행을 탐색, 내부에 있는 두번째 for문은 열을 탐색
        for (int row = 0; row<2; row++ ) {
            for (int column = 0; column<3; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); // 한 행이 끝나면 라인을 변경
        }
    }
}
