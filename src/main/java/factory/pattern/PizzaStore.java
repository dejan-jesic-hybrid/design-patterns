package factory.pattern;

abstract class PizzaStore {

	Pizza orderPizza(String type) {
		final Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	abstract Pizza createPizza(final String type);

}
