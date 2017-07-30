package code;

public class Runner {

	public static void main(String[] args) throws InterruptedException {

		// Construct and initialise game objects and classes
		Player p = new Player();
		TheVoid v = new TheVoid();
		Actioner a = new Actioner();
		Lister l = new Lister();
		Compass c = new Compass();
		Treasure tq = new Treasure(new int[] { 7, 9 }, 0);
		Treasure t1a = new Treasure(new int[] { 1, 1 }, 1);
		Treasure t2a = new Treasure(new int[] { 6, 7 }, 2);
		Treasure t1b = new Treasure(new int[] { 3, 8 }, 1);
		Enemy e1a = new Enemy("Rodo", new int[] { -1, -1 }, 1);
		Enemy e1b = new Enemy("Rodo", new int[] { 3, 0 }, 1);
		Enemy e2a = new Enemy("Rodo", new int[] { 1, 4 }, 2);
		Enemy e2b = new Enemy("Rodo", new int[] { 5, 3 }, 2);
		Enemy e3a = new Enemy("Rodo", new int[] { 7, 8 }, 3);
		Enemy e4a = new Enemy("Rodo", new int[] { 1, 9 }, 4);
		Enemy e4b = new Enemy("Rodo", new int[] { 7, 8 }, 4);
		Enemy e4c = new Enemy("Rodo", new int[] { 6, 9 }, 4);

		// Add game objects too the game (map)
		l.addToList(tq);
		l.addToList(t1a);
		l.addToList(t1b);
		l.addToList(t2a);
		l.addToList(e1a);
		l.addToList(e1b);
		l.addToList(e2a);
		l.addToList(e2b);
		l.addToList(e3a);
		l.addToList(e4a);
		l.addToList(e4b);
		l.addToList(e4c);

		// Start the game with opening script and get individual player name
		p.setName(v.openning());
		v.start(p.getName());

		// Get into game loop which executes game actions and terminates when player
		// reaches 0 health or finds treasure quest
		do {
			do {
				c.showRoute(p, tq);
				p.newMoveDirection = v.mover(p.getPosition());
				p.move();
				a.checkEvent(p, l.list);
			} while (!a.gameOver);
			v.askReplay(p.name);
			p.position[0] = 0;
			p.position[1] = 0;
			a.gameOver = false;
		} while (v.replay);
	}

}
