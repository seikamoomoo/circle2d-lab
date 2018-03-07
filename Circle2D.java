public class Circle2D
{
	//data fields
	double x, y;
	double radius;

	//no args constructor
	Circle2D()
	{
		x = 0;
		y = 0;
		radius = 1;
	}

	//create circle with specified values
	Circle2D(double i, double j, double r)
	{
		x = i;
		y = j;
		radius = r;
	}

	//return area of circle
	double getArea()
	{
		return Math.PI*radius*radius;
	}

	//return perimeter of circle
	double getPerimeter()
	{
		return 2*Math.PI*radius;
	}

	//check if circle contains point (i, j)
	boolean contains(double i, double j)
	{
		return Math.sqrt(Math.pow(x-i,2)+Math.pow(y-j,2))<radius;
	}

	//check if circle is contained within new circle
	boolean contains(Circle2D circle)
	{
		return (Math.sqrt(Math.pow(x-circle.x,2)+Math.pow(y-circle.y,2))+radius)<=circle.radius;
	}

	//check if circle overlaps new circle
	boolean overlaps(Circle2D circle)
	{
		return (Math.sqrt(Math.pow(x-circle.x,2)+Math.pow(y-circle.y,2))-circle.radius)<radius;
	}
}