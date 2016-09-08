package seedu.addressbook.parser;
import java.util.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.common.Utils;

public class UtilsTest {
	private String nullObj;
	private String notNull_1;
	private String notNull_2;
	private String notNull_3;
	private String notNull_1_copy;
	private ArrayList<Object> objList;
	
	@Before public void setUp() {
		nullObj = null;
		notNull_1 = "1";
		notNull_2 = "2";
		notNull_3 = "3";
		notNull_1_copy = "1";
		objList = new ArrayList<Object> ();
	
	}
	//isAnyNull must return true if a null obj is present
	@Test
	public void isAnyNull_HasNullObject() {


		assertTrue(Utils.isAnyNull(nullObj));
	}
	
	//isAnyNull must return false if no null objs is present
	@Test
	public void isAnyNull_HasNoNullObject() {
	
		assertFalse(Utils.isAnyNull(notNull_1));
		
	}
	
	
	//isAnyNull must return true if a null obj is present
	@Test
	public void isAnyNull_HasNullObjects() {


		assertTrue(Utils.isAnyNull(notNull_1, nullObj));
	}
	
	//isAnyNull must return false if no null objs is present
	@Test
	public void isAnyNull_HasNoNullObjects() {
	
		assertFalse(Utils.isAnyNull(notNull_1,notNull_2,notNull_3));
		
	}
	//test that all element are unique, return true
	@Test
	public void elementsAreUnique_Unique() {
		objList.add(notNull_1);
		objList.add(notNull_2);
		objList.add(notNull_3);
		assertTrue(Utils.elementsAreUnique(objList));
	}
	
	//test that duplicate element will return false
	@Test
	public void elementAreUnique_NotUnique() {
		objList.add(notNull_1);
		objList.add(notNull_2);
		objList.add(notNull_1_copy);
		assertFalse(Utils.elementsAreUnique(objList));
	}
	
	//test that empty list will still return true
	@Test
	public void elementAreUnique_ZeroEntry() {
		assertTrue(Utils.elementsAreUnique(objList));
	}

}

