package code;

import java.util.HashMap;

public class Lister {

	HashMap<int[], GameObject> list = new HashMap<int[], GameObject>();

	public Lister() {
	}
	
	//Adds game objects to the map
	public void addToList(GameObject o) {
		list.put(o.position, o);
	}

	public HashMap<int[], GameObject> getList() {
		return list;
	}

}
