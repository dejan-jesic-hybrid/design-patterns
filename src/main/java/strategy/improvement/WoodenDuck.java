package strategy.improvement;

class WoodenDuck extends Duck {

	@Override
	void swim() {
		// wooden duck can't swim !!!
	}

	@Override
	void display() {
		System.out.println("I'm wooden duck!");
	}

}
