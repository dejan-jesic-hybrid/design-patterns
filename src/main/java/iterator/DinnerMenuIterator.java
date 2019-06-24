package iterator;

import java.util.Iterator;
import java.util.Objects;

class DinnerMenuIterator implements Iterator<MenuItem> {

	private MenuItem[] items;
	private int position = 0;

	DinnerMenuIterator(final MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		return !(this.position >= this.items.length || Objects.isNull(this.items[this.position]));
	}

	@Override
	public MenuItem next() {
		final MenuItem item = this.items[this.position];
		this.position++;
		return item;
	}

}
