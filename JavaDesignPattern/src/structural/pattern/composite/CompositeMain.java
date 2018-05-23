package structural.pattern.composite;

/**
 * 
 * @Composite : 객체들의 관계를 트리 구조로 구성하여 부분 – 전체 계층을 표현하는 패턴으로, 사용자가 단일 객체와 복합 객체 모두
 *            동일하게 다루도록 할 수 있음
 *
 */
public class CompositeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Composite main = new Composite("Main");
		Composite sub1 = new Composite("sub1");
		Composite sub2 = new Composite("sub2");
		Composite sub11 = new Composite("sub11");
		Composite sub12 = new Composite("sub12");
		Composite sub13 = new Composite("sub13");
		Composite sub21 = new Composite("sub21");
		Composite sub22 = new Composite("sub22");
		Leaf leaf14 = new Leaf("leaf14");
		Leaf leaf121 = new Leaf("leaf121");

		main.add(sub1);
		main.add(sub2);
		sub1.add(sub11);
		sub1.add(sub12);
		sub1.add(sub13);
		sub2.add(sub21);
		sub2.add(sub22);
		sub1.add(leaf14);
		sub12.add(leaf121);

		System.out.println(main.getString());
	}
}
