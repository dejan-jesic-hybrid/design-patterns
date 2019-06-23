package template_method;

class Coffee extends WarmBeverage {

	@Override
	void brew() {
		System.err.println("Dripping coffee through filter.");
	}

	@Override
	void addCondiments() {
		System.err.println("Adding sugar.");
	}

	@Override
	void hook() {
		System.err.println("Adding milk.");
	}

}
