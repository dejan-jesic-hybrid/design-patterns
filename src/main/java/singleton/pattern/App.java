package singleton.pattern;

class App {

	public static void main(String[] args) {
		System.out.println("= = = = = = = = =");
		final SingletonThreadSafe threadSafe = SingletonThreadSafe.getInstance();
		threadSafe.log();

		final SingletonEagerInitialization eagerInitialization = SingletonEagerInitialization.getInstance();
		eagerInitialization.log();

		final SingletonBillPughPattern billPughPattern = SingletonBillPughPattern.getInstance();
		billPughPattern.log();
		System.out.println("= = = = = = = = =");
	}

}
