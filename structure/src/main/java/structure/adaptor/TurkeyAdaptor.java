package structure.adaptor;

/**
 * packageName : structure.adaptor
 * fileName : TurkeyAdaptor
 * author : macbook
 * date : 2022/05/10
 * description : 오리를 통해 칠면조의 기능(메소드)를 사용하고 싶을 때
 *               어댑터를 이용함
 *               껍데기: 오리(Duck) / 알맹이: 칠면조(Turkey)
 *               클라이언트(고객)는 무조건 오리의 메소드 이름만 사용해야함(변경불가)
 *               어댑터를 통해 칠면조의 기능을 사용할 수 있음
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/10         macbook          최초 생성
 */

public class TurkeyAdaptor implements Duck{
    // 칠면조를 사용
    Turkey turkey;

    // 매개변수 1개 생성자 생성 ( DI(Dependency Injection) : 의존성 주입(매개변수로 전달) )
    public TurkeyAdaptor(Turkey turkey) {
        this.turkey = turkey;
    }

    // 껍데기 : 오리 메소드 (꽥꽥)
    // 알맹이 : 칠면조 메소드를 호출
    @Override
    public void quack() {
        turkey.gobble(); // 칠면조는 골골 소리를 냄
    }

    @Override
    public void fly() {
        // 칠면조는 멀리 날 수 없으므로 다섯 번 날아 오리처럼 긴 거리를 날게 함
        for(int i=0; i<5; i++) {
            turkey.fly(); // 짧은 거리를 날 수 있음
        }
    }
}
