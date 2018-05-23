package structural.pattern.bridge;

/**
 * 
 * @Bridge : 구현부에서 추상층을 분리하여 각자 독립적으로 변형할 수 있게 하는 패턴. 
 * 		- 클래스를 다른 인터페이스로 변형시키는 면에서 어뎁터 패턴과 유사하게 보임 
 *         - 인터페이스와 실행을 분리하여 독립적으로 변할 수 있게 함
 * 
 * 
 * 
 *         {@link http://palpit.tistory.com/197 [palpit's log-b]}
 *
 */
public class BridgeMain {

	public static void main(String[] args) {
		ITV tv = new LGTV();
		LogitechRemoteControl lrc = new LogitechRemoteControl(tv);
		lrc.setChannelKeyboard(100);
	}
}
