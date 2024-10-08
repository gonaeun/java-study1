package loop;

public class Nested1 {
    public static void main(String[] args) {
        // 중첩 반복문
        // 외부 for는 2번, 내부 for는 3번 >> 총 외부(2)*내부(3)=6번 수행됨

        for(int i = 0; i <2; i++){
            System.out.println(" 외부 for 시작 i:"+i);
            for(int j = 0; j<3; j++) {
                System.out.println("->내부 for "+i+"-"+j);
            }
            System.out.println("외부 for 종료 i:" +i);
            System.out.println();
        }
    }
}
