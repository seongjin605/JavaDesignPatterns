package com.java.creational.pattern.prototype;

/**
 * @PrototypePattern : 생성할 객체의 종류를 명세하는 데에 원형이 되는 예시물을 이용하고, 그 원형을 복사함으로써 새로운 객체를
 *                   생성하는 패턴.
 * 
 *                   기존에 만들어진 복잡다난한 인스턴스의 내용이 일부만 살짝 변경된 비스무레한 객체가 필요한 경우에 쓰입니다.
 *                   일반적으로 객체를 새로 생성할 때는 new Object()와 같은 방법으로 생성을 합니다. 그러나 그렇게
 *                   생성할 경우 기존에 만들어진 것과 유사하다고 해도 결국 모든 정보를 다시 세팅해주어야 합니다. 그러나,
 *                   clone()을 이용할 경우에는 기존에 만들어진 것을 복사해서 바뀐 부분만 대체해 주면 인스턴스를
 *                   생성하기가 쉽습니다. 아주 일반적인 "원형"을 만들어서 그것을 복사한 후 적당히 커스터마이징을 하면
 *                   new로 객체를 생성하는 것보다 쉽게 됩니다.
 * 
 *                   스타크래프트 같은 걸 생각을 해봅시다. 건물은 Building 이라는 클래스 하나로 정의된다고
 *                   칩시다.(물론, 안 그렇겠지만 그렇다 칩시다) 한 명의 플레이어는 커맨드 센터를 여러 개 지을 수
 *                   있습니다. 각각의 커맨드 센터끼리는 위치 등 일부 정보만 다르고 생김새, 기본 에너지 등등 다른 건 다
 *                   비스무레할 겁니다. 그럴 때 Building이라는 클래스의 속성으로 모든 값들을 다시 세팅하는 것은 굉장히
 *                   번거로운 작업이 될 겁니다. 그래서 대략적인 모양새를 갖춘 객체를 하나 생성하고 그 객체를 복사해서 필요한
 *                   필드만 다시 세팅하면 쓸만한 커맨드 센터가 만들어집니다.
 * 
 *                   또 위의 예제에서는 그렇게 구현하지 않았지만 일반적으로 Prototype은 외부로 드러내지 않습니다.
 *                   팩토리 패턴과 조합해서 쓰는 게 일반적입니다. Factory 클래스에서 원형을 관리하고, 그
 *                   Factory의 create 메소드가 호출되면, 원형으로부터 복사해서 외부로 던져주는 겁니다.
 *                   Prototype은 Factory에서만 관리되고 그 외부로 드러나지 않습니다.
 * 
 *                   clone() 메소드가 호출되어 새로운 객체가 생성되는 시점에 원형이 어찌 생겼는지 크게 신경쓰지
 *                   않습니다. 그냥 다짜고짜 복사할 뿐입니다.
 *                   
 *                   {@link http://iilii.egloos.com/4062738}
 */
public class PatternInJava {

	public static void main(String[] args) throws CloneNotSupportedException {

		String ssn = "7411218";
		String name = "test";
		int age = 27;

		Person person = new Person(ssn, name, age);

		// Person 클래스 person 인스턴스 복제
		Person person2 = (Person) person.myClone();

		boolean flag = person.equals(person2);

		System.out.println("Person == Person2 ? " + flag);
		System.out.println("person=" + person.myClone());
		System.out.println("person2=" + person2.myClone());
		System.out.println("=====================================");

		System.out.println("person의 정보 : " + "\n" + person.getSsn() + "\n" + person.getName() + "\n" + person.getAge());
		System.out.println("=====================================");
		System.out.println(
				"person2의 정보 : " + "\n" + person2.getSsn() + "\n" + person2.getName() + "\n" + person2.getAge());
	}

}
