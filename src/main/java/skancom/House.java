package skancom;

public class House {
	private String photo;
	private String location;
	private String services;
	private String monthlyRent;
	private String owner;
	private String id_house;
	private static int currentId=0;
	private String tenant;
	private String paidTime;
	private String numfloors;
	private String bedrooms;
	private String bathrooms;
	
	
	public House()
	{
		
	}
	public House(String photo, String location, String services, String monthlyRent,String owner,String paidTime) {
		this.photo=photo;
		this.location=location;
		this.services=services;
		this.monthlyRent=monthlyRent;
		this.setOwner(owner);
		this.id_house=String.valueOf(++currentId);
		this.paidTime=paidTime;
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

	public String getTenant() {
		return tenant;
	}

	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public String getId() {
		return id_house;
	}

	public String getPaidTime() {
		return paidTime;
	}
	public void setPaidTime(String P) {
		this.paidTime=P;
	}

	


	
}
