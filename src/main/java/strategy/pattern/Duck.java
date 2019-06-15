package strategy.pattern;

abstract class Duck {

	FlyBehavior flyBehavior;

	QuackBehavior quackBehavior;

	void doFly() {
		flyBehavior.fly();
	}

	void doQuack() {
		quackBehavior.quack();
	}

	abstract void display();

	abstract void swim();

}
