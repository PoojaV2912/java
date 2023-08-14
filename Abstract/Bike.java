package Abstract;

public abstract class Bike {
	public void run() {
		System.out.println("Invoking run method in contract constructor");
	}

	public void mirror() {
		System.out.println("Invoking Mirror method in contract constructor");
	}

	public void seat() {
		System.out.println("Invoking seat  metehod in contract constructor");
	}

	public void shape() {
		System.out.println("Invoking shape method in contract constructor");
	}

	public void cluch() {
		System.out.println("Invoking cluch method in contract constructor");
	}

	public abstract void headLigthts();

	public abstract void gear();

	public abstract void engine();

	public abstract boolean stop();

	public abstract void logo();

}


