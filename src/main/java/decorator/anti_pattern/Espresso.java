package decorator.anti_pattern;

class Espresso extends Beverage {

	private int base = 2;

	Espresso() {
		super.description = "Espresso makes you feel full of energy!";
		super.sugar = 0;
		super.milk = 0;
		super.soda = 0;
		super.chocolate = 0;
	}

	@Override
	int cost() {
		return super.sugar + super.milk + super.soda + super.chocolate + this.base;
	}

}
