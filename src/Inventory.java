import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Random;

public class Inventory {
	public static void AOne() throws AWTException {
		// finds X axis
		Random randomX = new Random();
		int lowX = 828;
		int randX = randomX.nextInt(14);
		randX += lowX;

		// finds Y axis
		Random randomY = new Random();
		int lowY = 270;
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
	
	public static void ATwo() throws AWTException {
		// finds X axis
		Random randomX = new Random();
		int lowX = 871;
		int randX = randomX.nextInt(14);
		randX += lowX;

		// finds Y axis
		Random randomY = new Random();
		int lowY = 270;
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
}
