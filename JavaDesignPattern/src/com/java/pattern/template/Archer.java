package com.java.pattern.template;

public class Archer extends Person {
	@Override
	void prepareWeapon() {
		System.out.println("활을 손질합니다.");
	}

	@Override
	void prepareArmor() {
		System.out.println("가죽을 입습니다.");
	}

	@Override
	boolean isUsingPrepareOther() {
		return true;
	}

	@Override
	void prepareOther() {
		System.out.println("화살을 준비합니다.");
	}
}
