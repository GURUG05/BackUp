package com.collections;

import java.util.Objects;

public class Student {
    String name;
    String id;
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student("+ name+ " --" +id +")";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
    
}
