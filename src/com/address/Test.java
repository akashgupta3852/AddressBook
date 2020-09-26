package com.address;
import java.util.*;

public class Test implements Comparator<ContactPerson> {
	public int compare(ContactPerson person1, ContactPerson person2) {
		String personName=person1.getFirstName()+" "+person1.getLastName();
		String name=person2.getFirstName()+" "+person2.getLastName();
		return personName.compareTo(name);
	}
	
}
