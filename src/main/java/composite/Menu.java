package composite;

import java.util.ArrayList;
import java.util.List;

class Menu extends MenuComponent {

	private List<MenuComponent> components;
	private String name;
	private String description;

	Menu(final String name, final String description) {
		this.components = new ArrayList<>();
		this.name = name;
		this.description = description;
	}

	@Override
	void add(MenuComponent component) {
		this.components.add(component);
	}

	@Override
	void remove(MenuComponent component) {
		this.components.remove(component);
	}

	@Override
	MenuComponent getChild(int i) {
		return this.components.get(i);
	}

	@Override
	String getName() {
		return this.name;
	}

	@Override
	String getDescription() {
		return this.description;
	}

	@Override
	void print() {
		System.out.println(this.getName());
		System.out.println(this.getDescription());
		System.out.println("- - - - - - - - - - - - - - - - - - -");

		this.components.forEach(MenuComponent::print);
	}

}
