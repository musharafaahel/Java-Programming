/*Constructor*/

class Box
{
	double length, breadth, heigth;
	Box(double l, double b, double h)
	{
		length = l;
		breadth = b;
		heigth = h;
	}
	int display()
	{
		System.out.println("Volume of Box = "+ length*breadth*heigth);
		return 1;
	}
}

class BoxDemo
{
	public static void main(String args[])
	{
		Box b1 = new Box(10.0,10.0,10.0);
		b1.display();
	}
}