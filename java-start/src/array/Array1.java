package array;

public class Array1 {
    public static void main(String[] args) {
        // 학생들의 점수를 출력하는 간단한 프로그램
        int student1 = 90;
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;

        System.out.println("학생1의 점수 : " + student1);
        System.out.println("학생2의 점수 : " + student2);
        System.out.println("학생3의 점수 : " + student3);
        System.out.println("학생4의 점수 : " + student4);
        System.out.println("학생5의 점수 : " + student5);
        // 학생 수가 증가함에 따라 코딩 양이 비례해서 증가하는 문제 발생
        // 변수명은 반복문으로 해결 할 수 없어!
        // 같은 타입의 변수를 반복해서 선언하고 반복해서 사용하는 문제 해결 >> "배열"
    }
}
