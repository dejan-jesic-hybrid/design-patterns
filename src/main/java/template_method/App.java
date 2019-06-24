package template_method;

class App {

	public static void main(String[] args) {
		System.out.println("- - - - - - - - - - - - - - - - - - -");

		final WarmBeverage tea = new Tea();
		tea.prepareRecipe();

		System.out.println("- - - - - - - - - - - - - - - - - - -");

		final WarmBeverage coffee = new Coffee();
		coffee.prepareRecipe();

		System.out.println("- - - - - - - - - - - - - - - - - - -");
	}

}
