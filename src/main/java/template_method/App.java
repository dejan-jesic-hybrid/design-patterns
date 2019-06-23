package template_method;

class App {

	public static void main(String[] args) {
		System.err.println("= = = = = = = = = = = = ");

		final WarmBeverage tea = new Tea();
		tea.prepareRecipe();

		System.err.println("= = = = = = = = = = = = ");

		final WarmBeverage coffee = new Coffee();
		coffee.prepareRecipe();

		System.err.println("= = = = = = = = = = = = ");
	}

}
