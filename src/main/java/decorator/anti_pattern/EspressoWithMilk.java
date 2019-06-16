package decorator.anti_pattern;

class EspressoWithMilk extends Beverage {

	private int base = 2;

	EspressoWithMilk() {
		super.description = "Espresso with milk I like to drink!";
		super.sugar = 0;
		super.milk = 1;
		super.soda = 0;
		super.chocolate = 0;
	}

	@Override
	int cost() {
		return super.sugar + super.milk + super.soda + super.chocolate + this.base;
	}

}
