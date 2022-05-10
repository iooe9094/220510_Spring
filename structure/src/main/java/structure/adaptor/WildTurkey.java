package structure.adaptor;

/**
 * packageName : structure.adaptor
 * fileName : WildTurkey
 * author : macbook
 * date : 2022/05/10
 * description : 칠면조를 구현(상속)한 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/10         macbook          최초 생성
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("골골");
    }

    @Override
    public void fly() {
        System.out.println("칠면조는 짧은 거리를 날 수 있음");
    }
}
