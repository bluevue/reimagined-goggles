
///////////////////////////////////////////////////////////////////
//	This is for creating actions for doing tasks in RuneScape.
//	
//
//
///////////////////////////////////////////////////////////////////

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Actions {
	public static void setCamera() throws AWTException {
		// Creates bot
		Robot bot = new Robot();

		// moves mouse to compass to set north and center view.
		bot.mouseMove(824, 72);
		bot.delay(0);
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.delay(RandNumGen.pressReleaseRand());
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		bot.delay(160);

		// Clicks Options
		bot.mouseMove(941, 528);
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.delay(101);
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		bot.delay(98);

		// Zooms all the way in
		bot.mouseMove(967, 320);
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.delay(102);
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		bot.delay(1000);
	}

	public static void bankLumby() throws AWTException {
		Robot bot = new Robot();
		bot.mouseMove(540, 150);
		bot.delay(1000);
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.delay(100);
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
}
