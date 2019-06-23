package command;

class LightOn implements Command {

	private Light light;

	LightOn(final Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.on();
		logLight();
	}

	private void logLight() {
		System.out.println(this.light.getName() + " light is on.");
	}

}
