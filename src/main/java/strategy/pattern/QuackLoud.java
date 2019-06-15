package strategy.pattern;

class QuackLoud implements Quack {

	@Override
	public void quack() {
		System.out.println("Quacking loud 150 dB...");
	}

}
