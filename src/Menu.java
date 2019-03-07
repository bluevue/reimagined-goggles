
///////////////////////////////////////////////////////////////////
//	These functions will move the mouse to the corresponding tab
//	and click to open the tab.
//	Each function has a delay at the end.
//
///////////////////////////////////////////////////////////////////

import java.util.Random;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class Menu {
	public static void cmbTab() throws AWTException {
		// finds Y axis
		Random randomX = new Random();
		int lowX = 793;
		int randX = randomX.nextInt(24);
		randX += lowX;

		// finds x axis
		Random randomY = new Random();
		int lowY = 226;
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

	public static void skillsTab() throws AWTException {
		// finds Y axis
		Random randomX = new Random();
		int lowX = 826;
		int randX = randomX.nextInt(24);
		randX += lowX;

		// finds x axis
		Random randomY = new Random();
		int lowY = 226;
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

	public static void questTab() {

	}

	public static void invTab() {

	}

	public static void equipTab() {

	}

	public static void prayTab() {

	}

	public static void mageTab() {

	}
}
