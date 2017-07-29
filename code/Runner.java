package code;

import javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder;

public class Runner {

	public static void main(String[] args) throws InterruptedException {

		Player p = new Player();
		TheVoid v = new TheVoid();
		Actioner a = new Actioner();
		Treasure t0 = new Treasure(new int [] {2,8},0); 
		Treasure t = new Treasure(new int[] { 1, 1 }, 2);
		Enemy e1 = new Enemy("Rodo", new int[] { -1, -1 }, 4);
		Lister l = new Lister();
		Compass c = new Compass();

		l.addToList(t0);
		l.addToList(t);
		l.addToList(e1);

		p.setName(v.openning());
		v.start(p.getName());

		do {
			c.showRoute(p, t0);
			p.newMoveDirection = v.mover(p.getPosition());
			p.move();
			a.checkEvent(p, l.list);
		} while (!a.gameOver);

	}

}
