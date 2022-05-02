import java.util.Scanner;
public class ComboGen {

	public static void main(String[] args) {
		
		RandomGen input = new RandomGen();
		int choice = 0;
		int combo;
		Scanner scan = new Scanner(System.in);
		
		while (choice == 0) {
		System.out.println("Combo Generator \n-----------------------");
		System.out.print("What is your weapon: ");
		input.setWeapon(scan.next());
		System.out.print("What is your stat modifier: ");
		input.setStatAmt(scan.nextInt());
		
		System.out.println("-----------------------");
		
		System.out.print("Dice to Hit | Advantage (x2): ");
		input.setDice(scan.nextInt());
		
		System.out.print(System.lineSeparator());
		
		//Rolling For Attack//
		
		for(int x = 0; x < input.dice; x++) {
			System.out.println(input.toHit(input.getDice(), input.getWeapon()));
		}
		
		System.out.println("\nCombo\n-----------------------\n1. Normal\n2. Sneak+Hunter\n3. Hunter\n4. WomboCombo");
		combo = (scan.nextInt());
		System.out.print(System.lineSeparator());
		choice = 1;
		
		while (choice == 1) {
		switch(combo) {
		case 1: 
			
		case 2:
			System.out.println(input.toString(input.getWeapon(), combo, input.getDice()));
			combo = 0;
			System.out.println(input.toString(input.getWeapon(), combo, input.getDice()));
			
		case 3:
			System.out.println(input.toString(input.getWeapon(), combo, input.getDice()));
			combo = 0;
			System.out.println(input.toString(input.getWeapon(), combo, input.getDice()));
			
		case 4:
			System.out.println(input.toString(input.getWeapon(), 2, input.getDice()));
			System.out.println(input.toString(input.getWeapon(), 3, input.getDice()));
			System.out.println(input.toString(input.getWeapon(), 4, input.getDice()));
			
		}
		
		
		
		System.out.println("-----------------------\nReroll - 1 | Restart - 0");
		choice = (scan.nextInt());
		}
		

		
		
	}
		scan.close();
}
	
}

