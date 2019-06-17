package factory.pattern;

class AmericanMargherita extends AmericanPizza {

	AmericanMargherita(final String name) {
		super(name);
	}

	@Override
	void bake() {
		System.out.println("Baking American margherita...");
	}

	@Override
	void box() {
		System.out.println("Boxing American margherita...");
	}

}
