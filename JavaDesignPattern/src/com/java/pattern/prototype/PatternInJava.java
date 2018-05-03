package com.java.pattern.prototype;

public class PatternInJava {

	public static void main(String[] args) throws CloneNotSupportedException {

		String ssn = "7411218";
		String name = "test";
		int age = 27;
		
		Person person = new Person(ssn, name, age);
		
		//Person 클래스 person 인스턴스 복제
		Person person2= (Person) person.myClone();

		boolean flag = person.equals(person2);

		System.out.println("Person == Person2 ? " + flag);
		System.out.println("person="+person.myClone()); 
		System.out.println("person2="+person2.myClone());
		System.out.println("=====================================");
		
		System.out.println("person의 정보 : " + "\n"+ person.getSsn() + "\n"+ person.getName()+ 
				"\n"+person.getAge());
		System.out.println("=====================================");
		System.out.println("person2의 정보 : " + "\n"+ person2.getSsn() + "\n"+ person2.getName()+ 
				"\n"+person2.getAge());

	}

}
