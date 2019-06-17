package factory.pattern;

abstract class ItalianPizza extends Pizza {

	ItalianPizza(final String name) {
		super(name, "thin dough", "pomodori pelati sauce");
	}

	@Override
	void cut() {
		System.out.println("Cutting into 8 pieces...");
	}

}
