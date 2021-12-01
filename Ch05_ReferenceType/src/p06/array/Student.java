package p06.array;

public class Student {
	String name;	//홍길동1, 홍길동2, 홍길동3
	int age;		
	String phoneNumber;
	String specialSkill;
	String address;
	
	//getter()  & setter()
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getSpecialSkill() {
		return specialSkill;
	}
	public void setSpecialSkill(String specialSkill) {
		this.specialSkill = specialSkill;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void print() {
		System.out.println(
				  this.name + "\n"
				+ this.age + "\n"
				+ this.phoneNumber + "\n"
				+ this.specialSkill + "\n"
				+ this.address + "\n"				
				);
	}
	
	
}
