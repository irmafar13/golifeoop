
public class Cone extends Shape{
	
	private double r;
	private double t;

	public Cone(double r, double t) {
		// TODO Auto-generated constructor stub
		this.r = r;
		this.t = t;
		this.setShapeName("Cone");
		this.setShapeDimention(3);
		this.getShapeDetails();
	}
	
	public void setVolume() {
		volume = ((22/7) * r * r * t)/3;
	}

}
