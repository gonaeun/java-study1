package loop;

public class DoWhile2 {
    public static void main(String[] args) {

        int i = 10;

        do {
            System.out.println("현재 숫자는:"+i);
            i++;
        } while (i<3);

        // do-while문 : 조건에 상관없이 무조건 한 번은 코드를 실행
        // >> 최초 한번은 코드블럭을 꼭 실행해야 하는 경우에 사용
    }
}
