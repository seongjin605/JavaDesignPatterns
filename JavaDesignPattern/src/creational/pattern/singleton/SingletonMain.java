package creational.pattern.singleton;

/**
 * @SingletonPattern : 어떤 클래스의 인스턴스는 오직 하나임을 보장하며, 이 인스턴스에 접근할 수 있는 전역적인 접촉점을
 *                   제공하는 패턴. 어플리케이션이 시작될 때 어떤 클래스가 최초 한번만 메모리를 할당하고(static) 그
 *                   메모리에 인스턴스를 만들어 사용하는 디자인 패턴. 단 하나의 인스턴스를 생성해서 사용하는 디자인 패턴이다.
 * 
 *                   >싱글톤 패턴을 사용하는 이유 : 고정된 메모리 영역을 얻으면서 한번의 new로 인스턴스를 사용하기 때문에
 *                   메모리 낭비를 방지할 수 있음 또한 싱글톤으로 만들어진 클래스의 인스턴스는 전역 인스턴스이기 때문에 다른
 *                   클래스의 인스턴스들이 데이터를 공유하기 쉽다. DBCP처럼 공통된 객체를 여러개 생성해서 사용해야하는
 *                   상황에서 많이 사용 (스레드풀, 캐시, 대화상자, 사용자 설정, 레지스트리 설정, 로그 기록 객체등)
 *                   안드로이드 앱 같은 경우 각 액티비지나 클래스별로 주요 클래스들을 일일이 전달하기 번거롭기 때문에 싱글톤
 *                   클래스를 만들어 어디서나 접근하도록 설계하는것이 편함.
 *                   
 *                   >싱글톤 패턴의 문제점 : 싱글톤 인스턴스가 너무 많은 일을 하거나 마낳은 데이터를 공유시킬 경우 다른 클래스의
 *                   인스턴스들 간에 결합도가 높아져 "개방-폐쇄 원칙"을 위배하게된다.(객체지향 설계에 어긋남)
 * 
 * 
 *
 */
public class SingletonMain {

	public static void main(String[] args) {

		Singleton s = Singleton.INSTANCE;
		Singleton s1 = Singleton.INSTANCE;

		System.out.println("s == s1 ? " + (s == s1));

		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());

	}

}
