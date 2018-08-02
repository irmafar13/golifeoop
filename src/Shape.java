
public class Shape {

	
	private String shapeName;
	private double width;
	private double height;
	private double length; 
	private int shapeDimention;
	
	protected double luas;
	protected double volume;
	
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	
	protected void setWidth(double newWidth) {
		width = newWidth;
	}
	
	protected String getShapeName() {
		return shapeName;
	}
	
//	protected void setLuas(double width, double height, double length) {
//		luas = width * height * length;
//	}
	
	protected void setLuas() {
		luas = width * height;
	}
	
	protected void setVolume() {
		volume = width * height * length;
	}
	
	protected void setShapeDimention (int dimention) {
		shapeDimention = dimention;
	}
	
	protected double getLuas() {
		return luas;
	}
	
	protected double getVolume() {
		return volume;
	}
	
	protected void setShapeName(String name) {
		shapeName = name;
	}
	
	protected void getShapeDetails() {
		
		System.out.println("Name:" + getShapeName());
		if (shapeDimention == 2) {
			setLuas();
			System.out.println("Luas:" + getLuas());
		} else {
			setVolume();
			System.out.println("Volume:" + getVolume());
		}
		System.out.println("____");
	}

}
