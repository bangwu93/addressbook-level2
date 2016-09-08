package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's contact detail in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidPhone(String)}
 */

public class Contact {
	
    public final String value;
    private boolean isPrivate;
	
	public Contact(String contactInput, boolean isPrivate) {
		this.isPrivate = isPrivate;
		this.value = contactInput;
	}
	
    public String toString() {
        return value;
    }
    
    public int hashCode() {
        return value.hashCode();
    }
    
    public boolean isPrivate() {
        return isPrivate;
    }

}