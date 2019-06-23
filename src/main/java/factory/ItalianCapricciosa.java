package factory;

class ItalianCapricciosa extends ItalianPizza {

	ItalianCapricciosa(final String name) {
		super(name);
	}

	@Override
	void bake() {
		System.out.println("Baking Italian capricciosa...");
	}

	@Override
	void box() {
		System.out.println("Boxing Italian capricciosa...");
	}

}
