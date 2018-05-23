package structural.pattern.proxy;

public class CommandExecutorProxy implements CommanExecutor {
	private boolean isAdmin;
	private CommanExecutor executor;

	public CommandExecutorProxy(String user, String pwd) {
		if ("psj".equals(user) && "1234".equals(pwd))
			isAdmin = true;
		executor = new CommanExecutorImpl();
	}

	@Override
	public void runCommand(String cmd) throws Exception {
		if (isAdmin) {
			executor.runCommand(cmd);
		} else {
			if (cmd.trim().startsWith("rm")) {
				throw new Exception("rm command is not allowed for non-admin users.");
			} else {
				executor.runCommand(cmd);
			}
		}
	}
}
