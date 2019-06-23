package command;

class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("I don't know what to do! Please set some function to this button.");
	}

}
