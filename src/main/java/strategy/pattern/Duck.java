package strategy.pattern;

abstract class Duck {

	Fly fly;

	Quack quack;

	void doFly() {
		fly.fly();
	}

	void doQuack() {
		quack.quack();
	}

	abstract void display();

	abstract void swim();

}
