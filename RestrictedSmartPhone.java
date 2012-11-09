public class RestrictedSmartPhone extends SmartPhone {

	public RestrictedSmartPhone(String brand) {
		super(brand);
	}

	@Override
	private void playGame(String gameChoice) {
		System.out.println("Loading " + gameChoice + "...");	
	}
	
}

/**
RestrictedSmartPhone that overrides playGame(String) to make it private and thus non-visible to external
classes and scripts. Is this possible? Why?
*/



