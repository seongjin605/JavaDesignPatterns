package structural.pattern.proxy;

public class CommanExecutorImpl implements CommanExecutor {

	@Override
	public void runCommand(String cmd) throws Exception {
		Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
	}

}
