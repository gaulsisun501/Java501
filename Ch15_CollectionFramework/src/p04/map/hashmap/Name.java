package p04.map.hashmap;

import p03.set.hashset.Person;

public class Name {
	String firstName; //이름
	String lastName; //성
	
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public int hashCode() {
		
		return firstName.hashCode()+lastName.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Name) {
			Name p = (Name) obj;
			return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName);
		}
		return false;
	}
	
}
