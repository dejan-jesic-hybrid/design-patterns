package decorator.pattern;

class Milk extends BeverageAddition {

	private Beverage beverage;

	Milk(final Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	String getDescription() {
		return this.beverage.getDescription() + " Adding milk...";
	}

	@Override
	int cost() {
		return 1 + beverage.cost();
	}

}
