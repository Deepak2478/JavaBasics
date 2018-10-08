package com.sap.training4;

public class RobotFactory {

	private static int counter = 0;

	public static Robot createBabyRobot(String name, Gender gender) {
		Robot android = new Robot();
		android.setAge(0);
		android.setGender(gender);
		android.setName(name);
		counter++;
		return android;
	}

	public static Robot createYoungRobot(String name, Gender gender) {
		Robot android = new Robot();
		android.setAge(10);
		android.setGender(gender);
		android.setName(name);
		counter++;
		return android;
	}

	public static Robot createOldRobot(String name, Gender gender) {
		Robot android = new Robot();
		android.setAge(55);
		android.setGender(gender);
		android.setName(name);
		counter++;
		return android;
	}

	public static int getRobotCounter() {
		return counter;
	}

}
