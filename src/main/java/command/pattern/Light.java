package command.pattern;

class Light {

	private boolean lightTurnedOn;
	private String name;

	Light(final String name) {
		this.name = name;
	}

	void on() {
		this.lightTurnedOn = true;
	}

	void off() {
		this.lightTurnedOn = false;
	}

	String getName() {
		return this.name;
	}

}
