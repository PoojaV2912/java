package Abstract;

	public class Honda extends Bike {
		@Override
		public void run() {
			System.out.println("over riding run in Honda");
		}

		@Override
		public void engine() {
			System.out.println("over riding engin in Honda");
		}

		@Override
		public void gear() {
			System.out.println("over riding gear in Honda");
		}

		@Override
		public void headLigthts() {
			System.out.println("over riding head lights in Honda");
		}

		@Override
		public void logo() {
			System.out.println("over riding logo in Honda");
		}

		@Override
		public boolean stop() {
			System.out.println("over riding stop in Honda");
			return false;
		}

		@Override
		public void mirror() {
			System.out.println("over riding mirror in Honda");
		}

		@Override
		public void seat() {
			System.out.println("over riding seat in Honda");
		}

		@Override
		public void shape() {
			System.out.println("over riding shape in Honda");
		}

		@Override
		public void cluch() {
			System.out.println("over riding  cluch in Honda");
		}

	}


