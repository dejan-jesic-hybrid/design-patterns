package strategy.pattern;

class QuackSilently implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quacking silently 5 dB...");
	}

}
