package creational.pattern.factory;

/**
 * @FactoryMethod : 객체를 생성하는 인터페이스는 미리 정의하되, 인스턴스를 만들 클래스의 결정은 서브클래스 쪽에서 내리는 패턴.
 * 클래스의 인스턴스를 만드는 시점을 서브클래스로 미룸. 
 * 
 * factory는 공장이죠. 객체를 막 찍어내는 놈입니다. 객체 선언은 보통 new
 * 객체() 이런식으로 하죠. factory는 내부에서 그런 일을 해줍니다. 즉 factory를 가져다가 쓰는 부분에서는 new 객체()와
 * 같은 식으로 변수를 선언할 필요가 없습니다. Abstract class나 인터페이스에 대해서 다양한 하위 구현체가 있을 경우에 사용하면
 * 좋습니다. 사용법은 Factory.create(인자는 맘대로) 와 같이 됩니다. 
 * 
 * >> JAVA API에 있는 Factory Method
 * Factory 패턴의 중요한 특징 중 하나는 Factory에서 리턴할 때는 매번 객체를 새로 만들지 않을 수도 있다는 겁니다.
 * Boolean.valueOf(boolean) 을 먼저 살펴 보죠. Boolean a = Boolean.valueOf(true);
 * Boolean b = Boolean.valueOf(true); System.out.println(a==b); 이 코드를 실행시키면 어떤
 * 결과가 나올까요? true 가 나옵니다. 왜냐하면 Boolean.valueOf(true) 는 Boolean.TRUE 라는 상수를
 * 리턴합니다. 즉, 인스턴스를 새로 만드는 것이 아니라 기존에 있는 것을 그냥 리턴합니다. 매번 새로 만들지 않는다는 거죠. 각종
 * Wrapper 클래스에 있는 많은 메메드 들이 이렇게 구현되어 있습니다. Calendar.getInstance() 를 호출하면, 사용자
 * 환경에 맞는 Calendar 객체가 리턴됩니다. 보통은 GregorianCalendar가 리턴된죠. (이 메소드의 이름은 좀 잘못지어진 것
 * 같습니다. 보통 getInstance()는 singleton 패턴에서 쓰이는 이름입니다.)
 * 
 * {@link http://iilii.egloos.com/3791596}
 */
public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1=AnimalFactory.create("소");
		a1.printDescription();
		Animal a2=AnimalFactory.create("고양이");
		a2.printDescription();
		Animal a3=AnimalFactory.create("개");
		a3.printDescription();
	}

}
