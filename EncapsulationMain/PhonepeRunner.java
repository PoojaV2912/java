package EncapsulationMain;

public class PhonepeRunner {

	public static void main(String[] args) {
		
			System.out.println("invoking main in PhonePeRunner");
			PhonePe phonePe = new PhonePe();
			phonePe.setFullForm("Unified Payments Interface");
			System.out.println("FullForm is:" + phonePe.getFullForm());
			phonePe.setVesrion(1.6f);
			System.out.println("Vesion is:" + phonePe.getVersion());
			phonePe.setamount(1000);
			System.out.println("Amount is:" + phonePe.getamount());
			phonePe.setFeatures("Recharge Mobile");
			System.out.println("Features is:" + phonePe.getFeatures());
			phonePe.setUpdates(true);
			System.out.println("Updates is:" + phonePe.isUpdates());
			phonePe.setPrivacy(true);
			System.out.println("privacy is:" + phonePe.isPrivacy());
			phonePe.setAdvantage("Easy Transaction");
			System.out.println("Advantages is:" + phonePe.getAdvantage());
			phonePe.setNoOfUsers(100);
			System.out.println("Number of Users is:" + phonePe.getNoOfUsers());
			phonePe.setSafe(true);
			System.out.println("Phone Pay is Safe:" + phonePe.isSafe());
			phonePe.setMyNumber(1234567891L);
			System.out.println("My Number is:" + phonePe.getMyNumber());
			phonePe.setInventorYear(2015);
			System.out.println("Invented Year is:" + phonePe.getInventorYear());
			phonePe.setUserName("Chandhu");
			System.out.println("User Name is:" + phonePe.getUserName());
			phonePe.setPassword(true);
			System.out.println("Password is:" + phonePe.isPassword());
			phonePe.setInventor("Sameer Nigam");
			System.out.println("Inventor Name is:" + phonePe.getInventor());
		}	

	}