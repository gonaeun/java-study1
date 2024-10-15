package array;

public class ArrayRef1 {
    public static void main(String[] args) {
        // 배열 : 같은 타입의 변수를 사용하기 편하게 하나로 묶어둔 것

        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성
        System.out.println(students);  // 참조값 확인 가능. 출력:[I@10f87f48

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용
        System.out.println("학생1의 점수 : " + students[0]);
        System.out.println("학생2의 점수 : " + students[1]);
        System.out.println("학생3의 점수 : " + students[2]);
        System.out.println("학생4의 점수 : " + students[3]);
        System.out.println("학생5의 점수 : " + students[4]);
    }
}
