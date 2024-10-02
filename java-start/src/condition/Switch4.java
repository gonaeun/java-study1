package condition;

public class Switch4 {
    public static void main(String[] args) {
        // 새로운 switch문 (화살표-> 이용)

        int grade = 3;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 5000;
        };
        System.out.println("발급받은 쿠폰 : "+coupon);
    }
}
