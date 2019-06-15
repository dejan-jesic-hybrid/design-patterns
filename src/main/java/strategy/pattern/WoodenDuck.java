package strategy.pattern;

class WoodenDuck extends Duck {

	WoodenDuck() {
		super.fly = new NoFly();
		super.quack = new QuackMute();
	}

	@Override
	void display() {
		System.out.println("I'm wooden duck!");
	}

	@Override
	void swim() {
		// can't swim
	}

}
