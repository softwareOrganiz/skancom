package skancom;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
public class mainFunc {
	static Person user =new Person();

	public static void main(String[] args) {

		
		int x;
		String in;
		
		
		Scanner input = new Scanner(System.in);
		String name;
		String password;
		int logged = 0;/*flag*/
		String stat;/*type*/
		Logger logger = Logger.getLogger(mainFunc.class.getSimpleName());
		main.setPersons();

		logger.log(Level.INFO, "\n");

		logger.log(Level.INFO,
				"|\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome to  skancom foundation\t\t\t\t\t\t\t\t\t\t\t\t|");
		logger.log(Level.INFO, "\n");

		while (logged == 0) {
			logger.log(Level.INFO, ""); 
			logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t\t\t\tEnter your username\t\t\t\t\t\t\t\t\t\t\t\t\t|");
			logger.log(Level.INFO,
					"|_______________________________________________________________________________________________________________________________|");
			name = input.nextLine();
			logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t\t\t\tEnter your password\t\t\t\t\t\t\t\t\t\t\t\t\t|");
			password = input.nextLine();
		   
			stat = Admin.login(name, password,main.persons);
			if (stat.equals("false")) {
				logged = 0;
				logger.log(Level.INFO,
						"|\t\t\t\t\t\t\t\t\t\t\t\tLogin faild\t\t\t\t\t\t\t\t\t\t\t\t|");

			} else {
				logged = 1;
				user = main.persons.get(Person.getIndex(name, main.persons));
				
				logger.log(Level.INFO,
						"|______________________________________________________________________________________________________________________________|");
				logger.logp(Level.INFO,
						"|\t\t\t\t\t\t\t\t\t\t\t\t Welcome Back\t\t\t\t\t\t\t\t\t\t\t\t ",
						user.getName(), "                                              |");
				logger.log(Level.INFO, "\n");
				logger.log(Level.INFO, "\n");
				logger.log(Level.INFO, "\n");
			}
			if (stat.equalsIgnoreCase("owner")) {
				while (logged == 1) {
					logger.log(Level.INFO, "To see your housing enter 1");
					logger.log(Level.INFO, "To add new housing 1");
					
					logger.log(Level.INFO, "Enter 0 to log out");
					
					x = input.nextInt();
					if (x == 1) {
						
					
					}
					else if(x==0) {
						logged=0;
					}
					else {
							logger.log(Level.INFO, "Enter valid number");
							logger.log(Level.INFO, "\n");
						}	
					
				}}


}}}
