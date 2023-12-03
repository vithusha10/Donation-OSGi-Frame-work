package serviceorphanage;

public class OrphanageDonation {

	private String organaizationName;
	private String name;
	private String work;
	private String country;
	private Double amount;
	
	public OrphanageDonation() {
		
	}

	public OrphanageDonation(String organaizationName, String name, String work, String country, Double amount) {
		super();
		this.organaizationName = organaizationName;
		this.name = name;
		this.work = work;
		this.country = country;
		this.amount = amount;
	}
	

	public String getOrganaizationName() {
		return organaizationName;
	}
	
	public void setOrganaizationName(String organaizationName) {
		this.organaizationName = organaizationName;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getWork() {
		return work;
	}
	
	public void setWork(String work) {
		this.work = work;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
		
	@Override
	public String toString() {
		return "\n\n" +
				"----------------------------------------------------\n" +
				"|             orphanage Donation Receipt           |\n" + 
				"----------------------------------------------------\n" +
				"\tDonee Name : " + this.organaizationName + "\n" + 
				"\tDonar Name : " + this.name + "\n" + 
				"\tWork : " + this.work + "\n" + 
				"\tCountry : " + this.country + "\n" + 
				"\tAmount : " + String.format("%.02f", this.amount.floatValue()) + "\n" +
				"----------------------------------------------------";
	}
	
}
