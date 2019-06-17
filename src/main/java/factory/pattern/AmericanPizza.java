package factory.pattern;

abstract class AmericanPizza extends Pizza {

	AmericanPizza(final String name) {
		super(name, "thick dough", "ketchup sauce");
	}

	@Override
	void cut() {
		System.out.println("Cutting into 4 pieces...");
	}

}
