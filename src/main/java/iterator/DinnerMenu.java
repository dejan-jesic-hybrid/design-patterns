package iterator;

class DinnerMenu implements Menu {

	private MenuItem[] menuItems;

	DinnerMenu() {
		this.menuItems = new MenuItem[3];
		this.menuItems[1] = new MenuItem("Hotdog", "Hotdog with cheese and onion.", false, 1.99);
		this.menuItems[0] = new MenuItem("Bacon", "Bacon with lettuce and garlic.", false, 2.49);
		this.menuItems[2] = new MenuItem("Pizza", "Pizza capricciosa.", false, 3.99);
	}

	@Override
	public DinnerMenuIterator createIterator() {
		return new DinnerMenuIterator(menuItems);
	}

}
