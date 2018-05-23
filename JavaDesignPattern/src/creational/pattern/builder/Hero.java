package creational.pattern.builder;

public class Hero {
	private String armSource;
	private String legSource;
	private String name;

	public Hero(String name) {
		super();
		this.name = name;
	}

	public String getArmSource() {
		return armSource;
	}

	public void setArmSource(String armSource) {
		this.armSource = armSource;
	}

	public String getLegSource() {
		return legSource;
	}

	public void setLegSource(String legSource) {
		this.legSource = legSource;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showResult() {
		System.out.println(armSource + "로 만든 팔과 " + legSource + "로 만든 다리를 가진 " + name);
	}
}
