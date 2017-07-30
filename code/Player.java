package code;

public class Player extends GamePerson {

	String newMoveDirection;

	// Sets default player attributes
	public Player() {
		int[] startPos = { 0, 0 };
		this.setPosition(startPos);
		this.maxHealth = 100;
		this.currentHealth = this.maxHealth;
		this.hitDamage = 20;
	}

	// Executes move in selected move direction
	public void move() {

		switch (newMoveDirection) {
		case "n":
			this.position[1] += 1;
			break;
		case "s":
			this.position[1] -= 1;
			break;
		case "w":
			this.position[0] -= 1;
			break;
		case "e":
			this.position[0] += 1;
			break;
		}

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPosition(int[] pos) {
		this.position = pos;
	}

	public int[] getPosition() {
		return this.position;
	}
}
