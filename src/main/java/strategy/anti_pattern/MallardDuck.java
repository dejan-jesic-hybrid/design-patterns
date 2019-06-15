package strategy.anti_pattern;

public class MallardDuck extends Duck {

	@Override
	void swim() {
		System.out.println("Mallard duck swimming...");
	}

	@Override
	void display() {
		System.out.println("I'm mallard duck!");
	}

	@Override
	void quack() {
		System.out.println("Mallard duck quacking...");
	}

	@Override
	void fly() {
		System.out.println("Mallard duck flying...");
	}

}
