/**
 * 
 */
package seedu.addressbook.data.person;

/**
 * Represent Postal code in a address
 *
 */
public class PostalCode {
	
	private String postalCode;
	
	public PostalCode() {}
	
	public PostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	//getter method
	public String getPostalCode() {
		return postalCode;
	}
	//setter method
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	

}
