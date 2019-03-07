import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class Click {
	public static void leftClick(int x, int y) throws AWTException {
		Robot bot = new Robot();
		bot.mouseMove(x, y);
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.delay(60);
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

	public static void rightClick(int x, int y) throws AWTException {
		Robot bot = new Robot();
		bot.mouseMove(x, y);
		bot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		bot.delay(60);
		bot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
	}

	public static void doubleClick(int x, int y) throws AWTException {
		Robot bot = new Robot();
		bot.mouseMove(x, y);
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		bot.setAutoDelay(600);
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
}
