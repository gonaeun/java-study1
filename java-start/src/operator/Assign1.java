package operator;

public class Assign1 {
    public static void main(String[] args) {
        // 축약(복합) 대입 연산자
        int a = 5;
        a += 3;  // 5 + 3 = 8
        a -= 2;  // 8 - 2 = 6
        a *= 4;  // 6 * 4 = 24
        a /= 3;  // 24 / 3 = 8
        a %= 5;  // 8 % 5 = 3
        System.out.println(a);
    }
}
