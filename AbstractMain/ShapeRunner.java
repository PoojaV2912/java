package AbstractMain;

import Abstract.Rectangular;
import Abstract.Shape;

public class ShapeRunner {

	public static void main(String[] args) {
		Shape shape = new Rectangular();
		shape.circle();
		shape.definitions();
		shape.names();
		shape.properties();
		shape.size();
		shape.square();
		shape.ThreeDShape();
		shape.triangle();
		shape.twoDShape();

	}

}
	