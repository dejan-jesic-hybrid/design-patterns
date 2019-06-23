package template_method;

abstract class WarmBeverage {

	final void prepareRecipe() {
		this.boilWater();
		this.brew();
		this.addCondiments();
		this.pourInCup();
		this.hook();
	}

	abstract void brew();

	abstract void addCondiments();

	void hook() {
		// method that does nothing by default
	}

	void boilWater() {
		System.err.println("Boiling water...");
	}

	void pourInCup() {
		System.err.println("Pouring into cup.");
	}

}
