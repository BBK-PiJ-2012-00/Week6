public class OldPhone implements Phone {
	private String brand = null;

	public OldPhone(String brand) {
		super();
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void call(String number) {
		System.out.println("Calling " + number);
	}
	
}















