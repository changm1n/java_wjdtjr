// 멤버변수와 멤버변수를 제외한 변수(지역변수)로 나눌수 있다.
// static이 붙은면 클래스변수, 붙지 않으면 인스턴스 변수이다.
class Varibles {
    int iv; // 인스턴스 변수
    static int cv; // 클래스 변수

    void method()
    {
        int lv = 0;  // 지역변수
    }
}

//클래스 변수와 인스턴스변수의 차이
public class Card {
    String kind;
    int number;

    static int width = 100;
    static int height = 250;
}
//카드를 예시로 설명하면 각 카드 인스턴스는 자신만의 무늬와 숫자를 가지고 있지만 모든 카드 인스턴스는 높이와 너비가 유지되어야 한다.
//클래스 변수(static변수)는 객체생성 없이 클래스이름.클래스변수로 직접 사용이 가능하다.