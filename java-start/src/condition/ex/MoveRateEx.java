package condition.ex;

public class MoveRateEx {

    public static void main(String[] args) {
        // 요청한 평점 이상의 영화를 추천해주는 프로그램 작성
        // 어바웃타임 - 평점9
        // 토이스토리 - 평점8
        // 고질라 - 평점7

        double rating = 8;
        if (rating >= 9 ){
            System.out.println("'어바웃타임'를 추천합니다.");
        }
        if (rating >= 8 ) {
            System.out.println("'토이스토리'를 추천합니다.");
        }
        if (rating >= 7 ) {
            System.out.println("'고질라'을 추천합니다");
        }
        // else-if로 묶으면 하나씩 밖에 추천 안하는데
        // 해당 rating 이상인 모든 영화를 추천받을거니까 if문 여러개로 작성!
    }
}
