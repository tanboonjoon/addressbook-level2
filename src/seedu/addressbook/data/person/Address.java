package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses must be in STREET, UNIT, BLOCK_NUMBER, POSTAL_CODE format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";
    
    public static final int INDEX_OF_STREET = 0;
    public static final int INDEX_OF_BLOCK = 1;
    public static final int INDEX_OF_UNIT = 2;
    public static final int INDEX_OF_POSTALCODE= 3;
    public static final int TOTAL_ADDRESS_PARTS = 4;


    private boolean isPrivate;
    
    //The String value of various address class
    public final String value;
    private  Street street;
    private  Block block;
    private Unit unit;
    private PostalCode postalCode;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (!isValidAddress(address)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        this.value = address;
        
        if(!hasValidAddressParts(address)) {
        	throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        } else {
            String[] addressArr = this.value.split(",");
            street = new Street(addressArr[INDEX_OF_STREET].trim());
            block = new Block(addressArr[INDEX_OF_BLOCK].trim());
            unit = new Unit(addressArr[INDEX_OF_UNIT].trim());
            postalCode = new PostalCode(addressArr[INDEX_OF_POSTALCODE].trim());
        
        }
        
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }
    
    public static boolean hasValidAddressParts(String address) {
    	return address.split(",").length == 4;
    }
    

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }

	public Block getBlock() {
		return block;
	}

	public Street getStreet() {
		return street;
	}

	public Unit getUnit() {
		return unit;
	}

	public PostalCode getPostalCode() {
		return postalCode;
	}
    
    


}