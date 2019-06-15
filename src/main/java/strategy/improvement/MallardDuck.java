package strategy.improvement;

class MallardDuck extends Duck implements Quackable, Flyable {

	@Override
	void swim() {
		System.out.println("Mallard duck swimming...");
	}

	@Override
	void display() {
		System.out.println("I'm mallard duck!");
	}

	@Override
	public void quack() {
		System.out.println("Mallard duck quacking...");
	}

}
