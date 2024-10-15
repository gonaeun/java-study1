package array;

public class ArrayRef4 {
    public static void main(String[] args) {
        // 배열 : 같은 타입의 변수를 사용하기 편하게 하나로 묶어둔 것

        // 배열 선언, 생성, 초기화
        int[] students = new int[]{90,80,70,60,50,40,30};
        // 학생 점수 {40,30} 추가해도 여전히 실행 됨!
        // >> 배열을 사용한 덕분에 프로그램 구조화 성공

        // 또는 이렇게도 가능
        // int[] students = {90,80,70,60,50};

        // 변수 값 사용
        for (int i = 0; i < students.length; i++){
            System.out.println("학생"+ (i+1)+ "의 점수 : " + students[i]);
        }
    }
}
