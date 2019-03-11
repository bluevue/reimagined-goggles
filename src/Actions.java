
///////////////////////////////////////////////////////////////////
//																 //
//	This is for creating actions for doing tasks in RuneScape.	 //
//																 //
///////////////////////////////////////////////////////////////////

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Actions {
	
	// sets camera to a reliable location
	public static void setCamera() throws AWTException {
		// creates bot
		Robot bot = new Robot();
		
		// moves mouse to compass to set north and center view.
		bot.mouseMove(824, 72);
		bot.delay(0);
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.delay(RandNumGen.pressReleaseRand());
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		bot.delay(160);

		// Clicks Options
		Menu.optionTab();

		// Zooms all the way in
		bot.mouseMove(967, 320);
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.delay(102);
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		bot.delay(1000);
	}

	// banks all items in invy
	public static void bankAll() throws AWTException {
		// finds X axis
		Random randomX = new Random();
		int lowX = 693;
		int randX = randomX.nextInt(24);
		randX += lowX;

		// finds Y axis
		Random randomY = new Random();
		int lowY = 350;
		int randY = randomY.nextInt(24);
		randY += lowY;

		// creates robot, moves cursor and clicks
		Robot bot = new Robot();
		bot.delay(1000);
		bot.mouseMove(randX, randY);
		bot.delay(RandNumGen.pressReleaseRand());
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.delay(RandNumGen.pressReleaseRand());
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

	public static void exitBank() throws AWTException {
		// finds X axis
		Random randomX = new Random();
		int lowX = 740;
		int randX = randomX.nextInt(14);
		randX += lowX;

		// finds Y axis
		Random randomY = new Random();
		int lowY = 67;
		int randY = randomY.nextInt(14);
		randY += lowY;

		// creates robot, moves cursor and clicks
		Robot bot = new Robot();
		bot.delay(1000);
		bot.mouseMove(randX, randY);
		bot.delay(RandNumGen.pressReleaseRand());
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.delay(RandNumGen.pressReleaseRand());
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	
	
	
	public static void withdrawlFirst() throws AWTException {
		// finds X axis
		Random randomX = new Random();
		int lowX = 336;
		int randX = randomX.nextInt(14);
		randX += lowX;

		// finds Y axis
		Random randomY = new Random();
		int lowY = 137;
		int randY = randomY.nextInt(14);
		randY += lowY;

		// creates robot, moves cursor and clicks
		Robot bot = new Robot();
		bot.delay(1000);
		bot.mouseMove(randX, randY);
		bot.delay(RandNumGen.pressReleaseRand());
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.delay(RandNumGen.pressReleaseRand());
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

	// opens bank in lumby
	public static void bankLumby() throws AWTException {
		Robot bot = new Robot();
		bot.mouseMove(540, 150);
		bot.delay(1000);
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.delay(100);
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	
	// opens bank in ge west side
	public static void bankGE() throws AWTException {
		Random randomX = new Random();
		int lowX = 627;
		int randX = randomX.nextInt(40);
		randX += lowX;

		// finds Y axis
		Random randomY = new Random();
		int lowY = 226;
		int randY = randomY.nextInt(40);
		randY += lowY;

		// creates robot, moves cursor and clicks
		Robot bot = new Robot();
		bot.delay(1000);
		bot.mouseMove(randX, randY);
		bot.delay(RandNumGen.moveMouseRand());
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.delay(RandNumGen.pressReleaseRand());
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
}
