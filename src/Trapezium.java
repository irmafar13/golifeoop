
public class Trapezium extends Shape{
	
	private double width1;
	private double width2;
	private double height;

	public Trapezium(double width1, double width2, double height) {
		// TODO Auto-generated constructor stub
		this.width1 = width1;
		this.width2 = width2;
		this.height = height;
		this.setShapeName("Trapezium");
		this.setShapeDimention(2);
		this.getShapeDetails();
	}
	
	public void setLuas() {
		luas = (width1 + width2) * height/2;
	}

}
