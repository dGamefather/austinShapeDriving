package shape.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import shape.Model.DrawingRobot;

public class DrawingTester
{
	private DrawingRobot myRobotTester;
	@Before
	public void setUp() throws Exception
	{
		myRobotTester = new DrawingRobot();
	}

	@After
	public void tearDown() throws Exception
	{
	}
	
	@Test
	public void testRobotExists()
	{
		assertNotNull(myRobotTester);
	}

	@Test
	public void testCalculateAngle()
	{
		assertEquals(90, myRobotTester.circleAngle(4));
	}

}
