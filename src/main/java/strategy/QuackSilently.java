package strategy;

class QuackSilently implements Quack {

	@Override
	public void quack() {
		System.out.println("Quacking silently 5 dB...");
	}

}
