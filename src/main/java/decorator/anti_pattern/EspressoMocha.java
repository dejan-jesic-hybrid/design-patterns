package decorator.anti_pattern;

class EspressoMocha extends Beverage {

	private int base = 2;

	EspressoMocha() {
		super.description = "Espresso mocha is for girls!";
		super.sugar = 1;
		super.milk = 1;
		super.soda = 0;
		super.chocolate = 2;
	}

	@Override
	int cost() {
		return super.sugar + super.milk + super.soda + super.chocolate + this.base;
	}

}
