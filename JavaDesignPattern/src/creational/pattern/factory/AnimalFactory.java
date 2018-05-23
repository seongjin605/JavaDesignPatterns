package creational.pattern.factory;

public class AnimalFactory {
	public static Animal create(String animalName) {
		if (animalName == null) {
			throw new IllegalArgumentException();
		}
		if (animalName.equals("소")) {
			return new CowImpl();
		} else if (animalName.equals("고양이")) {
			return new CatImpl();
		} else if (animalName.equals("개")) {
			return new DogImpl();
		} else {
			return null;
		}
	}
}
