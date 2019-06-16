package decorator.pattern;

class Chocolate extends BeverageAddition {

	private Beverage beverage;

	Chocolate(final Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	String getDescription() {
		return this.beverage.getDescription() + " Adding chocolate...";
	}

	@Override
	int cost() {
		return 2 + beverage.cost();
	}

}
