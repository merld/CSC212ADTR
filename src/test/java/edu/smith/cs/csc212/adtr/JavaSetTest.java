package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {
	
	//size
	//insert
	//contains
	//remove
	
	
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		assertEquals(0, empty.size());
	}
	
	@Test
	public void testSize1() {
		SetADT<String> single = new JavaSet<>();
		single.insert("A");
		assertEquals(1, single.size());
		
	}
	
	@Test
	public void testSize4() {
		SetADT<String> four = new JavaSet<>();
		four.insert("a");
		four.insert("b");
		four.insert("c");
		four.insert("d");
		assertEquals(4, four.size());
	}
	
	@Test
	public void testInsert() {
		SetADT<String> one = new JavaSet<>();
		one.insert("mld");
		assertEquals(1, one.size());
		assertEquals(true, one.contains("mld"));
	}
	
	@Test
	public void testRepeatedInserts() {
		SetADT<String> repeat = new JavaSet<>();
		repeat.insert("A");
		repeat.insert("B");
		repeat.insert("C");
		for(int i = 0;i<33;i++)
			repeat.insert("A");
		assertEquals(3, repeat.size());
	}
	
	@Test
	public void testContains() {
		SetADT<String> letters = new JavaSet<>();
		letters.insert("L");
		letters.insert("M");
		letters.insert("N");
		assertEquals(true, letters.contains("L"));
		assertEquals(true, letters.contains("M"));
		assertEquals(true, letters.contains("N"));
		assertEquals(false, letters.contains("A"));
	}
	
	@Test
	public void testRemove() {
		SetADT<String> letters = new JavaSet<>();
		letters.insert("L");
		letters.insert("M");
		letters.insert("N");
		letters.remove("M");
		assertEquals(2, letters.size());
		assertEquals(false, letters.contains("M"));
	}
	
}
