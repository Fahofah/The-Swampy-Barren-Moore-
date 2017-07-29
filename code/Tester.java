package code;

import static org.junit.Assert.*;

import java.security.KeyStore.Entry;

import java.util.HashMap;
import java.util.Iterator;

import org.junit.Test;

public class Tester {
	
	Treasure t1=new Treasure (new int [] {1,1},2);
	Treasure t2=new Treasure (new int [] {1,2},1);
	Enemy e1 = new Enemy("Rodo",new int []{-1,-1},2);
	Lister l = new Lister();

	@Test
	public void testEnemyLeveling() { //Trough Constructor
		
		assertEquals("current health to max health error",e1.currentHealth,50);
		assertEquals("hit damege error",e1.hitDamage,10);
	}

	@Test
	public void testObject() { //From location key map
		
		
		l.addToList(t1);
		l.addToList(t2);
		int [] tl1 = t1.position;
		int [] tl2 = t2.position;
		
		assertEquals(l.list.get(tl1),t1);
		assertEquals(l.list.get(tl2),t2);
		}
	@Test
	public void testAttribute() { //From map object (Cast)
		l.addToList(e1);
		l.addToList(t2);
		int[] tl1=e1.position;
		int [] tl2 = new int [] {1,2};
	
		
		assertEquals(((Enemy)l.list.get(tl1)).currentHealth ,50);
		assertEquals(((Treasure)l.list.get(tl2)).name ,"Strenght Potion");
		
	}
}
