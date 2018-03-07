public class TestCircle
{
	public static void main(String[] args)
	{
		//create circle c1
		Circle2D c1 = new Circle2D(2, 2, 5.5);

		//get area and perimeter
		System.out.println("The area is " + c1.getArea() +
		" and the perimeter is " + c1.getPerimeter());

		//does c1 contain the point?
		System.out.println("The circle contains (3, 3): " + c1.contains(3, 3));

		//is c1 inside this circle?
		System.out.println("The circle contains new Circle2D(4, 5, 10.5): " +
		c1.contains(new Circle2D(4, 5, 10.5)));

		//does c1 overlap this circle?
		System.out.println("The circle overlaps new Circle2D(3, 5, 2.3): " +
		c1.overlaps(new Circle2D(3, 2, 2.3)));
	}
}