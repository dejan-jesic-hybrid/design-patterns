package decorator;

abstract class Beverage {

	private String description;

	abstract int cost();

	String getDescription() {
		return description;
	}

	void setDescription(final String description) {
		this.description = description;
	}

}
