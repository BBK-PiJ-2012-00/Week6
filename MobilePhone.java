public class MobilePhone extends OldPhone {
	private String[] numList = new String[10];
	private int callCount;
	
	public MobilePhone(String brand) {
		super(brand);
	}
	
	public String getBrand() {
		return super.getBrand();
	}
	
	public void ringAlarm(String ringAlarm) {
		System.out.println("The ring alarm has been set to: " + ringAlarm);	
	}

	public void playGame(String gameChoice) {
		System.out.println("Loading " + gameChoice + "...");	
	}
	
	@Override
	public void call(String number) {
		if (callCount < 10) {
			numList[callCount] = number;
			callCount++;
		}
		else {
			callCount = 0;
			numList[callCount] = number;
			callCount++;
		}
		System.out.println("Calling " + number);
	}
	
	public void printLastNumbers() {
		int i;
		System.out.println("The numbers in your call records are: ");
		for (i = 0; i < 10; i++) {
			System.out.println(numList[i]);
		}
	}				
	
	}

