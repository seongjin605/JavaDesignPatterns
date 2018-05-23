package creational.pattern.singleton;

/**
 * @SingletonPattern : 어떤 클래스의 인스턴스는 오직 하나임을 보장하며, 이 인스턴스에 접근할 수 있는 전역적인 접촉점을
 *                   제공하는 패턴.
 *
 *                   >Singleton의 특징
 * 
 *                   Singleton은 당연히 인스턴스가 1개만 생깁니다. 그러자고 만든 거니까요. 또 하나의 규약은
 *                   private 생성자 때문에 상속이 안 된다는 점입니다. (상속받은 하위체는 상위체의 생성자를
 *                   호출합니다.) 예를 들어 Singleton에서 설정관련된 xml 파일을 수정한다고 칩시다. 상속을 받아
 *                   다른 객체를 만들어서 파일을 수정하는 시도를 하면 안되지요. 상속을 받게 되면 "인스턴스 1개"라는 원칙을
 *                   깨게 됩니다. private 생성자는 외부에서의 직접호출을 통한 생성을 막는 것과 상속을 막는 두 가지
 *                   기능을 수행합니다. 둘 다 "인스턴스 1개"라는 원칙을 지키는 것이죠.
 * 
 *                   Factory 패턴과 사용법이 매우 유사합니다. Singleton은 Factory의 특이 케이스로 볼 수도
 *                   있습니다. Factory는 매번 객체를 만들어서 리턴하는 방법이고 Singleton은 한 개만 만들어서
 *                   요청이 들어올 때마다 만들어진 객체를 리턴한다는 게 차이점입니다. 또 일반적으로 Factory는
 *                   create...과 같은 메쏘드 이름을 사용하고 Singleton은 getInstance라는 메쏘드 이름을
 *                   사용합니다.
 * 
 *                   위에서 말한 세가지 방법 중 첫번째 방법의 경우는 public으로 멤버 변수를 선언하고 외부에서 직접
 *                   변수에 접근해서 사용하게 해도 됩니다. (반드시 private이어야할 필요는 없다는 거죠. ) 두번째와
 *                   세번째는 초기화가 보장이 안 되어 있지만, 첫번째의 경우는 보장되어있기 때문입니다. 주의할 점은 외부에서
 *                   악의적으로 public 멤버 변수는 바꿔치기를 할 수도 있기 때문에 이런 식으로 접근할 때는 final 을
 *                   붙여주는 게 좋습니다.(어차피 private 생성자를 가지고 있으니, 외부에서 새로운 객체를 만들어 낼
 *                   수는 없지만 null을 대입할 수는 있기 때문에 final이 필요합니다.) 그럼 public static
 *                   final이 되는군요! 상수란 말이죠. 하지만 일반적인 상수와는 다릅니다. 일반적인 상수는
 *                   Immutable 로 구현이 되어있기 때문입니다. 상수로 많이 쓰는 String, Integer,
 *                   Boolean 등은 전부 Immutalbe입니다. 물론 이런 접근이 권장사항은 아닙니다. 그냥 가능하긴
 *                   하다는 얘깁니다.
 * 
 *                   >JAVA API에 있는 Singleton
 * 
 *                   Boolean에 있는 valueOf 들은 전부 Singleton 비스무레하게 구현되어 있습니다. 다만
 *                   인자를 받기 때문에 멤버 변수로 예제처럼 1개만 가지고 있는 것이 아니라 여러개를 가질 수 있습니다.
 *                   true라는 값을 가지는 Boolean과 false라는 값을 가지는 Boolean 객체 2개가 존재하는
 *                   것이죠. Collections에 있는 empty.. 하는 메쏘드들도 전부 Singleton입니다.
 * 
 *                   jdk 안에 있는 Singleton은 대부분 위에서 말한 방법 중 첫번째 방법을 쓰고 있습니다. 클래스
 *                   로드시 멤버 변수들을 초기화하는 방법입니다. 그래서 대부분 그 멤버 변수들은 public static
 *                   final 로 선언되어있습니다.
 *                   
 *                   {@link http://iilii.egloos.com/3807664}
 *                   {@link https://dzone.com/articles/java-singletons-using-enum}
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
