package speakhello;

/**
 * @author BerINs
 * @date 2020/11/7 下午4:49
 */


public class SpeakHelloTest {
    public static void main(String[] args) {
       KindHello kindHello = new KindHello();
       kindHello.lookHello(new Chinese());
       kindHello.lookHello(new English());
    }
}
