import java.awt.AWTException;
import java.util.Scanner;


public class Main {

		
	public static void main(String[] args) throws AWTException {
		
		
		for (int i = 0; i < 5; i++) {
			Menu.cmbTab();
			Menu.skillsTab();
			Menu.questTab();
			Menu.invTab();
			Menu.equipTab();
			Menu.prayTab();
			Menu.mageTab();
			
			Menu.clanTab();
			Menu.friendTab();
			Menu.accTab();
			Menu.logTab();
			Menu.optionTab();
			Menu.emotesTab();
			Menu.musicTab();
			
			Actions.setCamera();
			Actions.bankLumby();
			Actions.bankAll();
			Actions.exitBank();
		}
		
	}

}
