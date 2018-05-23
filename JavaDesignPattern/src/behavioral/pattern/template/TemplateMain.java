package behavioral.pattern.template;

/**
 * @TemplateMethodPattern : 객체의 연산에는 알고리즘의 뼈대만을 정의하고 각 단계에서 수행할 구체적 처리는 서브클래스
 *                        쪽으로 미루는 패턴. 알고리즘의 구조 자체는 그대로 놔둔 채 알고리즘 각 단계의 처리를
 *                        서브클래스에서 재정의할 수 있게 함.
 *                        
 *                        ->Template Method 사용시 고려사항
 *                        Template Method는 위험성을 어느 정도 내포하고 있습니다. 바로 전체적인 프로세스가
 *                        바뀌는 것입니다. 상위 클래스에서 변동이 일어날 경우 하위 클래스가 안전하리라는 보장은 할 수
 *                        없습니다. 상위 클래스에 abstract method가 하나만 추가되어도 모든 하위 클래스는
 *                        변경이 불가피합니다. 나중에 발생하는 작은 변경이 큰 재난을 일으킬 수 있습니다. 이것은 상속이
 *                        가지는 위험성입니다. 그래서 Template Method 패턴을 사용할 때는 상위클래스에 대한
 *                        심사숙고가 반드시 필요합니다. 일반적으로는 전체적인 프로세스를 담당하는 로직을 final 메소드로
 *                        정의하기도 하지만, 프로세스 자체의 변경을 고려해 상속의 여지를 남겨두기 위해 final 메소드로
 *                        정의하지 않기도 합니다. 또 한가지는 하위 클래스의 메소드들은 외부에서 직접 호출되지 않고 상위
 *                        클래스의 Template Method에서 호출됩니다. 그래서 주로 protected 로
 *                        선언됩니다. 그런 이유로 외부의 호출과 구체적인 구현체의 메소드가 실행되기까지의 과정을 쉽게
 *                        파악하기가 어렵습니다. 문제가 생겼을 때 추적이 어려울 수도 있다는 것이죠.
 * 
 *                       ->JAVA API에 있는 Template Method
 * 
 *                        아마 JDK안에 가장 많이 들어 있는 패턴 중 하나가 Template Method일 겁니다.
 *                        Servlet 을 개발할 때, HttpServlet을 상속 받아 doGet() 과 doPost()
 *                        를 구현합니다. HttpServlet의 service() 에서 하위구현체의 doGet()이나
 *                        doPost() 등으로 분기를 시킵니다.(그 외에도 do머시기하는 메소드가 있지만 생략합니다.)
 *                        Template Method의 전형적인 사용법 중 하나입니다. 분기를 담당하는 부분은 상위클래스에
 *                        구체적으로 구현하고, 분기된 이후의 행동은 하위구현체에 떠 넘기는 방법이죠.
 * 
 *                        HashSet이라는 Set의 구현체를 아시죠? 얘는 Set이니까 중복 데이터를 요소로 가지지
 *                        않습니다. 그럼 '같다 다르다'의 기준은 뭘까요? 내용이 같으면 될까요? 아니면, 실제 레퍼런스가
 *                        같아야 할까요? 이름에 나와 있듯 hash 값이 일단 같아야 합니다. hash값은 Object의
 *                        hashCode() 메소드를 이용하여 체크합니다. 그리고 나서 또 Object의 equals()
 *                        메소드를 호출합니다. 그래서 Set에 넣을 요소에 대해서는 hashCode() 메소드와
 *                        equals() 메소드가 잘 구현되어있어야 합니다. 그렇지 않으면, 중복된 데이터가 삽입될 수
 *                        있습니다. HashSet의 경우는 위에서 설명한 Template Method와는 좀 다릅니다.
 *                        상위클래스와 하위클래스의 상관관계 같은 게 없죠. 다만 나도 모르는 사이에 내가 구현한 메소드가
 *                        호출될 수 있기 때문에 Template Method가 될 수 있습니다.(HashSet의
 *                        add(SomeClass) 메소드는 SomeClass의 hashCode()와 equals()를
 *                        호출합니다. ) 정확히 말하면 Set.add(SomeClass) 메소드는
 *                        Set.contains(SomeClass) 메소드를 호출하고 그 안에서 다시
 *                        SomeClass.hashCode()와 SomeClass.equals(SomeClass) 를
 *                        호출합니다. ( 중간에 좀 더 복잡한 과정이 있지만, 설명할 필요는 없으므로 생략합니다. )
 *                        여기서 UI관련 각종 EventListener들도 그런 맥락에서 Template Method라고
 *                        볼 수 있습니다. event 발생에서 리스너까지의 과정을 알 필요가 없습니다. 대략 어떤 이벤트를
 *                        발생시키면, 어떤 이벤트 리스너한테 전달된다 정도만 알면 되죠. 이벤트 핸들링에는 그 외에도
 *                        여러가지 패턴들이 적용되어 있습니다.
 *                        
 *                        {@link http://iilii.egloos.com/3806897}
 * 
 */
public class TemplateMain {

	public static void main(String[] args) {

		// 전사는 전투 준비를 위해서
		// 체력을 단련하고, 검을 닦고, 갑옷을 입습니다.
		Warrior warrior = new Warrior();
		warrior.readyToBattle();
		System.out.println("-----------------");

		// 궁사는 전투 준비를 위해서
		// 체력을 단련하고, 활을 손질하고, 화살을 준비합니다.
		Archer archer = new Archer();
		archer.readyToBattle();
		System.out.println("-----------------");

		// 마법사는 전투 준비를 위해서
		// 체력을 단련하고, 지팡이를 준비하고, 로브를 입습니다.
		Wizard wizard = new Wizard();
		wizard.readyToBattle();
	}

}
