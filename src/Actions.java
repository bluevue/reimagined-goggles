import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class Actions {
	public static void delay(int x) throws AWTException {
		Robot bot = new Robot();
		bot.delay(x);
	}
	
	public static void setCamera() throws AWTException {
		Click.leftClick(836, 72);
		delay(1000);
		Click.leftClick(950, 531);
		delay(1000);
		Click.leftClick(978, 323);
	}
	
	public static void bankLumby() throws AWTException {
		Click.leftClick(836, 72);
	}
}
