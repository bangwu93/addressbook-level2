package seedu.addressbook.data.person;

public interface Printable {
	Name getName();
	Email getEmail();
	Phone getPhone();
	Address getAddress();
	
	public String getPrintable();
}
