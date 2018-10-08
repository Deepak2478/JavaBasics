package com.sap.training4;

public class Robot {

	private String name;
	private int age;
	private Gender gender;

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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gener) {
		this.gender = gener;
	}

	public void saySomething() {
		if (age < 2) {
			System.out.println("100010101110101"); // Didn't learn English so far
		} else if (age < 18) {
			System.out.println("I'm "+name+ ". Nice to meet you."); // We can use him
		} else {
			System.out.println("We must destroy humans"); // He realized how bad we are
		}
	}

	@Override
	public String toString() {
		return "Android [name=" + name + ", age=" + age + ", gender=" + gender
				+ "]";
	}
}