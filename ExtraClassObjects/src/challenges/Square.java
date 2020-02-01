package challenges;

public class Square extends Shape {
	public int x;
	public int y;
	public int size;
	
	// add  default constructor
    public Square() {
    	this.size=60;
    }
	public Square(int size) {
		// code to set your attribute
		this.size = size;
	}
	@Override
	public String getShapeName() {
		// TODO Auto-generated method stub
		return "Square";
	}
	@Override
	public int getPerimeter() {
		// TODO Auto-generated method stub
		return 4*size;
	}
	@Override
	public double arear() {
		// TODO Auto-generated method stub
		return size*size;
	}

}
