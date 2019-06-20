package singleton.pattern;

final class SingletonEagerInitialization {

	private static SingletonEagerInitialization instance = new SingletonEagerInitialization();

	private SingletonEagerInitialization() {

	}

	public static SingletonEagerInitialization getInstance() {
		return instance;
	}

	void log() {
		System.out.println("I'm eager initialized singleton!");
	}

}
