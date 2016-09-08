package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";

    public final String value;
    private boolean isPrivate;
<<<<<<< HEAD

=======
    public Block block = null;
    public PostalCode postalCode = null;
    public Street streetName = null;
    public Unit unitName = null;
 
>>>>>>> a566dd6... Added null-pointers to new classes used for implementing encapsulation for Address Class, and added getter function for Address class to retrieve address in string  format.
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
<<<<<<< HEAD
        this.value = address;
=======
        value = address;
        
        String[] addressParts = value.split(",");
        
        if (addressParts.length > 0)
        block = new Block(addressParts[0]);
        if (addressParts.length > 1)
        streetName = new Street(addressParts[1]);
        if (addressParts.length >2)
        unitName = new Unit(addressParts[2]);
        if (addressParts.length >3)
        postalCode = new PostalCode(addressParts[3]);
    }
    
    public String formulateAddress() {
    	String output ="";
    	if (block != null)
    		output = output + " " + block.getBlockNumber();
    	if (streetName != null)
    		output = output + " " + streetName.getstreetName();
    	if (unitName != null)
    		output = output + " " + unitName.getunitNumber();
    	if (postalCode != null)
    		output = output + " " + postalCode.getPostalCodeNumber();
    	return output;
>>>>>>> a566dd6... Added null-pointers to new classes used for implementing encapsulation for Address Class, and added getter function for Address class to retrieve address in string  format.
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return value;
=======
        	String output = "";
       	if (block != null)
           output = output + " " + block.getBlockNumber();
       	if (streetName != null)
           output = output + " " + streetName.getstreetName();
       	if (unitName != null)
           output = output + " " + unitName.getunitNumber();
       	if (postalCode != null)
           output = output + " " + postalCode.getPostalCodeNumber();
       	return output;
       // return value;
>>>>>>> a566dd6... Added null-pointers to new classes used for implementing encapsulation for Address Class, and added getter function for Address class to retrieve address in string  format.
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
}