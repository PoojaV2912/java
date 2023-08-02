package Inheritance;

public class SoilRunner {
			public static void main(String[] args) {
				System.out.println("Invoking the main method in SoilKiller");
				Soil soil=new Soil();
				Soil ref=new Seeds();
			    Soil roots=new Roots();
				Roots ref1=new Seedling();
				Roots ref2=new Branch();
				Roots root=new Leaf();
				//Roots flower=new Flower();
				Flower flowers=new Fruit();
				Seeds seeds=new Seeds();
				Roots ref3=new Roots();
				Leaf leaf=new Leaf();
				Roots ref4=new Roots();
				Fruit fruit=new Fruit();
				Seedling seedling=new Seedling();
			 System.out.println(ref.color);
			 ref.soilTexture();
			 System.out.println(ref3.numberOfSeeds);
			 ref3.weigth();
			 System.out.println(ref1.strength);
			ref1.stiffness();
			System.out.println(flowers.stem);
			flowers.swollen();
			System.out.println(leaf.strength);
			leaf.numberOfBranch();
			System.out.println(flowers.color);
			flowers.petal();
			System.out.println(fruit.petals);
			fruit.tasty();
			System.out.println(seedling.radicle);
			seedling.hypocotyl();


			}
			}
	