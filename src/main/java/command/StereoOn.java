package command;

class StereoOn implements Command {

	private Stereo stereo;

	StereoOn(final Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		this.stereo.turnOn();
		this.stereo.putInCD();
		this.stereo.setVolume(10);
		logStereo();
	}

	private void logStereo() {
		System.out.println(
			String.format("The stereo is working.\nVolume: %s\nMusic from: %s",
				this.stereo.getVolume(), this.stereo.hasCD() ? "CD" : "radio"
			)
		);
	}

}
