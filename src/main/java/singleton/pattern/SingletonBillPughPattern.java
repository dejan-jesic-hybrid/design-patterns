package singleton.pattern;

final class SingletonBillPughPattern {

	private SingletonBillPughPattern() {

	}

	private static class SingletonHelper {
		private static final SingletonBillPughPattern INSTANCE = new SingletonBillPughPattern();
	}

	public static SingletonBillPughPattern getInstance(){
		return SingletonHelper.INSTANCE;
	}

	void log() {
		System.out.println("I'm Bill Pugh singleton!");
	}

}
