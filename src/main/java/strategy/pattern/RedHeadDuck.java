package strategy.pattern;

class RedHeadDuck extends Duck {

	RedHeadDuck() {
		super.flyBehavior = new FlyFast();
		super.quackBehavior = new QuackSilently();
	}

	@Override
	void display() {
		System.out.println("I'm read head duck!");
	}

	@Override
	void swim() {
		System.out.println("Read head duck swimming...");
	}

}
