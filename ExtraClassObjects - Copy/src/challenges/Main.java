package challenges;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Shape> shapes = new ArrayList<>();
		
		shapes.add(new Rectangle(10, 15 ));
		shapes.add(new Rectangle());
		
		shapes.add(new Triangle(15, 15));
		shapes.add(new Triangle());
		
		
		shapes.add(new Square(60));
		shapes.add(new Square());
		
		for(Shape shape : shapes) {
			System.out.println(shape.getShapeName());
			System.out.println("This parimeter is"+" "+shape.getPerimeter());
			System.out.println("This arear is "+" "+shape.arear());
		}
	}
}
