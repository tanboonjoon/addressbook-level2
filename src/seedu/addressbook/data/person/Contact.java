package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {
	public String value;
	private boolean isPrivate;
	
	public static String MESSAGE_CONTACT_CONSTRAINTS;
	public static String CONSTRAINTS_VALIDATION_REGEX;
	
	
	public Contact() {}
	
	public Contact(String contactInfo, boolean isPrivate, String msgConstraints, 
			String validationRegex) throws IllegalValueException{
		
		this.isPrivate = isPrivate;
		MESSAGE_CONTACT_CONSTRAINTS = msgConstraints;
		CONSTRAINTS_VALIDATION_REGEX = validationRegex;
		
		contactInfo = contactInfo.trim();
		if(!isValidData(contactInfo)) {
			throw new IllegalValueException(MESSAGE_CONTACT_CONSTRAINTS);
		}
		this.value = contactInfo;
	}
	
	public String toString() {
		return value;
	}
	
	public boolean equals(Object other) {
		return other == this
				|| (other instanceof Contact
				&& this.value.equals(((Contact) other).value));
	}
	
	public int hashCode() {
		return value.hashCode();
	}
	
	public boolean isPrivate() {
		return isPrivate;
	}
	public static boolean isValidData(String test) {
		return test.matches(CONSTRAINTS_VALIDATION_REGEX);
	}
	
	
	
	

}
