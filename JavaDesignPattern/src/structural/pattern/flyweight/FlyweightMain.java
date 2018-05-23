package structural.pattern.flyweight;

import structural.pattern.flyweight.PersonFactory.Person;

/**
 * 
 * @FlyWeightPattern : 크기가 작은 객체가 여러개 있을 때, 공유를 통해 이들을 효율적으로 지원하는 패턴. Flyweight
 *                   는 동일한 것을 공유해서 객체 생성을 줄여 가볍게 만드는 것입니다. 클래스 별로 factory를 씁니다.
 *                   그리고 그 factory에서는 자신이 찍어내는 객체들을 관리합니다. 이미 가지고 있는 객체에 대한 요청이
 *                   들어왔을 때는 관리하고 있던 객체를 던져주고, 가지고 있지 않은 것을 요청하면 새로 객체를 만들어 관리
 *                   리스트에 추가시키고 던져줍니다.
 *                   
 *                   {@link http://iilii.egloos.com/4066794}
 *
 */
public class FlyweightMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = PersonFactory.getPerson("홍길동");
		Person p2 = PersonFactory.getPerson("김말자");
		Person p3 = PersonFactory.getPerson("홍길동");

		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
	}

}
