package strategy.improvement;

class RedHeadDuck extends Duck implements Quackable, Flyable {

	@Override
	void swim() {
		System.out.println("Read head duck swimming...");
	}

	@Override
	void display() {
		System.out.println("I'm read head duck!");
	}

	@Override
	public void quack() {
		System.out.println("Read head duck quacking...");
	}

	@Override
	public void fly() {
		System.out.println("Read head duck flying...");
	}

}
