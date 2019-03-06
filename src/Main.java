import java.awt.AWTException;
import java.util.Scanner;

public class Main {

	//test update
	
	public static void main(String[] args) throws AWTException {
		System.out.println("Press c to stop the program");
		Scanner sc = new Scanner(System.in);
		String i = sc.next();
		System.out.println(i);
		sc.close();
		
		Actions.delay(1000);
		Actions.setCamera();
	}

}
