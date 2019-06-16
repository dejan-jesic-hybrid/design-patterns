package decorator.anti_pattern;

class CocaColaZero extends Beverage {

	private int base = 3;

	CocaColaZero() {
		super.description = "Coca cola zero is not tasty!";
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
