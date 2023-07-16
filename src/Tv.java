/*클래스는 객체를 정의해 놓은 것이다.
  객체는 실제로 존재하는 것으로 속성과 기능을 가지고 있다.
  ex) Tv(객체) Tv 설계도(클래스)
  속성 -> 변수
  기능 -> 메서드를 주로 사용*/

class Tv{
    //일반적으로 메서드보다는 변수를 먼저 선언하고 메서드를 선언한다. 끼리끼리 모아두기
    String color;
    boolean power;
    int channel;

    void power()    { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class TvTest {
    public static void main(String args[]) {
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은" + t.channel + "입니다.");
    }
}