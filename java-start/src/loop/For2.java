package loop;

public class For2 {
    public static void main(String[] args) {
        // i부터 하나씩 증가하는 수를 endNum까지 더하자
        int sum = 0;
        int endNum = 3;
        // 1+2+3 = 6

        for (int i = 1; i <= endNum; i++){
            sum = sum+i;
            System.out.println("i = "+i+" sum = "+sum);
        }

        // 같은 코드를 while문으로 작성한 while2_3파일과 비교해 볼 때
        // while문보다 for문으로 작성한 코드가 더 깔끔
        // for문은 초기화, 조건 검사, 반복 후 작업 등이 모두 규칙적으로 한줄에 있기 때문
        // >> 루프 횟수에 관련된 코드와 나머지 코드를 명확하게 구분할 수 있다!
    }
}
