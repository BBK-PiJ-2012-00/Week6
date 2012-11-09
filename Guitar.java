public class Guitar extends MusicalInstrument implements WoodenObject {

	public void burn() {
		System.out.println("The wooden object is burning.");
	}
	
	public static void main(String[] args) {
	
	Guitar ibanez = new Guitar();
	ibanez.launch();
	
	}
	
	private void launch() {
	
	Guitar ibanez = new Guitar();
	
	ibanez.play();
	
	ibanez.burn();
	
	}
	
}

