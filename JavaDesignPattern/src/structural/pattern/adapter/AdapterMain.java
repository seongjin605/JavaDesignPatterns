package structural.pattern.adapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * 
 * @AdapterPattern : 클래스의 인터페이스를 사용자가 기대하는 다른 인터페이스로 변환하는 패턴으로, 호환성이 없는 인터페이스
 *                 때문에 함께 동작할 수 없는 클래스들이 함께 작동하도록 해 줌.
 *
 */
public class AdapterMain {
	public static void goodMethod(Enumeration<String> enu) {
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		Enumeration<String> ite = new IteratorToEnumeration(list.iterator());

		AdapterMain.goodMethod(ite);
	}

}
