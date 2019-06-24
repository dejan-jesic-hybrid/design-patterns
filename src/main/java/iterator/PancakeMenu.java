package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class PancakeMenu implements Menu {

	private List<MenuItem> menuItems;

	PancakeMenu() {
		this.menuItems = Arrays.asList(
			new MenuItem("Protein pancakes", "Pancakes with scrambled eggs.", false, 2.99),
			new MenuItem("Blueberry pancakes", "Pancakes made with fresh blueberries.", true, 3.49),
			new MenuItem("Waffles", "Sweet waffles with blueberries or strawberries.", true, 3.99)
		);
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return this.menuItems.iterator();
	}

}
