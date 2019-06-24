package decorator;

public class App {

	public static void main(String[] args) {
		System.out.println("- - - - - - - - - - - - - - - - - - -");

		final Beverage espresso = new Espresso();
		final Beverage soda = new Soda();

		System.out.println(espresso.getDescription() + "\nPrice: $" + espresso.cost());
		System.out.println(soda.getDescription() + "\nPrice: $" + soda.cost());

		final Beverage cappuccino = new Milk(new Espresso());
		System.out.println(cappuccino.getDescription() + "\nPrice: $" + cappuccino.cost());

		final Beverage mocha = new Chocolate(new Milk(new Espresso()));
		System.out.println(mocha.getDescription() + "\nPrice: $" + mocha.cost());

		System.out.println("- - - - - - - - - - - - - - - - - - -");
	}

}
