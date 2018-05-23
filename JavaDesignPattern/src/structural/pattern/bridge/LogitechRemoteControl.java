package structural.pattern.bridge;

public class LogitechRemoteControl extends AbstractRemoteControl{

	public LogitechRemoteControl(ITV tv) {
		// TODO Auto-generated constructor stub
		super(tv);
	}
    public void setChannelKeyboard(int channel) {
        setChannel(channel);
        System.out.println("Logitect use keyword to set channel");
    }
}
