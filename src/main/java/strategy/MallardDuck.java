package strategy;

class MallardDuck extends Duck {

	MallardDuck() {
		super.fly = new FlySlow();
		super.quack = new QuackLoud();
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
