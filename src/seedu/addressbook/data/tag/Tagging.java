package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.person.Person;

public class Tagging {
	
	Name name;
	Tag tag;
	//isValid tells us whether the tag is still available after the change occurred.
	boolean isValid;
	
/*
 * object will be initialised whenever a tag is added or removed. the method called to do so will provide a reference to 
 * the tag object, the person object, as well as whether the affected tag's validity to the person.
 */
	public Tagging(Tag tagAffected, Person person, boolean validity) {
		name = person.getName();
		isValid = validity;
		tag = tagAffected;
	}
	
	public String outputTaggings() {
		String output = "";
		if (isValid) {
			output += "+ ";
		} else output += "- ";
		
		output += name.toString();
		output += tag.toString();
		
		return output;
	}

}
