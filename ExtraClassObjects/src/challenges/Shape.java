package challenges;

public abstract class Shape {
	public int x;
	public int y;
	Shape(){
		
	}
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public abstract String getShapeName();
    public abstract int getPerimeter();
    public abstract double arear();
	
}
