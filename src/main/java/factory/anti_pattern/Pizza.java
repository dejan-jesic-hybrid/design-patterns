package factory.anti_pattern;

abstract class Pizza {

	static Pizza orderPizza(final String type) {
		final Pizza pizza;
		switch (type) {
			case "Capricciosa" : pizza = new Capricciosa(); break;
			case "Margherita" : pizza = new Margherita(); break;
			default: throw new IllegalArgumentException();
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	abstract void prepare();

	abstract void bake();

	abstract void cut();

	abstract void box();

}
