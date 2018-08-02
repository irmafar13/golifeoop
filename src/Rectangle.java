
public class Rectangle extends Shape{
	
	private double sisi;

	public Rectangle(double sisi) {
		// TODO Auto-generated constructor stub
		this.sisi = sisi;
		// TODO Auto-generated constructor stub		
		this.setShapeName("Rectangle");
		this.setShapeDimention(2);
		this.getShapeDetails();
	}
	
	public void setLuas() {
		luas = sisi * sisi;
	}

}
