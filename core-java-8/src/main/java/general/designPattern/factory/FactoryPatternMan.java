package general.designPattern.factory;

public class FactoryPatternMan {

	public static void main(String[] args) {
		
		ShapeFactory factory = new ShapeFactory();
		// Get a object of circle
		Shape shape = factory.getShape("CIRCLE");
		shape.draw();
		
		// get a object of Triangle
		shape = factory.getShape("TRIANGLE");
		shape.draw();

	}

}
