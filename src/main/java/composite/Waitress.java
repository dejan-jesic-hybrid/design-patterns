package composite;

class Waitress {

	private MenuComponent allMenus;

	Waitress(final MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	void printMenus() {
		this.allMenus.print();
	}

}
