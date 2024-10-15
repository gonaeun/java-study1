package array;

public class ArrayRef3 {
    public static void main(String[] args) {
        // 배열 : 같은 타입의 변수를 사용하기 편하게 하나로 묶어둔 것

        int[] students; // 배열 변수 선언
        students = new int[]{90,80,70,60,50}; // 배열 생성과 초기화 (초기화=초기값 대입)


        // 변수 값 사용
        for (int i = 0; i < students.length; i++){
            System.out.println("학생"+ (i+1)+ "의 점수 : " + students[i]);
        }
    }
}
