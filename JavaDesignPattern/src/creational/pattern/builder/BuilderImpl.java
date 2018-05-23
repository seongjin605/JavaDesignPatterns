package creational.pattern.builder;

public class BuilderImpl implements Builder {

	private Hero batman;
	
	BuilderImpl(){
		batman=new Hero("배트맨");
	}
	@Override
	public void makeArm() {
		// TODO Auto-generated method stub
		batman.setArmSource("setArm");
	}

	@Override
	public void makeLeg() {
		// TODO Auto-generated method stub
		batman.setLegSource("setLeg");
	}

	@Override
	public Hero getResult() {
		// TODO Auto-generated method stub
		return batman;
	}

}
