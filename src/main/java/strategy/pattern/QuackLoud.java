package strategy.pattern;

class QuackLoud implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quacking loud 150 dB...");
	}

}
