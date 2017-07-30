package code;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

public class Actioner {

	boolean gameOver;

	// Sets game over to false on initialisation
	public Actioner() {
		this.gameOver = false;
	}

	// Checks if player encountered game object (treasure or enemy) in new location
	public void checkEvent(Player p, HashMap<int[], GameObject> m) throws InterruptedException {
		Iterator<Entry<int[], GameObject>> it = m.entrySet().iterator();
		while (it.hasNext()) {
			Entry<int[], GameObject> entry = it.next();
			if (entry.getKey()[0] == p.position[0] && entry.getKey()[1] == p.position[1]) {

				Object o = entry.getValue();

				if (o instanceof Treasure) {
					open(p, o);
				} else if (o instanceof Enemy) {
					fight(p, o);
				}
			}
		}
	}

	// Executes fight scene
	public void fight(Player p, Object e) throws InterruptedException {

		boolean fightOver = false;

		System.out
				.println("\nWatch out you came across a hostile being! He will try to destroy you!\n\nDefend yourself!");
		TimeUnit.SECONDS.sleep(2);

		while (!fightOver) {
			System.out.println("\n__" + ((Enemy) e).name + "__ Current Health: " + ((Enemy) e).currentHealth
					+ " Hit Damage: " + ((Enemy) e).hitDamage);
			System.out
					.println("\n__" + p.name + "__ Current Health: " + p.currentHealth + " Hit Damage: " + p.hitDamage);
			TimeUnit.SECONDS.sleep(3);

			System.out.println("\nEnemy hits!");
			p.currentHealth -= ((Enemy) e).hitDamage;
			if (p.currentHealth <= 0) {
				System.out.println("\nYou are dead, you will have to wake again...");
				System.out.println(
						"\n~~~Your enemy was stronger than you, next time travel around more to find hidden treasures which unlock true powers within you!~~~");
				gameOver = true;
				fightOver = true;
				break;
			}
			TimeUnit.SECONDS.sleep(1);
			System.out.println("\nYou hit!");
			((Enemy) e).currentHealth -= p.hitDamage;
			if (((Enemy) e).currentHealth <= 0) {
				System.out.println("\nEnemy defeated !");
				fightOver = true;
				break;
			}
			TimeUnit.SECONDS.sleep(1);
		}
	}

	// Executes treasure opening scene
	public void open(Player p, Object t) throws InterruptedException {
		switch (((Treasure) t).type) {
		case 1:
			System.out.println(
					"\nYou found a " + ((Treasure) t).name + " ! " + ((Treasure) t).name.split(" ")[0] + " increased");
			TimeUnit.SECONDS.sleep(4);
			p.currentHealth += 25;
			break;
		case 2:
			System.out.println(
					"\n You found a " + ((Treasure) t).name + " ! " + ((Treasure) t).name.split(" ")[0] + " increased");
			TimeUnit.SECONDS.sleep(4);
			p.hitDamage += 25;
			break;
		case 0:
			System.out.println("\nYou found the " + ((Treasure) t).name
					+ " !\n\n * * * * Quest Finally Completed! * * * *\n\nYou can now turn back to your own world "
					+ p.name + " ...");
			TimeUnit.SECONDS.sleep(4);
			this.gameOver = true;
		}

	}
}
