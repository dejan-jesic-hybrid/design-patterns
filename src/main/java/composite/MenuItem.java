package composite;

class MenuItem extends MenuComponent {

	private String name;
	private String description;
	private boolean isVegetarian;
	private double price;

	MenuItem(final String name, final String description, final boolean isVegetarian, final double price) {
		this.name = name;
		this.description = description;
		this.isVegetarian = isVegetarian;
		this.price = price;
	}

	@Override
	String getName() {
		return this.name;
	}

	@Override
	String getDescription() {
		return this.description;
	}

	@Override
	boolean isVegetarian() {
		return this.isVegetarian;
	}

	@Override
	double getPrice() {
		return this.price;
	}

	@Override
	void print() {
		System.out.println(this.getName());
		System.out.println(this.getDescription());
		if (this.isVegetarian) {
			System.out.println("This meal is vegetarian.");
		}
		System.out.println(this.getPrice());
		System.out.println("- - - - - - - - - - - - - - - - - - -");
	}

}
