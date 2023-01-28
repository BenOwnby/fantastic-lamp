public class Lamp extends Item{
	boolean isOn;

	public Lamp(){
		isOn = false;
	}

	public void examine(){
		if (isOn){
			System.out.println("it a lamp; the room is a dimly lit");
		}
		else{
			System.out.println("it is a bit too dark to see the lamp properly");
		}
	}

	public void interact(){
		if (isOn){
			System.out.println("You turn the lamp off; it is darker now");
			isOn = false;
		}
		else{
			System.out.println("You turn the lamp on; your eyes adjust");
			isOn = true;
		}
	}
}
