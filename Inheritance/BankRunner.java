package Inheritance;

public class BankRunner {
		public static void main(String[] args) {
			Banker banker=new Banker();
			Banker ref=new BankTeller();
			BankTeller ref1=new CreditAnalyst();
			CreditAnalyst ref2=new InvestmentBanker();
			InvestmentBanker ref3=new LoanProcessor();
			LoanProcessor ref4=new Manager();
			Manager ref5=new MotgageConsultant();
			MotgageConsultant motgageConsultant=new MotgageConsultant();
			System.out.println(ref.name);
			ref.BankerInfo();
			System.out.println(ref1.name);
			ref1.BankerTellerInfo();
			System.out.println(ref2.name);
			ref2.CreditAnalystInfo();
			System.out.println(ref3.name);
			ref3.InvestmentBankerInfo();
			System.out.println(ref4.name);
			ref4.LoanProcessorInfo();
			System.out.println(ref5.name);
			ref5.ManagerInfo();
			System.out.println(motgageConsultant.name);
			motgageConsultant.MotgageConsultantInfo();
		}
		}


