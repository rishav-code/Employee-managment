package input;

import java.util.Scanner;
/*
 *  class contains the main menu to select the desired operation
 */

public class Mainmenu {
	public void Usermenu() {
		do {
		Scanner input =new Scanner(System.in);
		System.out.println("Menu:Select The option");
		System.out.println("1:Creat Employee");
		System.out.println("2:Fetch Employee");
		System.out.println("3:Delete Employee");
		System.out.println("4:Exit");
		int Select=input.nextInt();
		mainmenu(Select);
		}
		while(1>0); 
	}

	
	
		private void mainmenu(int select) {
			switch (select) {
			case 1:
				CreatEmployee ce= new CreatEmployee();
				ce.creatmethod();
				
				break;
			case 2:
				Fetchmenu fm = new Fetchmenu();
				fm.fetchmenu();
				break;
				
			case 3:
				Deletemenu dm = new Deletemenu();
				dm.deletemenu();
				break;
				
			case 4:
				
			default:
				System.out.println("Wrong Option, Please select Correct Option");
			}
		// TODO Auto-generated method stub
		
	}
}

