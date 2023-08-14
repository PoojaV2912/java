package Abstract;

public abstract class Movie {
	public void hero() {
		System.out.println("Invoking travel method in contract constructor");
	}
	public void heroine() {
		System.out.println("Invoking running method in contract constructor");
	}
	public void comdeien() {
		System.out.println("Invoking walking  metehod in contract constructor");
	}

	public void director() {
		System.out.println("Invoking distance method in contract constructor");
	}
	public void producer() {
		System.out.println("Invoking type method in contract constructor");
	}

	public abstract  void trailer();
	public abstract  void nameboard();
	public abstract void productionHouse();
	public abstract void theme();
	public abstract void inspiration();

}



