package adapter;

class App {

	public static void main(String[] args) {
		System.err.println("- - - - - - - - - - - - - - - ");

		Turkey wildTurkey = new WildTurkey();

		Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

		turkeyAdapter.quack();
		turkeyAdapter.fly();

		System.err.println("- - - - - - - - - - - - - - - ");
	}

}
