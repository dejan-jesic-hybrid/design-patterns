package strategy.pattern;

class MallardDuck extends Duck {

	MallardDuck() {
		super.flyBehavior = new FlySlow();
		super.quackBehavior = new QuackLoud();
	}

	@Override
	void display() {
		System.out.println("I'm mallard duck!");
	}

	@Override
	void swim() {
		System.out.println("Mallard duck swimming...");
	}

}
