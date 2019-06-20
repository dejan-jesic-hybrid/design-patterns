package command.pattern;

class App {

	public static void main(String[] args) {
		final RemoteControl remote = new RemoteControl();
		System.out.println("= = = = = = = = = = =");

		// - - - - - - - - - - - - - - - - - - - - - - - - - - - -

		final Light livingRoomLight = new Light("Living room");
		final Light kitchenLight = new Light("Kitchen");
		final GarageDoor door = new GarageDoor();
		final Stereo stereo = new Stereo();

		// - - - - - - - - - - - - - - - - - - - - - - - - - - - -

		final LightOn livingRoomLightOn = new LightOn(livingRoomLight);
		final LightOn kitchenLightOn = new LightOn(kitchenLight);

		final LightOff livingRoomLightOff = new LightOff(livingRoomLight);
		final LightOff kitchenLightOff = new LightOff(kitchenLight);

		final GarageDoorOpen doorOpen = new GarageDoorOpen(door);
		final GarageDoorClose doorClose = new GarageDoorClose(door);

		final StereoOn stereoOn = new StereoOn(stereo);
		final StereoOff stereoOff = new StereoOff(stereo);

		// - - - - - - - - - - - - - - - - - - - - - - - - - - - -

		remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remote.setCommand(1, kitchenLightOn, kitchenLightOff);
		remote.setCommand(2, doorOpen, doorClose);
		remote.setCommand(3, stereoOn, stereoOff);

		remote.pressOnButton(0);
		remote.pressOnButton(1);
		remote.pressOffButton(1);
		remote.pressOnButton(2);
		remote.pressOffButton(2);
		remote.pressOnButton(3);

		// - - - - - - - - - - - - - - - - - - - - - - - - - - - -

		System.out.println("= = = = = = = = = = =");
	}

}
