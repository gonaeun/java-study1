package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 사용자로부터 상품 정보(상품명, 가격, 수량)을 입력받아서 총 가격을 출력하시오
        // 세가지 옵션 (1:상품입력 2:결제 3:프로그램 종료)
        // 사용자가 옵션을 선택하면, 사용자에게 상품명, 가격, 수량을 입력받으시오
        // 결제 옵션을 선택하면, 총 비용을 출력하고 총 비용을 0으로 초기화 (결제 완료했다고 가정 >> 다음 사용자를 위해)
        // 세가지 옵션 외에 다른 값을 입력하면, "올바른 옵션을 선택해주세요" 메세지 출력

        int totalCost = 0;

        while (true) {
            System.out.println("1 : 상품 입력, 2 : 결제, 3 : 프로그램 종료");
            int option = input.nextInt();

            if (option == 1){
                input.nextLine();  // 윗줄의 코드에서 줄바꿈 코드만 남는거 해결

                System.out.print("상품명을 입력하세요 : ");
                String product = input.nextLine();

                System.out.print("상품의 가격을 입력하세요 : ");
                int price = input.nextInt();

                System.out.print("구매 수량을 입력하세요 : ");
                int quantity = input.nextInt();

                totalCost += price * quantity;
                // totalCost = totalCost + price * quantity 의미
                System.out.println("상품명 : "+product + " 가격 : " +price+ "  수량 : "+ quantity + " 합계 : "+ price*quantity);

            } else if (option == 2){
                System.out.println("총 비용 : "+ totalCost);
                totalCost = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요");
            }
        }
    }
}
