package skancom;

import java.util.Scanner;
import java.util.logging.*;
import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
public class mainFunc {
	static Person user =new Person();

	public static void main(String[] args) {

		
		int x,y;
		
		String in;
		
		
		Scanner input = new Scanner(System.in);
		String id;
		String name;
		String password;
		int logged = 0;/*flag*/
		String stat;/*type*/
		Logger logger = Logger.getLogger(mainFunc.class.getSimpleName());
		
		main.setPersons();
		main.setHouse();
		main.setOwner();
		main.setTenant();

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
				logger.log(Level.INFO,
						"|\t\t\t\t\t\t\t\t\t\t\t\t Welcome Back "+user.getName()+"                                              |");
				logger.log(Level.INFO, "\n");
				logger.log(Level.INFO, "\n");
				logger.log(Level.INFO, "\n");
			}
			if (stat.equalsIgnoreCase("owner")) {
				while (logged == 1) {
					logger.log(Level.INFO, "To see your housing enter 1");
					logger.log(Level.INFO, "To add new housing enter 2");
					
					logger.log(Level.INFO, "Enter 0 to log out");
					
					x = input.nextInt();
					
				 if(x==0) {
						logged=0;
					}
					else {
							logger.log(Level.INFO, "Enter valid number");
							logger.log(Level.INFO, "\n");
						}	
					
				}}
			if (stat.equalsIgnoreCase("tenant")) {
				while (logged == 1) {
					logger.log(Level.INFO, "To see the available housing enter 1");
					logger.log(Level.INFO, "Io advertise your own used furniture for sale enter2");
					logger.log(Level.INFO, "Enter 0 to log out");
					
					x = input.nextInt();
					if (x == 1) {
						for(int i=0;i<main.Houses.size();i++) {
						if(main.Houses.get(i).getTenant()==null)
						{
							logger.log(Level.INFO,"House"+main.Houses.get(i).getId());
							
						}}
						
						logger.log(Level.INFO,"enter the House id to show more information");
						id=input.next();
						for(int i=0;i<main.Houses.size();i++) {
							if(main.Houses.get(i).getId().equals(id)) {
								logger.log(Level.INFO,main.Houses.get(i).getPhoto());
								logger.log(Level.INFO,main.Houses.get(i).getLocation());
								logger.log(Level.INFO,main.Houses.get(i).getMonthlyRent());
								logger.log(Level.INFO,main.Houses.get(i).getServices());
							
							logger.log(Level.INFO, "To book this house enter 1");
							logger.log(Level.INFO, "To go back inter 2");
							y=input.nextInt();
							if(y==1)
							{
							main.Houses.get(i).setTenant(name);
							logger.log(Level.INFO, "you booked the house successfully");
							for(int j=0;j<main.tenants.size();j++) {
								if(main.tenants.get(j).getName().equals(name))	{
								
									logger.log(Level.INFO,"your name is: "+main.tenants.get(j).getName());
									logger.log(Level.INFO,"your sge is: "+main.tenants.get(j).getAge());
									logger.log(Level.INFO,"your major is: "+main.tenants.get(j).getMajor());
								
								}
							}
							
								
							
							for(int s=0;s<main.Houses.size();s++) {
								if(main.Houses.get(s).getTenant()==name) {
									logger.log(Level.INFO,"paid time: "+main.Houses.get(s).getPaidTime());	
								}
							}
							for(int t=0;t<main.Houses.size();t++) {
								if(main.Houses.get(t).getId().equals(id)) {
									logger.log(Level.INFO,"the owner name is:  "+main.Houses.get(t).getOwner());
									int s=tenant.findByName(main.Houses.get(t).getOwner());
									logger.log(Level.INFO,"the owner Phone number is:  "+main.tenants.get(s).getContactInfo());
								}
									
								}
							}
							else
								continue;
							
							
							}
						}
					
					}
					else if(x==2)
					{
						logger.log(Level.INFO,"write a description about your furniture");
						String desc=input.next();
						logger.log(Level.INFO,"enter the price");
						String price=input.next();
						Furniture f=new Furniture(desc,price);
						main.furnit.add(f);
						logger.log(Level.INFO,"you advertise your own used furniture for sale successfully");
					}
					else if(x==0) {
						logged=0;
					}
					else {
							logger.log(Level.INFO,"enter valid number");
							logger.log(Level.INFO, "\n");
						}	
					
				}
				
				
			}
			else if(stat.equalsIgnoreCase("admin")) {
				logger.log(Level.INFO,"to see the reservations enter 1");
				
				x=input.nextInt();
				if(x==1) {
					for(int i=0;i<main.Houses.size();i++) {
					if(main.Houses.get(i).getTenant()!=null)
					{
						
						logger.log(Level.INFO,main.Houses.get(i).getLocation());
						logger.log(Level.INFO,main.Houses.get(i).getMonthlyRent());
						logger.log(Level.INFO,main.Houses.get(i).getServices());
						logger.log(Level.INFO,main.Houses.get(i).getTenant());
					}}
				}
			}


}}}
