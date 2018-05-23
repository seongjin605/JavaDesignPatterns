package creational.pattern.abstractfactory;

/**
 * 
 * @AbstractFactoryPattern : 구체적인 클래스를 지정하지 않고 관련성을 갖는 객체들의 집합을 생성하거나 서로 독립적인
 *                         객체들의 집합을 생성할 수 있는 인터페이스를 제공하는 패턴.
 *
 */
public class AbstractFactoryMain {

	public static void main(String[] args) {

		RobotFactory rf = new SuperRobotFactory();
		Robot r = rf.createRobot("super");
		Robot r2 = rf.createRobot("power");

		System.out.println(r.getName());
		System.out.println(r2.getName());

		RobotFactory mrf = new ModifiedSuperRobotFactory();
		Robot r3 = mrf.createRobot("com.java.creational.pattern.factory.SuperRobot");
		Robot r4 = mrf.createRobot("com.java.creational.pattern.factory.PowerRobot");

		System.out.println(r3.getName());
		System.out.println(r4.getName());
	}
}