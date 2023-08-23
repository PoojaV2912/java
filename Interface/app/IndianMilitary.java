package app;

import com.xworkz.Interface.Military;

public class IndianMilitary implements Military {

		@Override
		public void height(int minheight) {
			System.out.println("invoking minheight in IndianMilitary");
			 
		}

		@Override
		public void age(int age) {
			System.out.println("invoking minage in IndianMilitary");

		}
		@Override
		public void weight(int weight) {
			System.out.println("invoking minweight in IndianMilitary");
		}

	
}
