package factory.anti_pattern;

class Capricciosa extends Pizza {

	@Override
	void prepare() {
		System.out.println("Preparing capricciosa...");
	}

	@Override
	void bake() {
		System.out.println("Baking capricciosa...");
	}

	@Override
	void cut() {
		System.out.println("Cutting capricciosa...");
	}

	@Override
	void box() {
		System.out.println("Boxing capricciosa...");
	}

}
