package command;

class LightOff implements Command {

	private Light light;

	LightOff(final Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.off();
		logLight();
	}

	private void logLight() {
		System.out.println(this.light.getName() + " light is off.");
	}

}
