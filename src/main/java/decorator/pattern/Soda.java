package decorator.pattern;

class Soda extends Beverage {

	Soda() {
		super.setDescription("Soda is cold!");
	}

	@Override
	int cost() {
		return 2;
	}

}
