package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;
        while (i<3) {
            System.out.println("현재 숫자는:"+i);
            i++;
            // i가 while의 조건식에 만족하지 않으면 실행 안됨
        }
    }
}
