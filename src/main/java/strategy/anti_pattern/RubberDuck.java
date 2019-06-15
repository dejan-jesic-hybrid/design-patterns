package strategy.anti_pattern;

public class RubberDuck extends Duck {

	@Override
	void swim() {
		System.out.println("Rubber duck swimming...");
	}

	@Override
	void display() {
		System.out.println("I'm rubber duck!");
	}

	@Override
	void quack() {
		// rubber duck can't quack !!!
	}

	@Override
	void fly() {
		// rubber duck can't fly !!!
	}

}