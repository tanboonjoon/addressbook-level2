/**
 * 
 */
package seedu.addressbook.data.person;

/**
 * represent Street in a address class
 *
 */
public class Street {
	
	private String street;
	
	public Street (){}
	
	public Street(String street) {
		this.street = street;
		
	}
	//getter
	public String getStreet() {
		return street;
	}
	
	//setter
	public void setStreet(String street) {
		this.street = street;
	}
	
	

}
