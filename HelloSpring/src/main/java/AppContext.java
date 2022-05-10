import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * packageName : PACKAGE_NAME
 * fileName : AppContext
 * author : macbook
 * date : 2022/05/10
 * description : 스프링 환경 설정 자바 클래스
 *               과거에는 xml로 환경 설정 했으나, 현재는 자바 사용
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/10         macbook          최초 생성
 */

// @Configuration : 스프링 환경 설정 어노테이션(@)
@Configuration
public class AppContext {

    // @Bean : 스프링 컴포넌트로 등록 (메소드 형태)
    // @Configuration 등록된 클래스에 나옴
    // 컴포넌트 : 스프링에서 관리하는 서비스 (메소드, 객체) : 레고블럭
    // 컴포넌트 어노테이션 종류 : @Bean, @Component (@Service, @Repository)
    @Bean
    public Greeter greeter() {
        Greeter g = new Greeter();
        g.setFormat("Hello Spring"); // 인사말이 저장됨
        return g;
    }
}
