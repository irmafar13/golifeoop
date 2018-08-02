
public class Square extends Shape{
	
	private double sisi;

	public Square(double sisi) {
		this.sisi = sisi;
		// TODO Auto-generated constructor stub		
		this.setShapeName("Square");
		this.setShapeDimention(3);
		this.getShapeDetails();
	}
	
	public void setVolume() {
		volume = sisi * sisi *sisi;
	}

}
