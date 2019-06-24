package singleton;

class App {

	public static void main(String[] args) {
		System.out.println("- - - - - - - - - - - - - - - - - - -");
		final SingletonThreadSafe threadSafeSingleton = SingletonThreadSafe.getInstance();
		threadSafeSingleton.log();

		final SingletonEagerInitialization eagerInitializedSingleton = SingletonEagerInitialization.getInstance();
		eagerInitializedSingleton.log();

		final SingletonBillPughPattern billPughPattern = SingletonBillPughPattern.getInstance();
		billPughPattern.log();
		System.out.println("- - - - - - - - - - - - - - - - - - -");
	}

}
