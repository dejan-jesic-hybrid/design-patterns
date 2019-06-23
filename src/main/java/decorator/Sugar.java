package decorator;

class Sugar extends BeverageAddition {

	private Beverage beverage;

	Sugar(final Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	String getDescription() {
		return beverage.getDescription() + " Adding sugar...";
	}

	@Override
	int cost() {
		return 2 + beverage.cost();
	}

}
