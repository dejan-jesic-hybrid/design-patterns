package composite;

class App {

	public static void main(String[] args) {
		final MenuComponent pancakeMenu = new Menu("PANCAKE MENU", "Pancake breakfast menu.");
		final MenuComponent dinnerMenu = new Menu("DINNER MENU", "Warm dinner menu.");
		final MenuComponent cafeMenu = new Menu("CAFE MENU", "Nice cafe menu.");

		final MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined.");

		allMenus.add(pancakeMenu);
		allMenus.add(dinnerMenu);
		allMenus.add(cafeMenu);

		pancakeMenu.add(new MenuItem("Hotdog", "Hotdog with cheese and onion.", false, 1.99));
		pancakeMenu.add(new MenuItem("Blueberry pancakes", "Pancakes made with fresh blueberries.", true, 3.49));
		dinnerMenu.add(new MenuItem("Hotdog", "Hotdog with cheese and onion.", false, 1.99));
		cafeMenu.add(new MenuItem("Veggie burger", "Veggie burger on a whole wheat bun.", true, 3.99));

		final Waitress waitress = new Waitress(allMenus);
		waitress.printMenus();
	}

}
