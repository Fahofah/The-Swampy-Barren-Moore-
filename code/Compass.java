package code;

public class Compass {
	
	public Compass() {}

	public void showRoute(Player p, Treasure t) {
		int xDist = t.position[0] - p.position[0];
		int yDist = t.position[1] - p.position[1];
		double  dist = Math.sqrt((xDist * xDist) + (yDist * yDist));
		String direction = "";

		if (yDist < 0) {
			direction += "South";
		} else if (yDist > 0) {
			direction += "North";
		}
		if (xDist < 0) {
			direction += " West";
		} else if (xDist > 0) {
			direction += " East";
		}

		System.out.println("\n" + dist + " m "+direction +"\n");
	}
}
