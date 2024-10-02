package condition.ex;

public class DistanceEX {
    public static void main(String[] args) {
        // 주어진 거리에 따라 가장 적합한 운송 수단을 선택하는 프로그램 작성

         int distance = 110;

         if (distance <= 1){
             System.out.println("도보를 이용하세요");
         } else if (distance <= 10) {
             System.out.println("자전거를 이용하세요");
         } else if (distance <= 100) {
             System.out.println("자동차를 이용하세요");
         } else {
             System.out.println("비행기를 이용하세요");
         }
    }
}
