package observer.anti_pattern;

import java.util.Random;

class Weather {

	private Condition condition;
	private Statistic statistic;

	Weather(final Condition condition, final Statistic statistic) {
		this.condition = condition;
		this.statistic = statistic;
	}

	void changeMeasurement() {
		final int temperature = new Random().nextInt(5) + 12;
		final int humidity = new Random().nextInt(5) + 12;
		final int pressure = new Random().nextInt(5) + 12;

		condition.update(temperature, humidity, pressure);
		statistic.update(temperature, humidity, pressure);
	}

}
