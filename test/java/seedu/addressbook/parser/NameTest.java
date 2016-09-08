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
	Name sameName_1;
	Name differentName;
	Name sameName_2;
	Name similar_to_sameName_1;
	Name longName_2;
	Name nameNull;

	@Before
	public void setUp() throws IllegalValueException {
		sameName_1 = new Name("Tan");
		differentName = new Name("Alex");
		sameName_2 = new Name("tAN");
		similar_to_sameName_1 = new Name("ALEXANDER MONEY KOBE tAn");
		longName_2 = new Name("MARY BEN COOKING COMMONWEALTH HEY JONATHAN JOEL");
			
	}
	
	@Test
	public void isSimilar_SameName() {
		assertTrue(sameName_1.isSimilar(sameName_2));
	}
	
	@Test
	public void isSimilar_NullObj() {
		assertFalse(sameName_1.isSimilar(nameNull));
	}
	
	@Test
	public void isSimilar_DifferentName() {
		assertFalse(sameName_1.isSimilar(differentName));
	}
	
	@Test
	public void isSimilar_SimilarName() {
		assertTrue(sameName_1.isSimilar(similar_to_sameName_1));
	}
	
	@Test
	public void isSimilar_DifferentLongName() {
		assertFalse(similar_to_sameName_1.isSimilar(longName_2));
	}
	

}
