package Abstract;

	public abstract class Shape {
		public void names() {
			System.out.println("Invoking Names method in contract constructor");
		}

		public void definitions() {
			System.out.println("Invoking definitions method in contract constructor");
		}

		public void circle() {
			System.out.println("Invoking circle  metehod in contract constructor");
		}

		public void size() {
			System.out.println("Invoking size method in contract constructor");
		}

		public void triangle() {
			System.out.println("Invoking triangle method in contract constructor");
		}

		public abstract void square();

		public abstract void ThreeDShape();

		public abstract void pentagon();

		public abstract boolean properties();

		public abstract void twoDShape();

	}


