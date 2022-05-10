package behavior.chainofresponse;

/**
 * packageName : behavior.chainofresponse
 * fileName : NegativeProcessor
 * author : macbook
 * date : 2022/05/10
 * description : 핸들러(chain)를 상속한 음수 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/10         macbook          최초 생성
 */
public class NegativeProcessor implements Chain{
    // 다음 객체의 주소가 들어감
    private Chain nextInChain;

    // 체인 연결 메소드: 링크드 리스트 형태
    // 아래 메소드를 호출하면 체인에 연결됨
    @Override
    public void setNext(Chain nextInChain) {
        // 멤버변수 nextInChain에 다음 객체의 주소가 저장됨
        this.nextInChain = nextInChain;
    }

    // 음수인지 판단하는 메소드
    @Override
    public void process(Number request) {
        // 매개변수가 음수일 경우
        if(request.getNumber() < 0) {
            System.out.println("양수: " + request.getNumber());
        } else {
            // 음수가 아닐 경우 다음 체인으로 넘겨서 다시 판단
            nextInChain.process(request);
        }
    }
}
