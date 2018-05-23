package creational.pattern.builder;

public interface Builder {
	public void makeArm();
	public void makeLeg();
	public Hero getResult();

}
