package skancom;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//@SuppressWarnings("unused")
public class mainFunc{
	static Person user =new Person();

	@SuppressWarnings({ "resource" })
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
		main.setHouse(); // will put houses at the waiting list 

		logger.log(Level.INFO, "\n");

		logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\tWelcome to  skancom foundation\t\t\t\t\t\t\t\t\t\t\t\t");
		logger.log(Level.INFO, "\n");

		while (logged == 0) {
		
			logger.log(Level.INFO, ""); 
			logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\tEnter your username\t\t\t\t\t\t\t\t\t\t\t\t\t");
			//logger.log(Level.INFO,"|_______________________________________________________________________________________________________________________________|");
			name = input.nextLine();
			logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\tEnter your password\t\t\t\t\t\t\t\t\t\t\t\t\t");
			password = input.nextLine();
		   
			stat = Admin.login(name, password,main.persons);
			if (stat.equals("false")) {
				logged = 0;
				logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\tLogin faild\t\t\t\t\t\t\t\t\t\t\t\t");

			} else {
				logged = 1;
				user = main.persons.get(Person.getIndex(name, main.persons));
				
				//logger.log(Level.INFO,"______________________________________________________________________________________________________________________________|");
				logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\tWelcome Back "+user.getName());
				/*logger.log(Level.INFO, "\n");
				logger.log(Level.INFO, "\n");*/
				logger.log(Level.INFO, "\n");
			}
			if (stat.equalsIgnoreCase("owner")) {
				while (logged == 1) {
					logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t press 1. To add new house\t\t\t\t\t\t\t\t\t\t\t\t\t|");
					logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       2. To update puplished info\t\t\t\t\t\t\t\t\t\t\t\t\t|");
					logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       3. To update unpuplished info\t\t\t\t\t\t\t\t\t\t\t\t\t|");
					logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       4. To view your published housing\t\t\t\t\t\t\t\t\t\t\t\t\t|");
					logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       5. To view your unpublished housing\t\t\t\t\t\t\t\t\t\t\t\t\t|");
					logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       6. To view your booked housing\t\t\t\t\t\t\t\t\t\t\t\t\t|");
					logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       0. log out\t\t\t\t\t\t\t\t\t\t\t\t\t|");
					x = input.nextInt();
					
					if (x == 1) {

						House ex=new House();
						in = input.nextLine();
						logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t Enter Information : ID");
						in = input.nextLine();
						if (House.isExistHouse(in , House.Waitinghouses )) {
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t this Id already exist");
							logger.log(Level.INFO, "\n");
						} else {
							ex.setOwner(name);
							ex.setid(in);
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t Location");
							in = input.nextLine();
							ex.setLocation(in);

							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t number of floors");
							in = input.nextLine();
							ex.setnumfloors(in);

							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t number of bedrooms");
							in = input.nextLine();
							ex.setnumbedrooms(in);

							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t number of bathrooms");
							in = input.nextLine();
							ex.setnumbathrooms(in);
							
							logger.log(Level.INFO, "\t\t\t\\t\t\t\t\t\t number of monthlyrent");
							in = input.nextLine();
							ex.setMonthlyRent(in);
							
							ex.createHouse(ex, House.Waitinghouses);
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t\t  Added successfully to the waiting list");

						}

					}
					
					else if (x == 2 || x == 3) {
						List <House> testt = new ArrayList<House>();
						if (x== 2) {testt = main.Houses;}  
						else {testt = House.Waitinghouses;}
						logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t press 1. To update the photo \t\t\t\t\t\t\t\t\t\t\t\t\t|");
						logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       2. To update the location \t\t\t\t\t\t\t\t\t\t\t\t\t|");
						logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       3. To update the available services \t\t\t\t\t\t\t\t\t\t\t\t\t|");
						logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       4. To update the monthlyrent \t\t\t\t\t\t\t\t\t\t\t\t\t|");
						logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       5. To update the contact information \t\t\t\t\t\t\t\t\t\t\t\t\t|");
						String id;
						x = input.nextInt();
						//x = input.nextInt();
						if (x == 1) {
								logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t What house id do you want to update");
							id = input.nextLine();
						
							id = input.nextLine();
							if (!House.checkIsExist1(id, testt)) {
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t No house with this id");
							logger.log(Level.INFO, "\n");
							logger.log(Level.INFO, "\n");
						} else {
								logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t new photo: ");
								in = input.nextLine();
								House.updatePhoto(id, in,testt );
								logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t Update photo successfully");
							}
						}
						else if(x == 2) {
							
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t What house id do you want to update");
						id = input.nextLine();
						id = input.nextLine();

						if (!House.isExistHouse(id,testt)) {
						logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t No house with this id");
						logger.log(Level.INFO, "\n");
						logger.log(Level.INFO, "\n");
					} else {
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t new location: ");
							in = input.nextLine();
							House.updateloc(id,in, testt);
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t Update Location successfully");
						}
					}
						else if(x == 3) {
							
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t What house id do you want to update");
						id = input.nextLine();
					
						id = input.nextLine();
						if (!House.isExistHouse(id, testt)) {
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t No house with this id");
						logger.log(Level.INFO, "\n");
						logger.log(Level.INFO, "\n");
					} else {
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t new available services: ");
							in = input.nextLine();
							House.updateservices(id, in, testt);
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t Update services successfully");
						}
					}
                        else if(x == 4) {
							
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t What house id do you want to update");
						id = input.nextLine();	id = input.nextLine();
					

						if (!House.isExistHouse(id, testt)) {
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t No house with this id");
						logger.log(Level.INFO, "\n");
						logger.log(Level.INFO, "\n");
					} else {
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t new monthlyrent: ");
							in = input.nextLine();
							House.updaterent(id, in, testt);
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t Update monthlyrent successfully");
						}
					}
						
                        else if(x == 5) {
							
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t What house id do you want to update");
						id = input.nextLine();	id = input.nextLine();
					

						if (!House.isExistHouse(id, testt)) {
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t No house with this id");
						logger.log(Level.INFO, "\n");
						logger.log(Level.INFO, "\n");
					} else {
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t new contact info: ");
							in = input.nextLine();
							House.updatecontactinfo(id, in, testt);
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t Update contact info successfully");
						}
					}
						
						
					}

					else if (x == 4 || x == 5 ) { //done
						List <House> test = new ArrayList<House>();
						if (x == 4) {test = main.Houses;}  
						else if (x ==5 ) {test = House.Waitinghouses;}
						for(int i=0;i<test.size();i++)
						if(test.get(i).getOwner()== name)
						{
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t ID:"+test.get(i).getid());
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t Location:"+test.get(i).getLocation());
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t number of monthlyrent:"+test.get(i).getMonthlyRent());
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t number of floors:"+test.get(i).getnumfloors());
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t number of bedrooms:"+test.get(i).getnumbedrooms());
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t number of bathrooms:"+test.get(i).getnumbathrooms());
						
						}
						
					
					}
					else if(x == 6){} //book accomodation for the owner 
					else if(x==0) {
						logged=0;
					}
					else {
							logger.log(Level.INFO, "Enter valid number");
							logger.log(Level.INFO, "\n");
						}	
					
				}}
			else if (stat.equalsIgnoreCase("admin")) {
				while (logged == 1) {
				logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t press 1. To watch all reservation\t\t\t\t\t\t\t\t\t\t\t\t\t|");
				logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       2. To show housing on the waiting list for your acceptance :) \t\t\t\t\t\t\t\t\t\t\t\t\t|");
				logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       0. log out\t\t\t\t\t\t\t\t\t\t\t\t\t|");

				x = input.nextInt();
				
				if (x == 1) {} //sema
				else if (x==2) {
					House.printallWaitingList();
				
					String id;
					logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t What house id do you want to show?");
					id = input.nextLine();	id = input.nextLine();
				

					if (!House.isExistHouse(id, House.Waitinghouses)) {
						logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t No house with this id");
					logger.log(Level.INFO, "\n");
					logger.log(Level.INFO, "\n");
				} else {
				House.printHouse(id,House.Waitinghouses);
				int r;
				logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t if you want to accept click 1, to reject click 2");
				r = input.nextInt();
				if (r== 1) {
					 House.transferHouse(id, House.Waitinghouses, main.Houses);
					
				}else {
					logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t House is rejected !!");
					House.deleteHouseFromWaitingList(id);
				}

				}
				
					
					}else if (x ==0) { logged =0;
					}
					
					
			}}
				
			}
			
			


}}