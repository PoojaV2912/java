package app;

import com.xworkz.Interface.MetroRule;

public class Metro implements MetroRule {

		@Override
		public void run(String metroName) {
			System.out.println("invoking MetroTrain in run.....");
		}

		@Override
		public boolean stop() {
			System.out.println("invoking MetroTrain in Stop");
			return false;
		}

		@Override
		public int speed(int distance) {
			System.out.println("invoking MetroTrain in speed");
			return 0;
		}

	}

