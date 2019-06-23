package adapter.pattern;

import java.util.stream.IntStream;

class TurkeyAdapter implements Duck {

	private Turkey turkey;

	TurkeyAdapter(final Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		this.turkey.gobble();
	}

	@Override
	public void fly() {
		IntStream.range(0, 10).forEach(i -> this.turkey.fly());
	}

}
