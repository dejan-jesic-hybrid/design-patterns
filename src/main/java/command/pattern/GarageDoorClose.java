package command.pattern;

class GarageDoorClose implements Command {

	private GarageDoor garageDoor;

	GarageDoorClose(final GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		this.garageDoor.close();
		logDoor();
	}

	private void logDoor() {
		System.out.println("The door closed.");
	}

}
