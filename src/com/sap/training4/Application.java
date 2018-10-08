package com.sap.training4;


	public class Application {

		public static void main(String[] args) {		
			
			Robot luke = RobotFactory.createBabyRobot("Luke", Gender.MALE);
			Robot leia = RobotFactory.createBabyRobot("Leia", Gender.FEMALE);
			Robot anakin = RobotFactory.createYoungRobot("Anakin",Gender.MALE);
			Robot kenobi = RobotFactory.createOldRobot("Kenobi", Gender.MALE);
			Robot joda = RobotFactory.createOldRobot("Joda", Gender.MALE);

			System.out.println("We have created "
					+ RobotFactory.getRobotCounter() + " androids.");

			
			luke.saySomething();
			leia.saySomething();
			anakin.saySomething();
			kenobi.saySomething();
			joda.saySomething();
		}
	}

