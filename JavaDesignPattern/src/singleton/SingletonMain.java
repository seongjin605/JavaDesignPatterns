package singleton;

public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton s = Singleton.INSTANCE;
		Singleton s1=Singleton.INSTANCE;
		
		System.out.println("s == s1 ? " +(s==s1));
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());

	}

}
