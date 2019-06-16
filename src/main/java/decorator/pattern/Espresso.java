package decorator.pattern;

class Espresso extends Beverage {

	Espresso() {
		super.setDescription("Espresso makes you feel full of energy!");
	}

	@Override
	int cost() {
		return 2;
	}

}
