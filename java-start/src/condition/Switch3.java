package condition;

public class Switch3 {
    public static void main(String[] args) {
        // 문제 (switch문 사용_ break가 없다면?)
        // 회원 등급에 따라 다른 쿠폰을 발급하는 프로그램 작성
        // 2등급 : 쿠폰 3000 으로 수정

        int grade = 2;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:  // break가 없으면 다음 라인의 코드도 실행됨
            case 3:
                coupon = 3000;  // 2등급 일때, 발급받은 쿠폰 : 3000 출력됨
                break;
            default:
                coupon = 5000;
        }
        System.out.println("발급받은 쿠폰 : " + coupon);

        // break가 없다면 중단하지 않고 다음 라인의 코드도 실행되므로
        // switch문은 반드시 break와 함께 사용하기
    }
}
