package command.pattern;

class StereoOff implements Command {

	private Stereo stereo;

	StereoOff(final Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		this.stereo.takeOffCD();
		this.stereo.turnOff();
		logStereo();
	}

	private void logStereo() {
		System.out.println("The stereo is not working.");
	}

}
