package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {
        // 피라미드 출력
        // int rows를 선언 >> 이 수만큼 피라미드 출력
        // 참고) println()은 출력 후 다음라인으로 넘어가므로
        //      라인을 넘기지 않고 출력하려면 print() 사용
        //      System.out.print("*");

//        System.out.print("*");
//        System.out.println();
//        System.out.print("*");
//        System.out.print("*");
//        System.out.println();
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.println();

        // 중첩 반복문 필요
        int rows = 5;
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++) {    // 2번째 줄일땐 *이 2개, 3번째 줄일떈 *이 3개 출력되게 하는게 j<=i라는 조건식
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
