package Run;

import com.xworkz.Interface.Enginner;
import com.xworkz.Interface.MetroRule;
import com.xworkz.Interface.Military;
import com.xworkz.Interface.PG;
import com.xworkz.Interface.TempleRule;

import app.EngineerStudent;
import app.EnginnerStudent;
import app.IndianMilitary;
import app.Metro;
import app.PgRule;
import app.Temple;

public class Runner {

	public static void main(String[] args) {
		
				System.out.println("invoking main in Runner");
				MetroRule metro = new Metro();
				metro.run("Namma Metro");
				metro.speed(45);
				metro.stop();
				System.out.println("--------------------------------------");
				System.out.println("invoking main in TempleRunner");
				TempleRule rule = new Temple();
				rule.dress("ethnic");
				rule.photo();
				rule.silence("maintenance");
				System.out.println("--------------------------------------");
				System.out.println("invoking main in Pg");
				PG pg = new PgRule();
				pg.name("SJR");
				pg.food(false);
				pg.payment(6000);
				System.out.println("---------------------------------------");
				System.out.println("invoking main in Enginner");
				Enginner student = new EngineerStudent();
				student.attendance(10);
				student.branch("EEE");
				student.regular();
				System.out.println("----------------------------------------");
				System.out.println("invoking main in Military");
				Military military =  new IndianMilitary();
				military.height(null);
				military.age(25);
				military.weight(null);
			}

	
}
