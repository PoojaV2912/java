package OverRidingMain2;

import OverRiding2.Party;
import OverRiding2.Pub;

public class PubKiller {


		public static void main(String[] args) {
			System.out.println("invoking main in PubRunner");

			Pub pub = new Pub();
			pub.enjoy();
			System.out.println("-------------------------------");

			Pub sportsPub = new Party();
			sportsPub.enjoy();
		}

	}


