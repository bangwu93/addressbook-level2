package seedu.addressbook.parser;

import static org.junit.Assert.*;

import org.junit.Test;

import seedu.addressbook.data.person.Name;
import seedu.addressbook.common.Utils;
import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.*; 

public class UtilsTest {

	@Test
	public void isAnyNullTest() {
			Utils Util = new Utils();
		    Name name = null;
			
			//test case 1: return true for a name that is actually a null
			assertTrue(Utils.isAnyNull(name));
	}
	
	@Test
	public void isAnyNullTest1() {
		try {
			Utils Util = new Utils();
			Name name2 = new Name("Andy Tan");
			Name name3 = new Name("Joshua Soh");
			
			//test case 2: return false if no nulls among objects passed in
			assertFalse(Utils.isAnyNull(name2, name3));
			
		} catch (IllegalValueException e) {
		}
	}
	
	@Test
	public void isAnyNullTest2() {
		try {
			Utils Util = new Utils();
		    Name name = null;
			Name name2 = new Name("Andy Tan");
			Name name3 = new Name("Joshua Soh");
			
			//test case 3: return true if one of the name object is actually null
			assertTrue(Utils.isAnyNull(name, name2, name3));
			
		} catch (IllegalValueException e) {
		}
	}
	

}
