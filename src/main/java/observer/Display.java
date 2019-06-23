package observer;

interface Display {

	default String generateCommonMessage() {
		return "%s\n" +
			"- - -\n" +
			"Temperature: %s ºC\n" +
			"Humidity: %s %%\n" +
			"Pressure: %s mb";
	}

	void displayState();

}
