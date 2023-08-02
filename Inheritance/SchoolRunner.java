package Inheritance;

public class SchoolRunner {
		public static void main(String[] args) {
			Primary Primary=new Primary();
			Primary ref=new HighSchool();
			HighSchool ref1=new PUC();
			HighSchool ref2=new Diploma();
			Diploma ref3=new Engineer();
			Engineer ref4=new PostGraduation();
			PostGraduation postGraduation=new PostGraduation();
			System.out.println(ref.name);
			ref.primaryInfo();
			System.out.println(ref2.name);
			ref2.highSchoolInfo();
			System.out.println(ref1.name);
			System.out.println(ref4.name);
			ref4.diplomaInfo();
			System.out.println(postGraduation.name);
			postGraduation.engineerInfo();
			System.out.println(postGraduation.name);
			postGraduation.postGraduationInfo();
		} 
		}


