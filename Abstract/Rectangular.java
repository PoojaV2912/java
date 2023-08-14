package Abstract;

	public class Rectangular extends Shape {

		@Override
		public void square() {
			System.out.println("over riding square  in Rectangular");

		}

		@Override
		public void ThreeDShape() {
			System.out.println("overriding ThreeDShape  in Rectangular");

		}

		@Override
		public void pentagon() {
			System.out.println("overriding pentagon   in Rectangular");

		}

		@Override
		public boolean properties() {
			System.out.println("overriding proerties  in Rectangular");
			return false;
		}

		@Override
		public void twoDShape() {
			System.out.println("overriding twoDShape  in Rectangular");

		}

	}

