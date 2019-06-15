package strategy.pattern;

class FlyFast implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Flying fast 100 km/h...");
	}

}
