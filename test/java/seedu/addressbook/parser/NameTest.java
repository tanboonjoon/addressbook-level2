package seedu.addressbook.parser;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Address;
import seedu.addressbook.data.person.Email;
import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.person.Phone;

public class NameTest {
	Name name1;
	Name name2;
	Name name3;
	Name name4;
	Name name5;
	Name name6;
	Name nameNull;

	@Before
	public void setUp() throws IllegalValueException {
		name1 = new Name("Tan");
		name2 = new Name("Alex");
		name3 = new Name("tAN");
		name4 = new Name("BOON jOon");
		name5 = new Name("ALEXANDER MONEY KOBE tAn");
		name6 = new Name("MARY BEN COOKING COMMONWEALTH HEY JONATHAN JOEL");
			
	}
	
	@Test
	public void isSimilar_SameName() {
		assertTrue(name1.isSimilar(name3));
	}
	
	@Test
	public void isSimilar_NullObj() {
		assertFalse(name1.isSimilar(nameNull));
	}
	
	@Test
	public void isSimilar_DifferentName() {
		assertFalse(name1.isSimilar(name2));
	}
	
	@Test
	public void isSimilar_SimilarName() {
		assertTrue(name1.isSimilar(name5));
	}
	
	@Test
	public void isSimilar_DifferentLongName() {
		assertFalse(name5.isSimilar(name6));
	}
	

}
