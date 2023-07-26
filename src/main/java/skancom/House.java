package skancom;

public class House {
	private String photo;
	private String location;
	private String services;
	private String monthlyRent;
	private String owner;
	
	public House(String photo, String location, String services, String monthlyRent,String owner) {
		this.photo=photo;
		this.location=location;
		this.services=services;
		this.monthlyRent=monthlyRent;
		this.setOwner(owner);
		
	}
	
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	public String getMonthlyRent() {
		return monthlyRent;
	}
	public void setMonthlyRent(String monthlyRent) {
		this.monthlyRent = monthlyRent;
	}
	
	public void addHouse(House h)
	{
		 
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

}
