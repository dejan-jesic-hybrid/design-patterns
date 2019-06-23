package observer;

import java.util.ArrayList;
import java.util.List;

class Weather implements Publisher {

	private double temperature;
	private double humidity;
	private double pressure;

	private final List<Subscriber> subscribers;

	private boolean shouldNotify;

	Weather() {
		subscribers = new ArrayList<>();
	}

	@Override
	public void addSubscriber(final Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void removeSubscriber(final Subscriber subscriber) {
		if (!subscribers.isEmpty()) {
			subscribers.removeIf(s -> s.equals(subscriber));
		}
	}

	@Override
	public void notifySubscribers() {
		if (shouldNotify) {
			subscribers.forEach(subscriber -> subscriber.update(temperature, humidity, pressure));
		}
		this.shouldNotify = false;
	}

	void setMeasurements(final double temperature, final double humidity, final double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifySubscribers();
	}

	void setTemperature(final double temperature) {
		this.shouldNotify = isBigChange(this.temperature, temperature);
		this.temperature = temperature;
		setMeasurements(temperature, humidity, pressure);
	}

	void setHumidity(final double humidity) {
		this.shouldNotify = isBigChange(this.humidity, humidity);
		this.humidity = humidity;
		setMeasurements(temperature, humidity, pressure);
	}

	void setPressure(final double pressure) {
		this.shouldNotify = isBigChange(this.pressure, pressure);
		this.pressure = pressure;
		setMeasurements(temperature, humidity, pressure);
	}

	private boolean isBigChange(final double oldValue, final double newValue) {
		return Math.abs(oldValue - newValue) / oldValue * 100 >= 25;
	}

}
