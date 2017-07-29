package code;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

public class Actioner {

	boolean gameOver;

	public Actioner() {
		this.gameOver = false;
	}

	public void checkEvent(Player p, HashMap<int [], GameObject> m) throws InterruptedException {
		Iterator<Entry<int[], GameObject>> it = m.entrySet().iterator();
		while (it.hasNext()) {
			Entry<int[], GameObject> entry = it.next();
			if (entry.getKey()[0] == p.position[0]&&entry.getKey()[1] == p.position[1]) {

				Object o = entry.getValue();

				if (o instanceof Treasure) {
					open(p, o);
				} else if (o instanceof Enemy) {
					fight(p, o);
				}
			}
		}
	}

	public void fight(Player p, Object e) throws InterruptedException {

		boolean fightOver = false;

		while (!fightOver) {
			System.out.println("\n__" + ((Enemy) e).name + "__ Current Health: " + ((Enemy) e).currentHealth
					+ " Hit Damage: " + ((Enemy) e).hitDamage);
			System.out
					.println("\n__" + p.name + "__ Current Health: " + p.currentHealth + " Hit Damage: " + p.hitDamage);
			TimeUnit.SECONDS.sleep(3);

			System.out.println("Enemy hits!");
			p.currentHealth -= ((Enemy) e).hitDamage;
			if (p.currentHealth <= 0) {
				System.out.println("\n You are dead :(");
				fightOver = true;
				break;
			}
			TimeUnit.SECONDS.sleep(1);
			System.out.println("You hit!");
			((Enemy) e).currentHealth -= p.hitDamage;
			if (((Enemy) e).currentHealth <= 0) {
				System.out.println("\n Enemy defeated :!");
				fightOver = true;
				break;
			}
			TimeUnit.SECONDS.sleep(1);
		}
	}

	public void open(Player p, Object t) {
		switch (((Treasure) t).type) {
		case 1:
			System.out.println(
					"\nYou found a " + ((Treasure) t).name + " ! " + ((Treasure) t).name.split(" ")[0] + " increased");
			p.currentHealth += 25;
			break;
		case 2:
			System.out.println(
					"\n You found a " + ((Treasure) t).name + " ! " + ((Treasure) t).name.split(" ")[0] + " increased");
			p.hitDamage += 25;
			break;
		case 0:
			System.out.println("\nYou found the " + ((Treasure) t).name
					+ " !\n\n * * * * Quest Finally Completed! * * * *\n\n You can now turn back to your own world "
					+ p.name + " ...");
			this.gameOver=true;
		}

	}
}
