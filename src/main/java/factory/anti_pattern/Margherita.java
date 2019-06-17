package factory.anti_pattern;

class Margherita extends Pizza {

	@Override
	void prepare() {
		System.out.println("Preparing margherita...");
	}

	@Override
	void bake() {
		System.out.println("Baking margherita...");
	}

	@Override
	void cut() {
		System.out.println("Cutting margherita...");
	}

	@Override
	void box() {
		System.out.println("Boxing margherita...");
	}

}
