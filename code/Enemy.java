package code;

public class Enemy extends GamePerson {
	
	protected int level;
	
	public Enemy() {
		
	}
	public Enemy(String name, int [] position, int level) {
		this.name=name;
		this.position=position;
		this.level=level;
		switch (level) {
		case 1:
			this.maxHealth=25;
			this.currentHealth=this.maxHealth;
			this.hitDamage=5;
			break;
		case 2:
			this.maxHealth=50;
			this.currentHealth=this.maxHealth;
			this.hitDamage=10;
			break;
		case 3:
			this.maxHealth=75;
			this.currentHealth=this.maxHealth;
			this.hitDamage=20;
			break;
		case 4:
			this.maxHealth=100;
			this.currentHealth=this.maxHealth;
			this.hitDamage=35;
			break;
		}
	}

}
