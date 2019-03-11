
///////////////////////////////////////////////////////////////////
//																 //
//	For now this is where I'll test functions. 					 //
//	In the future I hope this will run the initial gui.			 //
//																 //
///////////////////////////////////////////////////////////////////

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Scanner;


public class Main {

		
	public static void main(String[] args) throws AWTException {
		Robot bot = new Robot();
		bot.delay(5000);
		
		Actions.setCamera();
		Menu.invTab();
		
		for (int i = 0; i < 15; i++) {
			Actions.bankGE();
			Inventory.ATwo();
			Actions.withdrawlFirst();
			Actions.exitBank();
			Inventory.AOne();
			Inventory.ATwo();
			Fletch.oakLongbow();
			bot.delay(Fletch.fletchRand());
			
			
			/*
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
			Actions.bankGE();
			Actions.bankAll();
			Actions.exitBank();
			*/			
		}
		System.exit(0);		
	}

}
