package factory;

class ItalianMargherita extends ItalianPizza {

	ItalianMargherita(final String name) {
		super(name);
	}

	@Override
	void bake() {
		System.out.println("Baking Italian margherita...");
	}

	@Override
	void box() {
		System.out.println("Boxing Italian margherita...");
	}

}
