package general.designPattern.facade;

import general.designPattern.factory.Shape;

import general.designPattern.factory.Circle;
import general.designPattern.factory.Square;
import general.designPattern.factory.Triangle;

public class ShapeMakerFacade {

	public Shape circle;
	public Shape triangle;
	public Shape square;

	public ShapeMakerFacade() {
		circle = new Circle();
		triangle = new Triangle();
		square = new Square();
	}

	public void drawCircle() {
		circle.draw();
	}
	public void drawTriangle() {
		triangle.draw();
	}
	public void drawSquare() {
		square.draw();
	}
}
