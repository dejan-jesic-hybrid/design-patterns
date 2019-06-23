package observer;

class WeatherData {

	private double temperature;
	private double humidity;
	private double pressure;

	WeatherData() {

	}

	void setTemperature(final double temperature) {
		this.temperature = temperature;
	}

	void setHumidity(final double humidity) {
		this.humidity = humidity;
	}

	void setPressure(final double pressure) {
		this.pressure = pressure;
	}

	double getTemperature() {
		return temperature;
	}

	double getHumidity() {
		return humidity;
	}

	double getPressure() {
		return pressure;
	}

}
