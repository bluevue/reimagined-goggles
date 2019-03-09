
///////////////////////////////////////////////////////////////////
//																 //
//	These functions will move the mouse to the corresponding tab //
//	and click to open the tab.									 //
//	Each function has a delay at the end.						 //
//																 //
///////////////////////////////////////////////////////////////////

import java.util.Random;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class Menu {

	// top row of menu options. y axis stays the same.
	public static void cmbTab() throws AWTException {
		// finds X axis
		Random randomX = new Random();
		int lowX = 793;
		int randX = randomX.nextInt(24);
		randX += lowX;

		// finds Y axis
		Random randomY = new Random();
		int lowY = 226;
		int randY = randomY.nextInt(24);
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

	public static void skillsTab() throws AWTException {
		// finds x axis
		Random randomX = new Random();
		int lowX = 826;
		int randX = randomX.nextInt(24);
		randX += lowX;

		// finds y axis
		Random randomY = new Random();
		int lowY = 226;
		int randY = randomY.nextInt(24);
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

	public static void questTab() throws AWTException {
		// finds x axis
		Random randomX = new Random();
		int lowX = 859;
		int randX = randomX.nextInt(24);
		randX += lowX;

		// finds y axis
		Random randomY = new Random();
		int lowY = 226;
		int randY = randomY.nextInt(24);
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

	public static void invTab() throws AWTException {
		// finds x axis
		Random randomX = new Random();
		int lowX = 893;
		int randX = randomX.nextInt(24);
		randX += lowX;

		// finds y axis
		Random randomY = new Random();
		int lowY = 226;
		int randY = randomY.nextInt(24);
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

	public static void equipTab() throws AWTException {
		// finds x axis
		Random randomX = new Random();
		int lowX = 928;
		int randX = randomX.nextInt(24);
		randX += lowX;

		// finds y axis
		Random randomY = new Random();
		int lowY = 226;
		int randY = randomY.nextInt(24);
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

	public static void prayTab() throws AWTException {
		// finds x axis
		Random randomX = new Random();
		int lowX = 958;
		int randX = randomX.nextInt(24);
		randX += lowX;

		// finds y axis
		Random randomY = new Random();
		int lowY = 226;
		int randY = randomY.nextInt(24);
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

	public static void mageTab() throws AWTException {
		// finds x axis
		Random randomX = new Random();
		int lowX = 991;
		int randX = randomX.nextInt(24);
		randX += lowX;

		// finds y axis
		Random randomY = new Random();
		int lowY = 226;
		int randY = randomY.nextInt(24);
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
	// end of top row of menu options.

	// bottom row of menu options. y axis stays the same.
	public static void clanTab() throws AWTException {
		// finds x axis
		Random randomX = new Random();
		int lowX = 791;
		int randX = randomX.nextInt(24);
		randX += lowX;

		// finds y axis
		Random randomY = new Random();
		int lowY = 522;
		int randY = randomY.nextInt(24);
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

	public static void friendTab() throws AWTException {
		// finds x axis
		Random randomX = new Random();
		int lowX = 827;
		int randX = randomX.nextInt(24);
		randX += lowX;

		// finds y axis
		Random randomY = new Random();
		int lowY = 522;
		int randY = randomY.nextInt(24);
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

	public static void accTab() throws AWTException {
		// finds x axis
		Random randomX = new Random();
		int lowX = 862;
		int randX = randomX.nextInt(24);
		randX += lowX;

		// finds y axis
		Random randomY = new Random();
		int lowY = 522;
		int randY = randomY.nextInt(24);
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

	public static void logTab() throws AWTException {
		// finds x axis
		Random randomX = new Random();
		int lowX = 892;
		int randX = randomX.nextInt(24);
		randX += lowX;

		// finds y axis
		Random randomY = new Random();
		int lowY = 522;
		int randY = randomY.nextInt(24);
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

	public static void optionTab() throws AWTException {
		// finds x axis
		Random randomX = new Random();
		int lowX = 926;
		int randX = randomX.nextInt(24);
		randX += lowX;

		// finds y axis
		Random randomY = new Random();
		int lowY = 522;
		int randY = randomY.nextInt(24);
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

	public static void emotesTab() throws AWTException {
		// finds x axis
		Random randomX = new Random();
		int lowX = 959;
		int randX = randomX.nextInt(24);
		randX += lowX;

		// finds y axis
		Random randomY = new Random();
		int lowY = 522;
		int randY = randomY.nextInt(24);
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

	public static void musicTab() throws AWTException {
		// finds x axis
		Random randomX = new Random();
		int lowX = 992;
		int randX = randomX.nextInt(24);
		randX += lowX;

		// finds y axis
		Random randomY = new Random();
		int lowY = 522;
		int randY = randomY.nextInt(24);
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
