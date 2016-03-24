import java.awt.Color;
//import java.util.Random;

public class Square extends Shape
{

	private int shapeWidth;
	//private int shapeHeight;
	//private int mouseX;
	//private int mouseY;

	public Square(int shapeWidth)
	{
		// TODO Constructor
		this.shapeWidth = shapeWidth;
		//this.shapeHeight = shapeHeight;
	}


	@Override
	public Color getRandomColor()
	{
		float r, g, b;// TODO Return random color produce from java.util.Random;
		//Random ran = new Random();

		//r = ran.nextFloat();
		//g = ran.nextFloat();
		//b = ran.nextFloat();
		r = (float)Math.random();
		g = (float)Math.random();
		b = (float)Math.random();
		// Java 'Color' class takes 3 floats, from 0 to 1.

		// TODO Return color produced by three rgb floats.
		return new Color(r, g, b);
	}

	@Override
	public int getShapeWidth()
	{
		// TODO Return Square width
		return shapeWidth;
	}

	@Override
	public int getShapeHeight(){
		// TODO Return Square height
		return shapeWidth;
	}


	@Override
	public int getCenterX(int mouseX)
	{
		//this.mouseX = mouseX;
		return mouseX - shapeWidth/2;
	}


	@Override
	public int getCenterY(int mouseY)
	{
		//this.mouseY = mouseY;
		// TODO Input mouse Y position and return center Y of square
		return mouseY - shapeWidth/2;
	}
}
