public class PhoneLauncher {

	public void testPhone(Phone phone) {
		phone.call("01"); //Can only call methods declared in interface Phone, ruling out phone.playGame("Tetris");
		SmartPhone sPhone = (SmartPhone) phone; //Need to downcast to use methods defined later.
		sPhone.playGame("Tetris");
		
	}

	public static void main(String[] args) {
	
	PhoneLauncher phoneLauncher = new PhoneLauncher();
	
	phoneLauncher.launch();
	
	}
	
	private void launch() {
	
	MobilePhone myPhone = new SmartPhone("Galaxy");
	
	myPhone.call("07890608884");
	
	myPhone.call("02289435657");
	
	myPhone.call("02934376948");
	
	myPhone.call("01932453733");
	
	myPhone.call("01934673723");
	
	myPhone.call("01932453733");
	
	myPhone.call("01932453733");
	
	myPhone.call("01932453733");
	
	myPhone.call("01932453733");
	
	myPhone.call("01999988733");
	
	myPhone.call("00326553733");
	
	myPhone.ringAlarm("Silent");
	
	myPhone.playGame("Tetris");
	
	myPhone.printLastNumbers();
	
	System.out.println("The brand of your phone is: " + myPhone.getBrand());
	
	//myPhone.browseWeb("Safari"); //Will not work with: MobilePhone/OldPhone myPhone = new SmartPhone();
	
	testPhone(myPhone);
	
	MobilePhone mPhone = new MobilePhone("5110");
	
	testPhone(mPhone); //Mobile phone cannot be cast to SmartPhone (runtime) (but call() works).
	//MobilePhone and SmartPhone are both types of Phone, but MobilePhone is not a type of SmartPhone.
	//Same as dog and cat are both animals, but cat cannot be cast to dog.
	
	
	
	}
	
}
	
	








