class Shape
{
	void draw()
	{
		System.out.println("draw any Shape");
	}
	void erase()
	{
		System.out.println("erase any Shape");
		
	}
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("draw Circle");
	}
	void erase()
	{
		System.out.println("erase Circle");
		
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("draw TRiangle");
	}
	void erase()
	{
		System.out.println("erase Triangle");
		
	}
	
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("draw Square");
	}
	void erase()
	{
		System.out.println("erase Square");
		
	}
}
public class Shp
{
	public static void main(String args)
	{
		Shape s= new Circle();
		Shape t= new Triangle();
		Shape u= new Square();
		s.draw();
		s.erase();
		t.draw();
		t.erase();
		u.draw();
		u.erase();
	}
}