package strategy.pattern;

import java.util.List;

class App {

	public static void main(String[] args) {
		List<Duck> ducks = List.of(
			new MallardDuck(),
			new RedHeadDuck(),
			new RubberDuck(),
			new WoodenDuck()
		);

		ducks.forEach(App::goDuckGo);
	}

	private static void goDuckGo(Duck duck) {
		System.out.println("- - - - - - - - - - - - - - - - - - -");
		duck.display();
		duck.swim();
		duck.doQuack();
		duck.doFly();
		System.out.println("- - - - - - - - - - - - - - - - - - -");
	}

}
