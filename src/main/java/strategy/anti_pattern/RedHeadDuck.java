package strategy.anti_pattern;

public class RedHeadDuck extends Duck {

	@Override
	void swim() {
		System.out.println("Read head duck swimming...");
	}

	@Override
	void display() {
		System.out.println("I'm read head duck!");
	}

	@Override
	void quack() {
		System.out.println("Read head duck quacking...");
	}

	@Override
	void fly() {
		System.out.println("Read head duck flying...");
	}

}
