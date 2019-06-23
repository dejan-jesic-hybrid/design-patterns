package factory;

class AmericanPizzaStore extends PizzaStore {

	@Override
	AmericanPizza createPizza(final String type) {
		switch (type) {
			case "Capricciosa":
				return new AmericanCapricciosa("American " + type.toLowerCase());
			case "Margherita":
				return new AmericanMargherita("American " + type.toLowerCase());
			default:
				throw new IllegalArgumentException();
		}
	}

}
