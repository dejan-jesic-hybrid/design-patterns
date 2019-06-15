package strategy.anti_pattern;

public class WoodenDuck extends Duck {

	@Override
	void swim() {
		System.out.println("Wooden duck swimming...");
	}

	@Override
	void display() {
		System.out.println("I'm wooden duck!");
	}

	@Override
	void quack() {
		// wooden duck can't quack !!!
	}

	@Override
	void fly() {
		// wooden duck can't fly !!!
	}

}
