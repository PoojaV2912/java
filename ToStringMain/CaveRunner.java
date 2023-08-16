package ToStringMain;

import ToString.Cave;

public class CaveRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Cave runner");
		Cave cave=new Cave();
		System.out.println(cave);
		Cave cave1=new Cave("flowStone","stalacties","helictites","stalagmites","sodaStraws","columns",6587,8768,"stone",546.6);
		System.out.println(cave1);
		Cave cave2=new Cave("flowStone","stalacties","helictites","sodaStraws","stalagmites","columns",6587,8768,"stone",546.6);
		System.out.println(cave2);
	

	}

}
