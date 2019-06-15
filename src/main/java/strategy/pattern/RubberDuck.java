package strategy.pattern;

class RubberDuck extends Duck {

	RubberDuck() {
		super.flyBehavior = new NoFly();
		super.quackBehavior = new QuackSilently();
	}

	@Override
	void display() {
		System.out.println("I'm rubber duck!");
	}

	@Override
	void swim() {
		System.out.println("Rubber duck swimming...");
	}

}
