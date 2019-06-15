package strategy.pattern;

class FlySlow implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Flying slow 20 km/h...");
	}

}
