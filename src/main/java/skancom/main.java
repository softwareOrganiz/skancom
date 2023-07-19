package skancom;

import java.util.ArrayList;
import java.util.List;
public class main {
	protected static final List<Person> persons=new ArrayList<Person>(); 
	
	
	public static void setPersons() {
		
    Person admin=new Person("admin","Iamadmin","admin");
	Person owner1=new Person("sema","sema123","owner");
	Person tenant1=new Person("muna","muna123","tenant");
	persons.add(admin);
	persons.add(owner1);
	persons.add(tenant1 );
	}
	

}
