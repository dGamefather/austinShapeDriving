package shape.Controller;

import lejos.nxt.Button;
import shape.Model.DrawingRobot;

public class AustinShapeController
{
	private DrawingRobot deathBot;
	
	public AustinShapeController()
	{
		deathBot = new DrawingRobot();
	}
	
	public void start()
	{
		while(Button.waitForAnyPress() != Button.ID_ESCAPE)
		{
			deathBot.drawCircle(1, 1);
			deathBot.drawSquare(4, 1);
			deathBot.drawTriangle(3, 1);
			deathBot.drawHexagon(6, 1);
			deathBot.drawOctagon(8, 1);
		}
	}
}
