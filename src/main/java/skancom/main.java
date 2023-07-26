package skancom;

import java.util.ArrayList;
import java.util.List;
public class main {
	protected static final List<Person> persons=new ArrayList<Person>(); 
	
	protected static final List<House> Houses=new ArrayList<House>();
	public static void setPersons() {
		
    Person admin=new Person("admin","Iamadmin","admin");
	Person owner1=new Person("sema","sema123","owner");
	Person owner2=new Person("ahmad","ahmad123","owner");
	Person tenant1=new Person("muna","muna123","tenant");
	persons.add(admin);
	persons.add(owner1);
	persons.add(tenant1 );
	persons.add(owner2 );
	}
	
public static void setHouse() {
	 House h1=new House("photo","rafedia","services","1000$","sema");
		
		House h2=new House("photo2","fisal street","services2","2000$","sema");
		House h3=new House("photo3","fisal street","services2","2000$","ahmad");
		Houses.add(h1);
		Houses.add(h2);
		
	
}
}
