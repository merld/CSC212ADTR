package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaList;
import edu.smith.cs.csc212.adtr.real.JavaSet;

public class ChallengesTest {
	
	@Test
	public void testUnion() {
		SetADT<Integer> one = new JavaSet<>();
		one.insert(1);
		one.insert(2);
		SetADT<Integer> two = new JavaSet<>();
		two.insert(2);
		two.insert(3);
		two.insert(4);
		
		SetADT<Integer> ret = Challenges.union(one, two);
		
		assertEquals(true, ret.contains(2));
		assertEquals(4, ret.size());
		
		
	}
	
	@Test
	public void testIntersection(){
		SetADT<Integer> one = new JavaSet<>();
		one.insert(1);
		one.insert(2);
		one.insert(4);
		SetADT<Integer> two = new JavaSet<>();
		two.insert(2);
		two.insert(3);
		two.insert(4);

		SetADT<Integer> ret = Challenges.intersection(one, two);
		
		assertEquals(false, ret.contains(3));
		assertEquals(2, ret.size());
		assertEquals(true, ret.contains(2));
		assertEquals(true, ret.contains(4));
		
	}
	
	@Test
	public void testWordCount() {
		ListADT<String> listy = new JavaList<>();
		listy.addBack("Rask");
		listy.addBack("Marchand");
		listy.addBack("Pastrnak");
		listy.addBack("Rask");
		listy.addBack("Rask");
		listy.addBack("Marchand");
		
		MapADT<String, Integer> ret = Challenges.wordCount(listy);
		
		assertEquals((Integer)3, ret.get("Rask"));
		assertEquals((Integer)2, ret.get("Marchand"));
		assertEquals((Integer)1, ret.get("Pastrnak"));
		assertEquals(3, ret.size());
		
		
	}
	
		
		
}


