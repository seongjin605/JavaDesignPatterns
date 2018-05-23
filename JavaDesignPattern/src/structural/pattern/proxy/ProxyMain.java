package structural.pattern.proxy;

public class ProxyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommanExecutor executor = new CommandExecutorProxy("psj", "1234");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand("rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message:: " + e.getMessage());
		}
	}
}
