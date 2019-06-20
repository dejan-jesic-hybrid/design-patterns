package singleton.pattern;

import java.util.Objects;

final class SingletonThreadSafe {

	private volatile static SingletonThreadSafe instance;

	private SingletonThreadSafe() {

	}

	public static SingletonThreadSafe getInstance() {
		if (Objects.isNull(instance)) {
			synchronized (SingletonThreadSafe.class) {
				if (Objects.isNull(instance)) {
					instance = new SingletonThreadSafe();
				}
			}
		}
		return instance;
	}

	void log() {
		System.out.println("I'm thread safe singleton!");
	}

}
