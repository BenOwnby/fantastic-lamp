public class TeaCup extends Item{
	float tempature;
	int teaLevel;

	public TeaCup(){
		tempature = 12;
		teaLevel = 8;
	}

	public void examine(){
		if(teaLevel < -1000) {
			System.out.println("the tea cup is destroyed");
		}
		else if(teaLevel < 1) {
			System.out.println("you have finished the tea");
		}
		else if(teaLevel < 4) {
			System.out.println("there is still some tea left");
		}
		else {
			System.out.println("it's some tea");
		}
		tempature--;
	}

	public void interact(){
		if(teaLevel < -1000) {
			System.out.println("better to not touch that");
		}
		if(teaLevel < -3) {
			System.out.println("you are mad that you have no more tea and destroy the cup");
			teaLevel = -2000;
		}
		else if(teaLevel < 1) {
			System.out.println("you have finished the tea; you pretend to take a sip");
		}
		else if(teaLevel == 0) {
			System.out.println("that was the last sip of tea");
		}
		else {
			System.out.print("you take a sip of tea; it is ");
			if (tempature < 1){
				System.out.println("cold and gross; you destroy the teacup");
				teaLevel = -2000;
			}
			if (tempature < 4){
				System.out.println("getting cold");
			}
			if (tempature < 11){
				System.out.println("the perfect tepmature");
			}
			else {
				System.out.println("too hot, and you drop the cup");
				teaLevel = -2000;
			}
		}
		tempature--;
		teaLevel--;
	}
}
