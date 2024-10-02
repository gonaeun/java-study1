package condition;

public class Switch1 {
    public static void main(String[] args) {
        // 문제 (else-if문 사용)
        // 회원 등급에 따라 다른 쿠폰을 발급하는 프로그램 작성
        // 1등급 : 쿠폰 1000
        // 2등급 : 쿠폰 2000
        // 3등급 : 쿠폰 3000
        // 위의 등급이 아닐 경우 : 쿠폰 5000
        // 쿠폰이 할당된 후에는 "발급받은 쿠폰" + 쿠폰값 출력하기

        int grade = 2;

        int coupon;
        if (grade == 1) {
            coupon = 1000;
        } else if (grade == 2) {
            coupon = 2000;
        } else if (grade == 3) {
            coupon = 3000;
        } else {
            coupon = 5000;
        }
        System.out.println("발급받은 쿠폰 : "+ coupon);
    }
}
