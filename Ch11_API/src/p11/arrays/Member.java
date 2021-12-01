package p11.arrays;
//members[0]
//Comparable<T> : natural Order(자연적 순서), 일반적인 정렬시 사용
//Comparator : 특수한 정렬시 사용
public class Member implements Comparable<Member>{
	String name;

	public Member(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {//members[1]
		return this.name.compareTo(o.name);//-1,0,1 값중하나를 가짐
	}
}
