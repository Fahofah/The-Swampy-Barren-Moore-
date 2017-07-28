package code;

public class Runner {

	public static void main(String[] args) {
		
		Player p1 = new Player();
		TheVoid v = new TheVoid();
		Actioner a = new Actioner();
		
		p1.setName(v.openning());
		v.start(p1.getName());
		while(true){
		p1.newMoveDirection=v.mover(p1.getPosition());
		p1.move();
		}
		

	}

}
