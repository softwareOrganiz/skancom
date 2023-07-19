package skancom;

import java.util.List;

public class Person {
	private String name;
	private String password;

	private String type;
	private int logged;

	

	public Person() {
		this.logged = 0;
	}

	public Person(String name2, String pass, String type2) {

		this.name = name2;
		this.password = pass;
		 
		this.type = type2;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLogged() {
		return logged;
	}

	public void setLogged(int logged) {
		this.logged = logged;
	}

	public static int getIndex(String name, List<Person> persons) {
		int index = -1;

		for (int i = 0; i < persons.size(); i++) {

			if (persons.get(i).getName().equals(name)) {

				return i;
			}
		}

		return index;
	}

	public static boolean isExist(String id2, List<Person> persons) {
		return (getIndex(id2, persons) != -1);
	}

	
}

