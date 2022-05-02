
public class Abilities extends RandomGen {
	
	String abilityName;
	int abilityDmg;
	
	public void abilityDB(String ability) {
		switch(ability) {
		case "Sneak":
			{abilityDmg = 6;
			
			}
		case "Hunter's Mark":{
			abilityDmg = 6;
		}
		}
	}

	public int getAbility() {
		return abilityDmg;
	}
}
