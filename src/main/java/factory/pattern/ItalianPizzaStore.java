package factory.pattern;

class ItalianPizzaStore extends PizzaStore {

	@Override
	ItalianPizza createPizza(final String type) {
		switch (type) {
			case "Capricciosa":
				return new ItalianCapricciosa("Italian " + type.toLowerCase());
			case "Margherita":
				return new ItalianMargherita("Italian " + type.toLowerCase());
			default:
				throw new IllegalArgumentException();
		}
	}

}
