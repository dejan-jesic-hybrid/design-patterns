package command;

class GarageDoorOpen implements Command {

	private GarageDoor garageDoor;

	GarageDoorOpen(final GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		this.garageDoor.open();
		logDoor();
	}

	private void logDoor() {
		System.out.println("The door is opened.");
	}

}
