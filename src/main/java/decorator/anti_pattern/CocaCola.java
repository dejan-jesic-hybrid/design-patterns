package decorator.anti_pattern;

class CocaCola extends Beverage {

	private int base = 3;

	CocaCola() {
		super.description = "Coca cola is refreshing but has sugar!";
		super.sugar = 1;
		super.milk = 0;
		super.soda = 1;
		super.chocolate = 0;
	}

	@Override
	int cost() {
		return super.sugar + super.milk + super.soda + super.chocolate + this.base;
	}

}
