package decorator.anti_pattern;

class Soda extends Beverage {

	private int base = 2;

	Soda() {
		super.description = "Soda is cold!";
		super.sugar = 0;
		super.milk = 0;
		super.soda = 1;
		super.chocolate = 0;
	}

	@Override
	int cost() {
		return super.sugar + super.milk + super.soda + super.chocolate + this.base;
	}

}
