package observer.anti_pattern;

class Statistic {

	private int temperature;
	private int humidity;
	private int pressure;

	void update(int temperature, int humidity, int pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}

}
