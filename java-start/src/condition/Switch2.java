package condition;

public class Switch2 {
    public static void main(String[] args) {
        // 문제 (switch문 사용)
        // 회원 등급에 따라 다른 쿠폰을 발급하는 프로그램 작성
        // 1등급 : 쿠폰 1000
        // 2등급 : 쿠폰 2000
        // 3등급 : 쿠폰 3000
        // 위의 등급이 아닐 경우 : 쿠폰 5000
        // 쿠폰이 할당된 후에는 "발급받은 쿠폰" + 쿠폰값 출력하기

        int grade = 1;

        int coupon;
        switch (grade) {
            case 1:             // grade가 1이면 >> 쿠폰은 1000원이고 >> break
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:            // else 같은 구문
                coupon = 5000;
        }
        System.out.println("발급받은 쿠폰 : " + coupon);

        // switch문은 if문을 더 편리하고 직관적으로 사용할 수 있는 기능
        // if문은 비교연산자도 사용할 수 있지만, switch문은 단순히 값이 같은지만 비교할 수 있음
    }
}
