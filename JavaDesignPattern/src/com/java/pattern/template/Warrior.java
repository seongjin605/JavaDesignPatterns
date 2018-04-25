package com.java.pattern.template;

public class Warrior extends Person {
	@Override
	void prepareWeapon() {
		System.out.println("검을 닦습니다.");
	}

	@Override
	void prepareArmor() {
		System.out.println("값옷을 입습니다.");
	}
}
