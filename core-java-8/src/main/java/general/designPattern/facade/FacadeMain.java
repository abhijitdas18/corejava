package general.designPattern.facade;

public class FacadeMain {

	public static void main(String[] args) {
		ShapeMakerFacade facade = new ShapeMakerFacade();
		facade.drawCircle();
		
		facade.drawSquare();
		
		facade.drawTriangle();

	}

}
