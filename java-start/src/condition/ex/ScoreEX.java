package condition.ex;

public class ScoreEX {
    public static void main(String[] args) {

        // 학생의 점수를 기반으로 학점을 출력하는 프로그램 작성

        int score = 90;

        if (score >= 90){
            System.out.println("학점은 A입니다");
        } else if (score >= 80) {
            System.out.println("학점은 B입니다");
        } else if (score >= 70) {
            System.out.println("학점은 C입니다");
        } else if (score >= 60) {
            System.out.println("학점은 D입니다");
        } else {
            System.out.println("학점은 F입니다");
        }
    }
}
