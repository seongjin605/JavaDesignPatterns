package structural.pattern.bridge;

public class SamsungTV implements ITV {

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Samsung TV is turned on");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Samsung TV is turned off");

	}

	@Override
	public void switchChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("Samsung: channel - " + channel);

	}

}
