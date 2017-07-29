package code;

import java.util.ArrayList;

public class Treasure extends GameObject {

	int type;

	public Treasure(int [] position,int type) {
		this.position= position;
		this.type=type;
		switch (type) {
		case 0:
			this.name= "Quest Treasue";
			break;
		case 1:
			this.name= "Health Potion";
			break;
		case 2:
			this.name= "Strengt Potion";
			break;
		}
		
		
	}


}
