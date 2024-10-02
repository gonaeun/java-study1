package condition.ex;

public class ExchangeRateEx {
    public static void main(String[] args) {
        // 미국 달러에서 한국 원으로 변환하는 프로그램 작성
        // 환율은 1달러당 1,300원

        int dollar = 10;

        if (dollar < 0){
            System.out.println("잘못된 금액입니다");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다");
        } else {
            int won = dollar * 1300;
            System.out.println("환전 금액은 "+won+"원입니다.");
        }
    }
}
