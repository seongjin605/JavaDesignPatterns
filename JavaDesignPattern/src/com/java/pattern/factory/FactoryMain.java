package com.java.pattern.factory;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RobotFactory rf=new SuperRobotFactory();
		Robot r=rf.createRobot("super");
		Robot r2=rf.createRobot("power");
		
		System.out.println(r.getName());
		System.out.println(r2.getName());
		
		RobotFactory mrf=new ModifiedSuperRobotFactory();
		Robot r3=mrf.createRobot("com.java.pattern.factory.SuperRobot");
		Robot r4=mrf.createRobot("com.java.pattern.factory.PowerRobot");
		
		System.out.println(r3.getName());
		System.out.println(r4.getName());
	}

}
