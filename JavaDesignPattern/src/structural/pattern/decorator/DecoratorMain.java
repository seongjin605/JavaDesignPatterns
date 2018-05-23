package structural.pattern.decorator;

/**
 * 
 * @DecoratorPattern : 주어진 상황 및 용도에 따라 어떤 객체에 책임을 덧붙이는 패턴으로, 기능 확장이 필요할 때 서브클래싱
 *                   대신 쓸 수 있는 대안이 될 수 있음.
 *
 */
public class DecoratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Decorator decorator = new Decorator();
		System.out.println(decorator.getMerong());

		Decorator child = new ChildDecorator(decorator);
		System.out.println(child.getMerong());

		Decorator child2 = new ChildDecorator(decorator);
		System.out.println(child2.getMerong());
	}
}