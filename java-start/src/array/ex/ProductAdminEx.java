package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        // 상품 관리 프로그램 만들기
        // 기능1 ) 상품 등록 : 상품 이름과 가격을 입력받아 저장
        // 기능2 ) 상품 목록 : 지금까지 등록한 모든 상품의 목록을 출력

        // 첫 화면에서 사용자들에게 세가지 선택 제시
        // 1. 상품 등록 >> 상품 이름과 가격을 입력받아 배열에 저장
        // 2. 상품 목록 >> 배열에 저장된 모든 상품을 출력
        // 3. 종료 >> 프로그램 종료

        // 제약조건 : 상품은 최대 10개까지 등록 가능

        int maxProducts = 10;  // 제약조건 10개
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];  // 제품명, 제품가격 모두 배열개수 10개까지만
        int productCount = 0;  // 상품이 저장될때마다 한개씩++

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요 : ");
            int menu = scanner.nextInt();   // \n가 남음
            scanner.nextLine();  // \n 인식용 코드

            if (menu == 1){

                if (productCount >= maxProducts){
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;   // 밑에 코딩 실행 안하고, 다시 while 문으로 돌아감
                }
                System.out.print("상품 이름을 입력하세요 : ");
                productNames[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요 : ");
                productPrices[productCount] = scanner.nextInt();

                productCount++;
            } else if (menu == 2){
                if (productCount == 0){
                    System.out.println("등록된 상품이 없습니다");
                    continue;
                }
                for (int i = 0; i < productCount; i++){
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }
            } else if (menu == 3){
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("옵션을 바르게 선택해주세요");
            }
        }


    }
}
