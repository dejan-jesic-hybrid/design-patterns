package command;

class Stereo {

	private boolean hasCD;

	private int volume;

	private boolean isWorking;

	void putInCD() {
		this.hasCD = true;
	}

	void takeOffCD() {
		this.hasCD = false;
	}

	void setVolume(final int volume) {
		this.volume = volume;
	}

	void turnOn() {
		this.isWorking = true;
	}

	void turnOff() {
		this.isWorking = false;
	}

	boolean hasCD() {
		return this.hasCD;
	}

	int getVolume() {
		return this.volume;
	}

}
