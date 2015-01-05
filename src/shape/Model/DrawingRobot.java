package shape.Model;

import lejos.nxt.Motor;

public class DrawingRobot
{
	public void drawCircle(int numberOfSides, int length)
	{
		int angle = circleAngle(numberOfSides);
		
		for(int drawCount =0; drawCount < numberOfSides; drawCount++)
		{
			try
			{
				System.out.print("Circle ");
				Motor.A.rotate(angle,true);
				Motor.B.flt();
				Motor.C.backward();
				Thread.sleep(length* 5000);
				Motor.A.rotate(90,true);
				Motor.B.stop();
				Motor.C.stop();
				
			}
			catch(Exception threadException)
			{
				System.out.print(threadException.getMessage());
			}
		}	
	}
	
	public int circleAngle(int numberOfSides)
	{
		int currentAngle = 0;
		
		if(numberOfSides != 0)
		{
			currentAngle = 360/4;
		}
		
		return currentAngle;
	}
	
	public void drawSquare(int numberOfSides, int length)
	{
		
		int angle = squareAngle(numberOfSides);
		
		for(int drawCount =0; drawCount < numberOfSides; drawCount++)
		{
			try
			{
				System.out.print("Square ");
				Motor.B.backward();
				Motor.C.backward();
				Thread.sleep(length* 1000);
				Motor.B.stop();
				Motor.C.stop();
				Motor.A.rotate(angle,true);
				Thread.sleep(length* 1000);
				Motor.C.backward();
				Motor.B.forward();
				Thread.sleep(length* 1000);
				Motor.A.rotate(90, true);
				Motor.B.stop();
				Motor.C.stop();
				Thread.sleep(length* 1000);	
			}
			catch(Exception threadException)
			{
				System.out.print(threadException.getMessage());
			}
		}	
	}
	
	public int squareAngle(int numberOfSides)
	{
		int currentAngle = 0;
		
		if(numberOfSides != 0)
		{
			currentAngle = 360/4;
		}
		
		return currentAngle;
	}
	
	public void drawTriangle(int numberOfSides, int length)
	{
		
		int angle = triAngle(numberOfSides);
		
		for(int drawCount =0; drawCount < numberOfSides; drawCount++)
		{
			try
			{
				System.out.print("Triangle ");
				Motor.B.backward();
				Motor.C.backward();
				Thread.sleep(length* 1000);
				Motor.B.stop();
				Motor.C.stop();
				Motor.A.rotate(angle,true);
				Thread.sleep(length* 1000);
				Motor.C.backward();
				Motor.B.forward();
				Thread.sleep(length* 1600);
				Motor.A.rotate(90, true);
				Motor.B.stop();
				Motor.C.stop();
				Thread.sleep(length* 1000);
			}
			catch(Exception threadException)
			{
				System.out.print(threadException.getMessage());
			}
		}	
	}
	
	public int triAngle(int numberOfSides)
	{
		int currentAngle = 0;
		
		if(numberOfSides != 0)
		{
			currentAngle = 360/4;
		}
		
		return currentAngle;
	}
	
	public void drawHexagon(int numberOfSides, int length)
	{
		
		int angle = HexAngle(numberOfSides);
		
		for(int drawCount =0; drawCount < numberOfSides; drawCount++)
		{
			try
			{
				System.out.print("Hexagon ");
				Motor.B.backward();
				Motor.C.backward();
				Thread.sleep(length* 1000);
				Motor.B.stop();
				Motor.C.stop();
				Motor.A.rotate(angle, true);
				Thread.sleep(length* 1000);
				Motor.C.backward();
				Motor.B.forward();
				Thread.sleep(length* 800);
				Motor.B.stop();
				Motor.C.stop();
				Motor.A.rotate(90, true);
				Thread.sleep(length* 1000);	
			}
			catch(Exception threadException)
			{
				System.out.print(threadException.getMessage());
			}
		}
	}
	
	public int HexAngle(int numberOfSides)
	{
		int currentAngle = 0;
		
		if(numberOfSides != 0)
		{
			currentAngle = 360/4;
		}
		
		return currentAngle;
	}
	
	public void drawOctagon(int numberOfSides, int length)
	{
		
		int angle = OctoAngle(numberOfSides);
		
		for(int drawCount =0; drawCount < numberOfSides; drawCount++)
		{
			try
			{
				System.out.print("Octagon ");
				Motor.B.backward();
				Motor.C.backward();
				Thread.sleep(length* 1000);
				Motor.B.stop();
				Motor.C.stop();
				Motor.A.rotate(angle, true);
				Thread.sleep(length* 1000);
				Motor.C.backward();
				Motor.B.forward();
				Thread.sleep(length* 500);
				Motor.B.stop();
				Motor.C.stop();
				Motor.A.rotate(angle, true);
				Thread.sleep(length* 1000);
					
			}
			catch(Exception threadException)
			{
				System.out.print(threadException.getMessage());
			}
		}
	}
	
	public int OctoAngle(int numberOfSides)
	{
		int currentAngle = 0;
		
		if(numberOfSides != 0)
		{
			currentAngle = 360/4;
		}
		
		return currentAngle;
	}
}
