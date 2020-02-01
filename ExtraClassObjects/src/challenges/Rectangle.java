package challenges;

public  class Rectangle extends Shape {
	public int x;
	public int y;
    public int width;
    public int height;
    
    // add  default constructor
    public Rectangle( ) {
    	this.width = 20;
    	this.height= 30;
    }
    public Rectangle(int width, int height) {
    	// code to set your attribute
    	
    	this.width = width;
    	this.height = height;
    }
    
    
	@Override
	public String getShapeName() {
		// TODO Auto-generated method stub
		return "Rectangle";
	}
	
	@Override
	public int getPerimeter() {
		// TODO Auto-generated method stub
		return 2* (width + height);
	}
	@Override
	public double arear() {
		// TODO Auto-generated method stub
		return width * height;
	}
}
