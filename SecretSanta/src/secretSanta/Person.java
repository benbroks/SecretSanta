package secretSanta;

public class Person {
	private String name;
	private String giftIdea;
	private String email;
	private Person giveTo; //Person p will be giving a present to "giveTo"
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGift(String gift) {
		this.giftIdea = gift;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setGiving(Person p) {
		giveTo = p;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGift() {
		return giftIdea;
	}
	
	public String getEmail() {
		return email;
	}
	
	public Person getGiveTo() {
		return giveTo;
	}
}
