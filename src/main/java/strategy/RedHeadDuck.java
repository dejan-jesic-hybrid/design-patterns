package strategy;

class RedHeadDuck extends Duck {

	RedHeadDuck() {
		super.fly = new FlyFast();
		super.quack = new QuackSilently();
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
