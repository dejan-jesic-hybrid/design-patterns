package adapter;

class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Mallard duck quacking!");
	}

	@Override
	public void fly() {
		System.out.println("Mallard duck flying...");
	}

}
