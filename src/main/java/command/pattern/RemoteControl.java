package command.pattern;

import java.util.stream.IntStream;

class RemoteControl {

	private Command[] onCommands;
	private Command[] offCommands;

	RemoteControl() {
		this.onCommands = new Command[4];
		this.offCommands = new Command[4];

		final Command noCommand = new NoCommand();
		IntStream.range(0, 4).forEach(slot -> setNoCommand(slot, noCommand));
	}

	void setCommand(final int slot, final Command onCommand, final Command offCommand) {
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}

	void pressOnButton(final int slot) {
		this.onCommands[slot].execute();
	}

	void pressOffButton(final int slot) {
		this.offCommands[slot].execute();
	}

	private void setNoCommand(int slot, Command command) {
		this.onCommands[slot] = command;
		this.offCommands[slot] = command;
	}

}
