package factory.pattern;

abstract class Pizza {

	private String name;
	private String dough;
	private String sauce;

	Pizza(final String name, final String dough, final String sauce) {
		this.name = name;
		this.dough = dough;
		this.sauce = sauce;
	}

	void prepare() {
		System.out.println("Preparing " + name + "...");
		System.out.println("Tossing " + dough + "...");
		System.out.println("Adding " + sauce + "...");
	}

	abstract void bake();

	abstract void cut();

	abstract void box();

}
