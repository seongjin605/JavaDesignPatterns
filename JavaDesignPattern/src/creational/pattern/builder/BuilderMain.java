package creational.pattern.builder;

/**
 * @BuilderPattern : Composite 객체의 생성 과정과 표현 방법을 분리하여 동일한 생성 절차에서 서로 다른 표현 결과를
 *                 만들수 있게 하는 패턴. 뭔가가 만들어 지는 과정은 꽤나 복잡할 수가 있습니다. 게다가 그 복잡한 과정이
 *                 순서대로 실행되어야 할 때도 있습니다. 객체의 생성에 있어서 이런 복잡한 과정들을 분리해 내는 것이
 *                 Builder 패턴입니다.
 *
 *
 */
public class BuilderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Builder builder = new BuilderImpl();
		Director director = new Director(builder);
		director.build();
		Hero hero = director.getHero();
		hero.showResult();
	}

}
