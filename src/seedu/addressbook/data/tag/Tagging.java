package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
	
	private Person person;
	private Tag tag;
	private String operatorType;
	
	private static final String TAGGING_ADDED = "+";
	private static final String TAGGING_REMOVED = "-";
	
	public Tagging(Person person, Tag tag ,String operatorType) {
		this.person = person;
		this.tag = tag;
		this.operatorType = operatorType;
		
	}
	
	public String toString() {
		String tagMsg = "" ;
		switch(operatorType) {
		case TAGGING_ADDED:
			tagMsg = TAGGING_ADDED + " " + person.getName() + " " + tag.toString();
			break;
		case TAGGING_REMOVED:
			tagMsg = TAGGING_REMOVED  + " " + person.getName() + " " + tag.toString();
			break;
		}
		return tagMsg;
	}
	

	

	
	
	

}
