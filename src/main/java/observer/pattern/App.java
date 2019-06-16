package observer.pattern;

class App {

	public static void main(String[] args) {
		final Weather weather = new Weather();

		weather.addSubscriber(new Statistics());
		weather.setMeasurements(20d, 50d, 1000d);
		weather.setTemperature(25d);
		weather.setHumidity(55d);
		weather.setPressure(800);

		weather.addSubscriber(new Conditions());

		weather.setTemperature(30d);
		weather.setHumidity(40d);
		weather.setPressure(1100d);
	}

}
