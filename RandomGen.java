import java.util.Random;
import java.util.Scanner;


public class RandomGen {
	Random random = new Random();
	int total, diceTotal, statAmt, dice, roll;
	int d4, d6, d8, d10, d20;
	int hit1, hit2, weaponHit;
	int weaponTotal, attackTotal;
	String statName;
	String weapon;
	
	int dice1, dice2, dice3;
	
	
	int x = 0;
	
	Scanner scan2 = new Scanner(System.in);
	
	//Dice Randomizer//
	public int diceRoll(int dice) {
	
	switch(dice) {
	case 8: d8 = random.nextInt(8)+1;
			diceTotal = d8;
	case 6: d6 = random.nextInt(6)+1;
			diceTotal = d6;
	case 4: d4 = random.nextInt(4)+1;
			diceTotal = d4;
	case 10: d10 = random.nextInt(10)+1;
			diceTotal = d10;
	case 20: d20 = random.nextInt(20)+1;
			diceTotal = d20;
	}
	
	return diceTotal;
	}
	
	public int diceDmg(int dice)
	{
		
		switch(dice) { 
		case 8: 
			diceRoll(dice);
			total = d8 + statAmt;
		case 6: 
			diceRoll(dice);
			total = d6 + statAmt;
		case 4: 
			diceRoll(dice);
			total = d4;
		case 10: 
			diceRoll(dice);
			total = d10;
		case 20: 
			diceRoll(dice);
			total = d20;
	}
		return total;
	}

	//Constructors//
	public void setDice(int dice) {
		this.dice = dice;
	}
	
	public int getDice() {
		return dice;
	}
	
	public void setStatAmt(int statAmt) {
		this.statAmt = statAmt;
	}
	
	public int getStatAmt() {
		return statAmt;
	}
	
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	public String getWeapon() {
		return weapon;
	}
	
	
	public void setTotalDmg(int weaponTotal) {
		
		this.weaponTotal = weaponTotal;
	}
	
	public int getTotalDmg() {
		return weaponTotal;
	}
	
	public void clearTotal() {
		total = 0;
	}

	
	
	public int shortBow() {
		total = d6 + statAmt;
		return total;
	}
	
	
	
	//Weapon Data//
	

	public int toHit(String weapon) {
		switch(weapon) {
			case "shortbow":
				 weaponHit = 5;
			}
			
		return weaponHit;
	}
	

	//toStrings | Outputs//
	
	
	public String toString(String weapon, int combo, int dice) {
		String text = null;

		
		switch(weapon) {
		case "shortbow":
			int a1, a2, a3;
			//Hunter - Sneak - Weapon-
			if(combo == 2) {
				diceRoll(6);
				a1 = d6;
				diceRoll(6);
				a2 = d6;
				diceRoll(6);
				a3 = d6;
				total = a1 + a2 + a3 + statAmt;
				text = "-Hunter's Mark Activated-\n    -Sneak Attack-\nShortbow(3d6+" + statAmt + "): " + (a1+a2+a3+statAmt) + "\nTotal: " + total +"\n";
				break;}
			
			//Hunter - Weapon//
			else if(combo == 3) {
				diceRoll(6);
				a1 = d6;
				diceRoll(6);
				a2 = d6;
				total = total + a1 + a2 + statAmt;
				text = "-Hunter's Mark Activated-\nShortbow(2d6+" + statAmt + "): " + (a1+a2+statAmt) + "\nTotal: " + total + "\n";
				break;
				
			}
			
			else if (combo == 4) {
				diceRoll(6); //Normal Attack//
				a1 = d6;
				diceRoll(6); //Hunters Mark//
				a2 = d6;
				diceRoll(8);//Deadly Ambush/
				a3 = d8;
				total = total + a1 + a2 + a3 + statAmt;
				text = "-Hunter's Mark Activated-\nDeadly Ambush\nShortbow(2d6+1d8+" + statAmt + "): " + (a1+a2+a3+statAmt) + "\nTotal: " + total + "\n";
				break;
			}
			
			//Normal 2 Attacks//
			else {
				diceRoll(6);
				a1 = d6;
				diceRoll(6);
				a2 = d6;
				total = total + a1 + a2 + statAmt;
				text = "Shortbow(2d6+"+ statAmt + "): " + (a1+a2+statAmt) + "\nTotal: " + total + "\n";
				break;}
		}
		return text;
	}
	
	public String toHit(int dice, String weapon) {
		String text = null;
		
		for(int x = 0; x < dice; x++) {
		diceRoll(20);
		roll = (d20 + statAmt + toHit(weapon));
		text = "Base: " + d20 + " + Modifier: " + (weaponHit+statAmt) + " : " + roll;
		}
		return text;
	}
	
}

