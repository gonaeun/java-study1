package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        // 처음 10개의 짝수를 출력
        // while문과 for문 2가지 버전의 정답 만들기

        for(int num=2, count=1; count<=10; num+=2, count++){  // 여러개 한번에 가능
            System.out.println(num);
        }

//        int num=2;
//        for(int count=1; count<=10; count++){ // count에 대한 증감을 알아보기엔 이게 더 좋은 코드
//            System.out.println(num);
//            num += 2;
//        }
    }
}
