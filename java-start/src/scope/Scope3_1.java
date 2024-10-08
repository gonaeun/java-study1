package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        // 스코프의 존재 이유

        int m = 10;
        int temp = 0;
        if (m>0){
            temp = m*2;
            System.out.println("temp = "+temp);
            // 조건이 맞으면 변수 m의 값을 2배로 증가시켜서 출력하는 코드
        }
        System.out.println("m = "+m);
        // 임시 변수 temp는 if 조건이 만족할 때 임시로 잠깐 사용하는 변수이지만
        // 임시 변수 temp는 main() 코드 블록에 선언되어 있음
        // 문제점 1) 불필요한 메모리 사용 : temp는 if코드블록 안에서만 사용하는데 main()코드블록이 종료될 때까지 메모리에 유지됨
        // 문제점 2) 코드 복잡성 : if 코드 블록 안에 temp를 선언했다면 if가 끝나고 temp를 전혀 생각하지 않아도 됐을텐데... temp의 스코프가 불필요하게 넓음
    }
}
