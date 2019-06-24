package iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class CafeMenu implements Menu {

	private Map<Integer, MenuItem> menuItems;

	CafeMenu() {
		this.menuItems = new HashMap<>();
		this.menuItems.put(1, new MenuItem("Soup", "Chicken soup.", false, 1.99));
		this.menuItems.put(0, new MenuItem("Veggie burger", "Veggie burger on a whole wheat bun.", true, 3.99));

	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator();
	}

}
