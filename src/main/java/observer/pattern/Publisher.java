package observer.pattern;

interface Publisher {

	void addSubscriber(Subscriber subscriber);

	void removeSubscriber(Subscriber subscriber);

	void notifySubscribers();

}
