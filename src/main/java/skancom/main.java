package skancom;
import java.util.ArrayList;
import java.util.List;
public class main {
	protected static final List<Person> persons=new ArrayList<Person>(); 
	
	protected static final List<House> Houses=new ArrayList<House>();
	protected static final List<tenant> tenants=new ArrayList<tenant>();
	protected static final List<Owner>owners=new ArrayList<Owner>();
	protected static final List<Furniture>furnit=new ArrayList<Furniture>();
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
	 House h1=new House("1","sema","2","4","6","rafedia","2000");
		
		House h2=new House("2"," sema","3","5","7","new nablus","2500");
		House h3=new House("78"," ahmad","2","3","8","tel street","4000");
		Houses.add(h1);
		House.Waitinghouses.add(h2);
		House.Waitinghouses.add(h3);
		
	
}
public static void setTenant() {
	
	
	tenant tenant11=new tenant("muna","20","Computer Engineering","phone: 0598184653");
	tenants.add(tenant11);
}
public static void setOwner() {
	Owner owner11=new Owner("sema","Phone: 0598213954"); 
	owners.add(owner11);
}


}
