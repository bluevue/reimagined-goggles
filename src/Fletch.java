import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Random;

public class Fletch {
	public static void longBow() throws AWTException {
		// finds X axis
		Random randomX = new Random();
		int lowX = 581;
		int randX = randomX.nextInt(80);
		randX += lowX;

		// finds Y axis
		Random randomY = new Random();
		int lowY = 443;
		int randY = randomY.nextInt(50);
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
	
	public static void oakShortbow() throws AWTException {
		// finds X axis
		Random randomX = new Random();
		int lowX = 379;
		int randX = randomX.nextInt(80);
		randX += lowX;

		// finds Y axis
		Random randomY = new Random();
		int lowY = 443;
		int randY = randomY.nextInt(50);
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
	
	public static void oakLongbow() throws AWTException {
		// finds X axis
		Random randomX = new Random();
		int lowX = 480;
		int randX = randomX.nextInt(80);
		randX += lowX;

		// finds Y axis
		Random randomY = new Random();
		int lowY = 443;
		int randY = randomY.nextInt(50);
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

	public static int fletchRand() {
		Random random = new Random();
		int add = 54500;
		int randInt = random.nextInt(5000);
		add += randInt;
		System.out.println(add);

		return add;
	}
}
