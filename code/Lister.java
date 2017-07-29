package code;


//import java.util.ArrayList;
import java.util.HashMap;

public class Lister {

	HashMap <int [], GameObject> list = new HashMap <int [], GameObject>();
//	ArrayList <Treasure> treasureList = new ArrayList <Treasure>();
//	ArrayList <Enemy> enemyList = new ArrayList <Enemy>();
	
	public Lister() {
		
	}
	
	public void addToList(GameObject o) {
		list.put(o.position, o);
	}
	
//	public void addTreasure(Treasure t) {
//		treasureList.add(t);
//	}
//	
//	public void addEnemy(Enemy e) {
//		enemyList.add(e);
//	}
	
	
	public HashMap<int [], GameObject> getList() {
		return list;
	}
	
	
}
