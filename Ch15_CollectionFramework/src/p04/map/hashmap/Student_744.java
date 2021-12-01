package p04.map.hashmap;

public class Student_744 {
	public int sno;
	public String name;
	
	public Student_744(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return (sno+name).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student_744) {
			Student_744 student = (Student_744) obj;
			return (this.sno==student.sno && this.name==student.name);
		}
		return false;
	}

}
