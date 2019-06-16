package decorator.anti_pattern;

abstract class Beverage {

	int sugar;
	int milk;
	int soda;
	int chocolate;

	String description;

	abstract int cost();

}