package array;

public class ArrayRef2 {
    public static void main(String[] args) {
        // 배열 : 같은 타입의 변수를 사용하기 편하게 하나로 묶어둔 것

        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용
        // [ArrayRef1]파일을 리팩토링 (;기능은 똑같은데 내부 코드의 구조를 개선)
        // 인덱스는 0부터 시작 >> i = 0으로 초기값 설정
//        for (int i = 0; i < 5; i++){
//            System.out.println("학생"+ (i+1)+ "의 점수 : " + students[i]);
//        }

        // 위의 코드를 리팩토링 (students.length 배열의 길이 이용)
        for (int i = 0; i < students.length; i++){
            System.out.println("학생"+ (i+1)+ "의 점수 : " + students[i]);
        }
    }
}
