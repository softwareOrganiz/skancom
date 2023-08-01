package skancom;

public class Furniture {
	private String description;
	private String price;
	
	public Furniture(String desc,String price){
		this.setDescription(desc);
		this.setPrice(price);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	

}
