package Abstract;

	public class AiroPlane extends Airport {

		@Override
		public void restaurants() {
			System.out.println("over riding restaurants  in restaurants ");
			
		}

		@Override
		public void emergenchServices() {
			System.out.println("over riding emergenchServices  in restaurants ");
			
		}

		@Override
		public void security() {
			System.out.println("over riding security  in restaurants ");
			
		}

		@Override
		public boolean baggageHandling() {
			System.out.println("over riding baggageHandling  in restaurants ");
			return false;
		}

		@Override
		public void emergencyDoors() {
			System.out.println("over riding emergencyDoors  in restaurants ");
			
		}
	@Override
	public void control() {
		System.out.println("over riding control  in restaurants ");

	}
	@Override
	public void foodServices() {
		System.out.println("over riding foodServices  in restaurants ");

	}
	@Override
	public void hangars() {
		System.out.println("over riding hangars  in restaurants ");

	}
	}

