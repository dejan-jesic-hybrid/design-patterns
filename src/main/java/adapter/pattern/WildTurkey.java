package adapter.pattern;

class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("Wild turkey gobbling!");
	}

	@Override
	public void fly() {
		System.out.println("Wild turkey flying...");
	}

}
