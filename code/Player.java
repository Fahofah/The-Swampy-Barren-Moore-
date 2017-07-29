package code;

import java.util.Random;

public class Player extends GamePerson  {

	String newMoveDirection;
	private Random randNo = new Random();
	
	public Player(){
		int [] startPos= {0,0};
		this.setPosition( startPos);
		this.maxHealth=100;
		this.currentHealth=this.maxHealth;
		this.hitDamage=20;
	}
	
	
	public void move(){
		
		switch(newMoveDirection){
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
		/*int [] newPos = {0,0};		//{x-Direction,y-Direction}
		
		switch(newMoveDirection){
		case "n": 
			newPos [0] = 0;
			newPos [1] = randNo.nextInt(4)+1;
			break;
		case "s": 
			newPos [0] = 0;
			newPos [1] = (randNo.nextInt(4)+1)*-1;
			break;
		case "w": 
			newPos [0] = (randNo.nextInt(4)+1)*-1;
			newPos [1] = 0;
			break;
		case "e": 
			newPos [0] = randNo.nextInt(4)+1;
			newPos [1] = 0;
			break;
			
		default:
			System.out.println("No movement");
			break;
		}
		this.position[0] += newPos[0] ;
		this.position[1] += newPos[1] ;
		*/
	}
	public void setName(String name){
		this.name=name;
	}
	 public String getName(){
		 return this.name;
	 }
	 
	 public void setPosition(int [] pos){
		 this.position=pos;
	 }
	 
	 public int [] getPosition(){
		 return this.position;
	 }
}
