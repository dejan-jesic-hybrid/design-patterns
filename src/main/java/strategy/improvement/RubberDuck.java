package strategy.improvement;

class RubberDuck extends Duck {

	@Override
	void swim() {
		System.out.println("Rubber duck swimming...");
	}

	@Override
	void display() {
		System.out.println("I'm rubber duck!");
	}


}