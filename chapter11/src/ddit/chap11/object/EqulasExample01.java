package ddit.chap11.object;

import java.util.Set;
import java.util.TreeSet;

public class EqulasExample01 { //주소도 같고 내용도 같으면 같은객체로 취급

	public static void main(String[] args) {
		Set<Person> set=new TreeSet<>(); //Person만 접근 가능하게 해줌
		// set 쓸때 요구되어짐
		
		Person p1=new Person("이순신");		
		Student s1=new Student();
		set.add(new Person("홍길동"));
		set.add(new Person("홍길자"));
		set.add(new Person("정몽주"));
		set.add(new Person("홍길순"));
		set.add(new Person("홍길동"));
		set.add(new Person("홍길자"));
		
		System.out.println(set);
		System.out.println(s1);
		System.out.println(p1.getClass().getCanonicalName()+"@"
							+p1.hashCode());
		//Object 클래스가 가지고 있는 원래의 toString 메소드
		
		
	}
}

class Person implements Comparable{ // Comparable 구현되어 있어야함
	String name;
	
	Person(String name){
		this.name=name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false; //upcasting해서 비교
		Person tmp=(Person) obj; //다시 downcasting해줌  name 꺼내려고
		return name.equals(tmp.name); //String class가 가지고 있는 eqauls 메소드
		}	
		
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Person) {
			Person p=(Person)obj; //같으면 덮어씀
			return name.compareTo(p.name);
		}else {
			return -1;
		}
	}

}

class Student{}

