package general.designPattern.factory;

public class ShapeFactory {

	public Shape getShape(String shapeType) {

		Shape shape = null;
		if (shapeType.equals("CIRCLE")) {
			shape = new Circle();
		}
		if (shapeType.equals("TRIANGLE")) {
			shape = new Triangle();
		}
		if (shapeType.equals("SQUARE")) {
			shape = new Square();
		}
		return shape;

	}

}
