package factory.pattern;

class App {

	public static void main(String[] args) {
		System.out.println("= = = = = = = = = = = = = = = =");

		final PizzaStore italianStore = new ItalianPizzaStore();
		final Pizza italianCapricciosa = italianStore.orderPizza("Capricciosa");
		System.out.println("- - - - - - - - - - - - - - - ");
		final Pizza italianMargherita = italianStore.orderPizza("Margherita");

		System.out.println("= = = = = = = = = = = = = = = =");

		final PizzaStore americanStore = new AmericanPizzaStore();
		final Pizza americanCapricciosa = americanStore.orderPizza("Capricciosa");
		System.out.println("- - - - - - - - - - - - - - - ");
		final Pizza americanMargherita = americanStore.orderPizza("Margherita");

		System.out.println("= = = = = = = = = = = = = = = =");
	}

}
