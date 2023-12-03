package serviceketto;

public class KettoDonation {

	private String donee;
	private String name;
	private String work;
	private String country;
	private Double amount;
	
	public KettoDonation() {
		
	}
	
	public KettoDonation(String donee, String name, String work, String country, Double amount) {
		this.donee = donee;
		this.name = name;
		this.work = work;
		this.country = country;
		this.amount = amount;
	}
	
	public String getDonee() {
		return donee;
	}
	
	public void setDonee(String donee) {
		this.donee = donee;
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
			"------------------------------------------------\n" +
			"|            Ketto Donation Receipt            |\n" + 
			"------------------------------------------------\n" +
			"\tDonee : " + this.donee + "\n" + 
			"\tDonar Name : " + this.name + "\n" + 
			"\tWork : " + this.work + "\n" + 
			"\tCountry : " + this.country + "\n" + 
			"\tAmount : " + String.format("%.02f", this.amount.floatValue()) + "\n" +
			"------------------------------------------------";
}
	
}
