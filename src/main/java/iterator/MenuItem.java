package iterator;

class MenuItem {

	private String name;
	private String description;
	private boolean isVegan;
	private double price;

	MenuItem(final String name, final String description, final boolean isVegan, final double price) {
		this.name = name;
		this.description = description;
		this.isVegan = isVegan;
		this.price = price;
	}

	String getName() {
		return this.name;
	}

	String getDescription() {
		return this.description;
	}

	boolean isVegan() {
		return this.isVegan;
	}

	double getPrice() {
		return this.price;
	}

}
