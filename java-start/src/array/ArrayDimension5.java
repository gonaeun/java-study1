package array;

public class ArrayDimension5 {
    public static void main(String[] args) {
        // 2x3의 2차원 배열 만든다

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}   // 추가했는데 제대로 출력된걸 보니, 리팩토링 성공
        };  // 행2,열3

        // 배열의 길이를 이용한 리팩토링
        for (int row = 0; row< arr.length; row++ ) {
            for (int column = 0; column< arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); // 한 행이 끝나면 라인을 변경
        }
    }
}
