package factory.pattern;

class AmericanCapricciosa extends AmericanPizza {

	AmericanCapricciosa(final String name) {
		super(name);
	}

	@Override
	void bake() {
		System.out.println("Baking American capricciosa...");
	}

	@Override
	void box() {
		System.out.println("Boxing American capricciosa...");
	}

}
