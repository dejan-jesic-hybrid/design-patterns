package strategy.improvement;

interface Flyable {

	default void fly() {
		System.out.println("Default flying...");
	}

}
