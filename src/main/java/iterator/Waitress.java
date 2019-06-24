package iterator;

import java.util.Iterator;
import java.util.List;

class Waitress {

	private List<Menu> menus;

	Waitress(final List<Menu> menus) {
		this.menus = menus;
	}

	void printMenus() {
		this.menus.forEach(this::printMenu);
	}

	private void printMenu(final Menu menu) {
		final Iterator<MenuItem> iterator = menu.createIterator();
		while (iterator.hasNext()) {
			final MenuItem item = iterator.next();
			System.out.println("- - - - - - - - - - - - - - - - - - -");
			System.out.println(item.getName());
			System.out.println(item.getDescription());
			System.out.println(item.getPrice());
		}
	}

}
