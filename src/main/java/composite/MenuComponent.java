package composite;

abstract class MenuComponent {

	void add(MenuComponent component) {
		throw new UnsupportedOperationException();
	}

	void remove(MenuComponent component) {
		throw new UnsupportedOperationException();
	}

	MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	String getName() {
		throw new UnsupportedOperationException();
	}

	String getDescription() {
		throw new UnsupportedOperationException();
	}

	double getPrice() {
		throw new UnsupportedOperationException();
	}

	boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}

	void print() {
		throw new UnsupportedOperationException();
	}

}
