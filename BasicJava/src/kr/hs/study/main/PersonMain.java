package kr.hs.study.main;

import kr.hs.study.beans.Person;

public class PersonMain {
	public static void main(String[] args) {
		Person person=new Person("lee",25);
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
	}
}
