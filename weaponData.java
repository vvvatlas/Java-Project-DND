
public class weaponData {
	int wepHitDB, wepBaseDmgDB;
	RandomGen rgenDB = new RandomGen();
	
	public int weaponBaseHit (String weapon) {
		switch(weapon) {
		case "shortbow":
			wepHitDB = 5;
		}
		return wepHitDB;
	}
	
	public int weaponBaseDamage(String weapon) {
		
		
		switch(rgenDB.weapon) {
		case "shortbow":
			wepBaseDmgDB = 6;
		}
		return wepBaseDmgDB;
	}

	//Constructors//
	
	
}
