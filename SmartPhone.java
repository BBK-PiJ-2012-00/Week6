public class SmartPhone extends MobilePhone {

	public SmartPhone(String brand) {
		super(brand);
	}

	public void browseWeb(String browser) {
		System.out.println("Launching browser: " + browser);
	}
	
	public int findPostion() {
		int gps = 005456;
		return gps;
	}
	
	public void playGame(String gameChoice) {
		System.out.println("Loading " + gameChoice + "...");	
	}
	
	@Override
	public void call(String number) {
		String sub = number.substring(0,2);
		if (sub.equals("00")) {
			System.out.println("Calling " + number + " through the internet to save money.");
		}
		else {
			super.call(number);
		}
	}
	
}







/**
Save money by routing your international calls through the internet! Modify your class SmartPhone so that it
overrides the method call(String) inherited from OldPhone. If the string parameter starts with “00”, the method
should output “Calling <number> through the internet to save money”; otherwise, the method should do the same
as the original method (hint: use super).
*/







