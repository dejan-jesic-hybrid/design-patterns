package iterator;

import java.util.Arrays;

class App {

	public static void main(String[] args) {
		final PancakeMenu pancakeMenu = new PancakeMenu();
		final DinnerMenu dinnerMenu = new DinnerMenu();
		final CafeMenu cafeMenu = new CafeMenu();

		final Waitress waitress = new Waitress(Arrays.asList(pancakeMenu, dinnerMenu, cafeMenu));
		waitress.printMenus();
	}

}
