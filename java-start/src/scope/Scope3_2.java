package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        // 스코프의 존재 이유

        int m = 10;
        if (m>0){
            int temp = m*2;
            System.out.println("temp = "+temp);
            // temp의 스코프가 해당 코드블록으로 줄어듬 >> 메모리 효율적으로 사용
            // temp 변수를 생각해야하는 범위가 줄어듬 >> 더 유지보수 하기 좋은 코드
        }
        // System.out.println(temp);   // temp 접근 불가능
        System.out.println("m = "+m);
    }
}
