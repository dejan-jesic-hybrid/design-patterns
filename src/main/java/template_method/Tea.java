package template_method;

class Tea extends WarmBeverage {

	@Override
	void brew() {
		System.err.println("Steeping the tea.");
	}

	@Override
	void addCondiments() {
		System.err.println("Adding lemon and honey.");
	}

}
